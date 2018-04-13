-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Ven 13 Avril 2018 à 14:15
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanque`
--
CREATE DATABASE IF NOT EXISTS `proxibanque` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `proxibanque`;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `idClient` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `codepostale` varchar(255) NOT NULL,
  `ville` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `idConseiller` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`idClient`, `nom`, `prenom`, `adresse`, `codepostale`, `ville`, `email`, `idConseiller`) VALUES
(1, 'Sersoub', 'Nabil', '75 rue de londre', '69002', 'Lyon', 'sersoub.nabil@gmail.com', 1),
(2, 'Batault', 'Frederic', '3 rue du paradis', '69001', 'Lyon', 'batault.frederic@gmail.com', 2),
(3, 'Demolis', 'Alexendre', '34 rue de la boustifais', '69005', 'Lyon', 'alexendre-demolis@outlook.com', 1),
(4, 'Hedi', 'Ines', '8 bis rue de la bastille', '38600', 'Fontaine', 'hedi-ines@gmail.com', 2),
(5, 'Blondel', 'Benoit', '154 avenue des champs', '69006', 'Lyon', 'benoit.blondel@gmail.com', 1),
(6, 'Mannou', 'Tarik', '10 boulevard de paris', '69008', 'Lyon', 'mannou.le meilleur@gtm.com', 2);

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE `compte` (
  `idCompte` int(11) NOT NULL,
  `solde` double NOT NULL,
  `typeCompte` varchar(255) NOT NULL DEFAULT 'CompteCourant',
  `decourvertAutorise` double DEFAULT NULL,
  `tauxRemuneration` double DEFAULT NULL,
  `idClient` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `compte`
--

INSERT INTO `compte` (`idCompte`, `solde`, `typeCompte`, `decourvertAutorise`, `tauxRemuneration`, `idClient`) VALUES
(1, 750, 'CompteCourant', -1000, NULL, 1),
(2, 250, 'CompteEpargne', NULL, 3, 1);

-- --------------------------------------------------------

--
-- Structure de la table `conseiller`
--

CREATE TABLE `conseiller` (
  `IdConseiller` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `conseiller`
--

INSERT INTO `conseiller` (`IdConseiller`, `nom`, `prenom`, `login`, `password`) VALUES
(1, 'Mbiandou', 'Douglas', 'douglas.mbiandou', 'Objis.java'),
(2, 'Pean', 'Frederic', 'frederic.pean', 'Gtm.formation'),
(3, 'Mhoumad', 'Nassur', 'nassur.mhounad', 'Objis.ajile'),
(4, 'Azzouz', 'Lotfi', 'lotfi.azzouz', 'Gtm.proxibanque');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`idClient`),
  ADD KEY `fk_conseillerClient` (`idConseiller`);

--
-- Index pour la table `compte`
--
ALTER TABLE `compte`
  ADD PRIMARY KEY (`idCompte`),
  ADD KEY `fk_client` (`idClient`);

--
-- Index pour la table `conseiller`
--
ALTER TABLE `conseiller`
  ADD PRIMARY KEY (`IdConseiller`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `idClient` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `compte`
--
ALTER TABLE `compte`
  MODIFY `idCompte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `conseiller`
--
ALTER TABLE `conseiller`
  MODIFY `IdConseiller` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
