-- Users
CREATE TABLE users (
    id UUID PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL
);

-- Votings
CREATE TABLE votings (
    id UUID PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    created_by UUID NOT NULL,
    created_at TIMESTAMP NOT NULL,
    FOREIGN KEY (created_by) REFERENCES users(id)
);

-- Participants
CREATE TABLE participants (
    id UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    voting_id UUID NOT NULL,
    role VARCHAR(20) NOT NULL,
    joined_at TIMESTAMP NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (voting_id) REFERENCES votings(id)
);

-- Friends
CREATE TABLE friends (
    id UUID PRIMARY KEY,
    friend1_id UUID NOT NULL,
    friend2_id UUID NOT NULL,
    friended_at TIMESTAMP NOT NULL,
    FOREIGN KEY (friend1_id) REFERENCES users(id),
    FOREIGN KEY (friend2_id) REFERENCES users(id),
    CHECK (friend1_id != friend2_id)
);
