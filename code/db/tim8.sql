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
CREATE DATABASE IF NOT EXISTS `tim8` DEFAULT CHARACTER SET utf8 COLLATE utf8_slovenian_ci;

USE `tim8`;
-- --------------------------------------------------------

--
-- Table structure for table `komentar`
--

CREATE TABLE `komentar` (
  `id` int(11) NOT NULL,
  `id_korisnika` int(11) NOT NULL,
  `id_lokacije` int(11) NOT NULL,
  `tekst` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `korisnik`
--

CREATE TABLE `korisnik` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `ime` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `broj_tacnih_prijava` int(11) NOT NULL,
  `broj_netacnih_prijava` int(11) NOT NULL,
  `ocjena` double NOT NULL,
  `admin` BIT(1) NOT NULL,
  `super_admin` BIT(1) NOT NULL
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
  `id_korisnika` int(11) NOT NULL,
  `id_lokacije` int(11) NOT NULL,
  `vrijeme_odjave` int(11) NOT NULL,
  `ispravnost_odjave` int(2) NOT NULL,
  `id_prijave` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `prijavapolozaja`
--

CREATE TABLE `prijavapolozaja` (
  `id` int(11) NOT NULL,
  `id_korisnika` int(11) NOT NULL,
  `id_lokacije` int(11) NOT NULL,
  `vrsta_kontrole` varchar(255) DEFAULT NULL,
  `vrijeme_prijave` time NOT NULL,
  `ispravnost_prijave` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `komentar`
--
ALTER TABLE `komentar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_korisnika` (`id_korisnika`),
  ADD KEY `id_lokacije` (`id_lokacije`);

--
-- Indexes for table `korisnik`
--
ALTER TABLE `korisnik`
  ADD PRIMARY KEY (`id`);

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
  ADD KEY `id_korisnika` (`id_korisnika`),
  ADD KEY `id_lokacije` (`id_lokacije`),
  ADD KEY `id_prijave` (`id_prijave`);

--
-- Indexes for table `prijavapolozaja`
--
ALTER TABLE `prijavapolozaja`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_korisnika` (`id_korisnika`),
  ADD KEY `id_lokacije` (`id_lokacije`);

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
  ADD CONSTRAINT `komentar_ibfk_1` FOREIGN KEY (`id_korisnika`) REFERENCES `korisnik` (`id`),
  ADD CONSTRAINT `komentar_ibfk_2` FOREIGN KEY (`id_lokacije`) REFERENCES `lokacija` (`id`);

--
-- Constraints for table `odjavapolozaja`
--
ALTER TABLE `odjavapolozaja`
  ADD CONSTRAINT `odjavapolozaja_ibfk_1` FOREIGN KEY (`id_korisnika`) REFERENCES `korisnik` (`id`),
  ADD CONSTRAINT `odjavapolozaja_ibfk_2` FOREIGN KEY (`id_lokacije`) REFERENCES `lokacija` (`id`),
  ADD CONSTRAINT `odjavapolozaja_ibfk_3` FOREIGN KEY (`id_prijave`) REFERENCES `prijavapolozaja` (`id`);

--
-- Constraints for table `prijavapolozaja`
--
ALTER TABLE `prijavapolozaja`
  ADD CONSTRAINT `prijavapolozaja_ibfk_1` FOREIGN KEY (`id_korisnika`) REFERENCES `korisnik` (`id`),
  ADD CONSTRAINT `prijavapolozaja_ibfk_2` FOREIGN KEY (`id_lokacije`) REFERENCES `lokacija` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
