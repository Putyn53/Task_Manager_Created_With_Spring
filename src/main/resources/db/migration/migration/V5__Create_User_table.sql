CREATE TABLE users (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR (30) NOT NULL,
    real_name VARCHAR (30) NOT NUll,
    password VARCHAR (30) NOT NULL,
    email VARCHAR (30) NOT NULL
);
INSERT INTO users (name, real_name, password, email) values ('admin','Admin','admin1', 'putekwaw@gmail.com');
INSERT INTO users (name, real_name, password, email) values ('Putek','Kacper','haslo1', 'putekwaw@gmail.com');
