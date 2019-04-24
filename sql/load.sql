-- psql -U postgres -d novels -a -f load.sql

insert into author (contact, name, password, user_name) values ('admin@abc.com', 'admin', '123456', 'admin');

insert into novel (title) values ('Test1');
insert into novel (title) values ('Test2');

insert into author_novel (author_id, novel_id) values (1, 1);
insert into author_novel (author_id, novel_id) values (1, 2);