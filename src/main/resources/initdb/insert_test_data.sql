INSERT INTO `performance` (name, price, round, type, start_date, is_reserve)
VALUES ('레베카', 100000, 1, 0, '2024-01-20 19:30:00', 'disable');

INSERT INTO `performance` (id, name, price, round, type, start_date, is_reserve)
VALUES (uuid_to_bin('4438a3e6-b01c-11ee-9426-0242ac180002'),'레베카', 100000, 1, 0, '2024-01-20 19:30:00', 'enable');

INSERT INTO performance_seat_info VALUES
 (DEFAULT, (SELECT id FROM performance limit 1), 1, 1, 'A', 1, 'enable', DEFAULT, DEFAULT)
,(DEFAULT, (SELECT id FROM performance limit 1), 1, 1, 'A', 2, 'enable', DEFAULT, DEFAULT)
,(DEFAULT, (SELECT id FROM performance limit 1), 1, 1, 'A', 3, 'enable', DEFAULT, DEFAULT)
,(DEFAULT, (SELECT id FROM performance limit 1), 1, 1, 'A', 4, 'enable', DEFAULT, DEFAULT);