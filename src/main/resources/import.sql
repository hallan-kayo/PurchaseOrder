INSERT INTO tb_category (name) VALUES ('Eletronics')
INSERT INTO tb_category (name) VALUES ('Books')
INSERT INTO tb_category (name) VALUES ('Computers')

INSERT INTO tb_product (name, description, price, img_url) values ('The lord of the Rings', 'product description', 90.5, '')
INSERT INTO tb_product (name, description, price, img_url) values ('Smart TV', 'product description', 2190.0, '')
INSERT INTO tb_product (name, description, price, img_url) values ('Macbook Pro', 'product description', 1250.0, '')
INSERT INTO tb_product (name, description, price, img_url) values ('Pc gamer', 'product description', 1200.0, '')
INSERT INTO tb_product (name, description, price, img_url) values ('Rails for Dummies', 'product description', 100.99, '')

INSERT INTO tb_user (name, email, phone, password) values ('halan', 'hallan@gmail.com', '999999999', '123456')
INSERT INTO tb_user (name, email, phone, password) values ('kayo', 'kayo@gmail.com', '888888888', '654321')
INSERT INTO tb_user (name, email, phone, password) values ('pereira', 'pereira@gmail.com', '777777777', '6454354')
INSERT INTO tb_user (name, email, phone, password) values ('nascimento', 'nascimento@gmail.com', '666666666', '5435352')

INSERT INTO tb_order (moment, order_status, client_id) VALUES	('2019-06-20T19:53:07Z',1,1)
INSERT INTO tb_order (moment, order_status, client_id) VALUES	('2019-07-21T03:42:10Z',2,2)
INSERT INTO tb_order (moment, order_status, client_id) VALUES	('2019-07-22T15:21:22Z',3,1)