 create table passenger (
   id bigserial not null,
   user_name varchar(15) not null,
   password varchar(20) not null,
   conf_password varchar(20) not null,
   first_name varchar(15) not null,
   last_name varchar(15) not null,
   email varchar(50) not null,
   phone_number smallint not null,
   primary key (id)
 );

 create table ride (
   id bigserial not null,
   start_addr varchar(20) not null,
   start_city varchar(20) not null,
   start_state varchar(20) not null,
   start_zip smallint not null,
   destination_addr varchar(20) not null,
   destination_city varchar(20) not null,
   destination_state varchar(20) not null,
   destination_zip varchar(20) not null,
   ride_status varchar(10) not null,
   primary key (id)
 );
