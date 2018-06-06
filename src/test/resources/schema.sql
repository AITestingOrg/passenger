DROP TABLE IF EXISTS passenger_test CASCADE;

create table passenger_test
(
  id bigserial not null,
  first_name varchar(20) not null,
  last_name varchar(20) not null,
  email varchar(50) not null,
  streetAddress varchar(20) not null,
  city varchar(20) not null,
  state varchar(20) not null,
  zip varchar(20) not null,
  phone_number varchar(20) not null,
  primary key (id)
);

insert into passenger_test(first_name, last_name, email, streetAddress, city, state, zip, phone_number)
values('Peter', 'Parker', 'PeterParker@marvel.com', '1000', 'Forrest Hills', 'New York', '11375', '1800-111-2222');

