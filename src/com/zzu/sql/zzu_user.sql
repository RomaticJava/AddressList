create table zzu_user(
    username varchar2(14) primary key,
    password varchar2(14)
);

insert into zzu_user(username,password) values('admin','123456');

delete from zzu_user where username='admin';

select username,password from zzu_user;

update zzu_user set password = '123456' where username = 'admin';
