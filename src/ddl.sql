CREATE DATABASE library;
CREATE DATABASE homework_04_DB;

USE library;

DROP TABLE author;
DROP TABLE book;

CREATE TABLE author
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(45)
);
CREATE TABLE book
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(45),
    author_id INT(11)
);

CREATE TABLE ClientsDetails
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(45),
    age INT(11),
    phone VARCHAR(45)
);

