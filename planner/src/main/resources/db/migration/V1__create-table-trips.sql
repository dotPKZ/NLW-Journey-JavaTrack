CREATE TABLE trips (
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    destination VARCHAR(80) NOT NULL,
    trip_start TIMESTAMP NOT NULL,
    trip_end TIMESTAMP NOT NULL,
    owner_name VARCHAR(80) NOT NULL,
    owner_email VARCHAR(80) NOT NULL,
    is_confirmed BOOLEAN NOT NULL
);