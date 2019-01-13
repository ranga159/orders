CREATE TABLE orders_schema.orders (
  id serial not null,
  order_date timestamp NOT NULL,
  order_status varchar(100) not null,
  created timestamp not null,
  created_by varchar(100) not null,
  modified timestamp not null,
  modified_by varchar(100) not null,
  PRIMARY KEY (id)
);