CREATE TABLE IF NOT EXISTS ORDEM (
  id integer not null auto_increment,
  price double precision not null,
  product varchar(255), primary key (id)
);