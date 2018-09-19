/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-09-19 11:03:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for guser
-- ----------------------------
DROP TABLE IF EXISTS `guser`;
CREATE TABLE `guser` (
  `id` bigint(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `dept_id` bigint(20) DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_user` bigint(20) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of guser
-- ----------------------------
INSERT INTO `guser` VALUES ('1041980730994319361', 'admin', '18', null, '1', '2018-09-18 17:22:18', '1', '2018-09-18 17:22:18');
INSERT INTO `guser` VALUES ('1041981307421712385', 'test', '18', '1', '1', '2018-09-18 17:25:54', '1', '2018-09-18 17:25:54');
INSERT INTO `guser` VALUES ('1042236871405912065', 'test1', '18', '1', '1', '2018-09-19 10:20:09', '1', '2018-09-19 10:20:09');
SET FOREIGN_KEY_CHECKS=1;
