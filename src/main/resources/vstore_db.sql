-- phpMyAdmin SQL Dump
-- version phpStudy 2014
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2019 年 07 月 25 日 19:56
-- 服务器版本: 5.5.53
-- PHP 版本: 5.4.45

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `vstore_db`
--

-- --------------------------------------------------------

--
-- 表的结构 `categorys`
--

CREATE TABLE IF NOT EXISTS `categorys` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `parentId` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `categorys`
--

INSERT INTO `categorys` (`id`, `name`, `parentId`) VALUES
('1', '服装', '0'),
('2', '电脑', '0'),
('3', '上衣', '1');

-- --------------------------------------------------------

--
-- 表的结构 `products`
--

CREATE TABLE IF NOT EXISTS `products` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `desp` varchar(100) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `detail` varchar(100) DEFAULT NULL,
  `imgs` varchar(100) DEFAULT NULL,
  `status` int(10) DEFAULT NULL,
  `categoryId` varchar(20) DEFAULT NULL,
  `pCategoryId` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `products`
--

INSERT INTO `products` (`id`, `name`, `desp`, `price`, `detail`, `imgs`, `status`, `categoryId`, `pCategoryId`) VALUES
('1', '联想ThinkPad 翼4809', '年度重量级新品，X390、T490全新登场 更加轻薄机身设计', '65999', '<p>想你所需，超你所想！精致外观，轻薄便携带光驱，内置正版office杜绝盗版</p>', '"["image-1559402396338.jpg"]"', 1, '2', '0');

-- --------------------------------------------------------

--
-- 表的结构 `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `menus_json` varchar(100) DEFAULT NULL,
  `create_time` varchar(30) DEFAULT NULL,
  `auth_name` varchar(20) DEFAULT NULL,
  `auth_time` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `roles`
--

INSERT INTO `roles` (`id`, `name`, `menus_json`, `create_time`, `auth_name`, `auth_time`) VALUES
('1533', '经理', '["/","/products","/category","/product","/user","/role"]', '1547381117891', 'zhangxiang', '1564055656000'),
('1564055585754', '商品管理员', '["/products","/category","/product"]', '1564055585754', 'zhangxiang', '1564055668000');

-- --------------------------------------------------------

--
-- 表的结构 `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` varchar(20) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `role_id` varchar(20) DEFAULT NULL,
  `create_time` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `phone`, `email`, `role_id`, `create_time`) VALUES
('1564055047815', 'zhangxiang', '123456', '18224361216', '1533911783@qq.com', '1533', '1564055047815'),
('1564055707328', 'admin', 'admin', '1234567899', '111@qq.com', '1533', '1564055707328');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
