INSERT INTO tea (id, tea_id, name, type, price, amount, link, vendor_id, year_of_harvest, notes)
VALUES (1, 'bad9ca93-6e3f-463d-8922-f63eec195860', 'Green Tea', 'GREEN', 10.99, 100.0, 'https://example.com/green-tea', UUID(), 2022, 'Some notes about the tea');

INSERT INTO tea (id, tea_id, name, type, price, amount, link, vendor_id, year_of_harvest, notes)
VALUES (2, 'e1926d6c-4d7b-4588-bb05-c7b3442015d6', 'Black Tea', 'BLACK', 8.99, 150.0, 'https://example.com/black-tea', UUID(), 2021, 'Notes for the black tea');

INSERT INTO tea (id, tea_id, name, type, price, amount, link, vendor_id, year_of_harvest, notes)
VALUES (3, '47aa7c26-cd19-4803-bb7a-1e0eed4d2774', 'Oolong Tea', 'OOLONG', 12.99, 80.0, 'https://example.com/oolong-tea', UUID(), 2023, 'Additional notes for oolong tea');

INSERT INTO TEA_PRICE_HISTORY (price, date, tea_id)
VALUES (11.90, '2023-06-16', 1);

INSERT INTO TEA_PRICE_HISTORY (price, date, tea_id)
VALUES (10.90, '2023-01-16', 1);

INSERT INTO TEA_PRICE_HISTORY (price, date, tea_id)
VALUES (8.90, '2023-01-16', 2);