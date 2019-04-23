-- psql -U postgres -d novels -a -f install.sql

drop table if exists author cascade;
drop sequence if exists author_id;

drop table if exists novel cascade;
drop sequence if exists novel_id;

drop table if exists contribute cascade;

CREATE SEQUENCE author_id start 1 increment 1;
CREATE SEQUENCE novel_id start 1 increment 1;

CREATE TABLE author (
	Id INT DEFAULT nextval('author_id') NOT NULL, 
	contact varchar(255), 
	name varchar(255), 
	password varchar(255), 
	user_name varchar(255), 
	PRIMARY KEY (id),
	UNIQUE (user_name)
);

CREATE TABLE novel (
	Id INT DEFAULT nextval('novel_id') NOT NULL,
	title varchar(255), 
	PRIMARY KEY (id)
);

CREATE TABLE contribute (
	author_id INT not null, 
	novel_id INT not null, 
	PRIMARY KEY (author_id, novel_id),
	FOREIGN KEY (author_id) REFERENCES author(Id),
	FOREIGN KEY (novel_Id) REFERENCES novel(Id)
);
