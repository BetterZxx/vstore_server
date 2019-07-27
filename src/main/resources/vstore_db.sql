/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : vstore_db

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-07-27 12:31:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `categorys`
-- ----------------------------
DROP TABLE IF EXISTS `categorys`;
CREATE TABLE `categorys` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `parentId` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of categorys
-- ----------------------------
INSERT INTO `categorys` VALUES ('1', '家用', '0');
INSERT INTO `categorys` VALUES ('10', 'iphoneX', '3');
INSERT INTO `categorys` VALUES ('11', '上衣', '4');
INSERT INTO `categorys` VALUES ('1564144692147', 't-shirt', '4');
INSERT INTO `categorys` VALUES ('2', '电器', '0');
INSERT INTO `categorys` VALUES ('3', '电子产品', '0');
INSERT INTO `categorys` VALUES ('30', '眼影', '6');
INSERT INTO `categorys` VALUES ('4', '服装', '0');
INSERT INTO `categorys` VALUES ('5', '食品', '0');
INSERT INTO `categorys` VALUES ('6', '化妆品', '0');
INSERT INTO `categorys` VALUES ('7', '洗护用品', '0');
INSERT INTO `categorys` VALUES ('8', '厨具', '1');
INSERT INTO `categorys` VALUES ('9', '冰箱', '2');

-- ----------------------------
-- Table structure for `products`
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
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

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES ('1', '联想ThinkPad 翼4809', '年度重量级新品，X390、T490全新登场 更加轻薄机身设计', '65999', '<p>想你所需，超你所想！精致外观，轻薄便携带光驱，内置正版office杜绝盗版</p>', '\"[\"image-1559402396338.jpg\"]\"', '1', '2', '0');

-- ----------------------------
-- Table structure for `roles`
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `menus_json` varchar(100) DEFAULT NULL,
  `create_time` varchar(30) DEFAULT NULL,
  `auth_name` varchar(20) DEFAULT NULL,
  `auth_time` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('1533', '经理', '[\"/\",\"/products\",\"/category\",\"/product\",\"/user\",\"/role\"]', '1547381117891', 'zhangxiang', '1564055656000');
INSERT INTO `roles` VALUES ('1564055585754', '商品管理员', '[\"/products\",\"/category\",\"/product\"]', '1564055585754', 'zhangxiang', '1564055668000');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` varchar(20) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `role_id` varchar(20) DEFAULT NULL,
  `create_time` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1564055047815', 'zhangxiang', '123456', '18224361216', '1533911783@qq.com', '1533', '1564055047815');
INSERT INTO `users` VALUES ('1564055707328', 'admin', 'admin', '1234567899', '111@qq.com', '1533', '1564055707328');

