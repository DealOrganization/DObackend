create table deal
(
    id int AUTO_INCREMENT,
    member_id varchar(20),
    category int,
    text varchar(100),
    title varchar(50),
    state int,
    price int,

    primary key (id)
);