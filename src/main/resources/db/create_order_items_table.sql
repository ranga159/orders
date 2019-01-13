CREATE TABLE orders_schema.order_items (
  id bigserial not null,
  book_id serial,
  order_id bigserial not null,
  created timestamp not null,
  created_by varchar(100) not null,
  modified timestamp not null,
  modified_by varchar(100) not null,
  PRIMARY KEY (id),
  CONSTRAINT fk_orders_id_order_items_id foreign key (order_id) references orders_schema.orders
);