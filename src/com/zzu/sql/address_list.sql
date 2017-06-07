create table address_list(
       id number(5) primary key,
       name varchar2(8),
       salary varchar2(11),
       birthday varchar2(10)
)

create sequence seq_id start with 3 maxvalue 99999;

drop sequence seq_id;

drop table address_list;

insert into address_list(id,name,salary,birthday) values(seq_id.nextval,'����','18937178220','2017-06-04');

delete from address_list where id='5';

select id,name,salary,birthday from address_list;

update address_list set name = '����',salary = '15890697212',birthday =  to_date('2016-06-04','yyyy-mm-dd') where id = '1';


