/*
Navicat MySQL Data Transfer

Source Server         : 本机MySql
Source Server Version : 80015
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-09-21 15:00:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '姓名',
  `sex` varchar(5) DEFAULT NULL,
  `room` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '东方月初', '男', '高三二班', '16', '东方家', '12345');
INSERT INTO `student` VALUES ('2', '王权霸业', '男', '高三一班', '19', '王权家族', '12345');
INSERT INTO `student` VALUES ('3', '齐天大圣', '男', '高三三班', '17', '傲来国', '13579');
INSERT INTO `student` VALUES ('4', '王权富贵', '男', '高二三班', '16', '万寿山', '24680');
INSERT INTO `student` VALUES ('5', '东方淮竹', '女', '高一二班', '17', '王权家族', '12580');
INSERT INTO `student` VALUES ('6', '涂山雅雅', '女', '高三一班', '16', '涂山', '10086');
INSERT INTO `student` VALUES ('7', '涂山荣荣', '女', '初三一班', '15', '涂山', '10256');
INSERT INTO `student` VALUES ('8', '涂山苏苏', '女', '初一一班', '12', '涂山', '10926');
INSERT INTO `student` VALUES ('9', '擎天', '男', '初三三班', '17', '南国', '12352');
