INSERT INTO VEHICULOS (MATRICULA, MARCA) VALUES 
('3445FTT', 'Piaggio'),
('7889DSS', 'SEAT'),
('4982MBB', 'Yamaha'),
('1299JHH', 'SEAT'),
('2600JDK', 'CITROEN'),
('1010KLR', 'VOLKSWAGEN');

INSERT INTO COCHES (MATRICULA, NUMERO_PUERTAS) VALUES 
('7889DSS', 5),
('1299JHH', 3),
('2600JDK', 5),
('1010KLR', 5);

INSERT INTO MOTOS (MATRICULA, PATA_CABRA) VALUES
('3445FTT', TRUE),
('4982MBB', FALSE);

INSERT INTO NOTICIAS (ID, TITULO, SUBTITULO) VALUES 
(10, 'Un cliente muerde a un perro en un famoso centro comercial...', 'En circunstancias todavía pendientes de esclarecimiento, bla bla bla'),
(11, 'El Valencia gana al Real Madrid!', 'Después de 17 años ...');

INSERT INTO COMENTARIOS (ORDEN, AUTOR, COMENTARIO, ID_NOTICIA) VALUES 
(1, 'rufus', 'jajajaja', 10),
(0, 'chinchan', 'ya era hora!!!!', 11),
(0, 'bartolo', 'la culpa es del gobierno!', 10),
(2, 'carlota', 'siempre igual!', 11),
(1, 'koko', 'No me lom puedo creer! Seguro que el VAR-sa lo desperdicia...', 11);

INSERT INTO ASIGNATURAS (ID, NOMBRE, CREDITOS) VALUES 
(10, 'Matemáticas', 10),
(13, 'Java SE', 8);

INSERT INTO ALUMNOS (ID, NOMBRE_COMPLETO) VALUES
(100, 'Honorio Martín Salvador'),
(102, 'Carlota Cifuentes Merino'),
(109, 'Alejandro Pocoyo Rui');

INSERT INTO ASIGNATURAS_ALUMNOS (ID_ASIGNATURA, ID_ALUMNO) VALUES
(10, 100),
(10, 102),
(13, 102),
(13, 109);

INSERT INTO PROVEEDORES (ID, NOMBRE, VIA, MUNICIPIO, CODIGO_POSTAL, PROVINCIA, PAIS) VALUES
(1000, 'HERMANOS MATA, S.L.', 'Avda del Gas 120', 'Montcada i Reixac', '08023', 'Barcelona', 'España'),
(1001, 'COMERCIAL GUGU S.A.', 'c/Picasso, 2', 'Barcelona', '08012', 'Barcelona', 'España');

INSERT INTO EQUIPOS (ID, NOMBRE, FECHA_FUNDACION) VALUES
(50, 'F.C. Reus', '1907-11-15'),
(51, 'Unio Esportiva Mollerusa', '1911-03-22');

INSERT INTO JUGADORES (ID, NOMBRE, APELLIDO1, APELLIDO2, DORSAL, ID_EQUIPO) VALUES
(1000, 'Honorio','Sánchez','Puy', 1, 50),
(1001, 'Carlos','Ramiro','Ferlosio', 2, 50),
(1002, 'Roberto','Balardo','Cucurlo', 3, 50),
(1003, 'Agapito','Roldán','Pallisó', 1, 51),
(1004, 'Carlitos','Rui','Carapiña', 10, 51),
(1005, 'José Ramón','Blanco','Moreno', 7, 51),
(1006, 'Ot','Pi','Mas', 9, 51),
(1007, 'Carlos','Batuso','Badiodelmonteverde', 6, 51);

INSERT INTO LIBROS (ISBN, TITULO, NUMERO_PAGINAS, EXPLICITO) VALUES
('ES762555', 'La Biblia del F.C. Barcelona', 125, FALSE),
('ES902245', 'Cocina fácil', 89, FALSE),
('ES200934', 'Java SE 1', 620, FALSE),
('ES908335', 'Los secretos de Java', 243, TRUE);

INSERT INTO JUGUETES (ID, NOMBRE, PRECIO, TIPO, FECHA_ALTA) VALUES
(100, 'Mecano', 120.0, 'ACCION', '2012-09-18'),
(101, 'Vinicius JR', 2.0, 'PUZZLE', '2017-10-21'),
(102, 'La Switch', 24.0, 'CONSOLA', '2012-02-25'),
(103, 'Mario Karts', 80.0, 'CONSOLA', '2017-10-12');