 create table passenger (
   id bigserial not null,
   first_name varchar(15) not null,
   last_name varchar(15) not null,
   email varchar(50) not null,
   streetAddress varchar(20) not null,
   city varchar(15) not null,
   state varchar(15) not null,
   zip varchar(10) not null,
   phone_number varchar(15) not null,
   primary key (id)
 );

