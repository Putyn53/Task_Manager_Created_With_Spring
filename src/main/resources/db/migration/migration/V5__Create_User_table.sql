CREATE TABLE user (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR (30) NOT NULL,
    real_name VARCHAR (30) NOT NUll,
    password VARCHAR (30) NOT NULL,
    email VARCHAR (30) NOT NULL
);
INSERT INTO user (name, real_name, password, email) values ('Admin','Admin','admin1', 'putekwaw@gmail.com');
INSERT INTO user (name, real_name, password, email) values ('Putek','Kacper','haslo1', 'kacput@gmail.com');
