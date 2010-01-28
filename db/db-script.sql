use onlineexam;

create table if not exists account (
    userid int not null,
    username varchar(25) not null,
    password varchar(25)  not null,
    email varchar(50) not null,
    firstname varchar(50) not null,
    lastname varchar(50) not null,
    role varchar(2)  null,
    addr1 varchar(255) not null,
    addr2 varchar(255) null,
    city varchar(50) not  null,
    state varchar(50) not null,
    zip varchar(25) not null,
    country varchar(25) not null,
    phone varchar(50) not null,
primary key (userid) )
type=innodb
min_rows=0 
max_rows=1000  
pack_keys=default 
row_format=default;