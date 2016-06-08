-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 05, 2015 at 11:46 PM
-- Server version: 5.5.20
-- PHP Version: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `holidays`
--

-- --------------------------------------------------------

--
-- Table structure for table `passengers`
--

CREATE TABLE IF NOT EXISTS `passengers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `passengerName` varchar(45) NOT NULL,
  `outboundDepartFrom` varchar(45) NOT NULL,
  `outboundDestination` varchar(45) NOT NULL,
  `outboundDepartDate` date NOT NULL,
  `outboundDepartTime` time NOT NULL,
  `outboundArriveTime` time NOT NULL,
  `hotelName` varchar(45) NOT NULL,
  `hotelLocation` varchar(45) NOT NULL,
  `stay` int(11) NOT NULL,
  `checkinDate` date NOT NULL,
  `checkoutDate` date NOT NULL,
  `returnDepartFrom` varchar(45) NOT NULL,
  `returnDestination` varchar(45) NOT NULL,
  `returnDepartDate` date NOT NULL,
  `returnDepartTime` time NOT NULL,
  `returnArriveTime` time NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `passengers`
--

INSERT INTO `passengers` (`id`, `passengerName`, `outboundDepartFrom`, `outboundDestination`, `outboundDepartDate`, `outboundDepartTime`, `outboundArriveTime`, `hotelName`, `hotelLocation`, `stay`, `checkinDate`, `checkoutDate`, `returnDepartFrom`, `returnDestination`, `returnDepartDate`, `returnDepartTime`, `returnArriveTime`) VALUES
(1, 'Joe Bloggs', 'Dublin, Ireland', 'Rome, Italy', '2014-11-20', '12:00:00', '14:30:00', 'Radisson Hotel', 'Rome, Italy', 7, '2014-11-20', '2014-11-27', 'Rome, Italy', 'Dublin, Ireland', '2014-11-27', '15:30:00', '18:00:00'),
(2, 'John Smith', 'Dublin, Ireland', 'Paris, France', '2014-11-03', '09:45:00', '12:00:00', 'Hotel Particulier Montmartre', 'Paris, France', 14, '2014-11-03', '2014-11-17', 'Paris, France', 'Dublin, Ireland', '2014-11-17', '16:30:00', '19:15:00');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
