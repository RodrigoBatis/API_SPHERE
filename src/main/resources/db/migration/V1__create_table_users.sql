CREATE TABLE IF NOT EXISTS T_SPHERE_USERS(
    id bigint auto_increment,
    name varchar(255),
    bio varchar(255),
    email varchar(255),
    password varchar(255),
    created_at datetime,
    updated_at datetime,
    primary key (id)
);