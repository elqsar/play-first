# --- !Ups
INSERT INTO products(id, ean, name, description) VALUES(1, 5010255079763, 'Micro SMG', 'Magazine size 16 rounds(30 with extended)');
INSERT INTO products(id, ean, name, description) VALUES(2, 5018206244666, 'Pistol.50', 'Magazie size 9 rounds. Simple.');
INSERT INTO products(id, ean, name, description) VALUES(3, 5018306332812, 'Assault SMG', 'Magazine size 30 rounds');
INSERT INTO products(id, ean, name, description) VALUES(4, 5018306312913, 'Norinco Type 56-2', 'Rate of fire 360 RPM');
INSERT INTO products(id, ean, name, description) VALUES(5, 5018206244611, 'Tavor TAR-21', 'Rate of fire 500 RPM');
# --- !Downs
DELETE FROM products;