DROP SCHEMA IF EXISTS human_friends;
CREATE SCHEMA human_friends;

USE human_friends;

DROP TABLE IF EXISTS dogs;
CREATE TABLE dogs (
  id_dogs SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL);

INSERT INTO dogs (name, birthday, commands) VALUES
('Жучка', '2021-06-01', 'сидеть, лай'),
('Пушок', '2015-11-16', 'кусай, лежи'),
('Рэкс', '2017-10-21', 'беги, хвататай, стой');

SELECT * from dogs;

DROP TABLE IF EXISTS cats;
CREATE TABLE cats (
  id_cats SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL);

INSERT INTO cats (name, birthday, commands) VALUES
('Лапка', '2019-06-22', 'мяукай, царапай'),
('Милка', '2023-10-12', 'мяукай, лежи'),
('Пушистик', '2021-10-20', 'лови');

SELECT * from cats;

DROP TABLE IF EXISTS hamsters;
CREATE TABLE hamsters (
  id_hamsters SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL);
  
INSERT INTO hamsters (name, birthday, commands) VALUES ('Мячик', '2022-03-09', 'крутись');
INSERT INTO hamsters (name, birthday) VALUES ('Пончик', '2023-01-05');

SELECT * from hamsters;

DROP TABLE IF EXISTS horses;
CREATE TABLE horses (
  id_horses SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL);

INSERT INTO horses (name, birthday, commands) VALUES
('Герцог', '2012-07-02', 'галлоп, рысь, аллюр, стой'),
('Афина', '2019-08-08', 'рысь, стой');

INSERT INTO horses (name, birthday) VALUES
('Плюшка', '2015-05-29'),
('Картон', '2013-05-05');

SELECT * from horses;

DROP TABLE IF EXISTS сamels;
CREATE TABLE сamels (
  id_сamels SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL);

INSERT INTO сamels (name, birthday, commands) VALUES
('Иосиф', '2013-11-12', 'стой, иди, зови на помощь'),
('Хан', '2018-08-08', 'стой, иди');

SELECT * from сamels;

DROP TABLE IF EXISTS donkeys;
CREATE TABLE donkeys (
  id_donkeys SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL);

INSERT INTO donkeys (name, birthday, commands) VALUES
('Карл', '2020-03-30', 'иди'),
('Маня', '2019-11-27', 'стой, кричи');

SELECT * from donkeys;

DROP TABLE IF EXISTS сamels;

DROP TABLE IF EXISTS pack_animals;
CREATE TABLE pack_animals (
  id_pack_animals SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL,
  tablename VARCHAR(20) NOT NULL,
  id_source_table VARCHAR(20) NOT NULL);

INSERT INTO pack_animals (name, birthday, commands, tablename, id_source_table)
SELECT name, birthday, commands, 'horses' as tablename, id_horses FROM horses 
UNION ALL
SELECT name, birthday, commands, 'donkeys' as tablename, id_donkeys FROM donkeys;

SELECT * from pack_animals;

DROP TABLE IF EXISTS young_animals;
CREATE TABLE young_animals (
  id_young_animals SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL,  
  tablename VARCHAR(20) NOT NULL,
  month INT NOT NULL);
  
INSERT INTO young_animals (name, birthday, commands, tablename, month)
SELECT name, birthday, commands, tablename, TIMESTAMPDIFF(MONTH, birthday, NOW()) as month
FROM 
	(SELECT name, birthday, commands, 'dogs' as tablename FROM dogs 
	UNION ALL
	SELECT name, birthday, commands, 'cats' as tablename FROM cats 
	UNION ALL
	SELECT name, birthday, commands, 'hamsters' FROM hamsters 
	UNION ALL
	SELECT name, birthday, commands, 'horses' as tablename FROM horses 
	UNION ALL
	SELECT name, birthday, commands, 'donkeys' as tablename FROM donkeys) as human_friends
WHERE TIMESTAMPDIFF(YEAR, birthday, NOW()) BETWEEN 1 AND 3;

SELECT * from young_animals;

DROP TABLE IF EXISTS human_friends;
CREATE TABLE human_friends (
  id_human_friends SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL,  
  tablename VARCHAR(20) NOT NULL,
  id_source_table VARCHAR(20) NOT NULL);
  
INSERT INTO human_friends (name, birthday, commands, tablename, id_source_table)
SELECT name, birthday, commands, 'dogs' as tablename, id_dogs FROM dogs 
UNION ALL
SELECT name, birthday, commands, 'cats' as tablename, id_cats FROM cats 
UNION ALL
SELECT name, birthday, commands, 'hamsters' as tablename, id_hamsters FROM hamsters 
UNION ALL
SELECT name, birthday, commands, 'horses' as tablename, id_horses FROM horses 
UNION ALL
SELECT name, birthday, commands, 'donkeys' as tablename, id_donkeys FROM donkeys;

SELECT * from human_friends;

DROP TABLE IF EXISTS human_friends_another;
CREATE TABLE human_friends_another (
  id_human_friends SERIAL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  birthday DATE NOT NULL,
  commands TEXT NULL,  
  tablename VARCHAR(20) NOT NULL,
  id_source_table VARCHAR(20) NOT NULL);
  
INSERT INTO human_friends_another (name, birthday, commands, tablename, id_source_table)
SELECT name, birthday, commands, 'dogs' as tablename, id_dogs FROM dogs 
UNION ALL
SELECT name, birthday, commands, 'cats' as tablename, id_cats FROM cats 
UNION ALL
SELECT name, birthday, commands, 'hamsters' as tablename, id_hamsters FROM hamsters 
UNION ALL
SELECT name, birthday, commands, 'pack_animals' as tablename, id_pack_animals FROM pack_animals;

SELECT * from human_friends_another







