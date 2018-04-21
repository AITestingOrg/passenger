 create table passenger (
   id bigserial not null,
   first_name varchar(15) not null,
   last_name varchar(15) not null,
   email varchar(50) not null,
   phone_number smallint not null,
   primary key (id)
 );

