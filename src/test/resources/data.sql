DELETE FROM Messages;
DELETE FROM Itineraries;
DELETE FROM Participants;
DELETE FROM Trips;
DELETE FROM Users;

INSERT INTO Users (id, name, email, password, created_at, updated_at) VALUES
('11111111-1111-1111-1111-111111111111', 'Иван Иванов', 'ivan@example.com', '$2a$10$xJwL5v5Jz5UZJZ5UZJZ5Ue', NOW(), NOW()),
('22222222-2222-2222-2222-222222222222', 'Петр Петров', 'petr@example.com', '$2a$10$xJwL5v5Jz5UZJZ5UZJZ5Ue', NOW(), NOW()),
('33333333-3333-3333-3333-333333333333', 'Мария Сидорова', 'maria@example.com', '$2a$10$xJwL5v5Jz5UZJZ5UZJZ5Ue', NOW(), NOW());

INSERT INTO Trips (id, title, description, start_date, end_date, created_by, created_at, updated_at) VALUES
('44444444-4444-4444-4444-444444444444', 'Отпуск в Сочи', 'Недельный отдых на море', '2023-07-15', '2023-07-22', '11111111-1111-1111-1111-111111111111', NOW(), NOW()),
('55555555-5555-5555-5555-555555555555', 'Горный поход', 'Трекинг в Альпах', '2023-08-10', '2023-08-20', '22222222-2222-2222-2222-222222222222', NOW(), NOW());

INSERT INTO Participants (id, user_id, trip_id, role, joined_at) VALUES
('66666666-6666-6666-6666-666666666666', '11111111-1111-1111-1111-111111111111', '44444444-4444-4444-4444-444444444444', 'ORGANIZER', NOW()),
('77777777-7777-7777-7777-777777777777', '22222222-2222-2222-2222-222222222222', '44444444-4444-4444-4444-444444444444', 'PARTICIPANT', NOW()),
('88888888-8888-8888-8888-888888888888', '33333333-3333-3333-3333-333333333333', '55555555-5555-5555-5555-555555555555', 'ORGANIZER', NOW()),
('99999999-9999-9999-9999-999999999999', '11111111-1111-1111-1111-111111111111', '55555555-5555-5555-5555-555555555555', 'PARTICIPANT', NOW());

INSERT INTO Itineraries (id, trip_id, day, activity, location, start_time, end_time, created_at, updated_at) VALUES
('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', '44444444-4444-4444-4444-444444444444', 1, 'Прибытие', 'Аэропорт Сочи', '12:00:00', '13:00:00', NOW(), NOW()),
('bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', '44444444-4444-4444-4444-444444444444', 1, 'Обед', 'Ресторан "Море"', '13:30:00', '15:00:00', NOW(), NOW()),
('cccccccc-cccc-cccc-cccc-cccccccccccc', '55555555-5555-5555-5555-555555555555', 1, 'Начало похода', 'Горная база', '08:00:00', '09:00:00', NOW(), NOW());

INSERT INTO Messages (id, trip_id, user_id, content, sent_at) VALUES
('dddddddd-dddd-dddd-dddd-dddddddddddd', '44444444-4444-4444-4444-444444444444', '11111111-1111-1111-1111-111111111111', 'Все готовы к поездке?', NOW()),
('eeeeeeee-eeee-eeee-eeee-eeeeeeeeeeee', '44444444-4444-4444-4444-444444444444', '22222222-2222-2222-2222-222222222222', 'Да, я готов!', NOW()),
('ffffffff-ffff-ffff-ffff-ffffffffffff', '55555555-5555-5555-5555-555555555555', '33333333-3333-3333-3333-333333333333', 'Не забудьте теплые вещи', NOW());
