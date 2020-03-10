CREATE DATABASE IF NOT EXISTS hola;
use hola;
DROP TABLE IF EXISTS saludos;
CREATE TABLE saludos (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(15),
    PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
INSERT INTO saludos(name)
VALUES ('hola'),('wena'),('konnichiha');
SELECT * FROM saludos;
UPDATE saludos SET name='konnichiwa' WHERE id=3;
SELECT * FROM saludos;
DELETE FROM saludos WHERE id=3;
SELECT * FROM saludos;
DROP DATABASE hola;