/*
Navicat MySQL Data Transfer

Source Server         : serTest
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : kindacg

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2018-06-14 13:26:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `administrator`
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `a_id` int(20) NOT NULL DEFAULT '0',
  `a_account` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `a_password` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  `a_name` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `a_telephone` int(15) DEFAULT NULL,
  `a_email` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `a_createtime` datetime DEFAULT NULL,
  `P_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`a_id`),
  KEY `FK92DDDAAD2DDC5B0E` (`P_ID`),
  CONSTRAINT `FK92DDDAAD2DDC5B0E` FOREIGN KEY (`P_ID`) REFERENCES `power` (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES ('1', 'admin', '123456', 'first', null, null, null, null);

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `c_id` int(20) NOT NULL DEFAULT '0',
  `c_comment` mediumtext COLLATE utf8_unicode_ci,
  `u_id` int(20) DEFAULT NULL,
  `a_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`c_id`),
  KEY `u_id` (`u_id`),
  KEY `a_id` (`a_id`),
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`),
  CONSTRAINT `comment_ibfk_2` FOREIGN KEY (`a_id`) REFERENCES `administrator` (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for `information`
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information` (
  `i_id` int(20) NOT NULL DEFAULT '0',
  `i_title` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `i_text` longtext COLLATE utf8_unicode_ci,
  `i_createtime` datetime DEFAULT NULL,
  `a_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`i_id`),
  KEY `a_id` (`a_id`),
  CONSTRAINT `information_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `administrator` (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of information
-- ----------------------------

-- ----------------------------
-- Table structure for `power`
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power` (
  `p_id` int(20) NOT NULL DEFAULT '0',
  `p_create` tinyint(1) DEFAULT NULL,
  `p_update` tinyint(1) DEFAULT NULL,
  `p_retrieve` tinyint(1) DEFAULT NULL,
  `p_delete` tinyint(1) DEFAULT NULL,
  `p_comment` tinyint(1) DEFAULT NULL,
  `A_ID` int(11) DEFAULT NULL,
  `U_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`p_id`),
  KEY `FK48C90E564CAC251` (`U_ID`),
  KEY `FK48C90E5D1CF9445` (`A_ID`),
  CONSTRAINT `FK48C90E564CAC251` FOREIGN KEY (`U_ID`) REFERENCES `user` (`u_id`),
  CONSTRAINT `FK48C90E5D1CF9445` FOREIGN KEY (`A_ID`) REFERENCES `administrator` (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of power
-- ----------------------------
INSERT INTO `power` VALUES ('1', '0', '0', '1', '0', '1', null, null);

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(20) NOT NULL DEFAULT '0',
  `u_account` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `u_password` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  `u_name` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `u_telephone` int(15) DEFAULT NULL,
  `u_email` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `u_createtime` datetime DEFAULT NULL,
  `P_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  KEY `FK27E3CB2DDC5B0E` (`P_ID`),
  CONSTRAINT `FK27E3CB2DDC5B0E` FOREIGN KEY (`P_ID`) REFERENCES `power` (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '123', '123', '123', '123', '2018-05-02 00:00:00', '1');
INSERT INTO `user` VALUES ('2', 'wang', '123456', 'wang123', '190', '733', '2018-05-14 00:00:00', '1');
INSERT INTO `user` VALUES ('3', 'yu', '123456', 'yu123', '123', '332', null, null);
