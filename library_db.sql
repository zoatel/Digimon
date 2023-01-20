-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2022 at 02:42 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ADMIN_ID` int(255) NOT NULL,
  `user` varchar(600) NOT NULL,
  `pass` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ADMIN_ID`, `user`, `pass`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `BOOK_ID` int(255) NOT NULL,
  `BOOK_NAME` varchar(600) NOT NULL,
  `BOOK_TYPE` int(255) NOT NULL,
  `BOOK_AUTHOR` int(255) NOT NULL,
  `BOOK_PUBLISHER` int(255) NOT NULL,
  `BOOK_STOCK` int(255) NOT NULL,
  `N_OF_RATINGS` int(255) NOT NULL,
  `RATING` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`BOOK_ID`, `BOOK_NAME`, `BOOK_TYPE`, `BOOK_AUTHOR`, `BOOK_PUBLISHER`, `BOOK_STOCK`, `N_OF_RATINGS`, `RATING`) VALUES
(1, 'The Name of the Wind', 1, 1, 1, 29, 0, 0),
(2, 'The Wise Man\'s Fear', 1, 1, 1, 19, 0, 0),
(3, 'The Doors of Stone', 1, 1, 2, 12, 0, 0),
(4, 'Dune', 1, 2, 1, 16, 0, 0),
(5, 'The Lord of the Rings', 1, 3, 4, 14, 1, 4),
(6, 'The Return of the King', 1, 3, 4, 5, 0, 0),
(7, 'The Eye of the World', 1, 4, 5, 22, 0, 0),
(8, 'The Great Hunt', 1, 4, 5, 22, 0, 0),
(9, 'The Dragon Reborn', 1, 4, 5, 18, 1, 5),
(10, 'The Shadow Rising', 1, 4, 5, 2, 0, 0),
(11, 'The Fires of Heaven', 1, 4, 5, 5, 0, 0),
(12, 'Lord of Chaos', 1, 4, 5, 6, 0, 0),
(13, 'A Crown of Swords', 1, 4, 5, 0, 0, 0),
(14, 'A Confederacy of Dunces', 2, 5, 6, 16, 0, 0),
(15, 'Born a Crime', 2, 6, 7, 30, 0, 0),
(16, 'Dear Girls', 2, 7, 8, 3, 0, 0),
(17, 'Cold Comfort Farm', 2, 8, 9, 4, 0, 0),
(18, 'Born Standing Up', 2, 9, 2, 1, 0, 0),
(19, 'A Brief History of Time', 3, 10, 10, 5, 0, 0),
(20, 'The Theory of Everything', 3, 10, 11, 9, 0, 0),
(21, 'The Universe in a Nutshell', 3, 10, 12, 8, 0, 0),
(22, 'The Grand Design', 3, 10, 12, 6, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `book_author`
--

CREATE TABLE `book_author` (
  `AUTHOR_ID` int(255) NOT NULL,
  `AUTHOR` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book_author`
--

INSERT INTO `book_author` (`AUTHOR_ID`, `AUTHOR`) VALUES
(1, 'Patrick Rothfuss'),
(2, 'Frank Herbert'),
(3, 'J. R. R. Tolkien'),
(4, 'Robert Jordan'),
(5, 'John Kennedy Toole'),
(6, 'Trevor Noah'),
(7, 'Ali Wong'),
(8, 'Stella Gibbons'),
(9, 'Steve Martin'),
(10, 'Stephen Hawking');

-- --------------------------------------------------------

--
-- Table structure for table `book_publisher`
--

CREATE TABLE `book_publisher` (
  `PUBLISHER_ID` int(255) NOT NULL,
  `PUBLISHER` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book_publisher`
--

INSERT INTO `book_publisher` (`PUBLISHER_ID`, `PUBLISHER`) VALUES
(1, 'DAW Books'),
(2, 'Simon & Schuster'),
(3, 'Chilton Books'),
(4, 'Allen & Unwin'),
(5, 'Tor Books'),
(6, 'LSU Press'),
(7, 'Spiegel & Grau'),
(8, 'Random House'),
(9, 'Longman'),
(10, 'Bantam Dell'),
(11, 'Jaico'),
(12, 'Bantam Spectra');

-- --------------------------------------------------------

--
-- Table structure for table `book_type`
--

CREATE TABLE `book_type` (
  `TYPE_ID` int(255) NOT NULL,
  `TYPE` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book_type`
--

INSERT INTO `book_type` (`TYPE_ID`, `TYPE`) VALUES
(1, 'Fantasy'),
(2, 'Comedy'),
(3, 'Science');

-- --------------------------------------------------------

--
-- Table structure for table `fanclub`
--

CREATE TABLE `fanclub` (
  `CLUB_ID` int(255) NOT NULL,
  `CLUB_NAME` varchar(600) NOT NULL,
  `BOOK` int(255) DEFAULT NULL,
  `CLUB_ADMIN` varchar(600) DEFAULT NULL,
  `ADMIN_ID` int(255) DEFAULT NULL,
  `M_DATE` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fanclub`
--

INSERT INTO `fanclub` (`CLUB_ID`, `CLUB_NAME`, `BOOK`, `CLUB_ADMIN`, `ADMIN_ID`, `M_DATE`) VALUES
(1, 'DEFAULT', NULL, NULL, NULL, NULL),
(2, 'Dune Fans', 4, '12345678912345', 1, 10);

-- --------------------------------------------------------

--
-- Table structure for table `lend`
--

CREATE TABLE `lend` (
  `B_ID` int(255) NOT NULL,
  `M_ID` int(255) NOT NULL,
  `RETURN_DATE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lend`
--

INSERT INTO `lend` (`B_ID`, `M_ID`, `RETURN_DATE`) VALUES
(4, 1, '2022-06-20');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `MEMBER_ID` int(255) NOT NULL,
  `MEMBER_NAME` varchar(600) NOT NULL,
  `MEMBER_EMAIL` varchar(600) NOT NULL,
  `MEMBER_NID` varchar(600) NOT NULL,
  `MEMBER_PNUMBER` varchar(600) NOT NULL,
  `FAN_1` int(255) NOT NULL,
  `FAN_2` int(255) NOT NULL,
  `FAN_3` int(255) NOT NULL,
  `FAN_C` int(255) NOT NULL,
  `ADMIN` int(255) NOT NULL,
  `BORROWED` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`MEMBER_ID`, `MEMBER_NAME`, `MEMBER_EMAIL`, `MEMBER_NID`, `MEMBER_PNUMBER`, `FAN_1`, `FAN_2`, `FAN_3`, `FAN_C`, `ADMIN`, `BORROWED`) VALUES
(1, 'Yaseen Ashraf', 'yaseenashraf@gmail.com', '12345678912345', '01068514965', 2, 1, 1, 1, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ADMIN_ID`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`BOOK_ID`),
  ADD KEY `type` (`BOOK_TYPE`),
  ADD KEY `author` (`BOOK_AUTHOR`),
  ADD KEY `publisher` (`BOOK_PUBLISHER`);

--
-- Indexes for table `book_author`
--
ALTER TABLE `book_author`
  ADD PRIMARY KEY (`AUTHOR_ID`);

--
-- Indexes for table `book_publisher`
--
ALTER TABLE `book_publisher`
  ADD PRIMARY KEY (`PUBLISHER_ID`);

--
-- Indexes for table `book_type`
--
ALTER TABLE `book_type`
  ADD PRIMARY KEY (`TYPE_ID`);

--
-- Indexes for table `fanclub`
--
ALTER TABLE `fanclub`
  ADD PRIMARY KEY (`CLUB_ID`),
  ADD KEY `admin` (`ADMIN_ID`),
  ADD KEY `bid` (`BOOK`);

--
-- Indexes for table `lend`
--
ALTER TABLE `lend`
  ADD KEY `book` (`B_ID`),
  ADD KEY `member` (`M_ID`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`MEMBER_ID`),
  ADD KEY `f1` (`FAN_1`),
  ADD KEY `f2` (`FAN_2`),
  ADD KEY `f3` (`FAN_3`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `ADMIN_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `BOOK_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `book_author`
--
ALTER TABLE `book_author`
  MODIFY `AUTHOR_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `book_publisher`
--
ALTER TABLE `book_publisher`
  MODIFY `PUBLISHER_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `book_type`
--
ALTER TABLE `book_type`
  MODIFY `TYPE_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `fanclub`
--
ALTER TABLE `fanclub`
  MODIFY `CLUB_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `MEMBER_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `books`
--
ALTER TABLE `books`
  ADD CONSTRAINT `author` FOREIGN KEY (`BOOK_AUTHOR`) REFERENCES `book_author` (`AUTHOR_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `publisher` FOREIGN KEY (`BOOK_PUBLISHER`) REFERENCES `book_publisher` (`PUBLISHER_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `type` FOREIGN KEY (`BOOK_TYPE`) REFERENCES `book_type` (`TYPE_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `fanclub`
--
ALTER TABLE `fanclub`
  ADD CONSTRAINT `admin` FOREIGN KEY (`ADMIN_ID`) REFERENCES `members` (`MEMBER_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bid` FOREIGN KEY (`BOOK`) REFERENCES `books` (`BOOK_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `lend`
--
ALTER TABLE `lend`
  ADD CONSTRAINT `book` FOREIGN KEY (`B_ID`) REFERENCES `books` (`BOOK_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `member` FOREIGN KEY (`M_ID`) REFERENCES `members` (`MEMBER_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `members`
--
ALTER TABLE `members`
  ADD CONSTRAINT `f1` FOREIGN KEY (`FAN_1`) REFERENCES `fanclub` (`CLUB_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `f2` FOREIGN KEY (`FAN_2`) REFERENCES `fanclub` (`CLUB_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `f3` FOREIGN KEY (`FAN_3`) REFERENCES `fanclub` (`CLUB_ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
