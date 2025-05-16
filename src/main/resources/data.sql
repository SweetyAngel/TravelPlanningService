-- Users
INSERT INTO users (username, password, created_at)
VALUES
('alice', 'password123', NOW()),
('bob', 'password123', NOW()),
('charlie', 'password123', NOW());

-- Votings
INSERT INTO votings (title, description, start_date, end_date, created_by, created_at)
VALUES
('Where to go this summer?', 'Vote for the destination!', '2025-06-01', '2025-06-15', 1, NOW());

-- Participants
INSERT INTO participants (user_id, voting_id, role, joined_at)
VALUES
(2, 1, 'member', NOW()),
(3, 1, 'admin', NOW());

-- Friends
INSERT INTO friends (friend1_id, friend2_id, friended_at)
VALUES
(1, 2, NOW()),
(1, 3, NOW());
