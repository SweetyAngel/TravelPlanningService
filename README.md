## Структура БД
1. Users (Пользователи)
  - id (UUID, первичный ключ)
  - name (VARCHAR)
  - email (VARCHAR, уникальный)
  - password (VARCHAR)
  - created_at (TIMESTAMP)
  - updated_at (TIMESTAMP)

2. Trips (Поездки)
  - id (UUID, первичный ключ)
  - title (VARCHAR)
  - description (TEXT)
  - start_date (DATE)
  - end_date (DATE)
  - created_by (UUID, внешний ключ на Users)
  - created_at (TIMESTAMP)
  - updated_at (TIMESTAMP)

3. Participants (Участники)
  - id (UUID, первичный ключ)
  - user_id (UUID, внешний ключ на Users)
  - trip_id (UUID, внешний ключ на Trips)
  - role (VARCHAR, например, "admin", "member")
  - joined_at (TIMESTAMP)

4. Itineraries (Маршруты)
  - id (UUID, первичный ключ)
  - trip_id (UUID, внешний ключ на Trips)
  - day (INT)
  - activity (VARCHAR)
  - location (VARCHAR)
  - start_time (TIME)
  - end_time (TIME)
  - created_at (TIMESTAMP)
  - updated_at (TIMESTAMP)

5. Messages (Сообщения)
  - id (UUID, первичный ключ)
  - trip_id (UUID, внешний ключ на Trips)
  - user_id (UUID, внешний ключ на Users)
  - content (TEXT)
  - sent_at (TIMESTAMP)
## Связи
- Users и Trips: Один ко многим (один пользователь может создать много поездок).
- Trips и Participants: Один ко многим (одна поездка может иметь много участников).
- Trips и Itineraries: Один ко многим (одна поездка может иметь много пунктов маршрута).
- Trips и Messages: Один ко многим (одна поездка может иметь много сообщений).
![diagram](https://github.com/user-attachments/assets/b4ad9537-d5fb-497d-82f2-2b5b45d59669)
## Описание таблиц
- Participants: Таблица, которая связывает пользователей с поездками и определяет их роль в поездке.
- Itineraries: Таблица, которая содержит детали маршрута для каждой поездки.
- Messages: Таблица, которая хранит сообщения, отправленные в рамках поездки.

