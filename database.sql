CREATE DATABASE dinosaur_park;

USE dinosaur_park;

CREATE TABLE income (
    id INT AUTO_INCREMENT PRIMARY KEY,
    concept VARCHAR(100),
    amount DOUBLE
);

CREATE TABLE expense (
    id INT AUTO_INCREMENT PRIMARY KEY,
    concept VARCHAR(100),
    amount DOUBLE
);