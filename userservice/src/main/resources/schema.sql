DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id        INT PRIMARY KEY NOT NULL,
  name      VARCHAR(100) NOT NULL
);


INSERT INTO user (id,  name) VALUES (1, 'User 1');
INSERT INTO user (id,  name) VALUES (2, 'User 2');
INSERT INTO user (id,  name) VALUES (3, 'User 3');
INSERT INTO user (id,  name) VALUES (4, 'User 4');
INSERT INTO user (id,  name) VALUES (5, 'User 5');
