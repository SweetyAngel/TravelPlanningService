-- Users
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL
);

-- Votings
CREATE TABLE votings (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    created_by INTEGER NOT NULL,
    created_at TIMESTAMP NOT NULL,
    FOREIGN KEY (created_by) REFERENCES users(id)
);

-- Participants
CREATE TABLE participants (
    id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    voting_id INTEGER NOT NULL,
    role VARCHAR(20) NOT NULL,
    joined_at TIMESTAMP NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (voting_id) REFERENCES votings(id)
);

-- Friends
CREATE TABLE friends (
    id SERIAL PRIMARY KEY,
    friend1_id INTEGER NOT NULL,
    friend2_id INTEGER NOT NULL,
    friended_at TIMESTAMP NOT NULL,
    FOREIGN KEY (friend1_id) REFERENCES users(id),
    FOREIGN KEY (friend2_id) REFERENCES users(id),
    CHECK (friend1_id != friend2_id)
);
