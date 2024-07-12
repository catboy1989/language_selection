CREATE TABLE products 
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(255) NOT NULL,
    category VARCHAR(30),
    price INT
);

DROP TABLE products;

INSERT INTO products(product_name, category, price) 
VALUES ('iphone', 'apple', 1000);

INSERT INTO products(product_name, category, price) 
VALUES ('galaxy s24 ultra', 'samsung', 900);

INSERT INTO products(product_name, category, price) 
VALUES ('macbook', 'apple', 1500);

SELECT * FROM products
SELECT product_name FROM products WHERE id = 1;
SELECT * FROM products WHERE price < 1200;

UPDATE products SET price = 1100 WHERE product_name = 'iphone';

DELETE FROM products WHERE category = 'apple';