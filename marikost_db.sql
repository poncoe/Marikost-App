-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 21, 2019 at 06:09 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

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
  `password` varchar(50) NOT NULL,
  `nama_pengguna` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `autentikasi`
--

INSERT INTO `autentikasi` (`username`, `password`, `nama_pengguna`) VALUES
('poncoe', '123456', 'Poncoe'),
('testing', 'test', 'testing');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `autentikasi`
--
ALTER TABLE `autentikasi`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
