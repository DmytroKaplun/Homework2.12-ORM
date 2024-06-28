INSERT INTO clients (passport, name)
VALUES
    ('AB123456', 'John Doe'),
    ('CD234567', 'Jane Smith'),
    ('EF345678', 'Alice Johnson'),
    ('GH456789', 'Bob Brown'),
    ('IJ567890', 'Charlie Davis'),
    ('KL678901', 'Diana Green'),
    ('MN789012', 'Eve Adams'),
    ('OP890123', 'Frank Wright'),
    ('QR901234', 'Grace White'),
    ('ST012345', 'Hank Martin');


INSERT INTO planets (id, name)
VALUES
    ('EARTH', 'Earth'),
    ('MARS', 'Mars'),
    ('VEN', 'Venus'),
    ('JUP', 'Jupiter'),
    ('SAT', 'Saturn'),
    ('NEP', 'Neptune');

INSERT INTO tickets (created_at, client_id, from_planet_id, to_planet_id)
VALUES
    ('2024-06-23 10:00:00', 1, 'EARTH', 'MARS'),
    ('2024-06-23 11:00:00', 2, 'MARS', 'VEN'),
    ('2024-06-23 12:00:00', 3, 'VEN', 'JUP'),
    ('2024-06-23 13:00:00', 4, 'JUP', 'SAT'),
    ('2024-06-23 14:00:00', 5, 'SAT', 'NEP'),
    ('2024-06-23 15:00:00', 6, 'NEP', 'EARTH'),
    ('2024-06-23 16:00:00', 7, 'EARTH', 'MARS'),
    ('2024-06-23 17:00:00', 8, 'MARS', 'VEN'),
    ('2024-06-23 18:00:00', 9, 'VEN', 'JUP'),
    ('2024-06-23 19:00:00', 10, 'JUP', 'SAT');


