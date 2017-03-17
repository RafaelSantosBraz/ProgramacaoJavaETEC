/*
SQLyog Community Edition- MySQL GUI v6.07
Host - 5.6.17 : Database - bdloja
*********************************************************************
Server version : 5.6.17
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `bdloja`;

USE `bdloja`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `cliente_fisica` */

DROP TABLE IF EXISTS `cliente_fisica`;

CREATE TABLE `cliente_fisica` (
  `Cod_Cliente_Fisica` int(4) NOT NULL AUTO_INCREMENT,
  `Nome_Cliente_Fisica` varchar(40) NOT NULL,
  `Rua_Cliente_Fisica` varchar(30) NOT NULL,
  `Bairro_Cliente_Fisica` varchar(30) NOT NULL,
  `Complemento_Cliente_Fisica` varchar(30) DEFAULT NULL,
  `Cidade_Cliente_Fisica` varchar(40) NOT NULL,
  `UF_Cliente_Fisica` varchar(30) NOT NULL,
  `CPF_Cliente_Fisica` int(11) NOT NULL,
  `RG_Cliente_Fisica` int(9) NOT NULL,
  `Sexo_Cliente_Fisica` varchar(20) DEFAULT NULL,
  `CEP_Cliente_Fisica` int(8) NOT NULL,
  `Email_Cliente_Fisica` varchar(50) NOT NULL,
  `DDD_Telefone_Cliente_Fisica` int(2) NOT NULL,
  `Numero_Telefone_Cliente_Fisica` int(9) NOT NULL,
  `Tipo_Telefone_Cliente_Fisica` varchar(30) NOT NULL,
  PRIMARY KEY (`Cod_Cliente_Fisica`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cliente_fisica` */

/*Table structure for table `cliente_juridica` */

DROP TABLE IF EXISTS `cliente_juridica`;

CREATE TABLE `cliente_juridica` (
  `Cod_Cliente_Juridica` int(4) NOT NULL AUTO_INCREMENT,
  `Nome_Cliente_Juridica` varchar(40) NOT NULL,
  `Bairro_Cliente_Juridica` varchar(30) NOT NULL,
  `Complemento_Cliente_Juridica` varchar(30) DEFAULT NULL,
  `Numero_Cliente_Juridica` int(4) DEFAULT NULL,
  `Cidade_Cliente_Juridica` varchar(40) NOT NULL,
  `UF_Cliente_Juridica` varchar(30) NOT NULL,
  `CNPJ_Cliente_Juridica` varchar(20) NOT NULL,
  `Inscricao_Estadual_Cliente_Juridica` varchar(30) NOT NULL,
  `CEP_Cliente_Juridica` int(8) NOT NULL,
  `Email_Cliente_Juridica` varchar(50) NOT NULL,
  `DDD_Telefone_Cliente_Juridica` int(2) NOT NULL,
  `Numero_Telefone_Cliente_Juridica` int(9) NOT NULL,
  `Tipo_Telefone_Cliente_Juridica` varchar(30) NOT NULL,
  PRIMARY KEY (`Cod_Cliente_Juridica`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cliente_juridica` */


/*Table structure for table `fornecedor` */

DROP TABLE IF EXISTS `fornecedor`;

CREATE TABLE `fornecedor` (
  `Cod_Fornecedor` int(4) NOT NULL AUTO_INCREMENT,
  `Nome_Fornecedor` varchar(40) NOT NULL,
  `Bairro_Fornecedor` varchar(30) NOT NULL,
  `Complemento_Fornecedor` varchar(30) DEFAULT NULL,
  `Cidade_Fornecedor` varchar(40) NOT NULL,
  `UF_Fornecedor` varchar(30) NOT NULL,
  `CNPJ_Fornecedor` varchar(20) NOT NULL,
  `Inscricao_Estadual_Fornecedor` varchar(30) NOT NULL,
  `CEP_Fornecedor` int(9) NOT NULL,
  `Email_Fornecedor` varchar(50) NOT NULL,
  `DDD_Telefone_Fornecedor` int(2) NOT NULL,
  `Numero_Telefone_Fornecedor` int(9) NOT NULL,
  `Tipo_Telefone_Fornecedor` varchar(30) NOT NULL,
  PRIMARY KEY (`Cod_Fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fornecedor` */

/*Table structure for table `contato` */

DROP TABLE IF EXISTS `contato`;

CREATE TABLE `contato` (
  `Cod_Contato` int(4) NOT NULL AUTO_INCREMENT,
  `Cod_Fornecedor` int(4) NOT NULL,
  `Nome_Contato` varchar(40) NOT NULL,
  PRIMARY KEY (`Cod_Contato`),
  KEY `Contato_FKIndex1` (`Cod_Fornecedor`),
  CONSTRAINT `FK_contato` FOREIGN KEY (`Cod_Fornecedor`) REFERENCES `fornecedor` (`Cod_Fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contato` */

/*Table structure for table `produto` */

DROP TABLE IF EXISTS `produto`;

CREATE TABLE `produto` (
  `Cod_Produto` int(4) NOT NULL AUTO_INCREMENT,
  `Nome_Produto` varchar(40) NOT NULL,
  `Preco_Compra_Produto` double NOT NULL,
  `Preco_Venda_Produto` double NOT NULL,
  `Prazo_Validade_Produto` date NOT NULL,
  `Garantia_Produto` date NOT NULL,
  `Descricao_Produto` varchar(90) NOT NULL,
  PRIMARY KEY (`Cod_Produto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `produto` */

/*Table structure for table `fornecimento` */

DROP TABLE IF EXISTS `fornecimento`;

CREATE TABLE `fornecimento` (
  `Cod_Fornecedor` int(4) NOT NULL,
  `Cod_Produto` int(4) NOT NULL,
  `Data_Fornecimeto` date NOT NULL,
  `Valor_Total_Fornecimeto` double NOT NULL,
  PRIMARY KEY (`Cod_Fornecedor`,`Cod_Produto`),
  KEY `Fornecedor_has_Produto_FKIndex1` (`Cod_Fornecedor`),
  KEY `Fornecedor_has_Produto_FKIndex2` (`Cod_Produto`),
  CONSTRAINT `FK_fornecimento` FOREIGN KEY (`Cod_Fornecedor`) REFERENCES `fornecedor` (`Cod_Fornecedor`),
  CONSTRAINT `FK_fornecimento2` FOREIGN KEY (`Cod_Produto`) REFERENCES `produto` (`Cod_Produto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fornecimento` */

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `Cod_Funcionario` int(4) NOT NULL AUTO_INCREMENT,
  `Nome_Funcionario` varchar(40) NOT NULL,
  `Rua_Funcionario` varchar(30) NOT NULL,
  `Bairro_Funcionario` varchar(40) NOT NULL,
  `Complemento_Funcionario` varchar(30) DEFAULT NULL,
  `Cidade_Funcionario` varchar(40) NOT NULL,
  `UF_Funcionario` varchar(30) NOT NULL,
  `CPF_Funcionario` int(11) NOT NULL,
  `RG_Funcionario` int(9) NOT NULL,
  `Sexo_Funcionario` varchar(20) DEFAULT NULL,
  `CEP_Funcionario` int(8) NOT NULL,
  PRIMARY KEY (`Cod_Funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */


/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `Cod_Usuario` int(4) NOT NULL AUTO_INCREMENT,
  `Nome_Usuario` varchar(40) NOT NULL,
  `Login_Usuario` varchar(40) NOT NULL,
  `Senha_Usuario` varchar(10) NOT NULL,
  `Cod_Funcionario` int(4) NOT NULL,
  PRIMARY KEY (`Cod_Usuario`),
  KEY `Cod_Funcionario` (`Cod_Funcionario`),
  CONSTRAINT `FK_usuario` FOREIGN KEY (`Cod_Funcionario`) REFERENCES `funcionario` (`Cod_Funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

/*Table structure for table `venda_cliente_fisica` */

DROP TABLE IF EXISTS `venda_cliente_fisica`;

CREATE TABLE `venda_cliente_fisica` (
  `Cod_Venda_Cliente_Fisica` int(4) NOT NULL,
  `Cod_Cliente_Fisica` int(4) NOT NULL,
  `Cod_Produto` int(4) NOT NULL,
  `Cod_Usuario` int(4) NOT NULL,
  `Hora_Venda_Cliente_Fisica` time NOT NULL,
  `Data_Venda_Cliente_Fisica` date NOT NULL,
  `Quantidade_Produtos_Venda_Cliente_Fisica` int(4) NOT NULL,
  `Total_Venda_Cliente_Fisica` double NOT NULL,
  PRIMARY KEY (`Cod_Venda_Cliente_Fisica`,`Cod_Cliente_Fisica`,`Cod_Produto`),
  KEY `Cliente_Fisica_has_Produto_FKIndex1` (`Cod_Cliente_Fisica`),
  KEY `Cliente_Fisica_has_Produto_FKIndex2` (`Cod_Produto`),
  KEY `Venda_Cliente_Fisica_FKIndex3` (`Cod_Usuario`),
  CONSTRAINT `FK_venda_cliente_fisica` FOREIGN KEY (`Cod_Cliente_Fisica`) REFERENCES `cliente_fisica` (`Cod_Cliente_Fisica`),
  CONSTRAINT `FK_venda_cliente_fisica2` FOREIGN KEY (`Cod_Produto`) REFERENCES `produto` (`Cod_Produto`),
  CONSTRAINT `FK_venda_cliente_fisica3` FOREIGN KEY (`Cod_Usuario`) REFERENCES `usuario` (`Cod_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `venda_cliente_fisica` */

/*Table structure for table `venda_cliente_juridica` */

DROP TABLE IF EXISTS `venda_cliente_juridica`;

CREATE TABLE `venda_cliente_juridica` (
  `Cod_Venda_Cliente_Juridica` int(4) NOT NULL,
  `Cod_Cliente_Juridica` int(4) NOT NULL,
  `Cod_Produto` int(4) NOT NULL,
  `Cod_Usuario` int(4) NOT NULL,
  `Hora_Venda_Cliente_Juridica` time NOT NULL,
  `Data_Venda_Cliente_Juridica` date NOT NULL,
  `Quantidade_Produto_Venda_Cliente_Juridica` int(4) NOT NULL,
  `Total_Venda_Cliente_Juridica` double NOT NULL,
  PRIMARY KEY (`Cod_Venda_Cliente_Juridica`,`Cod_Cliente_Juridica`,`Cod_Produto`),
  KEY `Cliente_Juridica_has_Produto_FKIndex1` (`Cod_Cliente_Juridica`),
  KEY `Cliente_Juridica_has_Produto_FKIndex2` (`Cod_Produto`),
  KEY `Venda_Cliente_Juridica_FKIndex3` (`Cod_Usuario`),
  CONSTRAINT `FK_venda_cliente_juridica` FOREIGN KEY (`Cod_Cliente_Juridica`) REFERENCES `cliente_juridica` (`Cod_Cliente_Juridica`),
  CONSTRAINT `FK_venda_cliente_juridica2` FOREIGN KEY (`Cod_Produto`) REFERENCES `produto` (`Cod_Produto`),
  CONSTRAINT `FK_venda_cliente_juridica3` FOREIGN KEY (`Cod_Usuario`) REFERENCES `usuario` (`Cod_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `venda_cliente_juridica` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
