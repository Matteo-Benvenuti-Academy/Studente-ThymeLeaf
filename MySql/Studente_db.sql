DROP DATABASE IF EXISTS Studente_db;
CREATE DATABASE Studente_db;
USE Studente_db;

CREATE TABLE Studenti(
	studenteID INTEGER PRIMARY KEY AUTO_INCREMENT,
    nominativo VARCHAR(250) NOT NULL,
    matricola VARCHAR(10) NOT NULL UNIQUE
);

INSERT INTO Studenti(nominativo,matricola) VALUES 
("Matteo Benvenuti","12345");


SELECT * FROM Studenti