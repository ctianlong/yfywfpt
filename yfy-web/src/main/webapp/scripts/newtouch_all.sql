/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.24 : Database - newtouch
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `bas_app_properties` */

CREATE TABLE `bas_app_properties` (
  `APP_PROPERTIES_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `APP_ID` varchar(20) NOT NULL DEFAULT '' COMMENT '应用名称',
  `KEY_` varchar(120) NOT NULL DEFAULT '' COMMENT '参数名称',
  `VALUE_` varchar(225) NOT NULL COMMENT '数参值',
  `DESCRIPTION` varchar(225) DEFAULT NULL COMMENT '数参描述',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`APP_PROPERTIES_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='应用参数表';

/*Data for the table `bas_app_properties` */

insert  into `bas_app_properties`(`APP_PROPERTIES_ID`,`APP_ID`,`KEY_`,`VALUE_`,`DESCRIPTION`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (1,'lion','hibernate.cache.provider_class','net.sf.ehcache.hibernate.SingletonEhCacheProvider','配置使用二级缓存的类－提供商',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(2,'lion','hibernate.cache.region.factory_class','net.sf.ehcache.hibernate.EhCacheRegionFactory','解决使用echache2.5以后的版本时出现的异常问题 ',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(3,'lion','hibernate.cache.use_minimal_puts','true','以频繁的读操作为代价，优化二级缓存来最小化写操作，默认是开启的，取值为：true|false',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(4,'lion','hibernate.cache.use_query_cache','false','是否开启一级缓存',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(5,'lion','hibernate.cache.use_second_level_cache','false','是否开启二级缓存',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(6,'lion','hibernate.dialect','org.hibernate.dialect.MySQLDialect','Hibernate SQL方言',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(7,'lion','hibernate.format_sql','true','是否格式SQL',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(8,'lion','hibernate.generate_statistics','true','如果开启，Hibernate将收集有助性能调节的统计数据',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(9,'lion','hibernate.hbm2ddl.auto','none','在SessionFactory创建时，自动检查数据库结构，或者将数据库schema的DDL导出数据库，使用create-drop时，在显示关闭SessionFactory时，将drop掉数据库schema，取值:vaildate|update|create|create-drop|no',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(10,'lion','hibernate.jdbc.batch_size','50','允许Hibernate使用JDBC的批量更新，取值建议在5到50之间的值',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(11,'lion','hibernate.jdbc.fetch_size','100','设置JDBC抓取数量的大小（调用Statement.setFetchSize()）',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(12,'lion','hibernate.max_fetch_depth','3','设置外连接抓取的最大深度取值，建议设置为0~3之间',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(13,'lion','hibernate.order-updates','true','强制Hibernate按照被更新数据的主键，为SQL更新排序，将减少在高并发系统中事务的死锁。取值:true|false',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(14,'lion','hibernate.show_sql','true','是否显示SQL',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(15,'lion','hibernate.use_sql_comments','true','如果开启，Hibernate将在SQL中生成有助于调试的注释信息，默认值为：false,取值：true|false',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(16,'lion','database.prefix','mysql','ORM配置文件前缀，用于切换不同数据库',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(17,'lion','excel.temp.path','D:/app/excel/temp/','该目录临时存放生成的Excel文件的',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL),(18,'lion','super.username','admin','超级用户',0,'2015-03-30 11:12:12',0,'2015-03-30 11:12:12',0,0,NULL);

/*Table structure for table `bas_calendar` */

CREATE TABLE `bas_calendar` (
  `BAS_CALENDAR_ID` int(11) NOT NULL AUTO_INCREMENT,
  `BAS_USER_ID` int(11) DEFAULT NULL,
  `EVENT_NAME` varchar(256) NOT NULL,
  `START_DATE` date NOT NULL,
  `START_TIME` time DEFAULT NULL,
  `END_DATE` date DEFAULT NULL,
  `END_TIME` time DEFAULT NULL,
  `ALLDAY` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`BAS_CALENDAR_ID`),
  KEY `IDX_BAS_CALENDAR_USER_ID` (`BAS_USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `bas_calendar` */

insert  into `bas_calendar`(`BAS_CALENDAR_ID`,`BAS_USER_ID`,`EVENT_NAME`,`START_DATE`,`START_TIME`,`END_DATE`,`END_TIME`,`ALLDAY`) values (11,1,'richeng','2015-03-17',NULL,'2015-03-17',NULL,1),(13,1,'java','2015-03-24',NULL,'2015-03-26',NULL,1),(15,1,'richeng','2015-03-17',NULL,'2015-03-17',NULL,1),(17,1,'richeng','2015-03-19',NULL,'2015-03-20','23:16:57',1),(18,1,'eeeee','2015-03-12','00:00:00','2015-03-19','23:59:00',1),(19,1,'','2015-03-17','00:00:00','2015-03-17','23:59:00',1),(22,1,'','2015-03-31','00:00:00','2015-03-31','23:59:00',1),(23,1,'dddddd','2015-04-08','00:00:00','2015-04-08','23:59:00',1),(24,1,'ddddd','2015-04-02','00:00:00','2015-04-02','23:59:00',1);

/*Table structure for table `bas_code_list` */

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

/*Table structure for table `bas_code_type` */

CREATE TABLE `bas_code_type` (
  `BAS_CODE_TYPE_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `CODE_TYPE` varchar(20) DEFAULT NULL COMMENT '编码类型',
  `NAME_ZH` varchar(128) DEFAULT NULL COMMENT '编码中文名称',
  `NAME_EN` varchar(128) DEFAULT NULL COMMENT '编码英文名称',
  `EDITABLE` tinyint(1) DEFAULT NULL COMMENT '该记录是否可编辑',
  `CODE_LEN_LIMIT` int(11) DEFAULT NULL COMMENT '编码的值长度约束',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '系统默认字段.删除日期',
  PRIMARY KEY (`BAS_CODE_TYPE_ID`),
  UNIQUE KEY `UK_BAS_CODE_TYPE_NAME_ZH` (`NAME_ZH`),
  UNIQUE KEY `UK_BAS_CODE_TYPE_NAME_EN` (`NAME_EN`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 COMMENT='通用编码类型定义表';

/*Data for the table `bas_code_type` */

insert  into `bas_code_type`(`BAS_CODE_TYPE_ID`,`CODE_TYPE`,`NAME_ZH`,`NAME_EN`,`EDITABLE`,`CODE_LEN_LIMIT`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (16,'Customers','客户管理','CustomerManage',NULL,1000,1,'2013-03-19 09:37:06',1,'2015-03-06 11:17:59',0,6,NULL),(19,'system','系统参数','SystemParamter',1,999999999,1,'2013-03-19 09:41:17',1,'2014-03-24 17:04:53',0,52,NULL),(21,'Customers','通用编码类型','codeTypes',1,10000,1,'2013-03-19 10:42:58',1,'2013-04-13 21:55:52',0,4,NULL),(23,'system','参数类型','paramterType',1,11111,1,'2013-03-19 13:24:26',1,'2013-03-24 21:38:51',0,3,NULL),(24,'Products','产品管理','ProductsManage',1,1000,1,'2013-03-19 14:33:58',1,'2013-03-24 21:38:27',0,2,NULL),(28,'ReportsCenter','报表中心','ReportCenter',NULL,11113,1,'2013-03-19 14:35:25',1,'2015-03-09 16:38:20',0,4,NULL),(32,'system','Target','Target',1,100,1,'2013-03-24 16:53:50',1,'2013-03-24 17:17:07',0,1,NULL),(33,'system','资源类型','ResourceType',NULL,1000,1,'2013-03-24 21:46:03',1,'2015-03-05 23:43:47',0,10,NULL),(34,'system','DataGrid_Editors','DataGrid_Editors',1,100,1,'2013-03-27 22:45:16',1,'2013-03-27 22:45:16',0,0,NULL),(35,'system','PagePosition','PagePosition',1,1000,1,'2013-03-28 22:31:02',1,'2013-03-28 22:31:02',0,0,NULL),(36,'system','PageList','PageList',1,1000,1,'2013-03-28 22:33:45',1,'2013-03-28 22:33:45',0,0,NULL),(37,'system','Datagrid类型','datagrid_type',NULL,1000,1,'2014-04-08 23:08:45',1,'2015-03-06 09:39:36',0,1,NULL),(38,'system','接口管理','sysInterface',1,1111,1,'2014-06-01 21:47:51',1,'2014-06-01 21:47:51',0,0,NULL),(39,'system','图标类型','ICON_TYPE',1,100,1,'2015-07-21 20:11:01',1,'2015-07-21 20:11:01',0,0,NULL),(40,'system','自定义绩效项目数据类型','CustomProjectDataType',1,1000,1,'2016-04-04 13:28:22',1,'2016-04-05 19:08:42',0,1,NULL);

/*Table structure for table `bas_column` */

CREATE TABLE `bas_column` (
  `BAS_COLUMN_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '列ID',
  `BAS_DATAGRID_ID` int(11) DEFAULT NULL,
  `SHOW_ORDER` int(11) NOT NULL COMMENT '显示顺序',
  `FILED` varchar(100) NOT NULL COMMENT '绑定字段',
  `NAME` varchar(100) DEFAULT NULL COMMENT '显示列名',
  `WIDTH` decimal(10,2) NOT NULL COMMENT '列宽度',
  `ROWSPAN` int(11) DEFAULT NULL COMMENT '合并列',
  `COLSPAN` int(11) DEFAULT NULL COMMENT '合并行',
  `SORTABLE` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否排序',
  `SORT_ORDER` varchar(5) DEFAULT 'ASC' COMMENT '排序方式:ASC DESC',
  `HEADER_ALIGN` varchar(10) DEFAULT 'LIFE' COMMENT 'LIFE RIGHT CENTER',
  `ALIGN` varchar(10) NOT NULL DEFAULT 'LIFE' COMMENT 'LIFE RIGHT CENTER',
  `HIDDEN` tinyint(1) DEFAULT '1' COMMENT '显示与否:TRUE FALSE',
  `CHECK_BOX` tinyint(1) DEFAULT '0',
  `FORMATTER` varchar(256) DEFAULT NULL,
  `STYLER` varchar(256) DEFAULT NULL,
  `SORTER` varchar(256) DEFAULT NULL,
  `EDITOR` varchar(256) DEFAULT NULL,
  `CREATE_BY` int(11) NOT NULL COMMENT '创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '是否标记删除 0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '记录操作次',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`BAS_COLUMN_ID`),
  KEY `FK_BAS_COLUMN_BAS_DATAGRID_ID` (`BAS_DATAGRID_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=212 DEFAULT CHARSET=utf8 COMMENT='DataGrid列属性配置';

/*Data for the table `bas_column` */

insert  into `bas_column`(`BAS_COLUMN_ID`,`BAS_DATAGRID_ID`,`SHOW_ORDER`,`FILED`,`NAME`,`WIDTH`,`ROWSPAN`,`COLSPAN`,`SORTABLE`,`SORT_ORDER`,`HEADER_ALIGN`,`ALIGN`,`HIDDEN`,`CHECK_BOX`,`FORMATTER`,`STYLER`,`SORTER`,`EDITOR`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (1,6,1,'id','name','10.00',0,0,1,'asc','left','center',0,1,'','','',NULL,1,'2013-03-27 23:35:50',1,'2013-03-30 12:45:36',0,1,NULL),(2,6,2,'showOrder','ShowOrder','20.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-03-27 23:42:09',1,'2013-03-27 23:42:09',0,0,NULL),(3,6,3,'field','Field','30.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-03-27 23:44:50',1,'2013-04-01 23:11:48',0,3,NULL),(4,6,5,'name','Name','150.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-01 22:17:36',1,'2013-04-02 11:01:13',0,3,NULL),(5,6,6,'width','Width','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-01 22:18:54',1,'2013-04-01 23:08:30',0,4,NULL),(7,6,4,'order','Order','20.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-01 22:26:48',1,'2013-04-01 23:06:45',0,1,NULL),(8,6,7,'align','Align','100.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-01 23:10:22',1,'2013-04-01 23:14:31',0,5,NULL),(9,6,8,'sortable','Sortable','100.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-01 23:15:12',1,'2013-04-01 23:16:36',0,2,NULL),(10,6,9,'headerAlign','HeaderAlign','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-01 23:16:26',1,'2013-04-01 23:17:05',0,1,NULL),(11,7,0,'id','编辑','8.00',0,0,1,'asc','center','center',0,0,'formatterCheckBox','','',NULL,1,'2013-04-02 11:12:03',1,'2013-04-05 20:42:44',0,8,NULL),(12,7,2,'nameZh','用户组名称(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-02 11:12:39',1,'2013-04-02 11:14:19',0,2,NULL),(13,7,1,'nameEn','用户组名称(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-02 11:14:59',1,'2013-04-02 11:14:59',0,0,NULL),(14,8,0,'id','状态','8.00',0,0,1,'asc','left','center',0,0,'formatterCheckBox','','',NULL,1,'2013-04-02 13:25:58',1,'2013-04-07 17:28:50',0,5,NULL),(15,8,1,'nameEn','角色名称(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-02 13:26:58',1,'2013-04-05 18:24:17',0,1,NULL),(16,8,2,'nameZh','角色名称(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-02 13:27:42',1,'2013-04-02 13:27:42',0,0,NULL),(17,9,0,'id',' ','30.00',0,0,1,'asc','left','center',0,1,'','','',NULL,1,'2013-04-02 14:42:24',1,'2013-04-02 19:09:25',0,10,NULL),(18,9,1,'nameEn','用户组名称(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-02 14:43:00',1,'2013-04-02 19:21:21',0,6,NULL),(19,9,2,'nameZh','用户组名称(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-02 14:44:53',1,'2013-04-02 14:46:27',0,1,NULL),(20,10,0,'id',' ','30.00',0,0,1,'asc','left','left',0,1,'','','',NULL,1,'2013-04-05 17:50:00',1,'2013-04-05 17:50:00',0,0,NULL),(21,10,1,'tableId','TableId','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 17:54:38',1,'2013-04-05 17:54:38',0,0,NULL),(22,10,2,'title','Title','100.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-05 17:55:10',1,'2013-04-05 19:01:00',0,1,NULL),(23,10,5,'pagination','Pagination','70.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-05 17:55:48',1,'2013-04-05 17:57:16',0,2,NULL),(24,10,4,'frozen','Frozen','50.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-05 17:56:27',1,'2013-04-05 17:56:27',0,0,NULL),(26,10,3,'fit',' Fit','50.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-05 17:59:45',1,'2013-04-05 17:59:45',0,0,NULL),(27,10,6,'fitColumns','FitColumns','60.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 18:00:32',1,'2013-04-05 18:03:07',0,2,NULL),(28,10,7,'striped','Striped','60.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-05 18:02:58',1,'2013-04-05 18:02:58',0,0,NULL),(29,10,8,'method','Method','80.00',0,0,1,'asc','left','left',1,0,'','','','',1,'2013-04-05 18:03:37',1,'2014-04-09 00:06:48',0,1,NULL),(30,10,9,'nowrap','Nowrap','50.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-05 18:05:14',1,'2013-04-05 18:05:14',0,0,NULL),(31,10,10,'url','URL','120.00',0,0,1,'asc','left','left',1,0,'','','','',1,'2013-04-05 18:05:48',1,'2014-04-09 00:04:54',0,1,NULL),(32,10,11,'rownumbers','Rownumbers','50.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-05 18:06:30',1,'2013-04-05 18:06:30',0,0,NULL),(33,10,12,'singleSelect','单行选择','50.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 18:07:08',1,'2013-04-05 18:07:08',0,0,NULL),(34,10,13,'checkOnSelect','CheckOnSelect','80.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-05 18:07:41',1,'2013-04-05 18:07:41',0,0,NULL),(35,10,14,'selectOnCheck','SelectOnCheck','80.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-05 18:08:14',1,'2013-04-05 18:08:14',0,0,NULL),(36,10,15,'pagePosition','PagePosition','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 18:08:42',1,'2013-04-05 18:08:42',0,0,NULL),(37,10,16,'pageNumber','PageNumber','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 18:09:25',1,'2013-04-05 18:12:19',0,3,NULL),(38,10,17,'pageSize','PageSize','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 18:09:59',1,'2013-04-05 18:09:59',0,0,NULL),(39,10,18,'pageList','PageList','150.00',0,0,1,'asc','left','left',1,0,'','','','',1,'2013-04-05 18:10:33',1,'2014-04-09 00:05:54',0,2,NULL),(40,10,20,'sortOrder','SortOrder','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 18:13:49',1,'2013-04-05 18:27:14',0,2,NULL),(41,10,21,'remoteSort','RemoteSort','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 18:14:09',1,'2013-04-05 18:27:22',0,3,NULL),(42,10,19,'sortName','SortName','80.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-05 18:27:04',1,'2013-04-05 19:00:26',0,1,NULL),(43,10,22,'showHeader','ShowHeader','50.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-05 18:28:14',1,'2013-04-05 18:28:14',0,0,NULL),(44,10,23,'showFooter','ShowFooter','50.00',0,0,1,'asc','left','center',1,0,'','','',NULL,1,'2013-04-05 18:28:33',1,'2013-04-05 19:00:15',0,1,NULL),(45,10,24,'data','Data','100.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-05 18:29:50',1,'2013-04-05 18:29:50',0,0,NULL),(46,10,25,'loadMsg','LoadMsg','100.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-05 18:30:17',1,'2013-04-05 18:30:17',0,0,NULL),(47,10,26,'scrollbarSize','ScrollbarSize','100.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-05 18:30:44',1,'2013-04-05 18:30:44',0,0,NULL),(48,10,27,'rowStyler','RowStyler','100.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-05 18:31:07',1,'2013-04-05 19:02:02',0,2,NULL),(49,10,28,'loader','Loader','50.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-05 18:31:45',1,'2013-04-05 18:31:45',0,0,NULL),(50,10,29,'loadFilter','LoadFilter','50.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-05 18:32:11',1,'2013-04-05 18:32:11',0,0,NULL),(51,12,1,'id',' ','10.00',0,0,1,'asc','left','center',0,1,'','','',NULL,1,'2013-04-05 21:00:44',1,'2013-04-05 21:00:44',0,0,NULL),(52,12,2,'nameEn','角色名称(英文)','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 21:01:24',1,'2013-04-05 21:01:24',0,0,NULL),(53,12,3,'nameZh','角色名称(中文)','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-05 21:01:54',1,'2013-04-05 21:01:54',0,0,NULL),(56,9,3,'users','users','10.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-08 15:38:16',1,'2013-04-08 15:38:16',0,0,NULL),(57,12,4,'users','users','10.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-08 16:32:18',1,'2013-04-08 16:32:18',0,0,NULL),(58,13,1,'id','id','8.00',0,0,1,'asc','center','center',0,1,'','','',NULL,1,'2013-04-09 17:13:28',1,'2013-04-09 17:13:28',0,0,NULL),(59,13,3,'nameZh','用户组名称(中文)','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-09 17:15:26',1,'2013-04-09 17:19:08',0,1,NULL),(60,13,2,'nameEn','用户组名称(英文)','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-09 17:16:14',1,'2013-04-09 17:16:14',0,0,NULL),(61,13,4,'description','描述','150.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-09 17:16:44',1,'2013-04-09 17:16:44',0,0,NULL),(62,13,5,'editable','是否可编辑','60.00',0,0,1,'asc','center','center',0,0,'formatterEidtable','','',NULL,1,'2013-04-09 17:17:18',1,'2013-04-09 17:18:56',0,1,NULL),(63,13,6,'createdDate','创建时间','100.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-09 17:17:53',1,'2013-04-09 17:17:53',0,0,NULL),(64,13,7,'updatedDate',' 更新时间','120.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-09 17:18:28',1,'2013-04-09 17:18:28',0,0,NULL),(65,14,1,'id','状态','12.00',0,0,1,'asc','center','center',0,0,'formatterCheckBox','','',NULL,1,'2013-04-09 20:28:25',1,'2013-04-09 20:51:58',0,1,NULL),(66,14,2,'username','用户名','60.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-09 20:29:30',1,'2013-04-09 20:51:50',0,1,NULL),(67,14,3,'realnameEn','用户姓名(英文)','80.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-09 20:30:46',1,'2013-04-09 20:50:34',0,2,NULL),(68,14,4,'realnameZh','用户姓名(英文)','80.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-09 20:31:50',1,'2013-04-09 20:50:27',0,1,NULL),(69,16,0,'id','状态','12.00',0,0,1,'asc','center','center',0,0,'formatterCheckBox','','',NULL,1,'2013-04-09 21:04:17',1,'2013-04-09 21:04:17',0,0,NULL),(70,16,1,'nameEn','角色名称(英文)','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-09 21:05:19',1,'2013-04-09 21:05:19',0,0,NULL),(71,16,2,'nameZh','角色名称(中文)','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-09 21:05:53',1,'2013-04-09 21:05:53',0,0,NULL),(72,17,0,'id','id','10.00',0,0,1,'asc','left','left',0,1,'','','',NULL,1,'2013-04-09 21:09:33',1,'2013-04-09 21:31:26',0,2,NULL),(73,17,1,'username','用户名','80.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-09 21:10:27',1,'2013-04-09 21:31:36',0,1,NULL),(74,17,2,'realnameEn','姓名(英文)','80.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-09 21:11:30',1,'2013-04-09 21:31:45',0,1,NULL),(75,17,3,'realnameZh','姓名(中文)','80.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-09 21:11:54',1,'2013-04-09 21:32:07',0,2,NULL),(76,18,0,'id','id','10.00',0,0,1,'asc','left','left',0,1,'','','',NULL,1,'2013-04-09 21:13:37',1,'2013-04-09 21:13:37',0,0,NULL),(77,18,1,'nameEn','角色名称(英文)','100.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-09 21:14:54',1,'2013-04-09 21:14:54',0,0,NULL),(78,18,2,'nameZh','角色名称(中文)','100.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-09 21:15:25',1,'2013-04-09 21:15:25',0,0,NULL),(79,17,4,'groups','用户组','10.00',0,0,1,'asc','left','center',1,0,'','','',NULL,1,'2013-04-09 21:39:59',1,'2013-04-09 21:57:23',0,2,NULL),(80,18,3,'groups','用户组','10.00',0,0,1,'asc','center','left',1,0,'','','',NULL,1,'2013-04-09 21:41:07',1,'2013-04-09 21:53:11',0,2,NULL),(81,19,0,'id','id','10.00',0,0,0,'asc','center','center',0,1,'','','',NULL,1,'2013-04-10 20:39:16',1,'2013-04-10 20:39:16',0,0,NULL),(82,19,1,'nameEn','角色名称(英文)','80.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-10 20:41:33',1,'2013-04-10 20:41:33',0,0,NULL),(83,19,2,'nameZh','角色名称(中文)','80.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-10 20:42:34',1,'2013-04-10 20:42:34',0,0,NULL),(84,19,3,'description','角色描述','120.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-10 20:43:15',1,'2013-04-10 20:51:04',0,1,NULL),(85,19,4,'editable','是否可编辑','30.00',0,0,1,'asc','center','center',0,0,'formatterEidtable','','',NULL,1,'2013-04-10 20:43:56',1,'2013-04-10 20:51:35',0,1,NULL),(86,19,5,'createdDate','创建时间','60.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-10 20:44:30',1,'2013-04-10 20:50:57',0,1,NULL),(87,19,6,'updatedDate','更新时间','60.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-10 20:45:01',1,'2013-04-10 20:50:48',0,1,NULL),(88,20,0,'id','状态','12.00',0,0,1,'asc','center','center',0,0,'formatterCheckBox','','',NULL,1,'2013-04-10 23:00:09',1,'2013-04-10 23:34:30',0,1,NULL),(89,20,1,'username','用户名','80.00',0,0,1,'asc','center','left',0,0,'','','',NULL,1,'2013-04-10 23:01:07',1,'2013-04-10 23:01:07',0,0,NULL),(90,20,2,'realnameEn','姓名(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-10 23:02:44',1,'2013-04-10 23:02:44',0,0,NULL),(91,20,3,'realnameZh','姓名(中文)','80.00',0,0,1,'asc','left','center',0,0,'','','',NULL,1,'2013-04-10 23:03:16',1,'2013-04-10 23:03:16',0,0,NULL),(92,21,0,'id','状态','12.00',0,0,1,'asc','center','center',0,0,'formatterCheckBox','','',NULL,1,'2013-04-10 23:06:12',1,'2013-04-10 23:34:39',0,1,NULL),(93,21,1,'nameEn','用户组名称(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-10 23:07:19',1,'2013-04-10 23:07:19',0,0,NULL),(94,21,2,'nameZh','用户组名称(中文) ','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-10 23:07:48',1,'2013-04-10 23:07:48',0,0,NULL),(97,22,0,'id','id','10.00',0,0,0,'asc','center','center',0,1,'','','',NULL,1,'2013-04-11 15:21:00',1,'2013-04-11 16:14:02',0,1,NULL),(98,22,1,'parentResourceId','上一级ID','80.00',0,0,0,'asc','center','center',1,0,'','','',NULL,1,'2013-04-11 15:21:53',1,'2013-04-11 16:14:08',0,3,NULL),(99,22,3,'nameEn','资源名称(英文)','80.00',0,0,0,'asc','left','left',0,0,'','','',NULL,1,'2013-04-11 15:22:45',1,'2013-04-11 16:16:45',0,3,NULL),(100,22,2,'nameZh','资源名称(中文)','80.00',0,0,0,'asc','left','left',0,0,'','','',NULL,1,'2013-04-11 15:23:53',1,'2013-04-11 16:16:51',0,4,NULL),(102,24,0,'id','id','10.00',0,0,1,'asc','center','center',0,1,'','','',NULL,1,'2013-04-11 15:37:21',1,'2013-04-11 15:37:21',0,0,NULL),(103,24,1,'username','用户名','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-11 15:37:58',1,'2013-04-11 15:37:58',0,0,NULL),(104,24,3,'realnameZh','姓名(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-11 15:38:51',1,'2013-04-11 15:38:51',0,0,NULL),(105,24,2,'realnameEn','姓名(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-11 15:39:39',1,'2013-04-11 15:39:39',0,0,NULL),(106,23,0,'id','id','10.00',0,0,1,'asc','left','left',0,1,'','','',NULL,1,'2013-04-11 15:40:11',1,'2013-04-11 15:40:11',0,0,NULL),(107,23,1,'nameEn','用户组名称(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-11 15:40:44',1,'2013-04-11 15:42:07',0,1,NULL),(108,23,2,'nameZh','用户组名称(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-11 15:41:57',1,'2013-04-11 15:41:57',0,0,NULL),(110,22,4,'roles','roles','10.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-11 16:17:40',1,'2013-04-11 16:17:40',0,0,NULL),(111,23,3,'roles','roles','10.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-11 18:38:42',1,'2013-04-11 18:38:42',0,0,NULL),(112,24,4,'roles','roles','10.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-11 18:39:27',1,'2013-04-11 18:39:27',0,0,NULL),(113,25,0,'id','id','10.00',0,0,1,'asc','center','center',0,1,'','','',NULL,1,'2013-04-14 09:07:06',1,'2013-04-14 09:33:27',0,8,NULL),(114,25,2,'nameEn','编码名称(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 09:30:31',1,'2013-04-14 09:30:31',0,0,NULL),(115,25,1,'codeType','编码类型','60.00',0,0,1,'asc','left','left',0,0,'formatterName','','',NULL,1,'2013-04-14 09:31:32',1,'2013-04-14 09:43:15',0,1,NULL),(116,25,3,'nameZh','编码名称(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 09:34:05',1,'2013-04-14 09:34:17',0,1,NULL),(117,25,4,'codeValue','编码值','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 09:34:45',1,'2013-04-14 09:34:45',0,0,NULL),(118,25,5,'editable','可编辑','20.00',0,0,1,'asc','center','center',0,0,'formatterEidtable','','',NULL,1,'2013-04-14 09:35:15',1,'2013-04-14 09:45:14',0,3,NULL),(119,25,6,'selected','默认项','20.00',0,0,1,'asc','center','center',0,0,'formatterEidtable','','',NULL,1,'2013-04-14 09:39:19',1,'2013-04-14 09:45:20',0,3,NULL),(120,25,7,'sortNo','排序','20.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-14 09:40:07',1,'2013-04-14 09:40:07',0,0,NULL),(121,25,8,'createdDate','创建时间','60.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-14 09:40:52',1,'2013-04-14 09:40:52',0,0,NULL),(122,25,9,'updatedDate','更新时间','60.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 09:41:15',1,'2013-04-14 09:41:15',0,0,NULL),(123,26,0,'id','id','10.00',0,0,1,'asc','center','center',0,1,'','','',NULL,1,'2013-04-14 09:48:05',1,'2013-04-14 09:50:48',0,1,NULL),(124,26,1,'type','通用编码类型','85.00',0,0,1,'asc','center','center',0,0,'formatterCodeList','','','',1,'2013-04-14 09:51:52',1,'2014-04-08 12:54:52',0,7,NULL),(125,26,2,'nameEn','通用编码类型名称(英文)','85.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 09:52:37',1,'2013-04-14 09:52:37',0,0,NULL),(126,26,3,'nameZh','通用编码类型名称(中文)','85.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 09:52:56',1,'2013-04-14 09:52:56',0,0,NULL),(127,26,4,'codeLenLimit','编码参数值长度','85.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 09:53:32',1,'2013-04-14 09:53:32',0,0,NULL),(128,26,5,'editable','可编辑','20.00',0,0,1,'asc','center','center',0,0,'formatterEidtable','','',NULL,1,'2013-04-14 09:53:57',1,'2013-04-14 09:55:07',0,2,NULL),(129,26,6,'createdDate','创建时间','80.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-14 09:55:00',1,'2013-04-14 09:55:00',0,0,NULL),(130,26,7,'updatedDate','更新时间','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 09:55:31',1,'2013-04-14 09:55:31',0,0,NULL),(131,27,0,'id','id','10.00',0,0,1,'asc','center','center',0,1,'','','',NULL,1,'2013-04-14 12:38:08',1,'2013-04-14 12:38:08',0,0,NULL),(132,27,1,'parentResourceId','上一级ID','10.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-14 12:39:36',1,'2013-04-14 12:39:36',0,0,NULL),(133,27,2,'nameZh','资源名称(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 16:37:08',1,'2013-04-14 16:37:08',0,0,NULL),(134,27,3,'type','资源类型','80.00',0,0,1,'asc','left','left',0,0,'formatterCodeResource','','',NULL,1,'2013-04-14 16:37:46',1,'2013-04-14 16:51:23',0,2,NULL),(135,27,4,'path','资源路径','120.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 16:38:11',1,'2013-04-14 16:38:11',0,0,NULL),(136,27,5,'seqNum','排序','20.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-14 16:39:13',1,'2013-04-14 16:58:03',0,1,NULL),(137,27,6,'target','目标','15.00',0,0,1,'asc','center','left',1,0,'','','',NULL,1,'2013-04-14 16:39:54',1,'2013-04-14 16:58:14',0,2,NULL),(138,27,7,'nameEn','资源名称(英文)','80.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-14 16:40:27',1,'2013-04-14 16:40:27',0,0,NULL),(139,27,8,'description','资源描述','120.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-14 16:40:51',1,'2013-04-14 16:42:17',0,1,NULL),(140,27,9,'editable','可编辑','15.00',0,0,1,'asc','center','center',0,0,'formatterEidtable','','',NULL,1,'2013-04-14 16:41:21',1,'2013-04-14 16:58:09',0,3,NULL),(141,27,10,'isLeaf','是否叶节点','40.00',0,0,1,'asc','left','left',1,0,'','','',NULL,1,'2013-04-14 16:42:05',1,'2013-04-14 16:42:05',0,0,NULL),(142,28,0,'id','部门ID','10.00',0,0,1,'asc','center','center',0,1,'','','',NULL,1,'2013-04-14 17:00:55',1,'2013-04-14 17:00:55',0,0,NULL),(143,28,1,'parentDepartmentId','上级部门ID','10.00',0,0,1,'asc','center','center',1,0,'','','',NULL,1,'2013-04-14 17:01:38',1,'2013-04-14 17:01:43',0,1,NULL),(144,28,2,'nameEn','部门名称(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 17:03:07',1,'2013-04-14 17:03:07',0,0,NULL),(145,28,3,'nameZh','部门名称(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 17:03:39',1,'2013-04-14 17:03:39',0,0,NULL),(146,28,4,'departmentNo','部门编号','80.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-14 17:04:08',1,'2013-04-14 17:04:08',0,0,NULL),(147,28,5,'description','部门描述','120.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 17:04:34',1,'2013-04-14 17:04:34',0,0,NULL),(148,28,6,'editable','可编辑','20.00',0,0,1,'asc','center','center',0,0,'formatterEidtable','','',NULL,1,'2013-04-14 17:05:25',1,'2013-04-14 17:05:25',0,0,NULL),(149,29,0,'id','序号','10.00',0,0,1,'asc','left','center',0,1,'','','',NULL,1,'2013-04-14 17:27:21',1,'2013-04-14 17:27:21',0,0,NULL),(150,29,1,'type','参数类型','60.00',0,0,1,'asc','left','left',0,0,'formatterCodeList','','',NULL,1,'2013-04-14 17:28:00',1,'2013-04-14 18:36:42',0,3,NULL),(151,29,2,'nameEn','参数名称(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 17:28:47',1,'2013-04-14 17:28:47',0,0,NULL),(152,29,3,'nameZh','参数名称(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 17:29:17',1,'2013-04-14 17:29:17',0,0,NULL),(154,29,5,'description','参数描述','100.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 17:30:02',1,'2013-04-14 17:30:02',0,0,NULL),(155,29,7,'editable','可编辑','25.00',0,0,1,'asc','center','center',0,0,'formatterEidtable','','',NULL,1,'2013-04-14 17:30:36',1,'2013-04-14 18:59:37',0,4,NULL),(156,29,8,'createdDate','创建时间','80.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-14 17:31:00',1,'2013-04-14 18:57:56',0,2,NULL),(157,29,9,'updatedDate','更新时间','80.00',0,0,1,'asc','center','center',0,0,'','','',NULL,1,'2013-04-14 17:31:24',1,'2013-04-14 18:57:50',0,1,NULL),(158,29,6,'value','参数值','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2013-04-14 18:57:34',1,'2013-04-14 18:57:34',0,0,NULL),(159,11,0,'id','id','30.00',0,0,1,'asc','left','left',0,1,'','','',NULL,1,'2014-04-03 12:17:05',1,'2014-04-03 12:57:33',0,4,NULL),(160,11,1,'username','用户名','80.00',0,0,1,'asc','left','left',0,0,'','',NULL,'text',1,'2014-04-03 12:48:38',1,'2015-02-07 15:04:07',0,7,NULL),(162,11,4,'realnameZh','真实姓名(中文)','80.00',0,0,1,'asc','left','left',0,0,'','','','text',1,'2014-04-03 12:58:51',1,'2014-04-03 13:04:44',0,2,NULL),(163,11,5,'realnameEn','真实姓名(英文)','80.00',0,0,1,'asc','left','left',0,0,'','','','text',1,'2014-04-03 12:59:22',1,'2014-04-03 13:07:59',0,2,NULL),(164,11,6,'employeeCode','员工号','80.00',0,0,1,'asc','left','left',0,0,'','','',NULL,1,'2014-04-03 13:00:56',1,'2014-04-03 13:02:26',0,1,NULL),(165,11,10,'accountLocked','账户锁定状态','90.00',0,0,1,'asc','left','center',0,0,'formatterAccountLocked','',NULL,'',1,'2014-04-03 13:01:50',1,'2015-02-07 15:00:27',0,6,NULL),(166,11,8,'telephone','联系电话','80.00',0,0,1,'asc','left','left',0,0,'','','','text',1,'2014-04-03 13:09:33',1,'2014-04-03 13:09:33',0,0,NULL),(167,11,9,'officePhone','办公室','80.00',0,0,1,'asc','left','left',1,0,'','',NULL,'',1,'2014-04-03 13:10:10',1,'2015-02-07 14:58:51',0,1,NULL),(168,11,10,'accountExpired','账户状态','80.00',0,0,1,'asc','left','left',0,0,'formatterEidtable','',NULL,'',1,'2014-04-03 13:11:20',1,'2015-02-07 14:31:51',0,2,NULL),(170,11,11,'accountExpiredDate','账户有效日期','100.00',0,0,1,'asc','left','left',0,0,'formatterDate','',NULL,'datebox',1,'2014-04-03 14:00:03',1,'2015-02-07 15:59:59',0,2,NULL),(173,30,0,'id','id','30.00',0,0,1,'asc','left','left',0,1,'','','','',1,'2014-04-04 01:05:31',1,'2014-04-04 01:05:31',0,0,NULL),(174,30,1,'nameEn','nameEn','300.00',0,0,1,'asc','left','left',0,0,'','','','',1,'2014-04-04 01:05:51',1,'2014-04-04 01:05:51',0,0,NULL),(175,11,12,'department','所属部门','100.00',0,0,1,'asc','left','left',0,0,'formatterShowDepartment','','','',1,'2014-04-04 14:57:13',4,'2014-05-07 16:23:05',0,2,NULL),(176,33,1,'name','缓存名称','100.00',0,0,0,'asc','left','left',0,0,'','','','',1,'2014-04-21 15:29:37',1,'2014-04-22 10:30:19',0,1,NULL),(177,33,2,'size','缓存大小','100.00',0,0,0,'asc','left','left',0,0,'','','','',1,'2014-04-21 15:30:36',1,'2014-04-22 10:30:36',0,1,NULL),(178,33,3,'memoryStoreSize','内存缓存数量','100.00',0,0,0,'asc','left','left',0,0,'','','','',1,'2014-04-21 15:31:01',1,'2014-04-22 10:30:40',0,2,NULL),(179,33,4,'diskStoreSize','磁盘数量','100.00',0,0,1,'asc','left','left',0,0,'','','','',1,'2014-04-21 15:31:30',1,'2014-04-21 15:31:30',0,0,NULL),(180,33,5,'cacheHits','命中次数','100.00',0,0,0,'asc','left','left',0,0,'','','','',1,'2014-04-21 15:32:02',1,'2014-04-22 10:30:45',0,1,NULL),(181,33,6,'inMemoryHits','内存命中次数','100.00',0,0,0,'asc','left','left',0,0,'','','','',1,'2014-04-21 15:32:26',1,'2014-04-22 10:30:49',0,1,NULL),(182,33,7,'onDiskHits','磁盘命中次数','100.00',0,0,0,'asc','left','left',0,0,'','','','',1,'2014-04-21 15:32:45',1,'2014-04-22 10:30:55',0,1,NULL),(183,33,8,'memoryStoreEvictionPolicy','缓存策略','100.00',0,0,0,'asc','left','left',0,0,'','','','',1,'2014-04-21 15:33:04',1,'2014-04-22 10:30:59',0,1,NULL),(184,27,11,'resources','资源','15.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2015-02-06 15:55:59',1,'2015-02-06 15:56:04',0,0,NULL),(185,27,10,'icon','图标','30.00',1,1,1,'asc','left','left',1,1,'','',NULL,'',1,'2015-03-30 16:46:02',1,'2015-03-30 16:46:02',0,0,NULL),(203,37,1,'projectCode','项目代码','50.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-03-29 13:09:37',1,'2016-03-29 13:09:41',0,1,NULL),(204,37,2,'projectName','项目名称','50.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-03-29 13:11:54',1,'2016-03-29 13:12:05',0,1,NULL),(205,37,3,'projectUnit','单位','20.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-03-29 13:13:25',1,'2016-03-29 13:13:30',0,1,NULL),(206,37,4,'dataTableName','数据表','50.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-03-29 13:14:45',1,'2016-03-29 13:14:49',0,1,NULL),(207,37,5,'fetchSQL','取数SQL','100.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-03-29 13:16:15',1,'2016-03-29 13:17:16',0,1,NULL),(208,37,6,'variableNumber','变量数','20.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-03-29 13:17:08',1,'2016-03-29 13:17:28',0,1,NULL),(209,37,7,'dataType','数据类型','50.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-03-29 13:18:32',1,'2016-03-29 13:18:35',0,1,NULL),(210,38,1,'id','编号','50.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-04-24 13:06:09',1,'2016-04-24 13:06:13',0,0,NULL),(211,38,2,'nameZh','中文名','50.00',0,0,1,'ASC','LIFE','LIFE',1,0,NULL,NULL,NULL,NULL,1,'2016-04-24 13:07:03',1,'2016-04-24 13:07:19',0,0,NULL);

/*Table structure for table `bas_custom_performance_project` */

CREATE TABLE `bas_custom_performance_project` (
  `BAS_CUSTOM_PERFORMANCE_PROJECT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROJECT_CODE` varchar(100) NOT NULL COMMENT '项目代码',
  `PROJECT_NAME` varchar(100) NOT NULL COMMENT '项目名称',
  `PROJECT_UNIT` varchar(20) NOT NULL COMMENT '项目单位',
  `DATA_TABLE_NAME` varchar(50) DEFAULT NULL COMMENT '数据表',
  `FETCH_SQL` varchar(300) DEFAULT NULL COMMENT '取数SQL',
  `VARIABLE_NUMBER` int(1) DEFAULT NULL COMMENT 'SQL中的变量数，可取2,3,4',
  `DATA_TYPE` int(1) NOT NULL COMMENT '数据类型 1 自动获取 0 手工输入',
  `CREATE_BY` int(11) NOT NULL COMMENT '创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '更新日期',
  `OPT_COUNTER` int(6) DEFAULT NULL COMMENT '记录操作次',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '是否标记删除 0 未删除   1 表示删除',
  PRIMARY KEY (`BAS_CUSTOM_PERFORMANCE_PROJECT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='绩效自定义项目表';

/*Data for the table `bas_custom_performance_project` */

insert  into `bas_custom_performance_project`(`BAS_CUSTOM_PERFORMANCE_PROJECT_ID`,`PROJECT_CODE`,`PROJECT_NAME`,`PROJECT_UNIT`,`DATA_TABLE_NAME`,`FETCH_SQL`,`VARIABLE_NUMBER`,`DATA_TYPE`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`OPT_COUNTER`,`DELETE_DATE`,`MARK_FOR_DELETE`) values (1,'jx0000000001','总收入','元','performance_data_original','select...',3,1,1,'2013-03-27 23:35:50',1,'2016-05-05 00:50:46',5,NULL,0),(2,'jx0000000002','B超','次','table','select...',4,1,1,'2016-03-27 20:34:08',1,'2016-03-28 23:27:28',1,NULL,0),(3,'jx0000000003','验血','次','tableone','select...',2,1,1,'2016-03-27 20:34:39',1,'2016-04-14 20:56:40',3,NULL,0),(4,'jx0000000004','项目4','次','','',NULL,0,1,'2016-03-27 20:46:43',1,'2016-04-06 01:03:57',3,NULL,0),(6,'jx0000000005','项目5','次','','',NULL,0,1,'2016-03-28 23:31:16',1,'2016-04-04 16:23:46',4,NULL,0),(7,'jx0000000006','项目6','次','','',NULL,0,1,'2016-04-04 16:24:54',1,'2016-04-06 12:16:02',8,NULL,0),(8,'jx0000000007','手术','次','','',NULL,0,1,'2016-04-13 14:26:35',1,'2016-04-13 14:26:35',0,NULL,0);

/*Table structure for table `bas_datagrid` */

CREATE TABLE `bas_datagrid` (
  `BAS_DATAGRID_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `TYPE_` varchar(30) DEFAULT NULL COMMENT '表格类型',
  `TABLE_ID` varchar(60) NOT NULL COMMENT '表格ID',
  `TITLE` varchar(128) DEFAULT NULL,
  `SHOW_TITLE` tinyint(1) DEFAULT '0' COMMENT '是否显示标题 默认为否',
  `FIT` tinyint(1) DEFAULT '1' COMMENT '设置为true将自动使列适应表格宽度以防止出现水平滚动',
  `FROZEN` tinyint(1) DEFAULT '0' COMMENT '跟列属性一样，但是这些列固定在左边，不会滚动',
  `SHOW_GROUP` tinyint(1) DEFAULT '0' COMMENT '是否合并表头并分组显示，默认值：false',
  `PAGINACTION` tinyint(1) DEFAULT '1' COMMENT '是否显示分页显示条',
  `FIT_COLUMNS` tinyint(1) DEFAULT '0',
  `STRIPED` tinyint(1) DEFAULT '0',
  `METHOD` varchar(15) DEFAULT 'POST' COMMENT 'The method type to request remote data.Default value is:post',
  `NOWRAP` tinyint(1) DEFAULT '1' COMMENT ' 默认设置为：true，当数据长度超出列宽时将会自动截取',
  `URL` varchar(256) DEFAULT NULL COMMENT ' A URL to request data from remote site',
  `DATA_` varchar(512) DEFAULT NULL COMMENT 'The data to be loaded',
  `LOAD_MSG` varchar(100) DEFAULT NULL COMMENT ' When loading data from remote site,show a prompt message.Default value is:''Processing, please wait …''',
  `ROW_NUMBERS` tinyint(1) DEFAULT '1' COMMENT 'True to show a row number column. Default value is:true',
  `SINGLE_SELECT` tinyint(1) DEFAULT '1' COMMENT 'True to allow selecting only one row. Default value is:true',
  `CHECK_ON_SELECT` tinyint(1) DEFAULT '1',
  `SELECT_ON_CHECK` tinyint(1) DEFAULT '1',
  `PAGE_POSITION` varchar(10) DEFAULT NULL COMMENT ' Defines position of the pager bar. Available values are: ''top'',''bottom'',''both''.The default value is:bottom',
  `PAGE_NUMBER` int(11) DEFAULT '1',
  `PAGE_SIZE` int(11) DEFAULT '15',
  `PAGE_LIST` varchar(50) DEFAULT '[10,15,20,30,40,50,100]',
  `QUEYR_PARAMS` varchar(50) DEFAULT '100',
  `SORT_NAME` varchar(30) DEFAULT 'id' COMMENT 'Defines which column can be sorted.',
  `SORT_ORDER` varchar(5) DEFAULT 'asc' COMMENT 'Defines the column sort order, can only be ''asc'' or ''desc''.',
  `REMOTE_SORT` tinyint(1) DEFAULT '1' COMMENT 'Defines if to sort data from server.',
  `SHOW_HEADER` tinyint(1) DEFAULT '1' COMMENT 'Defines if to show row header.',
  `SHOW_FOOTER` tinyint(1) DEFAULT '0' COMMENT 'Defines if to show row footer.',
  `SCROLLBER_SIZE` int(11) DEFAULT '18',
  `ROW_STYLER` varchar(100) DEFAULT NULL COMMENT 'Return style such as ''background:red''. The function take two parameter:',
  `LOAD_FILTER` varchar(100) DEFAULT NULL COMMENT 'Return the filtered data to display.',
  `EDITERS` varchar(100) DEFAULT NULL,
  `LOADER` varchar(100) DEFAULT NULL COMMENT 'Defines how to load data from remote server.',
  `VIEW_` varchar(100) DEFAULT NULL,
  `CREATE_BY` int(11) NOT NULL COMMENT '创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '是否标记删除 0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '记录操作次',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`BAS_DATAGRID_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='DATAGRID 表格控件显示数据';

/*Data for the table `bas_datagrid` */

insert  into `bas_datagrid`(`BAS_DATAGRID_ID`,`TYPE_`,`TABLE_ID`,`TITLE`,`SHOW_TITLE`,`FIT`,`FROZEN`,`SHOW_GROUP`,`PAGINACTION`,`FIT_COLUMNS`,`STRIPED`,`METHOD`,`NOWRAP`,`URL`,`DATA_`,`LOAD_MSG`,`ROW_NUMBERS`,`SINGLE_SELECT`,`CHECK_ON_SELECT`,`SELECT_ON_CHECK`,`PAGE_POSITION`,`PAGE_NUMBER`,`PAGE_SIZE`,`PAGE_LIST`,`QUEYR_PARAMS`,`SORT_NAME`,`SORT_ORDER`,`REMOTE_SORT`,`SHOW_HEADER`,`SHOW_FOOTER`,`SCROLLBER_SIZE`,`ROW_STYLER`,`LOAD_FILTER`,`EDITERS`,`LOADER`,`VIEW_`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (6,'datagrid_datagrid ','datacolumn_tb','DataGrid列管理列表',0,0,1,0,1,1,1,'post',1,'main/datacolumn_lists.action','','',1,1,1,1,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,1,18,'','',NULL,'',NULL,1,'2013-04-01 22:25:07',1,'2014-04-08 23:30:21',0,12,NULL),(7,'users_datagrid','usergroup_tb','已关联用户组 ',1,0,0,0,0,1,1,'post',1,'main/auth_usergrouplist.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-02 11:10:42',1,'2014-04-08 23:29:14',0,24,NULL),(8,'users_datagrid','userrole_tb','已关联角色',1,0,0,0,0,1,1,'post',1,'main/role_lists.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-02 13:23:51',1,'2014-04-08 23:47:06',0,5,NULL),(9,'users_datagrid','authgroup_tb','',0,0,1,0,0,1,1,'post',1,'main/auth_grouplist.action','','',1,0,1,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-02 14:41:23',1,'2013-04-07 19:20:02',0,4,NULL),(10,'datagrid_datagrid ','datagrid_dt','DataGrid表格',0,0,1,0,1,1,1,'post',1,'main/datagrid_lists.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-05 17:41:16',1,'2014-04-08 23:45:56',0,33,NULL),(11,'users_datagrid','sys_user_list_tb','用户列表',0,0,1,0,1,1,1,'post',1,'main/userlists.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-05 19:42:23',1,'2014-04-08 23:47:18',0,1,NULL),(12,'users_datagrid','authrole_tb',NULL,0,0,1,0,0,1,1,'post',1,'main/auth_rolelist.action','','',1,0,1,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-05 20:59:17',1,'2013-04-08 15:06:57',0,8,NULL),(13,'users_datagrid','sys_group_list_tb','用户组管理',0,0,0,0,1,1,1,'post',1,'main/group_lists.action','','',1,1,1,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-09 17:11:43',1,'2013-04-09 17:11:43',0,0,NULL),(14,'users_datagrid','sys_authuserlistforgroup_tb','已关联用户',1,0,1,0,0,1,1,'post',1,'main/auth_serlistforgroup.action','','',0,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-09 20:25:43',1,'2014-04-08 23:47:23',0,2,NULL),(16,'users_datagrid','sys_authrolelistforgroup_tb','已关联角色',1,0,0,0,0,1,1,'post',1,'main/authgroup_rolelistforgroup.action','','',0,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-09 21:03:09',1,'2013-04-09 23:21:55',0,2,NULL),(17,'users_datagrid','sys_authuserforgroup_tb','关联用户组',0,0,1,0,0,1,1,'post',1,'main/authgroup_userlist.action','','',1,0,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-09 21:08:50',1,'2014-04-08 23:48:29',0,3,NULL),(18,'users_datagrid','sys_authroleforgroup_tb','',0,0,1,0,0,1,1,'post',1,'main/authgroup_rolelist.action','','',1,0,1,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-09 21:13:06',1,'2013-04-09 22:01:22',0,2,NULL),(19,'users_datagrid','sys_rolelist_tb','角色列表',0,0,1,0,1,1,1,'post',1,'main/role_lists.action','','',1,1,1,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-10 20:37:53',1,'2014-04-08 23:30:51',0,1,NULL),(20,'users_datagrid','sys_authrole_userlist_tb','已关联用户组',1,0,1,0,0,1,1,'post',1,'main/authrole_userlist.action','','',0,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-10 22:59:07',1,'2014-04-08 23:47:34',0,1,NULL),(21,'users_datagrid','sys_authrole_grouplist_tb',NULL,0,0,1,0,1,1,1,'post',1,'main/authrole_grouplist.action','','',1,0,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-10 23:04:55',1,'2014-04-08 17:30:07',0,1,NULL),(22,'users_datagrid','sys_authrole_resources_tb',NULL,0,0,0,0,0,1,1,'post',1,'main/authrole_resources.action','','',1,0,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',0,1,0,18,'','',NULL,'',NULL,1,'2013-04-11 15:19:08',1,'2013-04-11 16:16:02',0,7,NULL),(23,'users_datagrid','sys_authrole_groups_tb',NULL,0,0,1,0,1,1,1,'post',1,'main/authrole_groups.action','','',1,0,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-11 15:35:23',1,'2014-04-02 17:23:29',0,5,NULL),(24,'users_datagrid','sys_authrole_users_tb','角色授权表格',0,0,1,0,0,1,1,'post',1,'main/authrole_users.action','','',1,0,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-11 15:36:43',1,'2014-04-08 23:48:03',0,7,NULL),(25,'code_datagrid','sys_codelist_tb','编码列表',0,0,1,0,1,1,1,'post',1,'main/codelist_lists.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-14 09:05:30',1,'2014-04-08 23:50:25',0,3,NULL),(26,'code_datagrid','sys_codetype_lists_tb','编码类型列表',0,0,1,0,1,1,1,'post',1,'main/codetype_lists.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-14 09:47:00',1,'2014-04-08 23:50:30',0,2,NULL),(27,'system_datagrid','sys_resource_lists_tb','资源列表',0,0,1,0,1,1,1,'post',1,'main/resource_lists.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-14 11:45:43',1,'2014-04-08 23:51:21',0,7,NULL),(28,'system_datagrid','sys_department_lists','部门列表',0,0,0,0,1,1,0,NULL,0,'main/department_lists.action','','',1,0,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'',NULL,0,1,0,18,'','',NULL,'',NULL,1,'2013-04-14 16:35:22',1,'2014-04-08 23:51:11',0,8,NULL),(29,'system_datagrid','sys_parameter_lists_tb','系统参数列表',0,0,1,0,1,1,1,'post',1,'main/parameter_lists.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2013-04-14 17:26:58',1,'2014-04-08 23:50:57',0,2,NULL),(30,'system_datagrid','sys_department_lists2',NULL,0,0,1,0,1,1,1,'post',1,'/main/system/department/lists.jhtml','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2014-04-04 01:04:59',1,'2014-04-04 01:10:43',0,2,NULL),(32,'datagrid_datagrid ','sys_datagrid_tb1','DataGrid表格测试 ',0,0,1,0,1,1,0,'post',1,'sys_datagrid_tb1','','',1,0,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',1,1,0,18,'','',NULL,'',NULL,1,'2014-04-08 23:04:00',1,'2014-04-08 23:46:14',0,2,NULL),(33,'system_datagrid','sys_cachelist_tb','缓存管理',0,0,1,0,0,1,1,'post',1,'sys_cachelist_tb','','',1,1,0,0,'bottom',1,15,'[10,15,20,25,30,40,50,100]',NULL,'','asc',0,1,0,18,'','',NULL,'',NULL,1,'2014-04-21 15:13:40',1,'2014-04-22 10:30:01',0,1,NULL),(37,'system_datagrid','sys_customperformanceproject_tb','自定义绩效项目表格',0,0,1,0,1,1,1,'POST',1,'main/customperformanceproject_lists.action','','',1,1,0,0,'bottom',1,15,'[10,15,20,30,40,50,100]','','','asc',1,1,0,18,'','',NULL,'',NULL,1,'2016-03-29 12:35:37',1,'2016-03-29 12:35:44',0,1,NULL),(38,'system_datagrid','sys_demo_tb','测试表格',0,0,1,0,1,1,1,'POST',1,NULL,'','',1,1,0,0,'bottom',1,15,'[10,15,20,30,40,50,100]','','','asc',1,1,0,18,'','',NULL,'',NULL,1,'2016-04-24 13:04:17',1,'2016-04-24 13:04:22',0,1,NULL);

/*Table structure for table `bas_demo` */

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

/*Table structure for table `bas_department` */

CREATE TABLE `bas_department` (
  `BAS_DEPARTMENT_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `PARENT_BAS_DEPARTMENT_ID` int(11) DEFAULT NULL COMMENT '父部门ID',
  `NAME_ZH` varchar(128) NOT NULL COMMENT '部门名称－中文',
  `NAME_EN` varchar(128) NOT NULL COMMENT '部门名称－英文',
  `DEPARTMENTNO` varchar(30) NOT NULL COMMENT '部门编号',
  `DESCRIPTION` varchar(256) DEFAULT NULL COMMENT '部门描述',
  `EDITABLE` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否能编辑',
  `CREATE_BY` int(11) NOT NULL COMMENT '创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '是否标记删除 0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '记录操作次',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`BAS_DEPARTMENT_ID`),
  KEY `FK_BAS_DEPARTMENT_PARENT_ID` (`PARENT_BAS_DEPARTMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='系统部门表';

/*Data for the table `bas_department` */

insert  into `bas_department`(`BAS_DEPARTMENT_ID`,`PARENT_BAS_DEPARTMENT_ID`,`NAME_ZH`,`NAME_EN`,`DEPARTMENTNO`,`DESCRIPTION`,`EDITABLE`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (26,NULL,'临床类','clinical','01','科室类别',1,1,'2016-04-12 12:47:46',1,'2016-05-04 19:48:03',0,2,NULL),(27,26,'妇科','gynaecology','0101','科室',1,1,'2016-04-12 12:57:25',1,'2016-05-04 19:54:27',0,3,NULL),(28,26,'鼻咽科','nasopharynx','0102','科室',1,1,'2016-04-12 12:55:32',1,'2016-05-04 19:54:03',0,3,NULL),(29,26,'头颈科','toujingke','0103','科室',1,1,'2016-04-12 12:59:09',1,'2016-05-04 19:49:08',0,2,NULL),(30,26,'胸科','xiongke','0104','科室',1,1,'2016-04-12 12:59:54',1,'2016-05-04 19:49:11',0,2,NULL),(31,26,'胃胰科','weiyike','0105','科室',1,1,'2016-04-12 13:09:48',1,'2016-05-04 19:49:19',0,2,NULL),(32,26,'结直肠科','jiezhichangke','0106','科室',1,1,'2016-04-12 13:10:35',1,'2016-05-04 19:49:25',0,2,NULL),(33,26,'内科','neike','0107','科室',1,1,'2016-04-12 13:11:11',1,'2016-05-04 19:49:29',0,2,NULL),(34,26,'放疗科','fangliaoke','0108','科室',1,1,'2016-04-12 13:12:05',1,'2016-05-04 19:49:33',0,2,NULL),(35,27,'妇科-医师','fuke-yishi','010101','绩效分配单元',1,1,'2016-04-12 16:54:45',1,'2016-05-04 19:54:32',0,3,NULL),(36,27,'妇科-护理','fuke-huli','010102','绩效分配单元',1,1,'2016-04-12 16:55:33',1,'2016-05-04 19:55:07',0,3,NULL),(37,35,'妇科-医师','fuke-yishi','01010101','绩效核算单元',1,1,'2016-04-12 16:57:26',1,'2016-05-04 19:54:39',0,3,NULL),(38,35,'妇科-化疗','fuke-hualiao','01010102','绩效核算单元',1,1,'2016-04-12 16:58:23',1,'2016-05-04 19:54:52',0,3,NULL),(39,35,'妇科-专科','fuke-gongjingzhuanke','01010103','绩效核算单元',1,1,'2016-04-12 16:59:18',1,'2016-05-04 19:54:56',0,4,NULL),(40,35,'妇科-行政','fuke-xingzheng','01010104','绩效核算单元',1,1,'2016-04-12 16:59:57',1,'2016-05-04 19:55:01',0,3,NULL),(43,28,'鼻咽科-医师','biyanke-yishi','010201','绩效分配单元',1,1,'2016-05-04 19:27:38',1,'2016-05-04 19:54:08',0,3,NULL),(44,28,'鼻咽科-护理','biyanke-huli','010202','绩效分配单元',1,1,'2016-05-04 19:28:58',1,'2016-05-04 19:54:17',0,2,NULL),(45,NULL,'医技医辅类','yjyfl','02','科室类别',1,1,'2016-05-04 19:47:29',1,'2016-05-04 19:47:41',0,1,NULL),(46,NULL,'行政后勤类','xzhql','03','科室类别',1,1,'2016-05-04 19:50:22',1,'2016-05-04 19:50:22',0,0,NULL),(48,45,'药学部','yxb','0201','科室',1,1,'2016-05-04 23:30:09',1,'2016-05-04 23:30:09',0,0,NULL),(49,45,'放射科','fsk','0202','科室',1,1,'2016-05-04 23:30:32',1,'2016-05-04 23:30:32',0,0,NULL),(50,45,'检验科','jyk','0203','科室',1,1,'2016-05-04 23:30:58',1,'2016-05-04 23:31:11',0,1,NULL),(51,45,'病理科','blk','0204','科室',1,1,'2016-05-04 23:31:44',1,'2016-05-04 23:31:44',0,0,NULL),(52,46,'办公室','bgs','0301','科室',1,1,'2016-05-04 23:33:32',1,'2016-05-04 23:33:32',0,0,NULL),(53,46,'组织人事处','zzrsc','0302','科室',1,1,'2016-05-04 23:33:59',1,'2016-05-04 23:33:59',0,0,NULL),(54,46,'医务处','ywc','0303','科室',1,1,'2016-05-04 23:34:21',1,'2016-05-04 23:34:21',0,0,NULL),(55,46,'财务处','cwc','0304','科室',1,1,'2016-05-04 23:35:04',1,'2016-05-04 23:35:04',0,0,NULL),(56,46,'保卫处','bwc','0305','科室',1,1,'2016-05-04 23:35:30',1,'2016-05-05 00:53:01',0,2,NULL);

/*Table structure for table `bas_group` */

CREATE TABLE `bas_group` (
  `BAS_GROUP_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色组ID',
  `NAME_ZH` varchar(128) NOT NULL COMMENT '角色组中文名称',
  `NAME_EN` varchar(128) NOT NULL COMMENT '角色组英语名称',
  `DESCRIPTION` varchar(256) DEFAULT NULL COMMENT '角色组描述',
  `EDITABLE` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否可编辑',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`BAS_GROUP_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='角色组表';

/*Data for the table `bas_group` */

insert  into `bas_group`(`BAS_GROUP_ID`,`NAME_ZH`,`NAME_EN`,`DESCRIPTION`,`EDITABLE`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (1,'系统管理组','SysAdminGroup','对系统有不受限制的完全访问权',1,1,'2013-03-23 22:40:16',1,'2016-05-08 22:14:35',0,113,NULL),(3,'部门考勤组','DeptAttendanceGroup','管理本部门绩效考勤',1,1,'2013-03-24 10:30:13',1,'2016-05-08 22:27:51',0,39,NULL),(5,'普通用户组','DefaultUserGroup','仅限查询本人相关信息',1,1,'2013-04-02 13:38:48',1,'2016-05-08 21:21:48',0,34,NULL),(6,'部门报表组','DeptReportGroup','管理本部门报表生成、导出',1,1,'2013-04-10 20:27:30',1,'2016-05-09 00:09:55',0,13,NULL),(7,'部门绩效组','DeptPerformanceGroup','管理本部门工作绩效数据',1,1,'2016-05-08 21:54:59',1,'2016-05-09 00:08:48',0,4,NULL),(8,'部门基础信息管理组','DeptBaseInfoGroup','管理本部门基础信息',1,1,'2016-05-08 21:56:24',1,'2016-05-09 00:21:28',0,4,NULL),(9,'系统考勤组','SysAttendanceGroup','管理所有部门绩效考勤',1,1,'2016-05-08 22:16:26',1,'2016-05-09 00:13:38',0,6,NULL),(10,'系统报表组','SysReportGroup','管理所有部门报表生成、导出',1,1,'2016-05-08 22:19:08',1,'2016-05-09 00:14:30',0,3,NULL),(11,'系统绩效组','SysPerformanceGroup','管理所有部门工作绩效数据',1,1,'2016-05-08 22:20:53',1,'2016-05-09 00:13:06',0,3,NULL);

/*Table structure for table `bas_group_role` */

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

/*Table structure for table `bas_icon` */

CREATE TABLE `bas_icon` (
  `BAS_ICON_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ICON_TYPE` varchar(255) DEFAULT NULL,
  `ICON_CLASS` varchar(255) DEFAULT NULL,
  `ICON_IMAGE` varchar(255) DEFAULT NULL,
  `CREATE_BY` int(11) NOT NULL,
  `CREATE_DATE` datetime NOT NULL,
  `UPDATE_BY` int(11) NOT NULL,
  `UPDATE_DATE` datetime NOT NULL,
  `MARK_FOR_DELETE` int(11) DEFAULT '0',
  `OPT_COUNTER` int(11) DEFAULT '0',
  `DELETE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`BAS_ICON_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `bas_icon` */

insert  into `bas_icon`(`BAS_ICON_ID`,`ICON_TYPE`,`ICON_CLASS`,`ICON_IMAGE`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (1,'RESOURCE_ICON','icon-star','',1,'2015-03-04 14:35:57',1,'2015-03-30 11:45:50',0,3,NULL),(2,'RESOURCE_ICON','icon-home','',1,'2015-03-30 11:44:33',1,'2015-03-30 11:45:55',0,1,NULL),(3,'RESOURCE_ICON','icon-user','',1,'2015-03-30 11:46:22',1,'2015-03-30 11:46:22',0,0,NULL),(4,'RESOURCE_ICON','icon-calendar','',1,'2015-03-30 11:46:38',1,'2015-03-30 11:46:38',0,0,NULL),(5,'RESOURCE_ICON','icon-bell','',1,'2015-03-30 11:46:49',1,'2015-03-30 11:46:49',0,0,NULL),(6,'RESOURCE_ICON','icon-settings','',1,'2015-03-30 11:47:45',1,'2015-03-30 11:47:45',0,0,NULL);

/*Table structure for table `bas_login_log` */

CREATE TABLE `bas_login_log` (
  `BAS_LOGIN_LOG_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `BAS_USER_ID` int(11) DEFAULT NULL COMMENT '用户ID',
  `LOGIN_IP` varchar(20) DEFAULT NULL COMMENT '登录用户IP',
  `LOGIN_MAC` varchar(20) DEFAULT NULL COMMENT '登录用户MAC',
  `BROWSER_NAME` varchar(100) DEFAULT NULL COMMENT '登录用户浏览器名称、版本信息等',
  `SESSION_ID` varchar(60) DEFAULT NULL COMMENT '会话ID',
  `LOGIN_RESULT` varchar(120) DEFAULT NULL COMMENT '登录结果',
  `LOGIN_TIME` datetime DEFAULT NULL COMMENT '登录时间',
  `LOGOUT_TIME` datetime DEFAULT NULL COMMENT '退出时间',
  `OS_INFO` varchar(120) DEFAULT NULL COMMENT '用户的操作系统',
  `IS_SUCCESS` tinyint(1) DEFAULT '1' COMMENT '是否登录成功',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '系统默认字段.删除日期',
  PRIMARY KEY (`BAS_LOGIN_LOG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户登录信息表';

/*Data for the table `bas_login_log` */

/*Table structure for table `bas_parameter` */

CREATE TABLE `bas_parameter` (
  `BAS_PARAMETER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统参数ID',
  `CATEGORY` varchar(30) NOT NULL COMMENT '系统参数类型',
  `NAME_EN` varchar(128) NOT NULL COMMENT '系统参数英文名称，最小为：6，最大为非作歹0100',
  `NAME_ZH` varchar(128) NOT NULL COMMENT '系统参数中文名称',
  `PARAMETER_VALUE` varchar(256) NOT NULL COMMENT '系统参数值',
  `EDITABLE` tinyint(1) DEFAULT '1' COMMENT '是否可编辑',
  `DESCRIPTION` varchar(512) DEFAULT NULL COMMENT '系统参数描述',
  `CREATE_BY` int(11) NOT NULL COMMENT '创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '更新人ID',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '是否标记删除 0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '记录操作次',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`BAS_PARAMETER_ID`),
  UNIQUE KEY `UK_BAS_PARAMETER_NAMEEN` (`NAME_EN`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=202 DEFAULT CHARSET=utf8 COMMENT=' 系统参数定义表';

/*Data for the table `bas_parameter` */

insert  into `bas_parameter`(`BAS_PARAMETER_ID`,`CATEGORY`,`NAME_EN`,`NAME_ZH`,`PARAMETER_VALUE`,`EDITABLE`,`DESCRIPTION`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (1,'Files','uploadFilePath12','上传文件路径11','c:/temp/',1,'文件上传路径',1,'2012-12-16 20:31:11',1,'2015-01-26 15:34:52',0,14,NULL),(4,'Users','uploadFilePath111','上传文件路径111','c:/temp/111',1,'文件上传路径1',1,'2012-12-16 21:28:26',1,'2015-02-18 10:47:05',0,8,NULL),(5,'Files','uploadFilePath','上传文件路径','c:/temp/temp/',1,'文件上传路径11',1,'2012-12-16 21:28:27',1,'2015-02-04 11:20:22',0,21,NULL),(9,'systems','systemName','系统名称','eCommerce',1,'',1,'2013-03-12 16:24:21',1,'2013-04-05 11:39:52',0,3,NULL),(78,'systems','PwdInitialization','用户初始化密码','111aaa',0,'用户初始化密码,用于管理系统用户的创建的密码',1,'2013-03-23 18:36:53',1,'2015-01-26 15:35:04',0,2,NULL),(99,'Files','name2','name2','name2',1,'name2',1,'2013-04-14 23:02:55',1,'2013-04-14 23:02:55',0,0,NULL),(128,'systems','name2222','name222','name',1,'文件上传路径1',1,'2013-05-21 20:35:31',1,'2015-01-26 15:35:00',0,1,NULL),(135,'Users','name223333','name22','name22',1,'22ddd',1,'2014-03-27 15:22:05',1,'2014-03-30 13:23:08',0,1,NULL),(138,'systems','name2333222','name222dd','nameeeddd',1,'',1,'2014-03-27 15:25:28',1,'2014-03-27 15:25:28',0,0,NULL),(139,'systems','name23332221','name222dd1','nameeeddd1',1,'',1,'2014-03-27 15:26:07',1,'2014-03-27 15:26:07',0,0,NULL),(140,'systems','wanglijun','wanglijun','wanglijun',1,'3333',1,'2014-03-27 15:26:30',1,'2014-03-27 15:26:30',0,0,NULL),(141,'systems','wanglijun1','wanglijun1','wanglijun1',1,'wanglijun1',1,'2014-03-27 15:27:53',1,'2014-03-27 15:27:53',0,0,NULL),(142,'systems','wanglijun3','wanglijun3','wanglijun3',1,'wanglijun3',1,'2014-03-27 15:32:15',1,'2014-03-27 15:32:15',0,0,NULL),(143,'systems','name','name','name',1,'name',1,'2014-03-27 15:32:45',1,'2014-03-27 15:32:45',0,0,NULL),(144,'systems','name2ddd','named','nameddd',1,'name',1,'2014-03-27 15:32:57',1,'2014-03-27 15:32:57',0,0,NULL),(145,'systems','name222222','name222222','name222222',1,'name222222',1,'2014-03-27 15:34:23',1,'2014-03-27 15:34:23',0,0,NULL),(154,'systems','wanglijun5','wanglijun5','wanglijun5',1,'name2222',1,'2014-03-27 15:35:58',1,'2014-03-27 15:35:58',0,0,NULL),(155,'systems','name3333','name3333','name3333',1,'name3333',1,'2014-03-27 15:37:00',1,'2014-03-27 15:37:00',0,0,NULL),(156,'systems','isVaild','isVaild','isVaild',1,'isVaild',1,'2014-03-27 15:47:34',1,'2014-03-27 15:47:34',0,0,NULL),(157,'systems','wanglijun8','wanglijun8','wanglijun8',1,'wangliju',1,'2014-03-27 15:47:53',1,'2014-03-28 17:45:15',0,1,NULL),(158,'Files','wanglijun10','wanglijun10','wanglijun10',1,'wanglijun1',1,'2014-03-27 15:48:34',1,'2015-02-02 10:07:25',0,2,NULL),(159,'systems','wanlgijun9','wanlgijun9','wanlgijun9',1,'wanlgijun9',1,'2014-03-27 15:49:27',1,'2014-03-27 21:31:25',0,4,NULL),(160,'systems','name5','name5','name5',1,'name5',1,'2014-03-27 15:50:07',1,'2014-03-27 21:31:06',0,2,NULL),(161,'systems','wanglijun9','wanglijun9','wanglijun9',1,'修改成功',1,'2014-03-27 15:52:06',1,'2014-03-27 21:31:33',0,2,NULL),(162,'systems','name200','name200','name200',1,'name200',1,'2014-04-02 15:52:34',1,'2014-04-02 15:52:34',0,0,NULL),(163,'sysInterface','userInterface','用户登录接口','http://www.site.com/user',1,'用户登录接口',1,'2014-06-01 21:49:10',1,'2014-06-01 21:50:12',0,3,NULL),(164,'sysInterface','policyApplyInterface','保单承保接口','http://www.site.com/policyapply',1,'保单承保接口',1,'2014-06-01 21:51:10',1,'2014-06-01 21:51:10',0,0,NULL),(165,'sysInterface','smsInterface','短信接口','192.168.1.60',1,'短信接口',1,'2014-06-01 21:51:57',1,'2014-06-01 21:51:57',0,0,NULL),(166,'sysInterface','emailInterface','邮件接口','192.168.1.79',1,'邮件接口',1,'2014-06-01 21:52:47',1,'2014-06-01 21:52:47',0,0,NULL),(167,'sysInterface','mpi.backTransUrl','后台交易请求地址','https://unionpaysecure.com/gateway/api/frontTransRequest.do,https://unionpaysecure.com/gateway/api/backTransRequest.do',1,'后台交易请求地址',1,'2014-06-01 21:54:39',1,'2014-06-01 21:58:55',0,1,NULL),(168,'sysInterface','mpi.frontTransUrl','前台交易请求地址','https://unionpaysecure.com/gateway/api/frontTransRequest.do',1,'前台交易请求地址',1,'2014-06-01 21:59:42',1,'2014-06-01 21:59:42',0,0,NULL),(169,'sysInterface','mpi.singleQueryUrl','单笔查询请求地址','https://unionpaysecure.com/gateway/api/singleQueryRequest.do',1,'单笔查询请求地址',1,'2014-06-01 22:00:11',1,'2014-06-01 22:00:11',0,0,NULL),(170,'sysInterface','mpi.batchTransUrl','批量交易请求地址','https://unionpaysecure.com/gateway/api/batchTransRequest.do',1,'批量交易请求地址',1,'2014-06-01 22:00:58',1,'2014-06-01 22:00:58',0,0,NULL),(171,'sysInterface','mpi.batchQueryUrl','批量查询请求地址','https://unionpaysecure.com/gateway/api/batchQueryRequest.do',1,'批量查询请求地址',1,'2014-06-01 22:02:33',1,'2014-06-01 22:03:44',0,2,NULL),(172,'sysInterface','mpi.fileTransUrl','文件传输交易地址','https://unionpaysecure.com/gateway/api/fileTransRequest.do',1,'文件传输交易地址',1,'2014-06-01 22:03:11',1,'2014-06-01 22:03:11',0,0,NULL),(173,'sysInterface','mpi.cbFrontTransUrl','跨行收单开通并支付交易地址','https://unionpaysecure.com/gateway/cb/frontTransRequest.do',1,'跨行收单开通并支付交易地址',1,'2014-06-01 22:04:20',1,'2014-06-01 22:04:20',0,0,NULL),(174,'sysInterface','mpi.cbBackTransUrl','跨行收单支付地址','https://unionpaysecure.com/gateway/cb/backTransRequest.do',1,'跨行收单支付地址',1,'2014-06-01 22:04:54',1,'2014-06-01 22:04:54',0,0,NULL),(175,'sysInterface','mpi.signCert.path','签名证书路径','/weblog10/bea/deploy_files/ICBC/tel/700000000000001.pfx',1,'签名证书路径',1,'2014-06-01 22:05:26',1,'2014-06-01 22:05:26',0,0,NULL),(176,'sysInterface','mpi.signCert.pwd','数字证书密码','000000',1,'数字证书密码',1,'2014-06-01 22:06:10',1,'2014-06-01 22:06:10',0,0,NULL),(177,'sysInterface','mpi.signCert.type','数字证书类型','PKCS12',1,'数字证书类型\r\n',1,'2014-06-01 22:06:44',1,'2014-06-01 22:06:44',0,0,NULL),(178,'sysInterface','mpi.encryptCert.path','密码加密证书路径','/weblog10/bea/deploy_files/ICBC/tel/PM_enc.cer',1,'密码加密证书路径，敏感信息加密证书路径，请根据实际情况进行修改',1,'2014-06-01 22:07:26',1,'2014-06-01 22:07:26',0,0,NULL),(179,'sysInterface','mpi.validateCert.dir','验证签名证书目录','/weblog10/bea/deploy_files/ICBC/tel',1,'验证签名证书目录，验证银联系统返回报文的证书目录',1,'2014-06-01 22:08:05',1,'2014-06-01 22:08:19',0,1,NULL),(180,'sysInterface','mpi.merchantNo','银联在线商户号','102310063000015',1,'银联在线商户号',1,'2014-06-01 22:08:48',1,'2014-06-01 22:08:48',0,0,NULL),(181,'Users','dddd','dddd','dddd',1,'dddd2',1,'2015-01-24 22:55:35',1,'2015-04-01 16:03:41',0,1,NULL),(187,'Users','ddddddddddd','dddddd','dddddddd',1,'ddddddd',1,'2015-01-24 22:59:20',1,'2015-01-24 22:59:20',0,0,NULL),(196,'Users','ddddd','dddd','dddd',1,'dddd',1,'2015-01-24 23:24:31',1,'2015-01-24 23:24:31',0,0,NULL),(197,'Users','dddddd','ddddd','ddddd',1,'ddddd1',1,'2015-01-25 12:13:25',1,'2015-01-26 15:55:17',0,1,NULL),(198,'Users','name4','name','value',1,'ddd',1,'2015-01-25 12:14:37',1,'2015-01-25 12:14:37',0,0,NULL),(199,'Users','dddd4444','dddd','dddd2',0,'dddd',1,'2015-01-25 12:15:30',1,'2015-01-26 15:41:34',0,1,NULL),(200,'Users','dddd4444e','dddd','dddd',1,'dddd',1,'2015-01-25 12:16:16',1,'2015-01-26 15:46:00',0,1,NULL),(201,'Files','name1','name1','name1',1,'name1',1,'2015-04-01 16:03:30',1,'2015-04-01 16:03:30',0,0,NULL);

/*Table structure for table `bas_position` */

CREATE TABLE `bas_position` (
  `BAS_POSITION_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `BAS_PARENT_POSITION_ID` int(11) DEFAULT NULL COMMENT '父级岗位ID',
  `BAS_DEPARTMENT_ID` int(11) NOT NULL COMMENT '部门ID',
  `NAME_EN` varchar(128) NOT NULL COMMENT '位岗文英名称',
  `NAME_ZH` varchar(128) NOT NULL COMMENT '位岗中文名称',
  `DESCRIPTION` varchar(512) DEFAULT NULL COMMENT '位岗描述',
  `CREATE_BY` int(11) NOT NULL COMMENT '创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '更新人ID',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '是否标记删除 0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '记录操作次',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`BAS_POSITION_ID`),
  UNIQUE KEY `UK_BAS_PARAMETER_NAMEEN` (`NAME_ZH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT=' 系统参数定义表';

/*Data for the table `bas_position` */

/*Table structure for table `bas_reminder_body` */

CREATE TABLE `bas_reminder_body` (
  `BAS_REMINDER_BODY_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `TITLE` varchar(512) DEFAULT NULL COMMENT '标题的消息',
  `CONTENT` varchar(1024) DEFAULT NULL COMMENT '内容的消息',
  `RELATED_URL` varchar(256) DEFAULT NULL COMMENT '相关页面链接，相对地址',
  `IMPORTANCE_LEVEL` int(1) DEFAULT NULL COMMENT '重要级别，数字越大越重要',
  `TITLE_PARAMS` varchar(1024) DEFAULT NULL COMMENT '标题的消息参数，分隔符分割',
  `CONTENT_PARAMS` varchar(1024) DEFAULT NULL COMMENT '内容的消息参数，分隔符分割',
  `REMINDER_TYPE` varchar(60) DEFAULT NULL COMMENT '0 系统消息 1 用户消息',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '系统默认字段.删除日期',
  PRIMARY KEY (`BAS_REMINDER_BODY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统消息表';

/*Data for the table `bas_reminder_body` */

/*Table structure for table `bas_reminder_reader` */

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

/*Data for the table `bas_reminder_reader` */

/*Table structure for table `bas_resource` */

CREATE TABLE `bas_resource` (
  `BAS_RESOURCE_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源ID',
  `PARENT_BAS_RESOURCE_ID` int(11) DEFAULT NULL COMMENT '父资源ID，可空',
  `TYPE_` varchar(256) DEFAULT NULL COMMENT '资源类型，应用自定义，参见CODELIS',
  `PATH` varchar(1024) DEFAULT NULL COMMENT '资源路径(URL,CLASS.METHOD)',
  `NAME_ZH` varchar(256) DEFAULT NULL COMMENT '资源中文名称',
  `NAME_EN` varchar(256) DEFAULT NULL COMMENT '资源英文名称',
  `DESCRIPTION` varchar(256) DEFAULT NULL COMMENT '资源描述',
  `SEQ_NUM` int(11) DEFAULT NULL COMMENT '资源同级排序',
  `IS_LEAF` tinyint(1) DEFAULT '1' COMMENT '是否叶节点，其下没有子资源 默认为：true\r\n            ',
  `EDITABLE` tinyint(1) DEFAULT '1' COMMENT '记录是否可编辑  默认为true\r\n            ',
  `TARGET` varchar(16) DEFAULT NULL COMMENT '指HTML链接的target属性',
  `ICON` varchar(30) DEFAULT NULL COMMENT '资源图标',
  `PERMISSION` varchar(128) DEFAULT NULL COMMENT '权限名称',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '系统默认字段.删除日期',
  PRIMARY KEY (`BAS_RESOURCE_ID`),
  KEY `FK_BAS_PARENT_BAS_RESOURCE_ID` (`PARENT_BAS_RESOURCE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8 COMMENT='系统资源表';

/*Data for the table `bas_resource` */

insert  into `bas_resource`(`BAS_RESOURCE_ID`,`PARENT_BAS_RESOURCE_ID`,`TYPE_`,`PATH`,`NAME_ZH`,`NAME_EN`,`DESCRIPTION`,`SEQ_NUM`,`IS_LEAF`,`EDITABLE`,`TARGET`,`ICON`,`PERMISSION`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (1,NULL,'application','','应用资源','Application','应用资源',0,0,1,'_self','icon-star','',1,'2013-03-25 15:56:44',1,'2015-02-26 17:52:14',0,7,NULL),(2,1,'module','','系统管理','SystemConfig','系统设置',2,0,1,'_self','icon-settings','',1,'2013-03-25 17:16:05',1,'2013-03-25 17:16:05',0,1,NULL),(10,2,'module_menu_category','','编码管理','CodeManage','编码管理',4,0,1,'_self','icon-star','',1,'2013-03-25 19:28:08',1,'2015-03-05 13:37:28',0,5,NULL),(11,2,'module_menu_category_item','/system/resource/index.htm','资源管理','ResourceManage','资源管理',3,1,1,'_self','icon-star','system.resource:index',1,'2013-03-25 19:30:56',1,'2013-03-26 22:51:30',0,1,NULL),(12,2,'module_menu_category_item','/system/parameter/index.htm','系统参数','ParameterManage','系统参数',5,1,1,'_self','icon-star','system.parameter:index',1,'2013-03-25 19:36:46',1,'2013-03-26 22:53:21',0,2,NULL),(13,1,'module_menu_category_item','/index.htm','首页','HomePage','首页',0,1,1,'_self','icon-home','system.homepage:index',1,'2013-03-25 19:43:04',1,'2015-03-05 16:52:04',0,3,NULL),(14,2,'module_menu_category_item','/system/role/index.htm','角色管理','RoleManage','角色管理',2,1,1,'_self','icon-star','system.role:index',1,'2013-03-25 19:59:34',1,'2013-03-26 22:46:59',0,2,NULL),(15,2,'module_menu_category_item','/system/group/index.htm','用户组管理','GroupManage','用户组管理',1,1,1,'_self','icon-star','system.group:index',1,'2013-03-25 20:10:13',1,'2013-03-26 22:47:25',0,2,NULL),(16,10,'module_menu_category_item','/system/codetype/index.htm','通用编码类型','CodeType','通用编码类型',0,1,1,'_self','icon-star','system.codetype:index',1,'2013-03-26 22:49:20',1,'2015-03-20 12:55:14',0,1,NULL),(17,10,'module_menu_category_item','/system/codelist/index.htm','编码列表','CodeList','编码列表',1,1,1,'_self','icon-star','system.codelist:index',1,'2013-03-26 22:51:12',1,'2015-03-04 20:59:00',0,4,NULL),(18,2,'module_menu_category_item','/system/user/index.htm','用户管理','UserManage','用户管理',0,1,1,'_self','icon-star','system.user:index',1,'2013-03-27 14:13:53',1,'2013-03-27 14:13:53',0,0,NULL),(19,72,'module_menu_category_item','/system/department/index.htm','部门管理','DepartmentManage','部门维护',0,0,1,'_self','icon-star','system.department:index',1,'2013-03-27 14:17:33',1,'2016-04-14 01:10:45',0,2,NULL),(20,2,'module_menu_category','','DataGrid管理','DataGridManage','DataGrid管理',6,0,1,'_self','icon-star','',1,'2013-03-27 20:59:31',1,'2013-03-30 10:59:06',0,11,NULL),(21,20,'module_menu_category_item','/system/datagrid/index.htm','DataGrid','DataGrid','DataGrid',0,1,1,'_self','icon-star','system.datagrid:index',1,'2013-03-27 21:01:06',1,'2015-03-30 16:52:13',0,5,NULL),(24,20,'module_menu_category_item','/system/datacolumn/index.htm','DataColumn','DataColumn','DataColumn',1,1,1,'_self','icon-star','system.datacolumn:index',1,'2013-03-27 21:47:09',1,'2015-03-30 16:52:16',0,3,NULL),(26,2,'module_menu_category_item','/system/application/index.htm','系统信息','SystemInfo','系统信息',7,1,1,'_self','icon-star','system.systeminfo:index',1,'2013-04-14 20:53:24',1,'2013-04-14 20:55:42',0,1,NULL),(36,2,'module_menu_category','','系统监控','SystemMonitor','系统监控',8,0,1,'_self','icon-star','',1,'2014-04-08 15:03:34',1,'2015-02-07 13:34:57',0,1,NULL),(37,36,'module_menu_category_item','/sessions/index.htm','用户会话监控','用户会话监控','用户会话监控',0,1,1,'_self','icon-star','system.sessions:index',1,'2014-04-08 15:06:21',1,'2015-02-27 10:19:34',0,1,NULL),(38,36,'module_menu_category_item','/monitor/jvm/memory.htm','JVM内存监控','JVM内存监控','JVM内存监控',1,1,1,'_self','icon-star','system.jvmmemorymonitor:index',1,'2014-04-08 15:08:03',1,'2015-03-19 13:33:40',0,6,NULL),(39,36,'module_menu_category_item','/monitor/jvm/index.htm','JVM监控','JVM监控','JVM监控',2,1,1,'_self','icon-star','system.jvmmonitor:index',1,'2014-04-08 15:09:17',1,'2015-03-19 13:34:09',0,3,NULL),(43,2,'module_menu_category_item','/system/applicationproperty/index.htm','项目属性配置','ProjectProConf','项目属性配置',9,1,1,'_self','icon-star','system.applicationproperty:index',1,'2015-02-17 14:56:18',1,'2015-02-17 14:56:18',0,0,NULL),(44,NULL,'module','','账户管理','AccountManage','账户管理',1,0,1,'_self','icon-user','',1,'2015-02-25 10:53:33',1,'2015-03-05 11:15:21',0,6,NULL),(45,44,'module_menu_category_item','/system/account/index.htm','个人资料','个人资料','个人资料',0,1,1,'_self','icon-user','system.account:index',1,'2015-02-25 10:57:12',1,'2015-02-25 13:51:59',0,5,NULL),(47,44,'module_menu_category_item','/system/account/notifications.htm','通知消息','通知消息','通知消息',2,1,1,'_self','icon-bell','system.account:notifications',1,'2015-02-25 14:38:22',1,'2015-02-25 14:38:22',0,0,NULL),(48,44,'module_menu_category_item','/system/account/calendar.htm','待办事项','待办事项','待办事项',1,1,1,'_self','icon-calendar','system.account:calendar',1,'2015-02-25 14:46:23',1,'2015-02-25 14:46:23',0,0,NULL),(49,36,'module_menu_category_item','/druid/index.html','数据库连接池','数据库连接池','数据库连接池',5,1,1,'_blank ','icon-star','system.druid:index',1,'2015-02-28 09:59:01',1,'2015-03-01 23:31:03',0,5,NULL),(50,36,'module_menu_category_item','/monitor/hibernate/index.htm','Hibernate监控','Hibernate监控','Hibernate监控',4,1,1,'_self','icon-star','system.hibernatemonitor:index',1,'2015-03-01 02:15:07',1,'2015-03-19 13:34:48',0,2,NULL),(51,36,'module_menu_category_item','/monitor/cache/index.htm','缓存监控','缓存监控','缓存监控',6,1,1,'_self','icon-star','system.cachemonitor:index',1,'2015-03-01 23:28:04',1,'2015-03-19 13:35:50',0,3,NULL),(52,36,'module_menu_category_item','/monitor/jvm/thread.htm','JVM线程监控','JVM线程监控','JVM线程监控',3,1,1,'_self','icon-star','system.jvmthreadmonitor:index',1,'2015-03-01 23:29:13',1,'2015-03-19 13:35:09',0,5,NULL),(53,16,'module_menu_category_item_button','/system/codetype/add.json','添加','ADD',NULL,1,1,1,'_self',NULL,'system.codetype:add',1,'2015-03-04 21:17:01',1,'2015-03-04 21:17:01',0,0,NULL),(54,16,'module_menu_category_item_button','/system/codetype/edit.json','编辑','EDIT',NULL,2,1,1,'_selft',NULL,'system.codetype:edit',1,'2015-03-04 21:19:56',1,'2015-03-04 21:19:56',0,0,NULL),(55,16,'module_menu_category_item_button','/system/codetype/list.json','查询','LIST',NULL,0,1,1,'_self',NULL,'system.codetype:list',1,'2015-03-04 21:21:24',1,'2015-03-04 21:21:24',0,0,NULL),(56,16,'module_menu_category_item_button','/system/codetype/export.json','Excel导出','EXCEL',NULL,3,1,1,'_self',NULL,'system.codetype:export',1,'2015-03-05 10:37:11',1,'2015-03-05 10:37:11',0,0,NULL),(57,16,'module_menu_category_item_button','/system/codetype/delete.json','删除','DELETE',NULL,4,1,1,'_self',NULL,'system.codetype:delete',1,'2015-03-05 10:38:22',1,'2015-03-09 16:05:34',0,2,NULL),(59,2,'module_menu_category_item','/system/icon/index.htm','图标管理','IconManage','图标管理',10,1,1,'_self','icon-star','system.icon:index',1,'2015-03-05 16:27:06',1,'2015-03-30 16:55:37',0,11,NULL),(60,17,'module_menu_category_item_button','/system/codelist/add.json','添加','ADD',NULL,1,1,1,'_self',NULL,'system.codelist:add',1,'2015-03-13 11:08:16',1,'2015-03-13 11:08:16',0,0,NULL),(61,17,'module_menu_category_item_button','/system/codelist/list.json','查询','LIST',NULL,0,1,1,'_self',NULL,'system.codelist:list',1,'2015-03-13 11:10:08',1,'2015-03-13 11:10:08',0,0,NULL),(62,17,'module_menu_category_item_button','/system/codelist/edit.json','编辑','EDIT',NULL,2,1,1,'_self',NULL,'system.codelist:edit',1,'2015-03-13 11:15:18',1,'2015-03-13 11:15:18',0,0,NULL),(63,2,'module_menu_category_item','/system/tasks/index.htm','计划任务','Tasks','计划任务',11,1,1,'_self','icon-star','system.tasks:index',1,'2015-03-30 18:06:23',1,'2015-03-30 18:06:23',0,0,NULL),(64,1,'module','','基础信息','BaseInfo','基础信息',3,0,1,'_self','icon-star','',1,'2016-03-27 10:59:43',1,'2016-03-27 11:20:02',0,1,NULL),(65,64,'module_menu_category_item','/baseinfo/customperformanceproject/index.htm','自定义绩效项目','CustomPerformanceProject','自定义绩效项目',1,1,1,'_self','icon-star','system.customperformanceproject:index',1,'2016-03-27 11:17:41',1,'2016-03-27 11:17:41',0,0,NULL),(66,65,'module_menu_category_item_button','/baseinfo/customperformanceproject/list.json','查询','LIST','查询自定义绩效项目',0,0,1,'_self','','system.customperformanceproject:list',1,'2016-04-05 23:20:50',1,'2016-04-14 20:22:31',0,1,NULL),(67,65,'module_menu_category_item_button','/baseinfo/customperformanceproject/add.json','添加','ADD','添加自定义绩效项目',1,0,1,'_self','','system.customperformanceproject:add',1,'2016-04-05 23:29:51',1,'2016-04-14 20:22:48',0,1,NULL),(68,65,'module_menu_category_item_button','/baseinfo/customperformanceproject/edit.json','编辑','EDIT',NULL,2,0,1,'_self',NULL,'system.customperformanceproject:edit',1,'2016-04-05 23:30:16',1,'2016-04-05 23:30:24',0,0,NULL),(69,65,'module_menu_category_item_button','/baseinfo/customperformanceproject/export.json','Excel导出','EXCEL',NULL,3,0,1,'_self',NULL,'system.customperformanceproject:export',1,'2016-04-05 23:30:34',1,'2016-04-05 23:30:38',0,0,NULL),(70,65,'module_menu_category_item_button','/baseinfo/customperformanceproject/delete.json','删除','DELETE',NULL,4,0,1,'_self',NULL,'system.customperformanceproject:delete',1,'2016-04-05 23:30:42',1,'2016-04-05 23:30:47',0,0,NULL),(71,64,'module_menu_category_item','/demo/baseinfo/projectpoints/index.htm','科室项目点数','ProjectPoints','科室项目点数维护',2,1,1,'_self','icon-star','system.projectpoints:index',1,'2016-04-13 23:11:07',1,'2016-04-13 23:26:18',0,0,NULL),(72,64,'module_menu_category','','组织机构维护','Party','组织机构维护',0,0,1,'_self','icon-star','',1,'2016-04-14 00:30:13',1,'2016-04-27 12:59:22',0,2,NULL),(73,72,'module_menu_category_item','/system/user/index2.htm','用户管理','PersonManage','非管理员用户管理',1,0,1,'_self','icon-star','system.user:index2',1,'2016-04-14 01:24:25',1,'2016-04-14 01:24:25',0,0,NULL),(74,64,'module_menu_category_item','/demo/baseinfo/attendancecoefficient/index.htm','出勤系数设置','AttendanceCoefficient','出勤系数设置',6,0,1,'_self','icon-star','system.attendancecoefficient:index',1,'2016-04-14 01:27:47',1,'2016-04-14 01:39:11',0,1,NULL),(75,1,'module','','工作绩效','WorkPerformance','工作绩效',5,0,1,'_self','icon-star','',1,'2016-04-14 01:29:57',1,'2016-04-14 01:46:27',0,2,NULL),(76,75,'module_menu_category_item','/demo/workperformance/workperformancedata/index.htm','工作绩效数据管理','WorkPerformanceData','工作绩效数据管理',0,0,1,'_self','icon-star','system.workperformancedata:index',1,'2016-04-14 01:31:24',1,'2016-04-14 01:46:07',0,1,NULL),(77,1,'module','','查询','Query','查询',8,0,1,'_self','icon-star','',1,'2016-04-14 01:32:39',1,'2016-04-14 01:47:39',0,1,NULL),(78,77,'module_menu_category_item','/demo/query/individualperformance/index.htm','个人绩效查询','IndividualPerformanceQuery','个人绩效查询',1,0,1,'_self','icon-star','system.individualperformance:index',1,'2016-04-14 01:33:55',1,'2016-04-14 01:48:42',0,1,NULL),(79,18,'module_menu_category_item_button','/system/user/addgroups.json','关联用户组','RelateGroups','为用户关联用户组',0,0,1,'_self','','system.user:relategroups',1,'2016-04-14 20:21:03',1,'2016-04-26 02:08:11',0,4,NULL),(80,18,'module_menu_category_item_button','/system/user/addroles.json','关联角色','RelateRoles','为用户关联角色',1,0,1,'_self','','system.user:relateroles',1,'2016-04-14 20:33:37',1,'2016-04-26 02:08:15',0,2,NULL),(81,73,'module_menu_category_item_button','/system/user/add.json','添加','ADD','添加用户',1,0,1,'_self','','system.user:add',1,'2016-04-25 21:43:39',1,'2016-04-25 21:43:39',0,0,NULL),(82,73,'module_menu_category_item_button','/system/user/list.json','查询','LIST','查询用户',0,0,1,'_self','','system.user:list',1,'2016-04-25 21:56:25',1,'2016-04-26 02:14:37',0,1,NULL),(83,73,'module_menu_category_item_button','/system/user/edit.json','编辑','EDIT','编辑用户',2,0,1,'_self','','system.user:edit',1,'2016-04-25 22:38:47',1,'2016-04-25 22:38:47',0,0,NULL),(84,73,'module_menu_category_item_button','/system/user/export.json','Excel导出','EXCEL','导出用户信息表格',3,0,1,'_self','','system.user:export',1,'2016-04-25 22:42:23',1,'2016-04-25 22:42:23',0,0,NULL),(85,73,'module_menu_category_item_button','/system/user/delete.json','删除','DELETE','删除用户',4,0,1,'_self','','system.user:delete',1,'2016-04-25 22:43:19',1,'2016-04-25 22:43:19',0,0,NULL),(86,18,'module_menu_category_item_button','/system/user/resetpwd.json','重置密码','ResetPassword','重置用户密码',4,0,1,'_self','','system.user:resetpwd',1,'2016-04-25 22:46:39',1,'2016-04-25 22:46:39',0,0,NULL),(87,18,'module_menu_category_item_button','/system/user/lock.json','锁定用户','LockUser','锁定用户',3,0,1,'_self','','system.user:lock',1,'2016-04-25 22:49:13',1,'2016-04-25 22:49:13',0,0,NULL),(88,18,'module_menu_category_item_button','/system/user/unlock.json','解锁用户','UnlockUser','解锁用户',2,0,1,'_self','','system.user:unlock',1,'2016-04-25 22:50:22',1,'2016-04-25 22:50:22',0,0,NULL),(89,15,'module_menu_category_item_button','/system/group/add.json','添加','ADD','添加用户组',1,0,1,'_self','','system.group:add',1,'2016-04-25 23:37:34',1,'2016-04-25 23:37:34',0,0,NULL),(90,15,'module_menu_category_item_button','/system/group/edit.json','编辑','EDIT','编辑用户组',2,0,1,'_self','','system.group:edit',1,'2016-04-25 23:39:44',1,'2016-04-25 23:39:44',0,0,NULL),(91,15,'module_menu_category_item_button','/system/group/addusertogroup.json','关联用户','RelateUsers','为用户组关联用户',5,0,1,'_self','','system.group:relateusers',1,'2016-04-25 23:51:38',1,'2016-04-26 02:08:05',0,1,NULL),(92,15,'module_menu_category_item_button','/system/group/addroletogroup.json','关联角色','RelateRoles','为用户组关联角色',6,0,1,'_self','','system.group:relateroles',1,'2016-04-26 02:07:57',1,'2016-04-26 02:12:32',0,1,NULL),(93,15,'module_menu_category_item_button','/system/group/delete.json','删除','DELETE','删除用户组',4,0,1,'_self','','system.group:delete',1,'2016-04-26 02:11:50',1,'2016-04-26 02:11:50',0,0,NULL),(94,15,'module_menu_category_item_button','/system/group/list.json','查询','LIST','查询用户组',0,0,1,'_self','','system.group:list',1,'2016-04-26 02:14:15',1,'2016-04-26 02:14:15',0,0,NULL),(95,15,'module_menu_category_item_button','/system/group/export.json','Excel导出','EXCEL','导出用户组信息',3,0,1,'_self','','system.group:export',1,'2016-04-26 02:15:57',1,'2016-04-26 02:15:57',0,0,NULL),(96,14,'module_menu_category_item_button','/system/role/add.json','添加','ADD','添加角色',1,0,1,'_self','','system.role:add',1,'2016-04-26 13:16:03',1,'2016-04-26 13:16:03',0,0,NULL),(97,14,'module_menu_category_item_button','/system/role/addusertorole.json','关联用户','RelateUsers','为角色关联用户',5,0,1,'_self','','system.role:relateusers',1,'2016-04-26 13:33:14',1,'2016-04-26 13:51:45',0,1,NULL),(98,14,'module_menu_category_item_button','/system/role/addgrouptorole.json','关联用户组','RelateGroups','为角色关联用户组',6,0,1,'_self','','system.role:relategroups',1,'2016-04-26 13:35:08',1,'2016-04-26 13:52:12',0,1,NULL),(99,14,'module_menu_category_item_button','/system/role/addresources.json','关联资源','RelateResources','为角色关联资源',7,0,1,'_self','','system.role:relateresource',1,'2016-04-26 13:37:27',1,'2016-04-26 14:36:53',0,2,NULL),(100,14,'module_menu_category_item_button','/system/role/delete.json','删除','DELETE','删除角色',4,0,1,'_self','','system.role:delete',1,'2016-04-26 13:38:37',1,'2016-04-26 13:38:37',0,0,NULL),(101,14,'module_menu_category_item_button','/system/role/edit.json','编辑','EDIT','编辑角色',2,0,1,'_self','','system.role:edit',1,'2016-04-26 13:39:36',1,'2016-04-26 13:39:36',0,0,NULL),(102,14,'module_menu_category_item_button','/system/role/list.json','查询','LIST','查询角色信息',0,0,1,'_self','','system.role:list',1,'2016-04-26 13:40:50',1,'2016-04-26 13:40:50',0,0,NULL),(103,14,'module_menu_category_item_button','/system/role/export.json','Excel导出','EXCEL','导出角色信息表',3,0,1,'_self','','system.role:export',1,'2016-04-26 13:42:28',1,'2016-04-26 13:42:28',0,0,NULL),(104,11,'module_menu_category_item_button','/system/resource/list.json','查询','LIST','查询资源信息',0,0,1,'_self','','system.resource:list',1,'2016-04-26 14:01:41',1,'2016-04-26 14:01:41',0,0,NULL),(105,11,'module_menu_category_item_button','/system/resource/add.json','添加','ADD','添加资源',1,0,1,'_self','','system.resource:add',1,'2016-04-26 14:45:40',1,'2016-04-26 14:45:40',0,0,NULL),(106,11,'module_menu_category_item_button','/system/resource/edit.json','编辑','EDIT','编辑资源',2,0,1,'_self','','system.resource:edit',1,'2016-04-26 14:57:30',1,'2016-04-26 14:57:30',0,0,NULL),(107,11,'module_menu_category_item_button','/system/resource/delete.json','删除','DELETE','删除资源',4,0,1,'_self','','system.resource:delete',1,'2016-04-26 14:59:26',1,'2016-04-26 14:59:26',0,0,NULL),(108,11,'module_menu_category_item_button','/system/resource/export.json','Excel导出','EXCEL','导出资源信息表',3,0,1,'_self','','system.resource:export',1,'2016-04-26 15:01:15',1,'2016-04-26 15:01:15',0,0,NULL),(109,17,'module_menu_category_item_button','/system/codelist/export.json','Excel导出','EXCEL','导出编码列表信息表',3,0,1,'_self','','system.codelist:export',1,'2016-04-26 20:02:40',1,'2016-04-26 20:02:40',0,0,NULL),(110,17,'module_menu_category_item_button','/system/codelist/delete.json','删除','DELETE','删除编码',4,0,1,'_self','','system.codelist:delete',1,'2016-04-26 20:29:19',1,'2016-04-26 20:29:19',0,0,NULL),(111,19,'module_menu_category_item_button','/system/department/list.json','查询','LIST','查询部门信息',0,0,1,'_self','','system.department:list',1,'2016-04-26 21:30:38',1,'2016-04-26 21:30:38',0,0,NULL),(112,19,'module_menu_category_item_button','/system/department/add.json','添加','ADD','添加部门',1,0,1,'_self','','system.department:add',1,'2016-04-26 21:31:29',1,'2016-04-26 21:31:29',0,0,NULL),(113,19,'module_menu_category_item_button','/system/department/edit.json','编辑','EDIT','编辑部门',2,0,1,'_self','','system.department:edit',1,'2016-04-26 21:32:11',1,'2016-04-26 21:32:11',0,0,NULL),(114,19,'module_menu_category_item_button','/system/department/export.json','Excel导出','EXCEL','导出部门信息表',3,0,1,'_self','','system.department:export',1,'2016-04-26 21:33:10',1,'2016-04-26 21:33:10',0,0,NULL),(115,19,'module_menu_category_item_button','/system/department/delete.json','删除','DELETE','删除部门',4,0,1,'_self','','system.department:delete',1,'2016-04-26 21:33:51',1,'2016-04-26 21:33:51',0,0,NULL),(116,76,'module_menu_category_item_button','/demo/workperformance/workperformancedata/list.json','查询','LIST','查询工作绩效数据',0,0,1,'_self','','system.workperformancedata:list',1,'2016-04-26 23:31:19',1,'2016-04-28 20:03:49',0,1,NULL),(117,1,'module','','考勤管理','AttendanceManage','考勤管理',6,0,1,'_self','icon-star','',1,'2016-04-27 12:57:32',1,'2016-04-27 12:57:32',0,0,NULL),(118,1,'module','','补发补扣','Reissue','考勤纠错及补发补扣',7,0,1,'_self','icon-star','',1,'2016-04-28 18:27:42',1,'2016-04-28 18:27:42',0,0,NULL),(119,1,'module','','报表','ReportForm','报表',9,0,1,'_self','icon-star','',1,'2016-04-28 18:29:58',1,'2016-05-08 21:11:06',0,5,NULL),(120,64,'module_menu_category_item','/demo/baseinfo/plansetting/index.htm','方案设置','PlanSetting','设置各核算单元计算公式中的各种参数',3,0,1,'_self','icon-star','system.plansetting:index',1,'2016-04-28 18:38:39',1,'2016-04-28 18:40:25',0,1,NULL),(121,76,'module_menu_category_item_button','/demo/workperformance/workperformancedata/add.json','添加','ADD','添加工作绩效数据',1,0,1,'_self','','system.workperformancedata:add',1,'2016-04-28 20:05:02',1,'2016-04-28 20:05:24',0,1,NULL),(122,76,'module_menu_category_item_button','/demo/workperformance/workperformancedata/edit.json','编辑','EDIT','编辑工作绩效数据',2,0,1,'_self','','system.workperformancedata:edit',1,'2016-04-28 20:07:05',1,'2016-04-28 20:07:05',0,0,NULL),(123,76,'module_menu_category_item_button','/demo/workperformance/workperformancedata/export.json','Excel导出','EXCEL','导出工作绩效数据',3,0,1,'_self','','system.workperformancedata:export',1,'2016-04-28 20:08:15',1,'2016-04-28 20:08:15',0,0,NULL),(124,76,'module_menu_category_item_button','/demo/workperformance/workperformancedata/delete.json','删除','DELETE','删除工作绩效数据',4,0,1,'_self','','system.workperformancedata:delete',1,'2016-04-28 20:09:26',1,'2016-04-28 20:09:26',0,0,NULL),(125,75,'module_menu_category_item','/demo/workperformance/departmentoperationdata/index.htm','科室运营数据','DepartmentOperationData','科室运营数据管理',1,0,1,'_self','icon-star','system.departmentoperationdata:index',1,'2016-04-28 20:18:53',1,'2016-04-28 20:18:53',0,0,NULL),(126,125,'module_menu_category_item_button','/demo/workperformance/departmentoperationdata/list.json','查询','LIST','查询科室运营数据',0,0,1,'_self','','system.departmentoperationdata:list',1,'2016-04-28 20:23:45',1,'2016-04-28 20:23:45',0,0,NULL),(127,125,'module_menu_category_item_button','/demo/workperformance/departmentoperationdata/add.json','添加','ADD','添加科室运营数据',1,0,1,'_self','','system.departmentoperationdata:add',1,'2016-04-28 20:24:38',1,'2016-04-28 20:24:38',0,0,NULL),(128,125,'module_menu_category_item_button','/demo/workperformance/departmentoperationdata/edit.json','编辑','EDIT','编辑科室运营数据',2,0,1,'_self','','system.departmentoperationdata:edit',1,'2016-04-28 20:25:29',1,'2016-04-28 20:25:29',0,0,NULL),(129,125,'module_menu_category_item_button','/demo/workperformance/departmentoperationdata/export.json','Excel导出','EXCEL','导出科室运营数据',3,0,1,'_self','','system.departmentoperationdata:export',1,'2016-04-28 20:26:23',1,'2016-04-28 20:26:23',0,0,NULL),(130,125,'module_menu_category_item_button','/demo/workperformance/departmentoperationdata/delete.json','删除','DELETE','删除科室运营数据',4,0,1,'_self','','system.departmentoperationdata:delete',1,'2016-04-28 20:27:15',1,'2016-04-28 20:27:15',0,0,NULL),(131,117,'module_menu_category_item','/demo/attendancemanage/performanceattendance/index.htm','绩效考勤','PerformanceAttendance','绩效考勤',0,0,1,'_self','icon-star','system.performanceattendance:index',1,'2016-04-28 20:36:23',1,'2016-04-28 20:37:26',0,1,NULL),(132,131,'module_menu_category_item_button','/demo/attendancemanage/performanceattendance/list.json','查询','LIST','查询',0,0,1,'_self','','system.performanceattendance:list',1,'2016-04-28 20:39:29',1,'2016-04-28 20:39:29',0,0,NULL),(133,131,'module_menu_category_item_button','/demo/attendancemanage/performanceattendance/add.json','添加','ADD','添加',1,0,1,'_self','','system.performanceattendance:add',1,'2016-04-28 20:40:25',1,'2016-04-28 20:40:25',0,0,NULL),(134,131,'module_menu_category_item_button','/demo/attendancemanage/performanceattendance/edit.json','编辑','EDIT','编辑',2,0,1,'_self','','system.performanceattendance:edit',1,'2016-04-28 20:42:20',1,'2016-04-28 20:42:55',0,1,NULL),(135,131,'module_menu_category_item_button','/demo/attendancemanage/performanceattendance/export.json','Excel导出','EXCEL','导出',3,0,1,'_self','','system.performanceattendance:export',1,'2016-04-28 21:04:13',1,'2016-04-28 21:04:13',0,0,NULL),(136,131,'module_menu_category_item_button','/demo/attendancemanage/performanceattendance/delete.json','删除','DELETE','删除',4,0,1,'_self','','system.performanceattendance:delete',1,'2016-04-28 21:05:25',1,'2016-04-28 21:05:25',0,0,NULL),(137,118,'module_menu_category_item','/demo/reissue/attendancecorrection/index.htm','考勤纠错','AttendanceCorrection','考勤纠错',0,0,1,'_self','icon-star','system.attendancecorrection:index',1,'2016-04-28 21:18:45',1,'2016-04-28 21:21:41',0,2,NULL),(138,119,'module_menu_category_item','/demo/reportform/individualoutpatientsubsidies/index.htm','个人门诊补贴','IndividualOutpatientSubsidies','个人门诊补贴',3,0,1,'_self','icon-star','system.individualoutpatientsubsidies:index',1,'2016-04-28 21:32:08',1,'2016-04-28 21:33:24',0,2,NULL),(139,119,'module_menu_category_item','/demo/reportform/workload/index.htm','工作量报表','WorkloadReportForm','工作量报表',0,0,1,'_self','icon-star','system.workloadreportform:index',1,'2016-05-08 21:05:58',1,'2016-05-08 21:07:10',0,1,NULL),(140,119,'module_menu_category_item','/demo/reportform/bonus/index.htm','奖金报表','BonusReportForm','奖金报表',1,0,1,'_self','icon-star','system.bonusreportform:index',1,'2016-05-08 21:08:19',1,'2016-05-08 21:09:42',0,1,NULL);

/*Table structure for table `bas_role` */

CREATE TABLE `bas_role` (
  `BAS_ROLE_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `NAME_ZH` varchar(128) NOT NULL COMMENT '角色中文名称',
  `NAME_EN` varchar(128) NOT NULL COMMENT '角色英文名称',
  `DESCRIPTION` varchar(256) DEFAULT NULL COMMENT '角色描述',
  `EDITABLE` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否可编辑,可为空',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '系统默认字段.删除日期',
  PRIMARY KEY (`BAS_ROLE_ID`),
  UNIQUE KEY `UK_BAS_ROLE_NAME_ZH` (`NAME_ZH`),
  UNIQUE KEY `AK_UK_BAS_ROLE_NAME_EN` (`NAME_EN`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='系统角色表';

/*Data for the table `bas_role` */

insert  into `bas_role`(`BAS_ROLE_ID`,`NAME_ZH`,`NAME_EN`,`DESCRIPTION`,`EDITABLE`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`MARK_FOR_DELETE`,`OPT_COUNTER`,`DELETE_DATE`) values (1,'系统管理角色','SystemAdminRole','对系统有不受限制的完全访问权',1,1,'2013-03-24 11:34:17',1,'2016-05-09 00:03:15',0,124,NULL),(2,'用户信息查询角色','UserInfoQueryRole','允许查询用户信息',1,1,'2013-03-24 11:34:58',1,'2016-05-09 00:04:01',0,34,NULL),(4,'用户信息管理角色','UserInfoManageRole','允许对用户信息进行增、删、改、查',1,1,'2013-04-10 20:26:40',1,'2016-05-09 00:03:43',0,21,NULL),(6,'报表管理角色','ReportManageRole','允许查询和导出报表',1,1,'2013-04-10 20:28:57',1,'2016-05-09 00:02:47',0,19,NULL),(10,'部门限定角色','DepartmentLimitRole','仅限查询或管理本部门信息',1,1,'2014-05-22 17:51:18',1,'2016-05-08 21:20:51',0,8,NULL),(11,'个人限定角色','PersonLimitRole','仅限查询或管理本人信息',1,1,'2016-05-04 17:36:49',1,'2016-05-08 21:20:41',0,2,NULL),(12,'个人绩效查询角色','PerformanceQueryRole','允许查询个人绩效数据',1,1,'2016-05-05 00:13:06',1,'2016-05-09 00:01:59',0,5,NULL),(13,'绩效考勤管理角色','AttendanceManageRole','允许对考勤信息进行管理和审核',1,1,'2016-05-08 18:09:48',1,'2016-05-08 23:58:29',0,4,NULL),(14,'工作绩效数据管理角色','PerformanceDataManageRole','允许对工作绩效数据进行管理和审核',1,1,'2016-05-08 18:12:49',1,'2016-05-09 00:01:39',0,2,NULL),(15,'部门信息管理角色','DepartmentManageRole','允许对部门信息进行增、删、改、查',1,1,'2016-05-08 20:30:20',1,'2016-05-09 00:00:36',0,1,NULL),(16,'部门信息查询角色','DepartmentQueryRole','允许查询部门信息',1,1,'2016-05-08 20:34:23',1,'2016-05-09 00:01:17',0,2,NULL),(17,'核算单元方案设置角色','AccountUnitPlanRole','允许设置核算单元绩效分配方案中的参数',1,1,'2016-05-08 20:36:53',1,'2016-05-08 23:57:01',0,5,NULL),(18,'自定义项目管理角色','CustomPerformanceRole','允许管理自定义绩效项目数据',1,1,'2016-05-08 20:38:24',1,'2016-05-09 00:00:04',0,3,NULL),(19,'绩效核心项目管理角色','CoreProjectManageRole','允许管理绩效系统的核心项目',1,1,'2016-05-08 20:47:18',1,'2016-05-08 23:59:00',0,2,NULL),(20,'出勤系数管理角色','AttendanceCoefficientRole','允许管理科室的出勤系数',1,1,'2016-05-08 20:54:52',1,'2016-05-08 23:57:21',0,1,NULL),(21,'考勤纠错管理角色','CorrectionManageRole','允许进行考勤纠错',1,1,'2016-05-08 21:01:28',1,'2016-05-08 23:59:35',0,1,NULL);

/*Table structure for table `bas_role_resource` */

CREATE TABLE `bas_role_resource` (
  `BAS_RESOURCE_ID` int(11) NOT NULL COMMENT '资源ID',
  `BAS_ROLE_ID` int(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`BAS_RESOURCE_ID`,`BAS_ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与资源关系表';

/*Data for the table `bas_role_resource` */

insert  into `bas_role_resource`(`BAS_RESOURCE_ID`,`BAS_ROLE_ID`) values (1,1),(1,2),(1,4),(1,6),(1,8),(1,12),(1,13),(1,14),(1,15),(1,16),(1,17),(1,18),(1,19),(1,20),(1,21),(2,1),(2,8),(9,1),(9,8),(10,1),(10,8),(11,1),(11,8),(12,1),(12,8),(13,1),(13,2),(13,4),(13,6),(13,8),(13,12),(13,13),(13,14),(13,15),(13,16),(13,17),(13,18),(13,19),(13,20),(13,21),(14,1),(14,8),(15,1),(15,8),(16,1),(16,8),(17,1),(17,8),(18,1),(18,8),(19,1),(19,6),(19,8),(19,15),(19,16),(20,1),(21,1),(24,1),(25,4),(26,1),(26,8),(36,1),(36,8),(37,1),(37,8),(38,1),(38,8),(39,1),(39,8),(43,1),(43,8),(44,1),(44,2),(44,4),(44,6),(44,8),(44,12),(44,13),(44,14),(44,15),(44,16),(44,17),(44,18),(44,19),(44,20),(44,21),(45,1),(45,2),(45,4),(45,6),(45,8),(45,12),(45,13),(45,14),(45,15),(45,16),(45,17),(45,18),(45,19),(45,20),(45,21),(47,1),(47,2),(47,4),(47,6),(47,8),(47,12),(47,13),(47,14),(47,15),(47,16),(47,17),(47,18),(47,19),(47,20),(47,21),(48,1),(48,2),(48,4),(48,6),(48,8),(48,12),(48,13),(48,14),(48,15),(48,16),(48,17),(48,18),(48,19),(48,20),(48,21),(49,1),(49,8),(50,1),(50,8),(51,1),(51,8),(52,1),(52,8),(53,1),(54,1),(54,8),(55,1),(55,8),(56,1),(57,1),(57,8),(59,1),(60,1),(61,1),(61,8),(62,1),(63,1),(64,1),(64,2),(64,4),(64,6),(64,15),(64,16),(64,17),(64,18),(64,19),(64,20),(65,1),(65,6),(65,18),(66,1),(66,6),(66,18),(67,1),(67,18),(68,1),(68,18),(69,1),(69,6),(70,1),(70,18),(71,1),(71,6),(71,19),(72,1),(72,2),(72,4),(72,6),(72,15),(72,16),(73,1),(73,2),(73,4),(73,6),(74,1),(74,6),(74,20),(75,1),(75,6),(75,14),(76,1),(76,6),(76,14),(77,1),(77,6),(77,12),(78,1),(78,6),(78,12),(79,1),(80,1),(81,1),(81,4),(82,1),(82,2),(82,4),(82,6),(83,1),(83,4),(84,1),(84,6),(85,1),(85,4),(86,1),(87,1),(88,1),(89,1),(90,1),(91,1),(92,1),(93,1),(94,1),(95,1),(96,1),(97,1),(98,1),(99,1),(100,1),(101,1),(102,1),(103,1),(104,1),(105,1),(106,1),(107,1),(108,1),(109,1),(110,1),(111,1),(111,6),(111,15),(111,16),(112,1),(112,15),(113,1),(113,15),(114,1),(114,6),(115,1),(115,15),(116,1),(116,6),(116,14),(117,1),(117,6),(117,13),(118,1),(118,6),(118,21),(119,1),(119,6),(120,1),(120,6),(120,17),(121,1),(121,14),(122,1),(122,14),(123,1),(123,6),(124,1),(124,14),(125,1),(125,6),(125,14),(126,1),(126,6),(126,14),(127,1),(127,14),(128,1),(128,14),(129,1),(129,6),(130,1),(130,14),(131,1),(131,6),(131,13),(132,1),(132,6),(132,13),(133,1),(133,13),(134,1),(134,13),(135,1),(135,6),(136,1),(136,13),(137,1),(137,6),(137,21),(138,1),(138,6),(139,1),(139,6),(140,1),(140,6);

/*Table structure for table `bas_tasks` */

CREATE TABLE `bas_tasks` (
  `BAS_TASKS_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `NAME` varchar(500) DEFAULT NULL COMMENT '称名',
  `CRON` varchar(200) DEFAULT NULL COMMENT 'CRON表达式',
  `BEAN_NAME` varchar(200) DEFAULT NULL COMMENT 'bean Name',
  `BEAN_CLASS` varchar(200) DEFAULT NULL COMMENT 'bean class 类',
  `METHOD_NAME` varchar(200) DEFAULT NULL COMMENT '方法名',
  `IS_START` tinyint(1) DEFAULT NULL COMMENT '是否启动 0 未启动，1 已启动',
  `EXECUTE_TIME` int(11) DEFAULT NULL COMMENT '执行时间',
  `DESCRIPTION` varchar(200) DEFAULT NULL COMMENT '描述',
  `CREATE_BY` int(11) NOT NULL COMMENT '创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '更新日期',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '记录操作次',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '删除日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '是否标记删除 0 未删除   1 表示删除',
  PRIMARY KEY (`BAS_TASKS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `bas_tasks` */

insert  into `bas_tasks`(`BAS_TASKS_ID`,`NAME`,`CRON`,`BEAN_NAME`,`BEAN_CLASS`,`METHOD_NAME`,`IS_START`,`EXECUTE_TIME`,`DESCRIPTION`,`CREATE_BY`,`CREATE_DATE`,`UPDATE_BY`,`UPDATE_DATE`,`OPT_COUNTER`,`DELETE_DATE`,`MARK_FOR_DELETE`) values (1,'111','111','bbb','aaa','name111',1,1000,'111',1,'2015-03-30 18:07:26',1,'2015-03-30 18:07:43',1,NULL,0);

/*Table structure for table `bas_tiptext` */

CREATE TABLE `bas_tiptext` (
  `BAS_TIPTEXT_ID` int(11) NOT NULL COMMENT 'ID',
  `TIP_TEXT_KEY` varchar(50) DEFAULT NULL COMMENT '提示信息关键字',
  `TEXT_ZH` varchar(400) DEFAULT NULL COMMENT '中文名称',
  `TEXT_EN` varchar(400) DEFAULT NULL COMMENT '英文名称',
  `CREATE_BY` int(11) NOT NULL COMMENT '系统默认字段.创建人ID',
  `CREATE_DATE` datetime NOT NULL COMMENT '系统默认字段.创建日期',
  `UPDATE_BY` int(11) NOT NULL COMMENT '系统默认字段.更新人ID',
  `UPDATE_DATE` datetime NOT NULL COMMENT '系统默认字段.更新日期',
  `MARK_FOR_DELETE` int(1) DEFAULT '0' COMMENT '系统默认字段.逻辑删除标记  0 未删除   1 表示删除',
  `OPT_COUNTER` int(6) DEFAULT '0' COMMENT '系统默认字段.版本记录',
  `DELETE_DATE` datetime DEFAULT NULL COMMENT '系统默认字段.删除日期',
  UNIQUE KEY `UK_BAS_TIPTEXT_KEY` (`TIP_TEXT_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bas_tiptext` */

/*Table structure for table `bas_user` */

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

/*Table structure for table `bas_user_group` */

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

/*Table structure for table `bas_user_role` */

CREATE TABLE `bas_user_role` (
  `BAS_USER_ID` int(11) NOT NULL,
  `BAS_ROLE_ID` int(11) NOT NULL,
  KEY `IDX_BAS_USER_ROLE_URID` (`BAS_USER_ID`,`BAS_ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bas_user_role` */

insert  into `bas_user_role`(`BAS_USER_ID`,`BAS_ROLE_ID`) values (1,1),(2,4),(2,10),(2,12),(2,16),(2,17),(2,18),(2,19),(2,20),(17,2),(17,11),(17,12),(23,2),(23,11),(23,12),(24,2),(24,10),(24,12),(24,14),(25,2),(25,6),(25,10),(25,12),(26,2),(26,10),(26,12),(26,13),(26,21);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
