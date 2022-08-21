-- MySQL dump 10.13  Distrib 5.7.25, for Win64 (x86_64)
--
-- Host: localhost    Database: electromex
-- ------------------------------------------------------
-- Server version	5.7.25-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `electromex`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `electromex` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `electromex`;

--
-- Table structure for table `clasificacionpropiedad`
--

DROP TABLE IF EXISTS `clasificacionpropiedad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificacionpropiedad` (
  `id_cla` int(11) NOT NULL AUTO_INCREMENT,
  `nom_cla` varchar(15) NOT NULL,
  PRIMARY KEY (`id_cla`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificacionpropiedad`
--

LOCK TABLES `clasificacionpropiedad` WRITE;
/*!40000 ALTER TABLE `clasificacionpropiedad` DISABLE KEYS */;
INSERT INTO `clasificacionpropiedad` VALUES (1,'Domestica'),(2,'Industrial'),(3,'Comercial');
/*!40000 ALTER TABLE `clasificacionpropiedad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consumoequipo`
--

DROP TABLE IF EXISTS `consumoequipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consumoequipo` (
  `id_eeq` int(11) NOT NULL AUTO_INCREMENT,
  `id_usu` int(11) NOT NULL,
  PRIMARY KEY (`id_eeq`),
  KEY `id_usu` (`id_usu`),
  CONSTRAINT `consumoequipo_ibfk_1` FOREIGN KEY (`id_usu`) REFERENCES `tipousuario` (`id_usu`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consumoequipo`
--

LOCK TABLES `consumoequipo` WRITE;
/*!40000 ALTER TABLE `consumoequipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `consumoequipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consumototal`
--

DROP TABLE IF EXISTS `consumototal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consumototal` (
  `id_con` int(11) NOT NULL AUTO_INCREMENT,
  `con_tot` decimal(6,2) NOT NULL,
  `id_pro` int(11) NOT NULL,
  PRIMARY KEY (`id_con`),
  KEY `id_pro` (`id_pro`),
  CONSTRAINT `consumototal_ibfk_1` FOREIGN KEY (`id_pro`) REFERENCES `propiedad` (`id_pro`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consumototal`
--

LOCK TABLES `consumototal` WRITE;
/*!40000 ALTER TABLE `consumototal` DISABLE KEYS */;
/*!40000 ALTER TABLE `consumototal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delegacion`
--

DROP TABLE IF EXISTS `delegacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delegacion` (
  `id_del` int(11) NOT NULL AUTO_INCREMENT,
  `nom_del` varchar(40) NOT NULL,
  PRIMARY KEY (`id_del`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delegacion`
--

LOCK TABLES `delegacion` WRITE;
/*!40000 ALTER TABLE `delegacion` DISABLE KEYS */;
INSERT INTO `delegacion` VALUES (1,'Alvaro Obregon'),(2,'Azcapotzalco'),(3,'Benito Juarez'),(4,'Coyoacan'),(5,'Cuajimalpa'),(6,'Cuauhtemoc'),(7,'Gustavo A. Madero'),(8,'Iztacalco'),(9,'Iztapalapa'),(10,'Magdalena Contreras'),(11,'Miguel Hidalgo'),(12,'Milpa Alta'),(13,'Tlahuac'),(14,'Tlalpan'),(15,'Venustiano Carranza'),(16,'Xochimilco');
/*!40000 ALTER TABLE `delegacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `descripcionconsumoequipo`
--

DROP TABLE IF EXISTS `descripcionconsumoequipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descripcionconsumoequipo` (
  `id_des` int(11) NOT NULL AUTO_INCREMENT,
  `id_eeq` int(11) NOT NULL,
  `id_equ` int(11) NOT NULL,
  `id_pri` int(11) NOT NULL,
  `id_tie` time NOT NULL,
  `id_pro` int(11) NOT NULL,
  PRIMARY KEY (`id_des`),
  KEY `id_eeq` (`id_eeq`),
  KEY `id_equ` (`id_equ`),
  KEY `id_pri` (`id_pri`),
  KEY `id_pro` (`id_pro`),
  CONSTRAINT `descripcionconsumoequipo_ibfk_1` FOREIGN KEY (`id_eeq`) REFERENCES `consumoequipo` (`id_eeq`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `descripcionconsumoequipo_ibfk_2` FOREIGN KEY (`id_equ`) REFERENCES `equipo` (`id_equ`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `descripcionconsumoequipo_ibfk_3` FOREIGN KEY (`id_pri`) REFERENCES `prioridaduso` (`id_pri`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `descripcionconsumoequipo_ibfk_4` FOREIGN KEY (`id_pro`) REFERENCES `propiedad` (`id_pro`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descripcionconsumoequipo`
--

LOCK TABLES `descripcionconsumoequipo` WRITE;
/*!40000 ALTER TABLE `descripcionconsumoequipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `descripcionconsumoequipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipo` (
  `id_equ` int(11) NOT NULL AUTO_INCREMENT,
  `nom_equ` varchar(30) DEFAULT NULL,
  `kw_equ` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`id_equ`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `id_per` int(11) NOT NULL AUTO_INCREMENT,
  `nom_per` varchar(30) NOT NULL,
  `id_usu` int(11) NOT NULL,
  `fec_per` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_per`),
  KEY `id_usu` (`id_usu`),
  CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`id_usu`) REFERENCES `tipousuario` (`id_usu`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prioridaduso`
--

DROP TABLE IF EXISTS `prioridaduso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prioridaduso` (
  `id_pri` int(11) NOT NULL AUTO_INCREMENT,
  `nom_pri` varchar(10) NOT NULL,
  PRIMARY KEY (`id_pri`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prioridaduso`
--

LOCK TABLES `prioridaduso` WRITE;
/*!40000 ALTER TABLE `prioridaduso` DISABLE KEYS */;
/*!40000 ALTER TABLE `prioridaduso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `privilegio`
--

DROP TABLE IF EXISTS `privilegio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `privilegio` (
  `id_priv` int(11) NOT NULL AUTO_INCREMENT,
  `tip_priv` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id_priv`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `privilegio`
--

LOCK TABLES `privilegio` WRITE;
/*!40000 ALTER TABLE `privilegio` DISABLE KEYS */;
INSERT INTO `privilegio` VALUES (1,'administrador'),(2,'usuario');
/*!40000 ALTER TABLE `privilegio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propiedad`
--

DROP TABLE IF EXISTS `propiedad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `propiedad` (
  `id_pro` int(11) NOT NULL AUTO_INCREMENT,
  `nom_pro` varchar(30) DEFAULT NULL,
  `id_del` int(11) NOT NULL,
  `id_usu` int(11) NOT NULL,
  `id_cla` int(11) NOT NULL,
  `id_tip` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pro`),
  KEY `id_del` (`id_del`),
  KEY `id_usu` (`id_usu`),
  KEY `id_cla` (`id_cla`),
  KEY `id_tip` (`id_tip`),
  CONSTRAINT `id_tip` FOREIGN KEY (`id_tip`) REFERENCES `tipotarifa` (`id_tip`),
  CONSTRAINT `propiedad_ibfk_1` FOREIGN KEY (`id_del`) REFERENCES `delegacion` (`id_del`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `propiedad_ibfk_2` FOREIGN KEY (`id_usu`) REFERENCES `tipousuario` (`id_usu`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `propiedad_ibfk_3` FOREIGN KEY (`id_cla`) REFERENCES `clasificacionpropiedad` (`id_cla`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propiedad`
--

LOCK TABLES `propiedad` WRITE;
/*!40000 ALTER TABLE `propiedad` DISABLE KEYS */;
/*!40000 ALTER TABLE `propiedad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiempo`
--

DROP TABLE IF EXISTS `tiempo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiempo` (
  `id_ano` int(11) NOT NULL AUTO_INCREMENT,
  `des_ano` int(11) NOT NULL,
  PRIMARY KEY (`id_ano`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiempo`
--

LOCK TABLES `tiempo` WRITE;
/*!40000 ALTER TABLE `tiempo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiempo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipotarifa`
--

DROP TABLE IF EXISTS `tipotarifa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipotarifa` (
  `id_tip` int(11) NOT NULL AUTO_INCREMENT,
  `nom_tip` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_tip`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipotarifa`
--

LOCK TABLES `tipotarifa` WRITE;
/*!40000 ALTER TABLE `tipotarifa` DISABLE KEYS */;
INSERT INTO `tipotarifa` VALUES (1,'1'),(2,'1A'),(3,'1B'),(4,'1C'),(5,'1D'),(6,'1E'),(7,'1F'),(8,'DAC');
/*!40000 ALTER TABLE `tipotarifa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipousuario` (
  `id_usu` int(11) NOT NULL AUTO_INCREMENT,
  `nom_usu` varchar(30) NOT NULL,
  `id_priv` int(11) NOT NULL,
  `con_usu` varchar(20) NOT NULL,
  PRIMARY KEY (`id_usu`),
  KEY `id_priv` (`id_priv`),
  CONSTRAINT `tipousuario_ibfk_1` FOREIGN KEY (`id_priv`) REFERENCES `privilegio` (`id_priv`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `variable`
--

DROP TABLE IF EXISTS `variable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `variable` (
  `id_var` int(11) NOT NULL AUTO_INCREMENT,
  `var_imp` decimal(6,2) NOT NULL,
  `var_pre` decimal(6,2) NOT NULL,
  `var_tar` decimal(6,2) NOT NULL,
  `var_sub` decimal(6,2) NOT NULL,
  `id_tip` int(11) NOT NULL,
  `id_ano` int(11) NOT NULL,
  PRIMARY KEY (`id_var`),
  KEY `id_tip` (`id_tip`),
  KEY `id_ano` (`id_ano`),
  CONSTRAINT `variable_ibfk_1` FOREIGN KEY (`id_tip`) REFERENCES `tipotarifa` (`id_tip`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `variable_ibfk_2` FOREIGN KEY (`id_ano`) REFERENCES `tiempo` (`id_ano`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `variable`
--

LOCK TABLES `variable` WRITE;
/*!40000 ALTER TABLE `variable` DISABLE KEYS */;
/*!40000 ALTER TABLE `variable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-07 16:55:02
