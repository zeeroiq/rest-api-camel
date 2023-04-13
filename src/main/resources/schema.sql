create schema if not exists schema_test;

create table if not exists schema_test.user_entity
(
    user_id           bigint not null,
    created_on        timestamp(6),
    email_id          varchar(255),
    firstname         varchar(255),
    lastname          varchar(255),
    password          varchar(255),
    updated_by        varchar(255),
    updated_on        timestamp(6),
    version           integer,
    primary key (user_id)
);
