-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 30, 2019 at 09:51 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `marikost_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `autentikasi`
--

CREATE TABLE `autentikasi` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `autentikasi`
--

INSERT INTO `autentikasi` (`username`, `password`) VALUES
('ponc03', '123'),
('poncoe', '123456'),
('testing', 'test'),
('testingg', '123');

-- --------------------------------------------------------

--
-- Table structure for table `homey`
--

CREATE TABLE `homey` (
  `id` varchar(50) NOT NULL,
  `pemilik` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `deskripsi` varchar(50) NOT NULL,
  `wilayah` varchar(50) NOT NULL,
  `kontak` int(50) NOT NULL,
  `harga` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `homey`
--

INSERT INTO `homey` (`id`, `pemilik`, `nama`, `jenis`, `deskripsi`, `wilayah`, `kontak`, `harga`) VALUES
('woke2', 'wisma oke', 'ahuy', 'Untuk Pria', 'wokeh', 'sukabirus', 123123, 2000);

-- --------------------------------------------------------

--
-- Table structure for table `mitra`
--

CREATE TABLE `mitra` (
  `nama_mitra` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mitra`
--

INSERT INTO `mitra` (`nama_mitra`, `password`) VALUES
('Royal Kost', '123'),
('Wisma Oke', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `autentikasi`
--
ALTER TABLE `autentikasi`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `homey`
--
ALTER TABLE `homey`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mitra`
--
ALTER TABLE `mitra`
  ADD PRIMARY KEY (`nama_mitra`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
