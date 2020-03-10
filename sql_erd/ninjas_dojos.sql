use ninjasdojos;
INSERT INTO ninjas(name, ability, Dojo_id)
VALUES ('victoria','morir',1),
('Gustavo','mm',2);
SELECT * FROM ninjas;
UPDATE ninjas
SET ability='SER WETa'
WHERE id=2;
INSERT INTO abilities(name,description)
VALUES ('Escupe Fuego','Puede escupir fuego durante 5 segundos'),
('Morir','Puede morir a voluntad');
SELECT * FROM abilities
