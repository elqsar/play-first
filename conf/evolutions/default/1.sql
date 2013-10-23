# --- !Ups
CREATE SEQUENCE s_product_id;

CREATE TABLE products (
	id long DEFAULT nextval('s_product_id'),
	ean long,
	name varchar(255),
	description varchar(255)
);
# --- !Downs

DROP TABLE IF EXISTS products;
DROP SEQUENCE s_product_id;