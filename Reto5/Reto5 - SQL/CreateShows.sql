-- -----------------------------------------------------
-- Table RedFlix45.shows
-- -----------------------------------------------------
DROP TABLE IF EXISTS shows;
CREATE TABLE IF NOT EXISTS shows (
	show_title VARCHAR(60) NOT NULL,
	show_seasons INT NULL,
	show_episodes INT NULL,
	PRIMARY KEY (show_title)
);
-- Content Values - shows
INSERT INTO shows (show_title, show_seasons, show_episodes)
	VALUES 
		("The walking dead", 11, 153),
        ("Viaje a las estrellas: la serie original", 3, 80),
        ("Glow", 3, 30),
        ("La casa de papel", 4, 31),
        ("Friends", 10, 236),
        ("Arrow", 8, 170),
        ("The big bang theory", 12, 279),
        ("Vikingos", 6, 79);
