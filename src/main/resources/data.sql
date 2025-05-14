-- Users
INSERT INTO users (id, username, password, created_at)
VALUES
('a1b2c3d4-e5f6-7890-g1h2-i3j4k5l6m7n8', 'alice', 'password123', NOW()),
('b2c3d4e5-f6g7-8901-h2i3-j4k5l6m7n8o9', 'bob', 'password123', NOW()),
('c3d4e5f6-g7h8-9012-i3j4-k5l6m7n8o9p0', 'charlie', 'password123', NOW());

-- Votings
INSERT INTO votings (id, title, description, start_date, end_date, created_by, created_at)
VALUES
('d4e5f6g7-h8i9-0123-j4k5-l6m7n8o9p0q1', 'Where to go this summer?', 'Vote for the destination!', '2025-06-01', '2025-06-15', 'a1b2c3d4-e5f6-7890-g1h2-i3j4k5l6m7n8', NOW());

-- Participants
INSERT INTO participants (id, user_id, voting_id, role, joined_at)
VALUES
('e5f6g7h8-i9j0-1234-k5l6-m7n8o9p0q1r2', 'b2c3d4e5-f6g7-8901-h2i3-j4k5l6m7n8o9', 'd4e5f6g7-h8i9-0123-j4k5-l6m7n8o9p0q1', 'member', NOW()),
('f6g7h8i9-j0k1-2345-l6m7-n8o9p0q1r2s3', 'c3d4e5f6-g7h8-9012-i3j4-k5l6m7n8o9p0', 'd4e5f6g7-h8i9-0123-j4k5-l6m7n8o9p0q1', 'admin', NOW());

-- Friends
INSERT INTO friends (id, friend1_id, friend2_id, friended_at)
VALUES
('g7h8i9j0-k1l2-3456-m7n8-o9p0q1r2s3t4', 'a1b2c3d4-e5f6-7890-g1h2-i3j4k5l6m7n8', 'b2c3d4e5-f6g7-8901-h2i3-j4k5l6m7n8o9', NOW()),
('h8i9j0k1-l2m3-4567-n8o9-p0q1r2s3t4u5', 'a1b2c3d4-e5f6-7890-g1h2-i3j4k5l6m7n8', 'c3d4e5f6-g7h8-9012-i3j4-k5l6m7n8o9p0', NOW());
