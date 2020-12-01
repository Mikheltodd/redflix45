-- -----------------------------------------------------
-- Table RedFlix.Users
-- -----------------------------------------------------
DROP TABLE IF EXISTS Users;
CREATE TABLE IF NOT EXISTS Users (
	user_username VARCHAR(40) NOT NULL,
    user_password VARCHAR(40) NOT NULL DEFAULT "user123",
    user_name VARCHAR(60) NULL,
    user_lastname VARCHAR(60) NULL,
    user_email VARCHAR(60) NULL DEFAULT "user@123.com",
    user_phone INT NULL,
    user_birthday DATE NULL DEFAULT "1900-01-01",
    PRIMARY KEY (user_username)
);
-- User Values
INSERT INTO Users (user_username, user_name, user_lastname)
	VALUES 
		("lucky", "Pedro", "Perez"),
        ("malopez", "Maria", "Lopez"),
        ("diva", "Ana", "Diaz"),
        ("dreamer", "Luis", "Rojas"),
        ("ninja", "Andres", "Cruz"),
        ("neon", "Nelson", "Ruiz"),
        ("rose", "Claudia", "Mendez"),
        ("green", "Jorge", "Rodriguez");