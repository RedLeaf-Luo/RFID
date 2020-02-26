/*
Navicat MySQL Data Transfer

Source Server         : black
Source Server Version : 50045
Source Host           : localhost:3306
Source Database       : rfid

Target Server Type    : MYSQL
Target Server Version : 50045
File Encoding         : 65001

Date: 2018-11-07 15:31:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `alarm_record`
-- ----------------------------
DROP TABLE IF EXISTS `alarm_record`;
CREATE TABLE `alarm_record` (
  `alarm_record_id` int(11) NOT NULL auto_increment,
  `m_id` int(11) default NULL,
  `goods_name` varchar(64) NOT NULL,
  `ware_house_name` varchar(64) default NULL,
  `alarm_record_time` datetime NOT NULL,
  PRIMARY KEY  (`alarm_record_id`),
  KEY `alarm_record_time` (`alarm_record_time`),
  KEY `goods_name` (`goods_name`),
  KEY `ware_house_name` (`ware_house_name`),
  KEY `FK_monitor_alarm` (`m_id`),
  CONSTRAINT `FK_monitor_alarm` FOREIGN KEY (`m_id`) REFERENCES `monitor` (`m_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alarm_record
-- ----------------------------
INSERT INTO `alarm_record` VALUES ('1', '1', '灯泡', '四号仓库', '2018-09-30 11:00:02');
INSERT INTO `alarm_record` VALUES ('2', '2', '狗狗娃娃', '六号仓库', '2018-09-27 08:30:53');
INSERT INTO `alarm_record` VALUES ('3', '3', '南极人被子', '四号仓库', '2018-09-08 08:32:10');
INSERT INTO `alarm_record` VALUES ('4', '4', '美的空调', '六号仓库', '2018-09-01 08:33:51');
INSERT INTO `alarm_record` VALUES ('5', '5', '百事可乐', '三号仓库', '2018-09-26 08:34:47');
INSERT INTO `alarm_record` VALUES ('6', '6', '南极人被子', '四号仓库', '2018-10-25 08:46:45');
INSERT INTO `alarm_record` VALUES ('7', '7', '南极人被子', '四号仓库', '2018-10-26 16:57:43');
INSERT INTO `alarm_record` VALUES ('8', '8', '南极人被子', '四号仓库', '2018-10-26 16:58:44');
INSERT INTO `alarm_record` VALUES ('9', '9', '灯泡', '四号仓库', '2018-10-25 17:08:13');
INSERT INTO `alarm_record` VALUES ('10', '10', '灯泡', '四号仓库', '2018-10-31 17:09:24');
INSERT INTO `alarm_record` VALUES ('11', '11', '美的空调', '六号仓库', '2018-10-31 08:48:19');
INSERT INTO `alarm_record` VALUES ('12', '12', '狗狗娃娃', '六号仓库', '2018-11-02 08:49:42');
INSERT INTO `alarm_record` VALUES ('13', '13', '狗狗娃娃', '六号仓库', '2018-11-03 09:14:38');
INSERT INTO `alarm_record` VALUES ('14', '14', '灯泡', '四号仓库', '2018-11-04 10:41:45');
INSERT INTO `alarm_record` VALUES ('15', '12', '狗狗娃娃', '六号仓库', '2018-11-04 10:42:49');
INSERT INTO `alarm_record` VALUES ('16', '16', '百事可乐', '三号仓库', '2018-11-01 10:09:28');
INSERT INTO `alarm_record` VALUES ('17', '17', '灯泡', '四号仓库', '2018-11-05 10:09:28');
INSERT INTO `alarm_record` VALUES ('18', '18', '狗狗娃娃', '六号仓库', '2018-11-05 10:09:28');
INSERT INTO `alarm_record` VALUES ('19', '19', '百事可乐', '三号仓库', '2018-11-05 10:09:28');
INSERT INTO `alarm_record` VALUES ('20', '20', '灯泡', '四号仓库', '2018-11-05 10:09:28');
INSERT INTO `alarm_record` VALUES ('21', '21', '百事可乐', '三号仓库', '2018-11-05 10:09:28');

-- ----------------------------
-- Table structure for `export`
-- ----------------------------
DROP TABLE IF EXISTS `export`;
CREATE TABLE `export` (
  `export_id` int(11) NOT NULL auto_increment,
  `rfid_id` varchar(64) default NULL,
  `user_id` varchar(64) NOT NULL,
  `user_name` varchar(32) NOT NULL,
  `goods_id` varchar(64) NOT NULL,
  `goods_name` varchar(64) NOT NULL,
  `ware_house_name` varchar(64) NOT NULL,
  `export_time` datetime NOT NULL,
  PRIMARY KEY  (`export_id`),
  KEY `export_time` (`export_time`),
  KEY `export_ware_house_name` (`ware_house_name`),
  KEY `FK_goods_export2` (`goods_id`),
  CONSTRAINT `FK_goods_export2` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of export
-- ----------------------------
INSERT INTO `export` VALUES ('1', 'rfid01', '0104160201', '黎宇科', 'good01', '美的风扇', '一号仓库', '2018-09-17 16:54:53');
INSERT INTO `export` VALUES ('2', 'rfid02', '0104160202', '小朋友', 'good02', '可口可乐', '二号仓库', '2018-09-17 17:06:50');
INSERT INTO `export` VALUES ('3', 'rfid02', '0104160202', '小朋友', 'good09', '电饭锅', '六号仓库', '2018-10-17 17:06:50');
INSERT INTO `export` VALUES ('4', 'rfid02', '0104160202', '小朋友', 'good10', '联想电脑', '六号仓库', '2018-10-17 17:06:50');
INSERT INTO `export` VALUES ('5', 'rfid02', '0104160202', '小朋友', 'good11', '戴尔笔记本', '六号仓库', '2018-10-17 17:06:50');
INSERT INTO `export` VALUES ('6', 'rfid02', '0104160202', '小朋友', 'good12', '沙雕图画', '六号仓库', '2018-10-17 17:06:50');
INSERT INTO `export` VALUES ('7', 'rfid02', '0104160202', '小朋友', 'good13', '水晶灯', '六号仓库', '2018-11-01 17:06:50');
INSERT INTO `export` VALUES ('8', 'rfid02', '0104160202', '小朋友', 'good14', '尚方宝剑', '六号仓库', '2018-11-04 17:06:50');
INSERT INTO `export` VALUES ('9', 'rfid02', '0104160202', '小朋友', 'good15', '葵花宝典', '六号仓库', '2018-11-03 17:06:50');
INSERT INTO `export` VALUES ('10', 'rfid02', '0104160202', '小朋友', 'good16', '倚天屠龙刀', '六号仓库', '2018-11-04 17:06:50');
INSERT INTO `export` VALUES ('11', 'rfid02', '0104160202', '小朋友', 'good17', 'iPhone100', '六号仓库', '2018-10-31 17:06:50');
INSERT INTO `export` VALUES ('12', 'rfid02', '0104160202', '小朋友', 'good18', 'oppo10000', '六号仓库', '2018-11-02 17:06:50');
INSERT INTO `export` VALUES ('13', 'rfid02', '0104160202', '小朋友', 'good19', '三星盖乐世', '六号仓库', '2018-11-02 17:06:50');
INSERT INTO `export` VALUES ('14', 'rfid02', '0104160202', '小朋友', 'good20', '什么东西', '六号仓库', '2018-11-05 17:06:50');
INSERT INTO `export` VALUES ('15', 'rfid02', '0104160202', '小朋友', 'good21', '珍珠奶茶', '六号仓库', '2018-11-05 17:06:50');

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id` varchar(64) NOT NULL,
  `goods_name` varchar(64) NOT NULL,
  `rfid_id` varchar(64) NOT NULL,
  `ware_house_id` varchar(64) default NULL,
  `ware_house_name` varchar(64) default NULL,
  `inport_id` int(11) default NULL,
  `inport_time` datetime NOT NULL,
  `goods_state` varchar(16) NOT NULL,
  PRIMARY KEY  (`goods_id`),
  KEY `goods_inport_time` (`inport_time`),
  KEY `goods_ware_house_name` (`ware_house_name`),
  KEY `FK_inport_goods2` (`inport_id`),
  KEY `FK_rfid_goods2` (`rfid_id`),
  KEY `FK_ware_goods` (`ware_house_id`),
  CONSTRAINT `FK_inport_goods2` FOREIGN KEY (`inport_id`) REFERENCES `inport` (`inport_id`),
  CONSTRAINT `FK_rfid_goods2` FOREIGN KEY (`rfid_id`) REFERENCES `rfid` (`rfid_id`),
  CONSTRAINT `FK_ware_goods` FOREIGN KEY (`ware_house_id`) REFERENCES `ware_house` (`ware_house_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('good01', '美的风扇', 'rfid01', 'ck01', '一号仓库', '1', '2018-09-17 16:25:34', 'out');
INSERT INTO `goods` VALUES ('good02', '可口可乐', 'rfid02', 'ck02', '二号仓库', '2', '2018-09-17 16:44:17', 'out');
INSERT INTO `goods` VALUES ('good03', '百事可乐', 'rfid03', 'ck03', '三号仓库', '3', '2018-09-17 16:45:48', 'in');
INSERT INTO `goods` VALUES ('good05', '灯泡', 'rfid05', 'ck05', '四号仓库', '4', '2018-09-17 16:47:08', 'in');
INSERT INTO `goods` VALUES ('good06', '狗狗娃娃', 'rfid06', 'ck06', '六号仓库', '5', '2018-09-17 16:47:57', 'in');
INSERT INTO `goods` VALUES ('good07', '南极人被子', 'rfid01', 'ck05', '四号仓库', '6', '2018-09-17 17:13:16', 'in');
INSERT INTO `goods` VALUES ('good08', '美的空调', 'rfid02', 'ck06', '六号仓库', '7', '2018-09-17 17:16:07', 'in');
INSERT INTO `goods` VALUES ('good09', '电饭锅', 'rfid02', 'ck06', '六号仓库', '8', '2018-09-17 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good10', '联想电脑', 'rfid02', 'ck06', '六号仓库', '9', '2018-09-17 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good11', '戴尔笔记本', 'rfid02', 'ck06', '六号仓库', '10', '2018-10-31 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good12', '沙雕图画', 'rfid02', 'ck06', '六号仓库', '11', '2018-11-01 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good13', '水晶灯', 'rfid02', 'ck06', '六号仓库', '12', '2018-11-01 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good14', '尚方宝剑', 'rfid02', 'ck06', '六号仓库', '13', '2018-11-01 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good15', '葵花宝典', 'rfid02', 'ck06', '六号仓库', '14', '2018-11-02 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good16', '倚天屠龙刀', 'rfid02', 'ck06', '六号仓库', '15', '2018-11-03 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good17', 'iPhone100', 'rfid02', 'ck06', '六号仓库', '16', '2018-11-03 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good18', 'oppo10000', 'rfid02', 'ck06', '六号仓库', '17', '2018-11-04 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good19', '三星盖乐世', 'rfid02', 'ck06', '一号仓库', '18', '2018-11-04 17:16:07', 'out');
INSERT INTO `goods` VALUES ('good20', '杯子', 'rfid02', 'ck06', '三号仓库', '19', '2018-11-04 17:16:07', 'in');
INSERT INTO `goods` VALUES ('good21', '联想电脑', 'rfid02', 'ck06', '三号仓库', '20', '2018-11-05 17:16:07', 'in');

-- ----------------------------
-- Table structure for `inport`
-- ----------------------------
DROP TABLE IF EXISTS `inport`;
CREATE TABLE `inport` (
  `inport_id` int(11) NOT NULL auto_increment,
  `rfid_id` varchar(64) default NULL,
  `user_id` varchar(64) default NULL,
  `user_name` varchar(32) NOT NULL,
  `goods_id` varchar(64) default NULL,
  `goods_name` varchar(64) NOT NULL,
  `ware_house_id` varchar(64) NOT NULL,
  `ware_house_name` varchar(64) NOT NULL,
  `inport_time` datetime NOT NULL,
  PRIMARY KEY  (`inport_id`),
  KEY `inport_time` (`inport_time`),
  KEY `inport_ware_house_name` (`ware_house_name`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inport
-- ----------------------------
INSERT INTO `inport` VALUES ('1', 'rfid01', '0104160201', '黎宇科', 'good01', '美的风扇', 'ck01', '一号仓库', '2018-09-17 16:25:34');
INSERT INTO `inport` VALUES ('2', 'rfid02', '0104160202', '小朋友', 'good02', '可口可乐', 'ck02', '二号仓库', '2018-09-17 16:44:17');
INSERT INTO `inport` VALUES ('3', 'rfid03', '0104160303', '王颖', 'good03', '百事可乐', 'ck03', '三号仓库', '2018-09-17 16:45:48');
INSERT INTO `inport` VALUES ('4', 'rfid05', '0104160105', '童佩玲', 'good05', '灯泡', 'ck05', '四号仓库', '2018-09-17 16:47:08');
INSERT INTO `inport` VALUES ('5', 'rfd06', '0104160106', '高金元', 'good06', '狗狗娃娃', 'ck06', '六号仓库', '2018-09-17 16:47:57');
INSERT INTO `inport` VALUES ('6', 'rfid01', '0104160105', '童佩玲', 'good07', '南极人被子', 'ck05', '四号仓库', '2018-09-17 17:13:16');
INSERT INTO `inport` VALUES ('7', 'rfid02', '0104160106', '高金元', 'good08', '美的空调', 'ck06', '六号仓库', '2018-09-17 17:16:07');
INSERT INTO `inport` VALUES ('8', 'rfid02', '0104160106', '高金元', 'good09', '电饭锅', 'ck06', '六号仓库', '2018-09-17 17:16:07');
INSERT INTO `inport` VALUES ('9', 'rfid02', '0104160106', '高金元', 'good10', '联想电脑', 'ck06', '六号仓库', '2018-11-01 17:16:07');
INSERT INTO `inport` VALUES ('10', 'rfid02', '0104160106', '高金元', 'good11', '戴尔笔记本', 'ck06', '六号仓库', '2018-10-30 17:16:07');
INSERT INTO `inport` VALUES ('11', 'rfid02', '0104160106', '高金元', 'good12', '沙雕图画', 'ck06', '六号仓库', '2018-10-30 17:16:07');
INSERT INTO `inport` VALUES ('12', 'rfid02', '0104160106', '高金元', 'good13', '水晶灯', 'ck06', '六号仓库', '2018-10-30 17:16:07');
INSERT INTO `inport` VALUES ('13', 'rfid02', '0104160106', '高金元', 'good14', '尚方宝剑', 'ck06', '六号仓库', '2018-11-02 17:16:07');
INSERT INTO `inport` VALUES ('14', 'rfid02', '0104160106', '高金元', 'good15', '葵花宝典', 'ck06', '六号仓库', '2018-11-02 17:16:07');
INSERT INTO `inport` VALUES ('15', 'rfid02', '0104160106', '高金元', 'good16', '倚天屠龙刀', 'ck06', '六号仓库', '2018-11-04 17:16:07');
INSERT INTO `inport` VALUES ('16', 'rfid02', '0104160106', '高金元', 'good17', 'iPhone100', 'ck06', '六号仓库', '2018-11-03 17:16:07');
INSERT INTO `inport` VALUES ('17', 'rfid02', '0104160106', '高金元', 'good18', 'oppo10000', 'ck06', '六号仓库', '2018-11-03 17:16:07');
INSERT INTO `inport` VALUES ('18', 'rfid02', '0104160106', '高金元', 'good19', '三星盖乐世', 'ck06', '六号仓库', '2018-11-05 17:16:07');
INSERT INTO `inport` VALUES ('19', 'rfid02', '0104160106', '高金元', 'good20', '什么东西', 'ck06', '六号仓库', '2018-11-05 17:16:07');
INSERT INTO `inport` VALUES ('20', 'rfid02', '0104160106', '高金元', 'good21', '珍珠奶茶', 'ck06', '六号仓库', '2018-11-05 17:16:07');

-- ----------------------------
-- Table structure for `monitor`
-- ----------------------------
DROP TABLE IF EXISTS `monitor`;
CREATE TABLE `monitor` (
  `m_id` int(11) NOT NULL auto_increment,
  `rfid_id` varchar(64) default NULL,
  `m_state` varchar(16) NOT NULL,
  `m_time` datetime NOT NULL,
  PRIMARY KEY  (`m_id`),
  KEY `m_time` (`m_time`),
  KEY `FK_rfid_monitor` (`rfid_id`),
  CONSTRAINT `FK_rfid_monitor` FOREIGN KEY (`rfid_id`) REFERENCES `rfid` (`rfid_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of monitor
-- ----------------------------
INSERT INTO `monitor` VALUES ('1', 'rfid05', '1', '2018-09-30 11:00:02');
INSERT INTO `monitor` VALUES ('2', 'rfid06', '1', '2018-09-27 08:30:53');
INSERT INTO `monitor` VALUES ('3', 'rfid01', '1', '2018-09-08 08:32:10');
INSERT INTO `monitor` VALUES ('4', 'rfid02', '1', '2018-09-01 08:33:51');
INSERT INTO `monitor` VALUES ('5', 'rfid03', '1', '2018-09-26 08:34:47');
INSERT INTO `monitor` VALUES ('6', 'rfid01', '1', '2018-09-27 08:46:45');
INSERT INTO `monitor` VALUES ('7', 'rfid01', '1', '2018-09-28 16:57:43');
INSERT INTO `monitor` VALUES ('8', 'rfid01', '1', '2018-09-28 16:58:44');
INSERT INTO `monitor` VALUES ('9', 'rfid05', '1', '2018-09-28 17:08:13');
INSERT INTO `monitor` VALUES ('10', 'rfid05', '1', '2018-09-28 17:09:24');
INSERT INTO `monitor` VALUES ('11', 'rfid02', '1', '2018-09-30 08:48:19');
INSERT INTO `monitor` VALUES ('12', 'rfid06', '1', '2018-09-29 08:49:42');
INSERT INTO `monitor` VALUES ('13', 'rfid06', '1', '2018-09-30 09:14:38');
INSERT INTO `monitor` VALUES ('14', 'rfid05', '1', '2018-10-09 10:41:45');
INSERT INTO `monitor` VALUES ('15', 'rfid06', '1', '2018-10-09 10:42:49');
INSERT INTO `monitor` VALUES ('16', 'rfid03', '1', '2018-10-09 10:43:55');
INSERT INTO `monitor` VALUES ('17', 'rfid05', '1', '2018-10-10 10:07:41');
INSERT INTO `monitor` VALUES ('18', 'rfid06', '1', '2018-10-10 10:08:20');
INSERT INTO `monitor` VALUES ('19', 'rfid03', '1', '2018-10-10 10:08:54');
INSERT INTO `monitor` VALUES ('20', 'rfid05', '1', '2018-10-11 10:02:31');
INSERT INTO `monitor` VALUES ('21', 'rfid03', '1', '2018-10-11 10:09:28');

-- ----------------------------
-- Table structure for `rfid`
-- ----------------------------
DROP TABLE IF EXISTS `rfid`;
CREATE TABLE `rfid` (
  `rfid_id` varchar(64) NOT NULL,
  `user_id` varchar(64) NOT NULL,
  `rfid_add_time` datetime default NULL,
  `state` varchar(8) NOT NULL,
  PRIMARY KEY  (`rfid_id`),
  KEY `rfid_add_time` (`rfid_add_time`),
  KEY `FK_user_rfid` (`user_id`),
  CONSTRAINT `FK_user_rfid` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rfid
-- ----------------------------
INSERT INTO `rfid` VALUES ('rfid01', '0104160201', '2018-09-01 15:56:49', '开启中');
INSERT INTO `rfid` VALUES ('rfid02', '0104160202', '2018-09-02 15:57:07', '开启中');
INSERT INTO `rfid` VALUES ('rfid03', '0104160303', '2018-09-03 15:57:57', '开启中');
INSERT INTO `rfid` VALUES ('rfid05', '0104160105', '2018-09-05 15:54:30', '开启中');
INSERT INTO `rfid` VALUES ('rfid06', '0104160106', '2018-09-06 15:55:07', '开启中');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(64) NOT NULL,
  `user_account` varchar(32) NOT NULL,
  `user_password` varchar(32) NOT NULL,
  `user_name` varchar(32) NOT NULL,
  `user_phone` varchar(32) NOT NULL,
  `add_time` datetime default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0104160105', 'bulb', '0719', '童佩玲', '13128502702', '2018-09-13 11:13:54');
INSERT INTO `user` VALUES ('0104160106', 'black', '0918', '高金元', '18924841995', '2018-09-03 14:55:42');
INSERT INTO `user` VALUES ('0104160201', 'liyuke', 'liyuke', '黎宇科', '11111111111', '2018-09-09 16:15:50');
INSERT INTO `user` VALUES ('0104160202', 'xiaofriend', 'xiaofriend', '小朋友', '22222222222', '2018-08-22 22:17:00');
INSERT INTO `user` VALUES ('0104160303', 'wangying', 'wangying', '王颖', '33333333333', '2018-09-28 07:45:35');

-- ----------------------------
-- Table structure for `user_ware_house`
-- ----------------------------
DROP TABLE IF EXISTS `user_ware_house`;
CREATE TABLE `user_ware_house` (
  `user_id` varchar(64) NOT NULL,
  `ware_house_id` varchar(64) NOT NULL,
  PRIMARY KEY  (`user_id`,`ware_house_id`),
  KEY `FK_user_ware2` (`ware_house_id`),
  CONSTRAINT `FK_user_ware` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FK_user_ware2` FOREIGN KEY (`ware_house_id`) REFERENCES `ware_house` (`ware_house_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_ware_house
-- ----------------------------
INSERT INTO `user_ware_house` VALUES ('0104160303', 'ck007');
INSERT INTO `user_ware_house` VALUES ('0104160201', 'ck01');
INSERT INTO `user_ware_house` VALUES ('0104160202', 'ck02');
INSERT INTO `user_ware_house` VALUES ('0104160303', 'ck03');
INSERT INTO `user_ware_house` VALUES ('0104160105', 'ck05');
INSERT INTO `user_ware_house` VALUES ('0104160106', 'ck06');

-- ----------------------------
-- Table structure for `ware_house`
-- ----------------------------
DROP TABLE IF EXISTS `ware_house`;
CREATE TABLE `ware_house` (
  `ware_house_id` varchar(64) NOT NULL,
  `ware_house_name` varchar(64) NOT NULL,
  `ware_house_address` varchar(128) NOT NULL,
  `ware_house_add_time` datetime NOT NULL,
  PRIMARY KEY  (`ware_house_id`),
  KEY `ware_house_name` (`ware_house_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ware_house
-- ----------------------------
INSERT INTO `ware_house` VALUES ('ck007', '七号仓库', '广东佛山', '2018-11-05 20:01:46');
INSERT INTO `ware_house` VALUES ('ck01', '一号仓库', '省科干1栋', '2018-09-01 15:59:14');
INSERT INTO `ware_house` VALUES ('ck02', '二号仓库', '省科干2栋', '2018-09-02 15:59:42');
INSERT INTO `ware_house` VALUES ('ck03', '三号仓库', '省科干3栋', '2018-09-03 16:00:10');
INSERT INTO `ware_house` VALUES ('ck05', '四号仓库', '省科干5栋', '2018-09-05 16:00:59');
INSERT INTO `ware_house` VALUES ('ck06', '六号仓库', '省科干6栋', '2018-09-06 16:03:31');
