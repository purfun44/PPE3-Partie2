----------------------------------------------------------------------------------------------------------------------------------------------
--CREATION DE LA BASE-------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
USE master
GO
----------------------------------------------------------------------------------------------------------------------------------------------
IF EXISTS (SELECT * FROM master.sys.databases WHERE name = 'BDMED')
	BEGIN
		DROP DATABASE BDMED
	END
GO
----------------------------------------------------------------------------------------------------------------------------------------------
CREATE DATABASE BDMED
GO
----------------------------------------------------------------------------------------------------------------------------------------------
--CREATION DES TABLES-------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
USE BDMED
GO
----------------------------------------------------------------------------------------------------------------------------------------------
CREATE TABLE specialite(
	identifiant INT NOT NULL IDENTITY,
	libelle VARCHAR(50),
	CONSTRAINT pk_specialite PRIMARY KEY (identifiant)
)
GO
----------------------------------------------------------------------------------------------------------------------------------------------
CREATE TABLE medecin(
	identifiant INT NOT NULL IDENTITY,
	nom VARCHAR(30),
	prenom VARCHAR(30),
	adresse CHAR(100),
	commune VARCHAR(30),
	codePostal INT NOT NULL,
	telephone INT NOT NULL,
	dateInstall DATETIME,
	idSpecialite INT NOT NULL,
	CONSTRAINT pk_medecin PRIMARY KEY (identifiant),
	CONSTRAINT fk_medecin_specialite FOREIGN KEY (idSpecialite) REFERENCES specialite (identifiant)
)
GO
----------------------------------------------------------------------------------------------------------------------------------------------
