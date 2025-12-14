CREATE TABLE incident(
id SERIAL PRIMARY KEY,
type VARCHAR(50),
location VARCHAR(100),
severity VARCHAR(20),
status VARCHAR(20)
);