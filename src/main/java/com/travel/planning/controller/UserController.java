@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/regUser")
    public ResponseEntity<?> registerUser(@RequestParam String username,
                                          @RequestParam String password) {

        // 1. Валидация входных данных
        if (username == null || username.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Username cannot be empty");
        }

        if (password == null || password.length() < 8) {
            return ResponseEntity.badRequest().body("Password must be at least 8 characters long");
        }

        // 2. Проверка, что пользователь не существует
        if (userRepository.existsByUsername(username)) {
            return ResponseEntity.badRequest().body("Username already taken");
        }

        // 3. Создание нового пользователя
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(passwordEncoder.encode(password)); // Хеширование пароля
        newUser.setCreatedAt(LocalDateTime.now());
        newUser.setRoles(Collections.singleton(Role.USER)); // По умолчанию роль USER

        try {
            // 4. Сохранение пользователя в БД
            userRepository.save(newUser);

            // 5. Можно вернуть DTO без пароля
            UserDto userDto = new UserDto(newUser.getId(), newUser.getUsername(), newUser.getRoles());

            return ResponseEntity.ok(userDto);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Registration failed: " + e.getMessage());
        }
    }

    // Класс DTO для безопасного возврата данных пользователя
    public record UserDto(Long id, String username, Set<Role> roles) {}
}