use event_planner;
INSERT INTO users(name)
VALUES ('Angel'),('Victoria'),('Gustavo'),('Maca');
SELECT * FROM users;
INSERT INTO addresses(addr,city,user_id)
VALUES ('Las Quilas 1367','Temuco',1),('San Martin 000','Temuco',1),('Caupolican 666','Temuco',2);
SELECT * FROM addresses;
INSERT INTO events(title,description,start_time,end_time)
VALUES ('Suicidaton Bailable','Con 3 ambientes (tech, ska y rock), esta será la ocasion perfecta para acabar con todo como se debe','22:15:00','03:00:00'),
('Completada 666','AAAA',current_time(),current_time());
SELECT * from events;
INSERT INTO invitations(accepted,user_id,event_id)
VALUES (1,1,1),(0,2,1),(1,3,1),(1,1,2),(1,2,2),(1,3,2);
INSERT INTO invitations(accepted,user_id)
VALUES (0,1);
SELECT * FROM invitations;
SELECT * FROM invitations
JOIN events on events.id = invitations.event_id;
SELECT * FROM invitations
LEFT JOIN events on events.id = invitations.event_id