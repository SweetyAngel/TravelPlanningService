package com.travel.planning.repository;

import com.travel.planning.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

=======
>>>>>>> 5783cb95be136b05745f6a4a8850880ea6857349
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}