INSERT INTO Users (id, name, email, password, created_at, updated_at) VALUES
('11111111-1111-1111-1111-111111111111', 'Alice Johnson', 'alice@example.com', 'hashed_password1', '2023-01-01 10:00:00', '2023-01-01 10:00:00'),
('22222222-2222-2222-2222-222222222222', 'Bob Smith', 'bob@example.com', 'hashed_password2', '2023-01-02 11:00:00', '2023-01-02 11:00:00'),
('33333333-3333-3333-3333-333333333333', 'Charlie Brown', 'charlie@example.com', 'hashed_password3', '2023-01-03 12:00:00', '2023-01-03 12:00:00'),
('44444444-4444-4444-4444-444444444444', 'Diana Prince', 'diana@example.com', 'hashed_password4', '2023-01-04 13:00:00', '2023-01-04 13:00:00'),
('55555555-5555-5555-5555-555555555555', 'Ethan Hunt', 'ethan@example.com', 'hashed_password5', '2023-01-05 14:00:00', '2023-01-05 14:00:00');

INSERT INTO Trips (id, title, description, start_date, end_date, created_by, created_at, updated_at) VALUES
('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'Summer Vacation in Paris', 'A wonderful week exploring Paris', '2023-07-15', '2023-07-22', '11111111-1111-1111-1111-111111111111', '2023-02-01 09:00:00', '2023-02-01 09:00:00'),
('bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'Winter Ski Trip', 'Skiing in the Alps with friends', '2023-12-10', '2023-12-17', '22222222-2222-2222-2222-222222222222', '2023-02-15 10:00:00', '2023-02-15 10:00:00'),
('cccccccc-cccc-cccc-cccc-cccccccccccc', 'Asian Adventure', 'Exploring Japan and South Korea', '2023-09-01', '2023-09-21', '33333333-3333-3333-3333-333333333333', '2023-03-01 11:00:00', '2023-03-01 11:00:00'),
('dddddddd-dddd-dddd-dddd-dddddddddddd', 'Weekend Getaway', 'Relaxing weekend at the beach', '2023-06-02', '2023-06-04', '44444444-4444-4444-4444-444444444444', '2023-04-01 12:00:00', '2023-04-01 12:00:00');

INSERT INTO Participants (id, user_id, trip_id, role, joined_at) VALUES
('aaaaaaaa-1111-1111-1111-111111111111', '11111111-1111-1111-1111-111111111111', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'organizer', '2023-02-01 09:05:00'),
('bbbbbbbb-2222-2222-2222-222222222222', '22222222-2222-2222-2222-222222222222', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'participant', '2023-02-02 10:00:00'),
('cccccccc-3333-3333-3333-333333333333', '33333333-3333-3333-3333-333333333333', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'participant', '2023-02-03 11:00:00'),
('dddddddd-4444-4444-4444-444444444444', '22222222-2222-2222-2222-222222222222', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'organizer', '2023-02-15 10:05:00'),
('eeeeeeee-5555-5555-5555-555555555555', '33333333-3333-3333-3333-333333333333', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'participant', '2023-02-16 11:00:00'),
('ffffffff-6666-6666-6666-666666666666', '44444444-4444-4444-4444-444444444444', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'participant', '2023-02-17 12:00:00'),
('gggggggg-7777-7777-7777-777777777777', '33333333-3333-3333-3333-333333333333', 'cccccccc-cccc-cccc-cccc-cccccccccccc', 'organizer', '2023-03-01 11:05:00'),
('hhhhhhhh-8888-8888-8888-888888888888', '11111111-1111-1111-1111-111111111111', 'cccccccc-cccc-cccc-cccc-cccccccccccc', 'participant', '2023-03-02 09:00:00'),
('iiiiiiii-9999-9999-9999-999999999999', '44444444-4444-4444-4444-444444444444', 'dddddddd-dddd-dddd-dddd-dddddddddddd', 'organizer', '2023-04-01 12:05:00'),
('jjjjjjjj-0000-0000-0000-000000000000', '55555555-5555-5555-5555-555555555555', 'dddddddd-dddd-dddd-dddd-dddddddddddd', 'participant', '2023-04-02 14:00:00');

INSERT INTO Itineraries (id, trip_id, day, activity, location, start_time, end_time, created_at, updated_at) VALUES
('11111111-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 1, 'Arrival and check-in', 'Charles de Gaulle Airport', '14:00:00', '15:30:00', '2023-02-05 09:00:00', '2023-02-05 09:00:00'),
('22222222-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 1, 'Eiffel Tower visit', 'Eiffel Tower', '16:00:00', '18:00:00', '2023-02-05 09:00:00', '2023-02-05 09:00:00'),
('33333333-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 2, 'Louvre Museum', 'Louvre Museum', '09:00:00', '12:00:00', '2023-02-05 09:00:00', '2023-02-05 09:00:00'),
('44444444-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 2, 'Seine River Cruise', 'Seine River', '19:00:00', '21:00:00', '2023-02-05 09:00:00', '2023-02-05 09:00:00'),
('55555555-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 3, 'Day trip to Versailles', 'Palace of Versailles', '08:00:00', '18:00:00', '2023-02-05 09:00:00', '2023-02-05 09:00:00');

INSERT INTO Itineraries (id, trip_id, day, activity, location, start_time, end_time, created_at, updated_at) VALUES
('11111111-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 1, 'Arrival and equipment rental', 'Chamonix Ski Resort', '10:00:00', '12:00:00', '2023-02-20 10:00:00', '2023-02-20 10:00:00'),
('22222222-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 1, 'Beginner slopes', 'Chamonix Ski Resort', '13:00:00', '16:00:00', '2023-02-20 10:00:00', '2023-02-20 10:00:00'),
('33333333-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 2, 'Advanced slopes', 'Grands Montets', '09:00:00', '16:00:00', '2023-02-20 10:00:00', '2023-02-20 10:00:00'),
('44444444-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 3, 'Rest day - Spa visit', 'Chamonix Town', '10:00:00', '15:00:00', '2023-02-20 10:00:00', '2023-02-20 10:00:00');

INSERT INTO Messages (id, trip_id, user_id, content, sent_at) VALUES
('11111111-1111-1111-1111-111111111111', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', '11111111-1111-1111-1111-111111111111', 'Welcome everyone to our Paris trip!', '2023-02-05 08:00:00'),
('22222222-2222-2222-2222-222222222222', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', '22222222-2222-2222-2222-222222222222', 'Thanks for organizing Alice!', '2023-02-05 08:05:00'),
('33333333-3333-3333-3333-333333333333', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', '33333333-3333-3333-3333-333333333333', 'Looking forward to the Eiffel Tower visit!', '2023-02-05 08:10:00'),
('44444444-4444-4444-4444-444444444444', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', '22222222-2222-2222-2222-222222222222', 'Ski trip preparations - who needs equipment rental?', '2023-02-18 09:00:00'),
('55555555-5555-5555-5555-555555555555', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', '33333333-3333-3333-3333-333333333333', 'I need ski pants and gloves', '2023-02-18 09:15:00'),
('66666666-6666-6666-6666-666666666666', 'cccccccc-cccc-cccc-cccc-cccccccccccc', '33333333-3333-3333-3333-333333333333', 'Asian Adventure planning - any must-see places?', '2023-03-05 10:00:00'),
('77777777-7777-7777-7777-777777777777', 'cccccccc-cccc-cccc-cccc-cccccccccccc', '11111111-1111-1111-1111-111111111111', 'Definitely visit Fushimi Inari in Kyoto!', '2023-03-05 10:30:00'),
('88888888-8888-8888-8888-888888888888', 'dddddddd-dddd-dddd-dddd-dddddddddddd', '44444444-4444-4444-4444-444444444444', 'Beach house is booked for the weekend!', '2023-04-10 12:00:00');
