-- -----------------------------------------------------
-- Schema RedFlix45
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS RedFlix45;
CREATE SCHEMA IF NOT EXISTS RedFlix45;
USE RedFlix45;

-- -----------------------------------------------------
-- Table RedFlix45.Movies
-- -----------------------------------------------------
DROP TABLE IF EXISTS Movies;
CREATE TABLE IF NOT EXISTS Movies (
	movie_title VARCHAR(60) NOT NULL,
	movie_summary VARCHAR(500) NULL,
	movie_year INT NULL,
	movie_director VARCHAR(60) NOT NULL,
	PRIMARY KEY (movie_title)
);
-- Content Values - Movies
INSERT INTO Movies (movie_title, movie_summary, movie_year, movie_director)
	VALUES 
		("Los Vengadores", "Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.", 1990, "Joss Whedon"),
        ("Interestelar", "Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.", 2014, "Christopher Nolan"),
        ("El viaje de Chihiro", "Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.", 2001, "Hayo Miyazaki"),
        ("Parasitos", "Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano.", 2019, "Bong Joon-ho"),
        ("Mas alla de los sueños", "Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.", 1998, "Vincent Ward");
-- -----------------------------------------------------
-- Table RedFlix45.Shows
-- -----------------------------------------------------
DROP TABLE IF EXISTS Shows;
CREATE TABLE IF NOT EXISTS Shows (
	show_title VARCHAR(60) NOT NULL,
	show_seasons INT NULL,
	show_episodes INT NULL,
	PRIMARY KEY (show_title)
);
-- Content Values - Shows
INSERT INTO Shows (show_title, show_seasons, show_episodes)
	VALUES 
		("The walking dead", 11, 153),
        ("Viaje a las estrellas: la serie original", 3, 80),
        ("Glow", 3, 30),
        ("La casa de papel", 4, 31),
        ("Friends", 10, 236),
        ("Arrow", 8, 170),
        ("The big bang theory", 12, 279),
        ("Vikingos", 6, 79);
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
    user_birthday VARCHAR(40) NULL DEFAULT "1900-01-01",
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