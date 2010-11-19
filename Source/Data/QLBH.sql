-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 19, 2010 at 01:10 PM
-- Server version: 5.1.36
-- PHP Version: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `quanlybanhang`
--

-- --------------------------------------------------------

--
-- Table structure for table `commodities`
--

CREATE TABLE IF NOT EXISTS `commodities` (
  `commodityId` int(10) NOT NULL AUTO_INCREMENT,
  `commodityName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `commodityType` int(10) unsigned NOT NULL,
  `unitPrice` float NOT NULL,
  `description` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `imgUrl` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `feature` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `amountExisting` int(10) unsigned NOT NULL,
  `manufacturer` int(10) unsigned NOT NULL,
  `warranty` int(10) unsigned NOT NULL DEFAULT '12',
  PRIMARY KEY (`commodityId`),
  KEY `FK_commodities_CommodityType` (`commodityType`),
  KEY `commodities_ibfk_2` (`manufacturer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Dumping data for table `commodities`
--


-- --------------------------------------------------------

--
-- Table structure for table `commoditytype`
--

CREATE TABLE IF NOT EXISTS `commoditytype` (
  `commodityTypeId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `commodityTypeName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`commodityTypeId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=11 ;

--
-- Dumping data for table `commoditytype`
--

INSERT INTO `commoditytype` (`commodityTypeId`, `commodityTypeName`, `description`) VALUES
(1, 'Quạt', 'các loại quạt'),
(2, 'Bàn ủi', ''),
(3, 'Thiết bị chăm sóc tóc', ''),
(4, 'Bàn ủi', ''),
(5, 'Massage', ''),
(6, 'Bộ nồi', ''),
(7, 'Xay đậu nành', ''),
(8, 'Nồi cơm điện', ''),
(9, 'Lò vi sóng', ''),
(10, 'Máy hút bụi', '');

-- --------------------------------------------------------

--
-- Table structure for table `manufacturers`
--

CREATE TABLE IF NOT EXISTS `manufacturers` (
  `manufacturerId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `manufacturerName` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `country` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`manufacturerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Dumping data for table `manufacturers`
--


-- --------------------------------------------------------

--
-- Table structure for table `orderdetail`
--

CREATE TABLE IF NOT EXISTS `orderdetail` (
  `orderDetailId` int(10) NOT NULL AUTO_INCREMENT,
  `order` int(10) DEFAULT NULL,
  `commodity` int(10) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`orderDetailId`),
  KEY `order` (`order`),
  KEY `commodity` (`commodity`),
  KEY `commodity_2` (`commodity`),
  KEY `F2` (`commodity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Dumping data for table `orderdetail`
--


-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE IF NOT EXISTS `orders` (
  `orderId` int(10) NOT NULL AUTO_INCREMENT,
  `customer` int(10) NOT NULL,
  `orderDate` datetime DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  KEY `customer` (`customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Dumping data for table `orders`
--


-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
  `paymentId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `deliveryAddress` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `paymentType` int(10) unsigned NOT NULL,
  `cardNumber` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `order` int(10) NOT NULL,
  `employee` int(10) NOT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`paymentId`),
  KEY `FK_payment_2` (`paymentType`),
  KEY `order` (`order`),
  KEY `employee` (`employee`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Dumping data for table `payment`
--


-- --------------------------------------------------------

--
-- Table structure for table `paymenttype`
--

CREATE TABLE IF NOT EXISTS `paymenttype` (
  `paymentTypeId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `paymentTypeName` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`paymentTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Dumping data for table `paymenttype`
--


-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `roleId` int(10) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `roleDescription` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`roleId`, `roleName`, `roleDescription`) VALUES
(1, 'Khách hàng', 'Là khách hàng của công ty, đăng nhập vào trang web để mua hàng'),
(2, 'Nhân viên', 'Là nhân viên của công ty, sau khi đăng nhập có thể xem các phiếu đặt hàng của khách hàng'),
(3, 'Quản trị', 'Là người chịu trách nhiệm quản trị web');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `userId` int(10) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` bit(1) DEFAULT NULL,
  `dateOfBirth` datetime DEFAULT NULL,
  `cellphone` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role` int(10) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `role` (`role`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=74 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userId`, `fullname`, `address`, `gender`, `dateOfBirth`, `cellphone`, `email`, `username`, `password`, `role`) VALUES
(50, 'Nguyễn Duy Khánh', '95/7A XO VIET NGHE TINH - P.21 - Q.BINH THANH 158/66 XO VIET NGHE TINH - P.21 - Q.BINH THANH HCM', b'1', '1984-08-03 00:00:00', '', '0612001@student.hcmus.edu.vn', '612001', '', 1),
(51, 'Nguyễn Thị Bé Hai', '1/23 CALMETTE, P.NGUYEN THAI BINH, Q.1  TPHCM', b'0', '1989-01-05 00:00:00', '', '0612002@student.hcmus.edu.vn', '612002', '', 1),
(52, 'Nguyễn Phước Hòa', '55 TRAN HUNG DAO - TP.NAM DINH 33 BIS TRAN QUANG KHAI - Q1 - TP.HCM ', b'1', '1984-02-11 00:00:00', '', '0612003@student.hcmus.edu.vn', '612003', '', 1),
(53, 'Lê Thị Bé Mười', '100/4 NGUYEN DINH CHIEU, Q.1  TP HCM', b'0', '0000-00-00 00:00:00', '', '0612004@student.hcmus.edu.vn', '612004', '', 1),
(54, 'Lữ Phúc Nguyên', '26/14 TRUONG DINH - Q1 337/5 NGUYEN TRAI - P.NGUYEN CU TRINH - Q1 HCM', b'1', '1969-08-08 00:00:00', '', '0612005@student.hcmus.edu.vn', '612005', '', 1),
(55, 'Lê Nguyên cẩn', '15B/82 LE THANH TON,P. BEN NGHE, Q.1  TP HCM', b'1', '1975-08-11 00:00:00', '', '0612006@student.hcmus.edu.vn', '612006', '', 1),
(56, 'Phan văn Minh', '214/10 PHAN VAN TRI, P.12, Q.BINH THANH  TPHCM', b'1', '1975-10-04 00:00:00', '', '0612007@student.hcmus.edu.vn', '612007', '', 1),
(57, 'Ngô Minh Thiện', '70 BIS TRAN DINH XU, P.CO GIANG, Q.1  TPHCM', b'1', '0000-00-00 00:00:00', '', '0612008@student.hcmus.edu.vn', '612008', '', 1),
(58, 'Lê Nguyễn Kim Xuyến ', '76/6B XOM DAT, P.8, Q.11  TPHCM', b'0', '1976-01-11 00:00:00', '', '0612009@student.hcmus.edu.vn', '612009', '', 1),
(59, 'Bùi Hữu Lộc', '06 THI SACH, Q.1  TP HCM', b'1', '1977-05-01 00:00:00', '', '0612010@student.hcmus.edu.vn', '612010', '', 1),
(60, 'Phạm Hoàng Pha', '237/61 TRAN VAN DANG - P.11 - Q3 104 LUONG DINH CUA - P.BINH KHANH - Q2 HCM', b'0', '0000-00-00 00:00:00', '', '0612011@student.hcmus.edu.vn', '612011', '', 1),
(61, 'Phan Minh Triết', '290/2 BUI DINH TUY, P.12, Q. BINH THANH  TPHCM', b'1', '1961-08-02 00:00:00', '', '0612012@student.hcmus.edu.vn', '612012', '', 1),
(62, 'Phạm Thị Hồng Hạnh', 'K5 - P8 - TXTV - TRA VINH 205A TRAN HUNG DAO - Q5 HCM', b'0', '0000-00-00 00:00:00', '', '0612013@student.hcmus.edu.vn', '612013', '', 1),
(63, 'Võ Đại Quang Trưởng', '259 LE VAN LUONG, Q.7  TPHCM', b'1', '0000-00-00 00:00:00', '', '0612014@student.hcmus.edu.vn', '612014', '', 1),
(64, 'Hoàng Trần Đình Quân', '98 BUI VIEN, P. PHAM NGU LAO, Q.1  TP HCM', b'1', '0000-00-00 00:00:00', '', '0612015@student.hcmus.edu.vn', '612015', '', 1),
(65, 'Võ Thị Ngọc Hân', '240 DOC LAP, P . TAN THANH, TAN PHU, TP.HCM  TP.HCM', b'0', '1978-02-12 00:00:00', '', '0612016@student.hcmus.edu.vn', '612016', '', 1),
(66, 'Lâm Minh Tài', '16 TRUONG QUOC DUNG - P8 - Q.PHU NHUAN  HCM', b'1', '1962-08-09 00:00:00', '', '0612017@student.hcmus.edu.vn', '612017', '', 1),
(67, 'Trần Thị Kim Ngọc', '220/8 NGUYEN VAN NGHI - P.7 - Q.GO VAP 105 LE QUANG DINH - P.14 - Q.BINH THANH HCM', b'0', '0000-00-00 00:00:00', '', '0612018@student.hcmus.edu.vn', '612018', '', 1),
(68, 'Ngô Hồng Khánh', '72/7A BACH DANG, P24, BINH THANH, TP.HCM  ', b'1', '1966-02-10 00:00:00', '', '0612020@student.hcmus.edu.vn', '612020', '', 1),
(69, 'Trịnh Thanh Lâm', '94 PHAM NGOC THACH - P.6 - Q.3  HCM', b'1', '0000-00-00 00:00:00', '', '0612021@student.hcmus.edu.vn', '612021', '', 1),
(70, 'Tạ Thái Bình', '51 BEN CHUONG DUONG, Q.1  TPHCM', b'1', '0000-00-00 00:00:00', '', '0612022@student.hcmus.edu.vn', '612022', '', 1),
(71, 'Phương Lập Cơ', 'P.1101-LO C CC PHAM VIET CHANH, Q BINH THANH  TPHCM', b'1', '1983-07-08 00:00:00', '', '0612023@student.hcmus.edu.vn', '612023', '', 1),
(72, 'Ngô Quốc Đạt', '147/A9 DE THAM, P.CO GIANG, Q.1  TPHCM', b'1', '0000-00-00 00:00:00', '', '0612024@student.hcmus.edu.vn', '612024', '', 1),
(73, 'Trần Ngọc Linh', '132/154 DOAN VAN BO - P.14 - Q4  HCM', b'0', '1984-07-07 00:00:00', '', '0612025@student.hcmus.edu.vn', '612025', '', 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `commodities`
--
ALTER TABLE `commodities`
  ADD CONSTRAINT `commodities_ibfk_1` FOREIGN KEY (`commodityType`) REFERENCES `commoditytype` (`commodityTypeId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `commodities_ibfk_2` FOREIGN KEY (`manufacturer`) REFERENCES `manufacturers` (`manufacturerId`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD CONSTRAINT `F2` FOREIGN KEY (`commodity`) REFERENCES `commodities` (`commodityId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `orderdetail_ibfk_1` FOREIGN KEY (`order`) REFERENCES `orders` (`orderId`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer`) REFERENCES `users` (`userId`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`paymentType`) REFERENCES `paymenttype` (`paymentTypeId`),
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`order`) REFERENCES `orders` (`orderId`),
  ADD CONSTRAINT `payment_ibfk_3` FOREIGN KEY (`employee`) REFERENCES `users` (`userId`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`role`) REFERENCES `role` (`roleId`);

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `payment`(
    deliveryAddress varchar(100),
    paymentType int,
    cardNumber varchar(14),
    orderId int,
    employee int,
    paymentStatus bit
)
BEGIN
    INSERT INTO `quanlybanhang`.`payment`
        (
        `deliveryAddress`,
        `paymentType`,
        `cardNumber`,
        `order`,
        `employee`,
        `status`)
    VALUES
    (
    
    deliveryAddress,
    paymentType,
    cardNumber,
    orderId,
    employee,
    paymentStatus
    );

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AddCommodity`(
    commodityName varchar(40),
    commodityType int,
    unitPrice float,
    description varchar(100),
    imgUrl varchar(100),
    feature varchar(255),
    amountExisting int
)
BEGIN

    INSERT INTO `quanlybanhang`.`commodities`
    (
        `commodityName`,
        `commodityType`,
        `unitPrice`,
        `description`,
        `imgUrl`,
        `feature`,
        `amountExisting`)
    VALUES
    (    
        commodityName,
        commodityType,
        unitPrice,
        description,
        imgUrl,
        feature,
        amountExisting
    );

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AddCommodityType`(
    commodityTypeName varchar(100),
    description varchar(255)
)
BEGIN

    INSERT INTO `quanlybanhang`.`commoditytype`
    (
        `commodityTypeName`,
        `description`)
    VALUES
    (        
        commodityTypeName,
        description
    );


END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AddOrder`(
    customer int,
    orderDate datetime,
    orderStatus bit
)
BEGIN
    INSERT INTO `quanlybanhang`.`orders`
    (
    `customer`,
    `orderDate`,
    `status`)
    VALUES
    (   
    customer,
    orderDate,
    orderStatus
    );

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AddOrderDetail`(
    orders int,
    commodity int,
    amount int,
    price float
)
BEGIN

    INSERT INTO `quanlybanhang`.`orderdetail`
    (
    `order`,
    `commodity`,
    `amount`,
    `price`)
    VALUES
    (    
    orders,
    commodity,
    amount,
    price
    );

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AddPaymentType`(
    paymentTypeName varchar(100),
    description varchar(255)
)
BEGIN
    INSERT INTO `quanlybanhang`.`paymenttype`
    (
        `paymentTypeName`,
        `description`)
    VALUES
    (    
    paymentTypeName,
    description
    );
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AddRole`(
    roleName varchar(40),
    roleDescription varchar(255)
)
BEGIN
    INSERT INTO `quanlybanhang`.`role`
    (
        `roleName`,
        `roleDescription`)
    VALUES
    (    
        roleName,
        roleDescription
    );
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AddUser`(
        fullname varchar(50),
        address varchar(100),
        gender bit,
        dateOfBirth datetime,
        cellphone varchar(14),
        email varchar(50),
        username varchar(50),
        passwords varchar(100),
        role int

)
BEGIN
    INSERT INTO `quanlybanhang`.`users`
    (
        `fullname`,
        `address`,
        `gender`,
        `dateOfBirth`,
        `cellphone`,
        `email`,
        `username`,
        `password`,
        `role`)
    VALUES
    (    
        fullname,
        address,
        gender,
        dateOfBirth,
        cellphone,
        email,
        username,
        passwords,
        role
    );

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_GetCommodityAll`()
BEGIN
  select * from commodities;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_GetCommodityTypeAll`()
BEGIN
  select * from commodityType;
END$$

DELIMITER ;
