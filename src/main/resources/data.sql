INSERT INTO tea (id, tea_id, name, type, price, amount, link, vendor_id, year_of_harvest, notes)
VALUES (1, 'bad9ca93-6e3f-463d-8922-f63eec195860', 'Green Tea', 'GREEN', 10.99, 100.0, 'https://example.com/green-tea', '6a1c32ef-6572-4b9c-b456-740f1a76dbf1', 2022, 'Some notes about the tea');
INSERT INTO tea (id, tea_id, name, type, price, amount, link, vendor_id, year_of_harvest, notes)
VALUES (2, 'e1926d6c-4d7b-4588-bb05-c7b3442015d6', 'Black Tea', 'BLACK', 8.99, 150.0, 'https://example.com/black-tea', '6a1c32ef-6572-4b9c-b456-740f1a76dbf1', 2021, 'Notes for the black tea');
INSERT INTO tea (id, tea_id, name, type, price, amount, link, vendor_id, year_of_harvest, notes)
VALUES (3, '47aa7c26-cd19-4803-bb7a-1e0eed4d2774', 'Oolong Tea', 'OOLONG', 12.99, 80.0, 'https://example.com/oolong-tea', '4c57dbb6-92e3-431a-89d0-3a5a23c4c84e', 2023, 'Additional notes for oolong tea');

INSERT INTO TEA_PRICE_HISTORY (price, date, tea_id)
VALUES (11.90, '2023-06-16', 1);
INSERT INTO TEA_PRICE_HISTORY (price, date, tea_id)
VALUES (10.90, '2023-01-16', 1);
INSERT INTO TEA_PRICE_HISTORY (price, date, tea_id)
VALUES (8.90, '2023-01-16', 2);

INSERT INTO vendor (id, vendor_id, name, link)
VALUES (1, '6a1c32ef-6572-4b9c-b456-740f1a76dbf1', 'Yunnan Sourcing', 'https://example.com/vendor1');
INSERT INTO vendor (id, vendor_id, name, link)
VALUES (2, '4c57dbb6-92e3-431a-89d0-3a5a23c4c84e', 'White2Tea', 'https://example.com/vendor2');
INSERT INTO vendor (id, vendor_id, name, link)
VALUES (3, 'eae04e43-87c3-40f0-8e77-9686f9f0f77a', 'Crimson Lotus', 'https://example.com/vendor3');

INSERT INTO vessel (id, vessel_id, name, capacity, type)
VALUES (1, '6a1c32ef-6572-4b9c-b456-740f1a76dbf1', 'Bero', 70, 'SHIBORIDASHI');
INSERT INTO vessel (id, vessel_id, name, capacity, type)
VALUES (2, '4c57dbb6-92e3-431a-89d0-3a5a23c4c84e', 'Porcelain Gaiwan', 100, 'GAIWAN');
INSERT INTO vessel (id, vessel_id, name, capacity, type)
VALUES (3, 'eae04e43-87c3-40f0-8e77-9686f9f0f77a', 'Dragon Teapot', 120, 'TEAPOT');

INSERT INTO session (id, session_id, date, amount_used, session_cost, vessel_id, tea_id)
VALUES (1, '6a1c32ef-6572-4b9c-b456-740f1a76dbf1', '2023-06-16 10:30:00', 5.0, 2.55, '6a1c32ef-6572-4b9c-b456-740f1a76dbf1', 'bad9ca93-6e3f-463d-8922-f63eec195860');
INSERT INTO session (id, session_id, date, amount_used, session_cost, vessel_id, tea_id)
VALUES (2, '4c57dbb6-92e3-431a-89d0-3a5a23c4c84e', '2023-06-15 15:45:00', 3.5, 0.78, '4c57dbb6-92e3-431a-89d0-3a5a23c4c84e', 'bad9ca93-6e3f-463d-8922-f63eec195860');
INSERT INTO session (id, session_id, date, amount_used, session_cost, vessel_id, tea_id)
VALUES (3, 'eae04e43-87c3-40f0-8e77-9686f9f0f77a', '2023-06-14 09:15:00', 4.2, 1.02, 'eae04e43-87c3-40f0-8e77-9686f9f0f77a', '47aa7c26-cd19-4803-bb7a-1e0eed4d2774');
