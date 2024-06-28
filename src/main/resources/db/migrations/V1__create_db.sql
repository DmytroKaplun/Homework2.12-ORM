CREATE TABLE IF NOT EXISTS clients (
    id IDENTITY PRIMARY KEY,
    passport VARCHAR(100),
    name VARCHAR(200) NOT NULL CHECK (LENGTH(NAME) BETWEEN 3 AND 200)
);

CREATE TABLE IF NOT EXISTS planets (
    id VARCHAR(100) PRIMARY KEY CHECK (id REGEXP '^[A-Z0-9]+$'),
    name VARCHAR(500) NOT NULL
);

CREATE TABLE IF NOT EXISTS tickets (
    id IDENTITY PRIMARY KEY,
    created_at TIMESTAMP,
    client_id BIGINT,
    from_planet_id VARCHAR(100),
    to_planet_id VARCHAR(100),
    FOREIGN KEY (client_id) REFERENCES clients(id),
    FOREIGN KEY (from_planet_id) REFERENCES planets(id),
    FOREIGN KEY (to_planet_id) REFERENCES planets(id)
);