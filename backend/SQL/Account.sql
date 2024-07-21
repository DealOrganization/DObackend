create table account
(
    checking int AUTO_INCREMENT,
    id varchar(70),
    category int,
    cnt int,
    name varchar(100),
    price int,
    shipping int,
    company varchar(100),
    platform varchar(50),
    seller varchar(100),
    days int,

    primary key (checking)
);
