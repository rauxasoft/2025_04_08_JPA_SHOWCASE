CREATE SEQUENCE "JUGUETES_SEQ"
	MINVALUE 5000
	MAXVALUE 999999999
	INCREMENT BY 50
	START WITH 5000
	NOCACHE
	NOCYCLE;
	
CREATE SEQUENCE "NOTICIAS_SEQ"
	MINVALUE 5000
	MAXVALUE 999999999
	INCREMENT BY 50
	START WITH 5000
	NOCACHE
	NOCYCLE;
	
CREATE TABLE VEHICULOS(

	MATRICULA		VARCHAR(10)			NOT NULL,
	MARCA			VARCHAR(50)			NOT NULL,
	
	PRIMARY KEY (MATRICULA)

);

CREATE TABLE COCHES(

	NUMERO_PUERTAS	INTEGER				NOT NULL, 
	MATRICULA		VARCHAR(10)			NOT NULL,
	
	PRIMARY KEY(MATRICULA),
	FOREIGN KEY(MATRICULA) REFERENCES VEHICULOS (MATRICULA)
);

CREATE TABLE MOTOS(

	PATA_CABRA		BOOLEAN				,
	MATRICULA		VARCHAR(10)			NOT NULL,
	
	PRIMARY KEY(MATRICULA),
	FOREIGN KEY(MATRICULA) REFERENCES VEHICULOS (MATRICULA)
);
	
CREATE TABLE NOTICIAS(

	ID				BIGINT				NOT NULL,
	TITULO			VARCHAR(150)		,
	SUBTITULO		VARCHAR(200)		,
	
	PRIMARY KEY(ID)
);

CREATE TABLE COMENTARIOS(

	AUTOR			VARCHAR(150)		NOT NULL,
	COMENTARIO		VARCHAR(250)		NOT NULL,
	ID_NOTICIA		BIGINT				NOT NULL,
	ORDEN			INTEGER				NOT NULL,
	
	FOREIGN KEY(ID_NOTICIA) REFERENCES NOTICIAS (ID)

);
	
CREATE TABLE ASIGNATURAS(

	ID				BIGINT				NOT NULL,
	NOMBRE			VARCHAR(150)		,
	CREDITOS		INTEGER				,
	
	PRIMARY KEY(ID)
);

CREATE TABLE ALUMNOS(

	ID				BIGINT				NOT NULL,
	NOMBRE_COMPLETO VARCHAR(150)		,
	
	PRIMARY KEY(ID)
);

CREATE TABLE ASIGNATURAS_ALUMNOS(

	ID_ASIGNATURA	BIGINT				NOT NULL,
	ID_ALUMNO		BIGINT				NOT NULL,
	
	PRIMARY KEY(ID_ASIGNATURA, ID_ALUMNO),
	FOREIGN KEY (ID_ASIGNATURA) REFERENCES ASIGNATURAS (ID),
	FOREIGN KEY (ID_ALUMNO) REFERENCES ALUMNOS (ID)
);

CREATE TABLE PROVEEDORES(

	ID				BIGINT				NOT NULL,
	NOMBRE			VARCHAR(100)		,
	VIA				VARCHAR(100)		,
	MUNICIPIO		VARCHAR(100)		,
	CODIGO_POSTAL	VARCHAR(10)			,
	PROVINCIA		VARCHAR(100)		,
	PAIS			VARCHAR(100)		,
	
	PRIMARY KEY(ID)

);

CREATE TABLE EQUIPOS(

	ID				BIGINT				NOT NULL,
	NOMBRE			VARCHAR(100)		,
	FECHA_FUNDACION	DATE				,
	
	PRIMARY KEY(ID)

);

CREATE TABLE JUGADORES(

	ID				BIGINT				NOT NULL,
	NOMBRE			VARCHAR(200)		,
	APELLIDO1		VARCHAR(200)		,
	APELLIDO2		VARCHAR(200)		,
	DORSAL			INTEGER				,
	ID_EQUIPO		BIGINT				,
	
	PRIMARY KEY(ID),
	FOREIGN KEY(ID_EQUIPO) REFERENCES EQUIPOS (ID)
);

CREATE TABLE LIBROS(

	ISBN			VARCHAR(50)			NOT NULL,
	TITULO			VARCHAR(200)		,
	NUMERO_PAGINAS	INTEGER				,
	EXPLICITO		BOOLEAN				,
	
	PRIMARY KEY (ISBN)

);

CREATE TABLE JUGUETES(

	ID				BIGINT				NOT NULL, 
	NOMBRE			VARCHAR(200)		,
	PRECIO			DOUBLE				,
	TIPO			VARCHAR(20)			,
	FECHA_ALTA		DATE				,
	
	PRIMARY KEY(ID)
	
);