-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2017 at 06:52 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tim8`
--

-- --------------------------------------------------------

--
-- Table structure for table `komentar`
--

CREATE TABLE `komentar` (
  `id` int(11) NOT NULL,
  `idKorisnika` int(11) NOT NULL,
  `idLokacije` int(11) NOT NULL,
  `komentar` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `korisnik`
--

CREATE TABLE `korisnik` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `imeIPrezime` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `brojTacnihPrijava` int(11) NOT NULL,
  `brojNetacnihPrijava` int(11) NOT NULL,
  `ocjena` double NOT NULL,
  `admin` BIT(1) NOT NULL,
  `superAdmin` BIT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lokacija`
--

CREATE TABLE `lokacija` (
  `id` int(11) NOT NULL,
  `naziv` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `odjavapolozaja`
--

CREATE TABLE `odjavapolozaja` (
  `id` int(11) NOT NULL,
  `korisnikId` int(11) NOT NULL,
  `lokacijaId` int(11) NOT NULL,
  `vrijemeOdjave` int(11) NOT NULL,
  `ispravnostOdjave` int(2) NOT NULL,
  `idPrijave` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `prijavapolozaja`
--

CREATE TABLE `prijavapolozaja` (
  `id` int(11) NOT NULL,
  `korisnikId` int(11) NOT NULL,
  `lokacijaId` int(11) NOT NULL,
  `vrstaKontrole` varchar(255) DEFAULT NULL,
  `vrijemePrijave` time NOT NULL,
  `ispravnostPrijave` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `komentar`
--
ALTER TABLE `komentar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idKorisnika` (`idKorisnika`),
  ADD KEY `idLokacije` (`idLokacije`);

--
-- Indexes for table `korisnik`
--
ALTER TABLE `korisnik`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `lokacija`
--
ALTER TABLE `lokacija`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `odjavapolozaja`
--
ALTER TABLE `odjavapolozaja`
  ADD PRIMARY KEY (`id`),
  ADD KEY `korisnikId` (`korisnikId`),
  ADD KEY `lokacijaId` (`lokacijaId`),
  ADD KEY `idPrijave` (`idPrijave`);

--
-- Indexes for table `prijavapolozaja`
--
ALTER TABLE `prijavapolozaja`
  ADD PRIMARY KEY (`id`),
  ADD KEY `korisnikId` (`korisnikId`),
  ADD KEY `lokacijaId` (`lokacijaId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `komentar`
--
ALTER TABLE `komentar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `korisnik`
--
ALTER TABLE `korisnik`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `lokacija`
--
ALTER TABLE `lokacija`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `odjavapolozaja`
--
ALTER TABLE `odjavapolozaja`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `prijavapolozaja`
--
ALTER TABLE `prijavapolozaja`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `komentar`
--
ALTER TABLE `komentar`
  ADD CONSTRAINT `komentar_ibfk_1` FOREIGN KEY (`idKorisnika`) REFERENCES `korisnik` (`id`),
  ADD CONSTRAINT `komentar_ibfk_2` FOREIGN KEY (`idLokacije`) REFERENCES `lokacija` (`id`);

--
-- Constraints for table `odjavapolozaja`
--
ALTER TABLE `odjavapolozaja`
  ADD CONSTRAINT `odjavapolozaja_ibfk_1` FOREIGN KEY (`korisnikId`) REFERENCES `korisnik` (`id`),
  ADD CONSTRAINT `odjavapolozaja_ibfk_2` FOREIGN KEY (`lokacijaId`) REFERENCES `lokacija` (`id`),
  ADD CONSTRAINT `odjavapolozaja_ibfk_3` FOREIGN KEY (`idPrijave`) REFERENCES `prijavapolozaja` (`id`);

--
-- Constraints for table `prijavapolozaja`
--
ALTER TABLE `prijavapolozaja`
  ADD CONSTRAINT `prijavapolozaja_ibfk_1` FOREIGN KEY (`korisnikId`) REFERENCES `korisnik` (`id`),
  ADD CONSTRAINT `prijavapolozaja_ibfk_2` FOREIGN KEY (`lokacijaId`) REFERENCES `lokacija` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
