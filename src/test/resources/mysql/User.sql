/*
 Navicat Premium Data Transfer

 Source Server         : sample
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : sample

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 14/11/2018 21:30:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for User
-- ----------------------------
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `id` varchar(32) NOT NULL,
  `name` varchar(64) NOT NULL,
  `pwd` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of User
-- ----------------------------
BEGIN;
INSERT INTO `User` VALUES ('lisi', '李四', '765578');
INSERT INTO `User` VALUES ('wangwu', '王五', '888888');
INSERT INTO `User` VALUES ('zhangshan', '张三', '123456');
INSERT INTO `User` VALUES ('zhaoliu', '赵六', '1111111');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
