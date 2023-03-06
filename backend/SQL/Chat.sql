create table chat
(
    checking int AUTO_INCREMENT,
    user1_id varchar(20) NOT NULL,
    user2_id varchar(20) NOT NULL,
    user1_chat varchar(100),
    user2_chat varchar(100),
    goods_id int,

    primary key(checking)
);