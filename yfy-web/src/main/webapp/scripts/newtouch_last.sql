CREATE TABLE `bas_code_list` (
  `BAS_CODE_LIST_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `BAS_CODE_TYPE_ID` int(11) DEFAULT NULL COMMENT '表ID',
  `CODE_VALUE` varchar(255) DEFAULT NULL COMMENT '编码值',
  `NAME_ZH` varchar(255) DEFAULT NULL COMMENT '编码中文名称',
  `NAME_EN` varchar(255) DEFAULT NULL COMMENT '编码英文名称',
  `SORT_NO` int(11) DEFAULT NULL COMMENT '排序编号',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '系统默认字段.删除日期',
  `EDITABLE` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否编辑',
  `SELECTED` tinyint(1) DEFAULT NULL COMMENT 'true 默认选择项',
  PRIMARY KEY (`BAS_CODE_LIST_ID`),
  UNIQUE KEY `AK_UK_BAS_CODE_LIST_NAME_ZH` (`NAME_ZH`),
  UNIQUE KEY `UK_BAS_CODE_LIST_NAME_EN` (`NAME_EN`),
  KEY `FK_BAS_CODE_TYPE_ID_001` (`BAS_CODE_TYPE_ID`),
  CONSTRAINT `FK_BAS_CODE_TYPE_ID_001` FOREIGN KEY (`BAS_CODE_TYPE_ID`) REFERENCES `bas_code_type` (`BAS_CODE_TYPE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8 COMMENT='通用编码表';

/*Data for the table `bas_code_list` */

insert  into `bas_code_list`(`BAS_CODE_LIST_ID`,`BAS_CODE_TYPE_ID`,`CODE_VALUE`,`NAME_ZH`,`NAME_EN`,`SORT_NO`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`,`EDITABLE`,`SELECTED`) values (1,19,'Users','用户','Users',2,1,'2013-03-19 17:15:16',1,'2014-04-08 10:28:59',0,3,NULL,1,0),(2,19,'Files','文件类','Files',1,1,'2013-03-19 17:19:03',1,'2014-04-08 10:28:53',0,2,NULL,1,0),(3,19,'systems','系统类','systems',3,1,'2013-03-19 20:42:18',1,'2014-04-08 10:55:56',0,9,NULL,1,0),(11,21,'system','系统类型','system',1,1,'2013-03-20 18:03:39',1,'2015-03-03 23:39:20',0,7,NULL,1,0),(12,21,'Products','产品管理','Products',2,1,'2013-03-20 18:04:45',1,'2013-03-20 18:04:45',0,0,NULL,1,0),(13,21,'Customers','客户管理','Customers',3,1,'2013-03-20 18:06:49',1,'2013-03-24 21:43:12',0,1,NULL,0,0),(14,21,'ReportsCenter','报表中心','Reports Center',4,1,'2013-03-20 18:07:36',1,'2015-02-12 19:38:10',0,4,NULL,1,0),(15,32,'_blank','_blank','_blank',1,1,'2013-03-24 18:03:14',1,'2013-03-29 23:17:44',0,2,NULL,1,0),(17,32,'_self','_self','_self',2,1,'2013-03-24 18:22:46',1,'2015-03-13 11:08:47',0,1,NULL,1,1),(18,32,'_parent','_parent','_parent',3,1,'2013-03-24 18:29:43',1,'2013-03-24 18:29:43',0,0,NULL,1,0),(19,21,'CustomerCenter','客户中心','CustomerCenter',2,1,'2013-03-24 18:53:21',1,'2013-03-24 18:53:21',0,0,NULL,1,0),(21,33,'application','应用层','application',1,1,'2013-03-24 21:51:33',1,'2013-03-24 22:12:27',0,2,NULL,1,0),(22,33,'module','模块','module',2,1,'2013-03-24 22:06:47',1,'2014-04-08 10:30:45',0,2,NULL,1,0),(23,33,'module_menu_category','菜单项','module_menu_category',3,1,'2013-03-24 22:12:07',1,'2014-04-08 14:10:05',0,2,NULL,1,0),(24,34,'text','text','text',0,1,'2013-03-27 22:47:22',1,'2013-03-29 22:21:34',0,1,NULL,1,0),(25,34,'textarea','textarea','textarea',1,1,'2013-03-27 22:47:58',1,'2013-03-27 22:47:58',0,0,NULL,1,0),(26,34,'checkbox','checkbox','checkbox',3,1,'2013-03-27 22:48:32',1,'2013-03-27 22:48:32',0,0,NULL,1,0),(27,34,'numberbox','numberbox','numberbox',2,1,'2013-03-27 22:50:02',1,'2013-03-27 22:50:02',0,0,NULL,1,0),(28,34,'validatebox','validatebox','validatebox',4,1,'2013-03-27 22:50:37',1,'2013-03-27 22:50:37',0,0,NULL,1,0),(29,34,'datebox','datebox','datebox',5,1,'2013-03-27 22:50:54',1,'2013-03-27 22:50:54',0,0,NULL,1,0),(30,34,'combobox','combobox','combobox',6,1,'2013-03-27 22:51:17',1,'2013-03-27 22:51:17',0,0,NULL,1,0),(31,34,'combotree','combotree','combotree',7,1,'2013-03-27 22:51:47',1,'2013-03-27 22:51:47',0,0,NULL,1,0),(32,35,'top','top','top',1,1,'2013-03-28 22:32:04',1,'2013-03-28 22:32:04',0,0,NULL,1,0),(33,35,'bottom','bottom','bottom',2,1,'2013-03-28 22:32:21',1,'2013-03-29 23:19:34',0,2,NULL,1,0),(34,35,'both','both','both',3,1,'2013-03-28 22:32:43',1,'2013-03-29 23:18:09',0,1,NULL,1,0),(35,36,'[10,20,30,40,50]','[10,20,30,40,50]','[10,20,30,40,50]',1,1,'2013-03-28 22:34:14',1,'2013-03-28 22:34:14',0,0,NULL,1,0),(36,36,'[5,10,15,20,25,30,40,50]','[5,10,15,20,25,30,40,50]','[5,10,15,20,25,30,40,50]',2,1,'2013-03-28 22:35:28',1,'2013-03-28 22:35:28',0,0,NULL,1,0),(37,36,'[10,15,20,25,30,40,50,100]','[10,15,20,25,30,40,50,100]','[10,15,20,25,30,40,50,100]',0,1,'2013-03-28 22:36:24',1,'2013-03-29 22:28:31',0,3,NULL,1,0),(40,33,'module_menu_category_item','菜单子项','module_menu_category_item',4,1,'2014-04-08 14:09:11',1,'2014-04-08 14:10:11',0,1,NULL,1,0),(44,37,'users_datagrid','用户管理','users_datagrid',0,1,'2014-04-08 23:09:47',1,'2014-04-08 23:11:08',0,1,NULL,1,0),(45,37,'code_datagrid','编码管理','code_datagrid',1,1,'2014-04-08 23:10:22',1,'2014-04-08 23:11:03',0,1,NULL,1,0),(46,37,'system_datagrid','系统管理','system_datagrid',2,1,'2014-04-08 23:11:52',1,'2014-04-08 23:11:52',0,0,NULL,1,0),(47,37,'datagrid_datagrid ','DataGrid管理','datagrid_datagrid ',3,1,'2014-04-08 23:12:43',1,'2014-04-08 23:26:15',0,1,NULL,1,0),(48,37,'SYSTEM_MINITOR','系统监控管理','SYSTEM_MINITOR',4,1,'2014-04-08 23:13:18',1,'2014-04-08 23:13:18',0,0,NULL,1,0),(49,19,'sysInterface','接口管理','sysInterface',3,1,'2014-06-01 21:48:36',1,'2014-06-01 21:48:36',0,0,NULL,1,0),(51,39,'RESOURCE_ICON','按钮','RESOURCE_ICON',1,1,'2015-03-04 16:55:27',1,'2015-07-21 20:23:30',0,4,NULL,1,0),(52,33,'module_menu_category_item_button','按钮项','item_button',5,1,'2015-03-04 21:11:44',1,'2015-03-04 21:11:44',0,0,NULL,1,0),(60,40,'1','自动获取','auto',1,1,'2016-04-06 00:28:43',1,'2016-04-06 00:28:47',0,0,NULL,1,0),(61,40,'0','手工输入','manual',2,1,'2016-04-06 00:29:49',1,'2016-04-06 00:29:52',0,0,NULL,1,0);


CREATE TABLE `bas_group_role` (
  `BAS_GROUP_ID` int(11) NOT NULL COMMENT '角色组ID',
  `BAS_ROLE_ID` int(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`BAS_GROUP_ID`,`BAS_ROLE_ID`),
  KEY `FK_BAS_GROUP_ROLE_ROLE_ID_001` (`BAS_ROLE_ID`),
  CONSTRAINT `FK_BAS_GROUP_ROLE_GROUP_ID_001` FOREIGN KEY (`BAS_GROUP_ID`) REFERENCES `bas_group` (`BAS_GROUP_ID`),
  CONSTRAINT `FK_BAS_GROUP_ROLE_ROLE_ID_001` FOREIGN KEY (`BAS_ROLE_ID`) REFERENCES `bas_role` (`BAS_ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组与角色关系表';

/*Data for the table `bas_group_role` */

insert  into `bas_group_role`(`BAS_GROUP_ID`,`BAS_ROLE_ID`) values (1,1),(3,2),(5,2),(6,2),(7,2),(8,4),(9,4),(10,4),(11,4),(6,6),(10,6),(3,10),(6,10),(7,10),(8,10),(5,11),(3,12),(5,12),(6,12),(7,12),(8,12),(9,12),(10,12),(11,12),(3,13),(9,13),(7,14),(11,14),(9,15),(10,15),(11,15),(8,16),(8,17),(8,18),(8,19),(8,20),(3,21),(9,21);

CREATE TABLE `bas_reminder_reader` (
  `BAS_REMINDER_READER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `BAS_USER_ID` int(11) DEFAULT NULL COMMENT '接收消息用户ID',
  `IS_READ` tinyint(1) DEFAULT '0' COMMENT '是否阅读 默认为：false',
  `BAS_REMINDER_BODY_ID` int(11) DEFAULT NULL COMMENT '接收消息主体ID',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '系统默认字段.删除日期',
  PRIMARY KEY (`BAS_REMINDER_READER_ID`),
  KEY `FK_BAS_REMINDER_READER_BODY_ID_001` (`BAS_REMINDER_BODY_ID`),
  CONSTRAINT `FK_BAS_REMINDER_READER_BODY_ID_001` FOREIGN KEY (`BAS_REMINDER_BODY_ID`) REFERENCES `bas_reminder_body` (`BAS_REMINDER_BODY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='接收消息和用户关系表，\r\n标记是否阅读';


/*Table structure for table `bas_user_group` */

CREATE TABLE `bas_demo` (
  `bas_demo_id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) DEFAULT NULL,
  `name_zh` varchar(30) DEFAULT NULL,
  `CREATE_BY` int(11) DEFAULT NULL,
  `CREATE_DATE` date DEFAULT NULL,
  `UPDATE_BY` int(11) DEFAULT NULL,
  `UPDATE_DATE` date DEFAULT NULL,
  PRIMARY KEY (`bas_demo_id`),
  KEY `FK_BAS_DEMO_PARENT_ID` (`parent_id`),
  CONSTRAINT `FK_BAS_DEMO_PARENT_ID` FOREIGN KEY (`parent_id`) REFERENCES `bas_demo` (`bas_demo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `bas_demo` */

insert  into `bas_demo`(`bas_demo_id`,`parent_id`,`name_zh`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`) values (1,NULL,'一',1,NULL,NULL,NULL),(2,1,'二',1,NULL,NULL,NULL),(3,1,'三',1,NULL,NULL,NULL),(4,1,'四',1,NULL,NULL,NULL),(5,1,'五',NULL,NULL,NULL,NULL),(6,1,'六',NULL,NULL,NULL,NULL),(7,1,'七',NULL,NULL,NULL,NULL),(8,1,'八',NULL,NULL,NULL,NULL);

CREATE TABLE `bas_user` (
  `BAS_USER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `BAS_DEPARTMENT_ID` int(11) DEFAULT NULL COMMENT '部门ID',
  `BAS_POSITION_ID` int(11) DEFAULT NULL,
  `MANAGER_USER_ID` int(11) DEFAULT NULL COMMENT '经理USERID',
  `USERNAME` varchar(30) NOT NULL COMMENT '用户登录名',
  `PASSWORD` varchar(128) NOT NULL COMMENT '密码，存储采用SHA算法加密',
  `PASSWORD_HINT` varchar(30) DEFAULT NULL COMMENT '密码提示语',
  `EMPLOYEE_NO` varchar(30) NOT NULL COMMENT '员工号',
  `REALNAME_ZH` varchar(128) DEFAULT NULL COMMENT '用户中文名称',
  `REALNAME_EN` varchar(128) DEFAULT NULL COMMENT '用户英语名称',
  `GENDER` int(1) NOT NULL COMMENT '性别 0 男 1 女',
  `USERTYPE` varchar(10) DEFAULT NULL COMMENT '用户类型EMPLOYEE, SUPPLIER, DEALER可自行扩展',
  `AUTHTYPE` varchar(10) DEFAULT NULL COMMENT '认证类型 LDAP, DB, DUMMY',
  `TELEPHONE` varchar(30) DEFAULT NULL COMMENT '办公室电话',
  `MOBILE` varchar(30) DEFAULT NULL COMMENT '手机号码',
  `EMAIL` varchar(128) DEFAULT NULL COMMENT '邮件地址',
  `OFFICE_TELEPHONE` varchar(30) DEFAULT NULL COMMENT '办公室 电话',
  `FAX` varchar(30) DEFAULT NULL,
  `POSTCODE` varchar(6) DEFAULT NULL COMMENT '邮编',
  `LOCATION` varchar(256) DEFAULT NULL COMMENT '办公地址',
  `ACCOUNT_EXPIRED` tinyint(1) NOT NULL DEFAULT '1' COMMENT '账户是否有效',
  `ACCOUNT_LOCKED` tinyint(1) NOT NULL DEFAULT '1' COMMENT '账户是否被锁定',
  `CREDENTIAL_EXPIRED` tinyint(1) NOT NULL DEFAULT '1' COMMENT '密码是否有效',
  `CREDENTIAL_EXPIRED_DATE` datetime NOT NULL COMMENT '密码有效日期',
  `ACCOUNT_EXPIRED_DATE` datetime NOT NULL COMMENT '账户有效日期',
  `EDITABLE` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否可编辑',
  `DESCRIPTION` varchar(256) DEFAULT NULL COMMENT '用户描述',
  `IMAGE` varchar(128) DEFAULT NULL COMMENT '用户头像',
  `CREATE_BY` int(11) NOT NULL COMMENT '创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '更新日期',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '记录操作次',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '是否标记删除 0 未删除   1 表示删除',
  PRIMARY KEY (`BAS_USER_ID`,`ACCOUNT_LOCKED`),
  UNIQUE KEY `UK_BAS_USER_USERNAME` (`USERNAME`),
  KEY `FK_BAS_USER_DEPARTEMNT_ID_001` (`BAS_DEPARTMENT_ID`),
  KEY `FK_BAS_USER_MANAGER_USER_ID` (`MANAGER_USER_ID`),
  CONSTRAINT `FK_BAS_USER_DEPARTEMNT_ID_001` FOREIGN KEY (`BAS_DEPARTMENT_ID`) REFERENCES `bas_department` (`BAS_DEPARTMENT_ID`),
  CONSTRAINT `FK_BAS_USER_MANAGER_USER_ID` FOREIGN KEY (`MANAGER_USER_ID`) REFERENCES `bas_user` (`BAS_USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COMMENT='系统用户信息表';

/*Data for the table `bas_user` */

insert  into `bas_user`(`BAS_USER_ID`,`BAS_DEPARTMENT_ID`,`BAS_POSITION_ID`,`MANAGER_USER_ID`,`USERNAME`,`PASSWORD`,`PASSWORD_HINT`,`EMPLOYEE_NO`,`REALNAME_ZH`,`REALNAME_EN`,`GENDER`,`USERTYPE`,`AUTHTYPE`,`TELEPHONE`,`MOBILE`,`EMAIL`,`OFFICE_TELEPHONE`,`FAX`,`POSTCODE`,`LOCATION`,`ACCOUNT_EXPIRED`,`ACCOUNT_LOCKED`,`CREDENTIAL_EXPIRED`,`CREDENTIAL_EXPIRED_DATE`,`ACCOUNT_EXPIRED_DATE`,`EDITABLE`,`DESCRIPTION`,`IMAGE`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`OPT_COUNTER`,`DELETE_DATE`,`MARK_FOR_DELETE`) values (1,55,NULL,NULL,'admin','7ead2ee8a751cfac6220247b56debfa0f7a003e3',NULL,'0001','王君','wangjun',0,NULL,NULL,'021-234298379','15821501966','wangjun@126.com','021-234298379','021-234298379','293482','',1,0,1,'2016-07-31 00:00:00','2017-04-30 00:00:00',1,'','resources/admin/image/Koala_cut.jpg',1,'2013-03-23 21:08:49',1,'2016-05-09 00:35:25',155,NULL,0),(2,37,NULL,NULL,'duxu','0ee0bbe88b42178cf0318d48373fa9e1dfa5a8dd',NULL,'0004','杜旭','duxu',0,NULL,NULL,'111','13001236547','duxu@126.com','','','','',1,0,1,'2016-07-31 00:00:00','2016-07-31 00:00:00',1,'','resources/admin/image/Chrysanthemum_cut.jpg',1,'2013-03-23 21:16:44',1,'2016-05-09 00:18:33',35,NULL,0),(3,40,NULL,NULL,'zhangsan','3d9366e2fce5783605326c16c9ca3c85b7b5311d',NULL,'0003','张三','zhangsan',0,NULL,NULL,'','','zhangsan@126.com','','','','',1,0,1,'2015-04-03 00:00:00','2017-04-03 00:00:00',1,'','resources/admin/image/Desert_cut.jpg',1,'2013-03-24 14:18:47',1,'2016-05-05 00:39:58',28,NULL,0),(17,37,NULL,NULL,'zhangkexin','ae906ee13dd6cd5430417af8543f4d01952e8ec2',NULL,'0002','张可心','zhangkexin',1,NULL,NULL,'','','zhangkexin@gmail.com','','','','',1,0,1,'2016-07-31 00:00:00','2016-07-31 00:00:00',1,'','resources/admin/image/Tulips_cut.jpg',1,'2015-02-27 17:22:57',1,'2016-05-19 01:02:39',23,NULL,0),(18,39,NULL,NULL,'lijudong','b36677afacb45c2cfee8eda4ae92938cb257cc73',NULL,'0005','李俊东','lijundong',0,NULL,NULL,'','','lijundong@163.com','','','','',1,0,1,'2016-08-04 00:00:00','2017-05-04 00:00:00',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:05:17',1,'2016-05-05 00:39:29',2,NULL,0),(19,39,NULL,NULL,'huangxin','de32ea62af59716b2f61a054866c4261abf3b93f',NULL,'0006','黄欣','huangxin',0,NULL,NULL,'','','huangxin@163.com','','','','',1,0,1,'2016-08-04 00:00:00','2017-05-04 00:00:00',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:06:49',1,'2016-05-05 00:39:17',2,NULL,0),(20,37,NULL,NULL,'liujihong','93f7d27a720fae5c06bd6e350c0a931bf1a8d68a',NULL,'0007','刘继红','liujihong',0,NULL,NULL,'','','liujihong@163.com','','','','',1,0,1,'2016-08-04 20:09:01','2017-05-04 20:09:01',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:09:01',1,'2016-05-09 00:34:04',2,NULL,0),(21,37,NULL,NULL,'zhangyanna','56ad48ba0c01cd59f12a03e6fbcf40caf57b6786',NULL,'0008','张艳娜','zhangyanna',0,NULL,NULL,'','','zhangyanna@163.com','','','','',1,0,1,'2016-08-04 20:09:41','2017-05-04 20:09:41',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:09:41',1,'2016-05-09 00:34:16',2,NULL,0),(22,37,NULL,NULL,'liyanfang','480c661d4f6a0ef13f98df2f6c59aed98d86e306',NULL,'0009','李艳芳','liyanfang',0,NULL,NULL,'','','liyanfang@163.com','','','','',1,0,1,'2016-08-04 20:10:15','2017-05-04 20:10:15',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:10:15',1,'2016-05-09 00:34:08',2,NULL,0),(23,37,NULL,NULL,'zhengmin','38348472c3657fb67d195c9c254892c5394e7650',NULL,'0010','郑敏','zhengmin',0,NULL,NULL,'','','zhengmin@163.com','','','','',1,0,1,'2016-08-04 00:00:00','2017-05-04 00:00:00',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:11:07',1,'2016-05-09 00:34:21',4,NULL,0),(24,37,NULL,NULL,'huanghe','815d1ace6ec82b8257eb29396a4f8a2837eb8065',NULL,'0011','黄鹤','huanghe',0,NULL,NULL,'','','huanghe@163.com','','','','',1,0,1,'2016-08-04 20:12:46','2017-05-04 20:12:46',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:12:46',1,'2016-05-09 00:18:50',4,NULL,0),(25,37,NULL,NULL,'huangyongwen','00b494bad7d9a95c1708617c29e538ea96ae8fbf',NULL,'0012','黄勇文','huangyongwen',0,NULL,NULL,'','','huangyongwen@163.com','','','','',1,0,1,'2016-08-04 00:00:00','2017-05-04 00:00:00',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:17:56',1,'2016-05-09 00:24:46',5,NULL,0),(26,37,NULL,NULL,'fengyanling','52df62349aef912403ce5b2ad6f5828aeee88198',NULL,'0013','冯艳玲','fengyanling',0,NULL,NULL,'','','fengyanling@163.com','','','','',1,0,1,'2016-08-04 20:18:39','2017-05-04 20:18:39',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 20:18:39',1,'2016-05-09 00:18:43',4,NULL,0),(27,38,NULL,NULL,'lanchunyan','488176a16fe93b15cfa193a9e13abd8a73ca4f3c',NULL,'0014','兰春燕','lanchunyan',0,NULL,NULL,'','','lanchunyan@163.com','','','','',1,0,1,'2016-08-04 21:41:46','2017-05-04 21:41:46',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:41:46',1,'2016-05-05 00:38:10',1,NULL,0),(28,38,NULL,NULL,'xiaxiaoyan','4a1796facf2833d5451a9885662a60b19bbe8f56',NULL,'0015','夏晓燕','xiaxiaoyan',0,NULL,NULL,'','','xiaxiaoyan@163.com','','','','',1,0,1,'2016-08-04 21:42:32','2017-05-04 21:42:32',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:42:32',1,'2016-05-05 00:37:58',1,NULL,0),(29,38,NULL,NULL,'luoyi','6dff0dd9b88574470c4088e5e52f17f5a5da13ab',NULL,'0016','罗伊','luoyi',0,NULL,NULL,'','','luoyi@163.com','','','','',1,0,1,'2016-08-04 21:43:26','2017-05-04 21:43:26',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:43:26',1,'2016-05-05 00:38:26',2,NULL,0),(30,40,NULL,NULL,'houteng','1100812342c7af3e5279276f823e2868929fae49',NULL,'0017','侯腾','houteng',0,NULL,NULL,'','','houteng@163.com','','','','',1,0,1,'2016-08-04 00:00:00','2017-05-04 00:00:00',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:44:23',1,'2016-05-05 00:39:52',2,NULL,0),(31,38,NULL,NULL,'tongchongjie','c02b99035d649bfec61eab069863a1096cd1cea7',NULL,'0018','童冲杰','tongchongjie',0,NULL,NULL,'','','tongchongjie@163.com','','','','',1,0,1,'2016-08-04 21:45:48','2017-05-04 21:45:48',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:45:48',1,'2016-05-05 00:37:44',1,NULL,0),(32,38,NULL,NULL,'wanting','678b0921d9d7bb830c84de21a989dd76d1731ea8',NULL,'0019','万挺','wanting',0,NULL,NULL,'','','wanting@163.com','','','','',1,0,1,'2016-08-04 21:50:22','2017-05-04 21:50:22',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:50:22',1,'2016-05-05 00:37:22',1,NULL,0),(33,39,NULL,NULL,'guhaifeng','792957a0a5a2fc66c167d3ed1f73e924f2be2a4e',NULL,'0020','顾海峰','guhaifeng',0,NULL,NULL,'','','guhaifeng@163.com','','','','',1,0,1,'2016-08-04 21:51:51','2017-05-04 21:51:51',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:51:51',1,'2016-05-05 00:39:13',1,NULL,0),(34,39,NULL,NULL,'tuhua','3f640b3d57b1afb43b84c80492298d6b9472560c',NULL,'0021','涂画','tuhua',0,NULL,NULL,'','','tuhua@163.com','','','','',1,0,1,'2016-08-04 21:53:31','2017-05-04 21:53:31',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:53:31',1,'2016-05-05 00:39:10',1,NULL,0),(35,39,NULL,NULL,'wangyin','902e170ac733e13e239c80c481a331bcc418b276',NULL,'0022','王寅','wangyin',0,NULL,NULL,'','','wangyin@163.com','','','','',1,0,1,'2016-08-04 21:54:12','2017-05-04 21:54:12',1,'','resources/admin/image/Tulips_cut.jpg',1,'2016-05-04 21:54:12',1,'2016-05-05 00:39:06',1,NULL,0),(36,55,NULL,NULL,'lili','1ddcb9eefdf382f2dc66c838b8d94122979ee31e',NULL,'0023','李丽','lili',0,NULL,NULL,'','','lili@163.com','','','','',1,0,1,'2016-08-12 09:45:43','2017-05-12 09:45:43',1,'',NULL,1,'2016-05-12 09:45:43',1,'2016-05-12 09:48:11',1,NULL,0),(37,55,NULL,NULL,'wangyi','0843cbb386699614965461d574d3c665ecfaf328',NULL,'0024','王毅','wangyi',0,NULL,NULL,'','','wangyi@163.com','','','','',1,0,1,'2016-08-12 09:47:42','2017-05-12 09:47:42',1,'',NULL,1,'2016-05-12 09:47:42',1,'2016-05-12 09:50:27',1,NULL,0);


CREATE TABLE `bas_user_group` (
  `BAS_GROUP_ID` int(11) NOT NULL COMMENT '用户组ID',
  `BAS_USER_ID` int(11) NOT NULL COMMENT '用户ID',
  KEY `FK_BAS_USER_ROLE_GROUP_GROUPID_001` (`BAS_GROUP_ID`),
  KEY `FK_BAS_USER_ROLE_GROUP_USERID_001` (`BAS_USER_ID`),
  CONSTRAINT `FK_BAS_USER_ROLE_GROUP_GROUPID_001` FOREIGN KEY (`BAS_GROUP_ID`) REFERENCES `bas_group` (`BAS_GROUP_ID`),
  CONSTRAINT `FK_BAS_USER_ROLE_GROUP_USERID_001` FOREIGN KEY (`BAS_USER_ID`) REFERENCES `bas_user` (`BAS_USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户与用户组关系表';

/*Data for the table `bas_user_group` */

insert  into `bas_user_group`(`BAS_GROUP_ID`,`BAS_USER_ID`) values (1,1),(8,2),(3,26),(7,24),(6,25),(5,20),(5,22),(5,17),(5,21),(5,23),(9,36),(11,37);
