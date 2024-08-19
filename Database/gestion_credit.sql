-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2024 at 06:52 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestion_credit`
--

-- --------------------------------------------------------

--
-- Table structure for table `categorie`
--

CREATE TABLE `categorie` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categorie`
--

INSERT INTO `categorie` (`id`, `nom`) VALUES
(1, 'Admin'),
(2, 'Agent de credit'),
(3, 'Agent de creditss');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(80) NOT NULL,
  `date` date NOT NULL,
  `civilite` varchar(50) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `tel` varchar(50) NOT NULL,
  `cni` varchar(80) NOT NULL,
  `numero_compte` varchar(80) NOT NULL,
  `categorie` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id`, `nom`, `prenom`, `date`, `civilite`, `genre`, `adresse`, `tel`, `cni`, `numero_compte`, `categorie`) VALUES
(1, 'MUGISHA', 'Samuel', '2024-08-08', 'Marié', 'Homme', 'Ruyigi', '+257 67 89 45 32', '576844/54432', '456', 1),
(2, 'MUNEZERO', 'Gerardine', '2024-08-09', 'Non marié', 'Femme', 'Kayanza', '+257 34 56 78 89', '958/444', '001/2024', 2),
(3, 'IRANKUNDA', 'Jeovanie', '2024-08-08', 'Marié', 'Femme', 'Ruyigi', '+257 68 86 09 48', '5644/6970', '002/2024', 4);

-- --------------------------------------------------------

--
-- Table structure for table `demande`
--

CREATE TABLE `demande` (
  `id` int(11) NOT NULL,
  `client` int(11) NOT NULL,
  `type_credit` int(11) NOT NULL,
  `date` date NOT NULL,
  `montant` int(11) NOT NULL,
  `etat` varchar(80) NOT NULL DEFAULT 'En attente',
  `date_remb` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `demande`
--

INSERT INTO `demande` (`id`, `client`, `type_credit`, `date`, `montant`, `etat`, `date_remb`) VALUES
(1, 1, 1, '2024-08-08', 80000, 'Approuvée', '2024-08-31'),
(2, 2, 1, '2024-08-16', 400000, 'Retard', '2024-08-13');

-- --------------------------------------------------------

--
-- Table structure for table `documents`
--

CREATE TABLE `documents` (
  `id` int(11) NOT NULL,
  `client` int(11) NOT NULL,
  `Attestation d'Identite complete` tinyint(1) NOT NULL,
  `Attestation de service` tinyint(1) NOT NULL,
  `Photocopie de la CNI` tinyint(1) NOT NULL,
  `Devis chiffres du projet a financer` tinyint(1) NOT NULL,
  `Extrait d'acte de mariage` tinyint(1) NOT NULL,
  `Accreditif` tinyint(1) NOT NULL,
  `Justification des revenus declares` tinyint(1) NOT NULL,
  `Garantie` tinyint(1) NOT NULL,
  `Accreditif des derniers mois pour le salarie` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `rembourcement`
--

CREATE TABLE `rembourcement` (
  `id` int(11) NOT NULL,
  `demande` int(11) NOT NULL,
  `date` date NOT NULL,
  `montant` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rembourcement`
--

INSERT INTO `rembourcement` (`id`, `demande`, `date`, `montant`) VALUES
(1, 1, '2024-08-16', 80000);

-- --------------------------------------------------------

--
-- Table structure for table `type_client`
--

CREATE TABLE `type_client` (
  `id` int(11) NOT NULL,
  `nom` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `type_client`
--

INSERT INTO `type_client` (`id`, `nom`) VALUES
(1, 'Avaliseur'),
(2, 'Fonctionnaire'),
(3, 'Commercant'),
(4, 'Agriculteur'),
(5, 'Eleveur');

-- --------------------------------------------------------

--
-- Table structure for table `type_credit`
--

CREATE TABLE `type_credit` (
  `id` int(11) NOT NULL,
  `nom` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `type_credit`
--

INSERT INTO `type_credit` (`id`, `nom`) VALUES
(1, 'Crédit scolaire'),
(2, 'Crédit ordinaire'),
(3, 'Découvert sur salaire'),
(4, 'Crédit express'),
(5, 'Crédit d\'investissement'),
(6, 'Pret au personnel'),
(7, 'Avance spéciale au salaire'),
(8, 'Crédit aux'),
(9, 'Crédit Warrantage'),
(10, 'Crédit au Groupe Solidaire'),
(11, 'Crédit de Campagne'),
(12, 'Découvert Commercial Trimestriel'),
(13, 'Découvert Commercial Semestriel');

-- --------------------------------------------------------

--
-- Table structure for table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `userID` int(11) NOT NULL,
  `nom` varchar(80) NOT NULL,
  `prenom` varchar(80) NOT NULL,
  `email` varchar(255) NOT NULL,
  `tel` varchar(50) NOT NULL,
  `mot_de_passe` varchar(50) NOT NULL,
  `categorie` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `utilisateur`
--

INSERT INTO `utilisateur` (`userID`, `nom`, `prenom`, `email`, `tel`, `mot_de_passe`, `categorie`) VALUES
(1, 'IZOMPANSAVYE', 'Chalome', 'chalome@gmail.com', '+257 68 89 47 73', 'chalome1999', 1),
(2, 'Chalome', 'Chalome', 'chalome@gmail.com', '+257 68 89 47 73', 'chal123', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `demande`
--
ALTER TABLE `demande`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `documents`
--
ALTER TABLE `documents`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rembourcement`
--
ALTER TABLE `rembourcement`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `type_client`
--
ALTER TABLE `type_client`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `type_credit`
--
ALTER TABLE `type_credit`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `demande`
--
ALTER TABLE `demande`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `documents`
--
ALTER TABLE `documents`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `rembourcement`
--
ALTER TABLE `rembourcement`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `type_client`
--
ALTER TABLE `type_client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `type_credit`
--
ALTER TABLE `type_credit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
