/*
Navicat MySQL Data Transfer

Source Server         : LocalHost
Source Server Version : 50633
Source Host           : localhost:3306
Source Database       : mysecurity

Target Server Type    : MYSQL
Target Server Version : 50633
File Encoding         : 65001

Date: 2020-10-04 10:02:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `role_id` bigint(32) NOT NULL COMMENT '角色id',
  `permission_id` bigint(32) NOT NULL COMMENT '权限id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` int(11) NOT NULL COMMENT '已删除'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1', '2019-07-19 11:55:39', '2019-07-19 11:55:39', '0');
INSERT INTO `role_permission` VALUES ('2', '2', '2019-07-19 11:55:51', '2019-07-19 11:55:51', '0');
INSERT INTO `role_permission` VALUES ('2', '3', '2019-07-19 11:55:56', '2019-07-19 11:55:56', '0');

-- ----------------------------
-- Table structure for role_resource
-- ----------------------------
DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE `role_resource` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(32) NOT NULL COMMENT '角色id',
  `resource_id` bigint(32) NOT NULL COMMENT '资源id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` int(11) NOT NULL COMMENT '已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_resource
-- ----------------------------
INSERT INTO `role_resource` VALUES ('1', '1', '1', '2020-09-28 11:13:44', '2020-09-28 11:13:44', '0');
INSERT INTO `role_resource` VALUES ('2', '1', '2', '2020-09-28 11:13:53', '2020-09-28 11:13:53', '0');
INSERT INTO `role_resource` VALUES ('3', '2', '2', '2020-09-28 11:14:01', '2020-09-28 11:14:01', '0');
INSERT INTO `role_resource` VALUES ('4', '1', '3', '2020-09-28 15:07:08', '2020-09-28 15:07:08', '0');
INSERT INTO `role_resource` VALUES ('5', '2', '3', '2020-09-28 15:07:15', '2020-09-28 15:07:15', '0');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `permission_name` varchar(50) NOT NULL COMMENT '权限名称',
  `permission_desc` varchar(50) NOT NULL COMMENT '权限描述',
  `permission_code` varchar(50) NOT NULL COMMENT '权限编码',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` int(11) NOT NULL COMMENT '已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '商品查询', '查询商品', 'PRODUCT_LIST', '2019-07-19 11:52:13', '2019-07-19 11:52:13', '0');
INSERT INTO `sys_permission` VALUES ('2', '商品添加', '添加商品', 'PRODUCT_ADD', '2019-07-19 11:53:05', '2019-07-19 11:53:05', '0');
INSERT INTO `sys_permission` VALUES ('3', '商品删除', '删除商品', 'PRODUCT_REMOVE', '2019-07-19 11:53:32', '2019-07-19 11:53:32', '0');

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(50) NOT NULL COMMENT '权限名称',
  `code` varchar(50) NOT NULL COMMENT '权限编码',
  `url` varchar(200) NOT NULL COMMENT 'url',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` int(11) NOT NULL COMMENT '已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
INSERT INTO `sys_resource` VALUES ('1', '商品添加', 'product_add', '/product/add', '2020-09-28 11:12:43', '2020-09-28 11:12:43', '0');
INSERT INTO `sys_resource` VALUES ('2', '商品查询', 'product_list', '/product/list', '2020-09-28 11:13:10', '2020-09-28 11:13:10', '0');
INSERT INTO `sys_resource` VALUES ('3', '主页', 'index_page', '/index', '2020-09-28 15:06:56', '2020-09-28 15:06:56', '0');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(50) NOT NULL COMMENT '角色名称',
  `role_desc` varchar(50) NOT NULL COMMENT '角色描述',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` int(11) NOT NULL COMMENT '已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'ROLE_ADMIN', '管理员', '2019-07-19 11:55:00', '2020-09-28 09:41:02', '0');
INSERT INTO `sys_role` VALUES ('2', 'ROLE_NORMAL', '操作员', '2019-07-19 11:55:16', '2020-09-28 09:41:14', '0');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(64) NOT NULL COMMENT '用户名称',
  `password` varchar(128) NOT NULL COMMENT '密码密文',
  `real_name` varchar(128) NOT NULL COMMENT '真实姓名',
  `phone` varchar(32) NOT NULL COMMENT '手机号',
  `enabled` int(11) NOT NULL COMMENT '是否可用',
  `account_non_expired` int(11) NOT NULL COMMENT '是否过期',
  `account_non_locked` int(11) NOT NULL COMMENT '是否锁定',
  `credentials_non_expired` int(11) NOT NULL COMMENT '证书是否过期',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` int(11) NOT NULL COMMENT '已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`user_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1001', 'latiny', '$2a$10$0WwqscAThg4/2KitckDyWufnFfVqNkEXSWv99TP3hkVN9vxv8OdBu', '乔峰', '15185087790', '1', '1', '1', '1', '2019-07-18 15:09:10', '2020-09-28 10:13:43', '0');
INSERT INTO `sys_user` VALUES ('1002', 'edward', '$2a$10$0WwqscAThg4/2KitckDyWufnFfVqNkEXSWv99TP3hkVN9vxv8OdBu', '李太白', '13885109770', '1', '1', '1', '1', '2019-07-19 15:33:53', '2020-09-28 10:13:45', '0');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` bigint(32) NOT NULL COMMENT '用户id',
  `role_id` bigint(32) NOT NULL COMMENT '角色id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` int(11) NOT NULL COMMENT '已删除'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1001', '1', '2019-07-19 11:56:55', '2020-09-28 15:27:49', '0');
INSERT INTO `user_role` VALUES ('1002', '2', '2019-07-19 15:34:07', '2020-09-28 15:27:50', '0');
