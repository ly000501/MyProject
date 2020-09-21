/*
Navicat MySQL Data Transfer

Source Server         : 本机MySql
Source Server Version : 80015
Source Host           : 127.0.0.1:3306
Source Database       : universitysciencesys

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-09-21 15:00:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `college_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `college_title` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` date DEFAULT NULL,
  `person` varchar(30) DEFAULT NULL COMMENT '人名',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  `type` varchar(20) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`college_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of college
-- ----------------------------
INSERT INTO `college` VALUES ('1', '学院简介', '2015-04-02', null, '    理学院是西安科技大学最大的学院之一，其前身为西安矿业学院基础课部。经过数十年的发展，现具有4个二级学科硕士点：固体力学、工程力学、应用数学、物理电子学。学院还拥有工程力学和数学与应用数学2个本科专业。理学院由工程力学系、数学I系、数学II系、应用物理系、工程图学系5个系组成。现有物理实验中心、力学实验中心、图形图像实验室、应用数学实验室、数学建模研究室等5个实验室，承担着全校相关课程的实验教学任务。\r\n\r\n    理学院重视师资队伍建设，拥有一批业务精干、结构合理的教师队伍。全院现有教职工143人，其中教师122人，实验技术人员15人，行政6人；教师中有教授22人、副教授34人；教师中博士52人、硕士53人，硕士及以上学历教师人数已占教师总人数的86%。\r\n\r\n    近年来，理学院秉承“健康、快乐、进步，宽松、和谐、发展”的理念，坚持以人才队伍建设为突破口，以教学为中心，以科学研究和社会服务并重，取得了丰硕的成果。在本科和研究生教学中，理学院承担着全校数学、力学、物理及制图类的公共课程和部分专业课的教学任务，自2003年以来，建设了国家级精品课程1门，省级双语教学示范课程1门，校级精品课程10余门；具有省级教学团队和级教学团队各1个；承担省级以上教改项目3项，校级教改项目40余项，获得省级以上教学成果奖6项，校级教学成果奖10余项；出版教材或专著20余部。在科学研究方面，自2008年以来，先后承担了10余项国家自然科学基金，以及四十余项省部级科研项目，累计经费达到2000多万元。在国内外重要刊物上发表论文200余篇，其中被国际三大检索系统SCI、EI、ISTP收录60余篇。在学生培养中，理学院学生在全国大学生数学建模竞赛，全国大学生英语竞赛，全国周培源大学生力学竞赛，陕西省高等数学竞赛等学科竞赛中，年均获奖超40人次；以学科竞赛、学生第二课堂、学院特色活动等内容为载体，“厚基础、高素质、精技能”在学生身上得以展现。近年学院的考研率保持在40%左右，优秀学子纷纷考入浙江大学、西安交通大学、西北工业大学、中国科学院等211、985院校深造。', '学院简介');
INSERT INTO `college` VALUES ('2', '理学院党政领导', '2014-05-22', null, '孙颜红  理学院党委书记\r\n\r\n李明   理学院院长\r\n\r\n高欣   理学院党委副书记\r\n\r\n张仲华  理学院副院长\r\n\r\n解忧   理学院副院长\r\n\r\n', '党政领导');
INSERT INTO `college` VALUES ('3', '机构设置', null, null, '尚无资料\r\n', '机构设置');
INSERT INTO `college` VALUES ('4', '理学院召开人才工作专题会', '2018-04-19', null, '    4月18日下午，理学院在雁塔校区主楼12楼会议室召开理学院2018年人才工作专题会，李明院长主持会议，学院领导班子、党委委员出席会议。\r\n\r\n     会上，李院长对2018年春季集中组队外出招聘博士工作、学院2018年人才工作的成效、存在的问题和工作建议等方面做了详细的安排和部署。与会人员结合针对2018年理学院博士人才招聘、高层次人才引进和培养等方面进行交流探讨，对引进人才较为困难的专业，研究采取差异化的政策，加大引才力度，破解引才难题。 \r\n\r\n李院长着重强调，学院需要加大人才引进工作力度，创造良好氛围，将人才引进方面的各项工作做细做实，争取取得更大突破。', '师资概况');

-- ----------------------------
-- Table structure for datum
-- ----------------------------
DROP TABLE IF EXISTS `datum`;
CREATE TABLE `datum` (
  `datum_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `datum_title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `file_name` varchar(60) DEFAULT NULL COMMENT '文件名',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `file` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '文件',
  `number` int(10) DEFAULT '0' COMMENT '下载次数',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`datum_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of datum
-- ----------------------------
INSERT INTO `datum` VALUES ('1001', '西安科技大学试题标准格式（2015版）', '西安科技大学试题标准格式（2015版）.rar', '2018-03-23 15:35:00', 'E:\\WorkSpace\\idea\\UniversityScienceSys\\src\\main\\resources\\static\\file\\datum\\西安科技大学试题标准格式（2015版）.rar', '1', '教学资料');
INSERT INTO `datum` VALUES ('1002', '科技成果报奖', '科技成果报奖-6659.doc', '2011-11-24 23:39:00', 'E:\\WorkSpace\\idea\\UniversityScienceSys\\src\\main\\resources\\static\\file\\datum\\科技成果报奖-6659.doc', '0', '科研资料');
INSERT INTO `datum` VALUES ('1003', '西安科技大学理学院班主任工作考核表', '西安科技大学理学院班主任工作考核表.doc', '2015-12-17 10:46:00', 'E:\\WorkSpace\\idea\\UniversityScienceSys\\src\\main\\resources\\static\\file\\datum\\西安科技大学理学院班主任工作考核表.doc', '0', '学工资料');
INSERT INTO `datum` VALUES ('1004', '西安科技大学临潼校区办公电话号码表', '西安科技大学临潼校区办公电话号码表.doc', '2011-11-24 23:22:00', 'E:\\WorkSpace\\idea\\UniversityScienceSys\\src\\main\\resources\\static\\file\\datum\\西安科技大学临潼校区办公电话号码表.doc', '1', '其他资料');

-- ----------------------------
-- Table structure for educate_achieve
-- ----------------------------
DROP TABLE IF EXISTS `educate_achieve`;
CREATE TABLE `educate_achieve` (
  `educate_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '成果编号',
  `educate_title` varchar(50) DEFAULT NULL COMMENT '成果标题',
  `date` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`educate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of educate_achieve
-- ----------------------------
INSERT INTO `educate_achieve` VALUES ('1001', '西安科技大学第十一届优秀教学成果奖获奖', '2011-11-22 17:13:00');

-- ----------------------------
-- Table structure for educate_achieve_list
-- ----------------------------
DROP TABLE IF EXISTS `educate_achieve_list`;
CREATE TABLE `educate_achieve_list` (
  `achieve_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '成果序号',
  `achieve_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '成果名称',
  `grade` varchar(10) DEFAULT NULL COMMENT '成果等级',
  `person` varchar(30) DEFAULT NULL COMMENT '成果主要完成人姓名',
  `unit` varchar(10) DEFAULT NULL COMMENT '获奖单位',
  `educate_id` int(10) DEFAULT NULL COMMENT '成果编号',
  PRIMARY KEY (`achieve_id`),
  KEY `educate_id` (`educate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of educate_achieve_list
-- ----------------------------
INSERT INTO `educate_achieve_list` VALUES ('1', '高职高专物理课程教学体系改革研究与实践', '一等奖', '郭长立、李勇、王瑞平、炎正馨、常琳', '理学院', '1001');
INSERT INTO `educate_achieve_list` VALUES ('2', '弹性力学课程体系的改革与实践', '二等奖', '韩江水、屈钧利、张天军、邹彩凤、宁民霞', '理学院', '1001');
INSERT INTO `educate_achieve_list` VALUES ('3', '“质量工程”项目管理与监控模式的构建与实施', '二等奖', '张涛、李勇、郭长立、杨富强、吴乐', '理学院', '1001');
INSERT INTO `educate_achieve_list` VALUES ('4', '学分制下使用信息技术工具改造线性代数课程研究与实践', '二等奖', '杨秀妮、冯卫兵、丁正生、杨云锋、夏小刚', '理学院', '1001');

-- ----------------------------
-- Table structure for educate_flow
-- ----------------------------
DROP TABLE IF EXISTS `educate_flow`;
CREATE TABLE `educate_flow` (
  `educate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `educate_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `person` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '人名',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `picture` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '流程图',
  PRIMARY KEY (`educate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of educate_flow
-- ----------------------------
INSERT INTO `educate_flow` VALUES ('1001', '学生申请请假流程图', '杨富强', '2011-11-09 19:31:00', '../static/imgs/educate/edu_flow/shenqingqingjia.jpg');
INSERT INTO `educate_flow` VALUES ('1002', '学生办理转专业流程图', '杨富强', '2011-11-09 19:30:00', '../static/imgs/educate/edu_flow/zhuanzhuanye.jpg');

-- ----------------------------
-- Table structure for educate_info
-- ----------------------------
DROP TABLE IF EXISTS `educate_info`;
CREATE TABLE `educate_info` (
  `educate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `educate_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `person` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '人名',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  PRIMARY KEY (`educate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of educate_info
-- ----------------------------
INSERT INTO `educate_info` VALUES ('1001', '应对疫情“停课不停学”，理学院组织教师开展在线教学培训', '姚红霞', '2020-02-19 23:01:00', '为全面贯彻教育部、省教育厅和我校关于加强疫情防控工作的相关要求，积极落实疫情防控期间“停课不停学、学习不延期”相关部署，理学院为全体教师开展在线教学培训。\r\n\r\n2月19日晚，理学院使用“腾讯视频”进行在线教学工作培训，培训会邀请物理系教师、教育部智慧教学之星鱼海涛副教授和数学系刘杰副教授分别以“如何利用学堂云及雨课堂快速部署线上教学”和以“基于超星学习通的混合式教学”为主题，从网络课程模式探讨、雨课堂移动端和PC端的使用、超星学习通的使用及线上教学常见问题等方面进行了细致地讲解，分享了线上教学模式的组织、教学方法和经验。并对大家的提问进行了详细解答。\r\n\r\n培训会由理学院教学副院长解忧教授在线主持，两场线上培训会从20点开始，持续了两个多小时，总共有一百多人次参加了在线培训。学院教师通过网络对开展线上教学进行了深入讨论和互动交流。为后续开展线上教学奠定良好基础和充分准备。解忧副院长要求学院全体教师，尽快掌握在线教学方法，提高在线教学能力，全力维护疫情防控期间正常教学秩序、教学进度和教学质量，把疫情对教学工作影响降到最小。');
INSERT INTO `educate_info` VALUES ('1002', '理学院举办首届“课堂教学设计大赛”', '姚红霞 ', '2019-11-07 08:51:00', '为了全面提高理学院教师（尤其是青年教师）课堂教学设计水平，提升其课堂教学水平，打造一支“四有”教师队伍，结合“不忘初心牢记使命”主题教育活动，2019年11月6日，理学院举办了首届“课堂教学设计大赛”。\r\n\r\n本次比赛从2019年6月开始启动，通过前期的宣传、动员和各系的初赛，经过近半年的准备，数学系、物理系、力学系和图学系共选拔了十名优秀教师参加决赛。决赛中，参赛的教师根据课程学科特色设计教学，将自己精心设计的优秀教学方案进行了全方位展示。讲解了“教什么？怎么教？为什么这样教？教学效果如何？”。同时也把立德树人、课程育人理念贯穿于教学全过程，课堂教学融入实现民族伟大复兴的理想和责任。\r\n\r\n课堂教学设计是教师为达成一定的教学目标，对课堂教学活动进行的系统规划、安排与决策。良好的课堂教学设计是取得良好教学效果的重要保证。本次比赛为大家提供一个相互交流、相互学习、相互促进、相互提高的平台。通过比赛交流，大家对具体的课堂教学设计有了深刻理解，对于广大教师提高教学能力和水平具有重要的促进作用。近期，理学院将会把比赛中展现出来的优秀课堂教学设计做成展板展示，进一步提高辐射教育作用。');

-- ----------------------------
-- Table structure for educate_manage
-- ----------------------------
DROP TABLE IF EXISTS `educate_manage`;
CREATE TABLE `educate_manage` (
  `educate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `educate_title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  PRIMARY KEY (`educate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of educate_manage
-- ----------------------------
INSERT INTO `educate_manage` VALUES ('1001', '西安科技大学多媒体教室管理与使用办法（试行）', '2011-11-09 22:48:00', '多媒体教学是集传统的电化教育和现代传播技术为一体，依托计算机技术基础，用最生动、最有效的方法设计、编辑、制作具有无穷奥妙和变化的教学软件（即课堂教学内容），从而极大地提高了教学质量，越来越受到广大师生的亲睐。多媒体教室的应用与教学研究是多媒体教学改革研究的重要课题，是多媒体教室发挥其效能的重要方面，是促进教师采用先进的电子备课、授课及进行软件编制的重要源泉与动力。多媒体教室是为教学服务的，因此只能开展多媒体教学的研究和应用。为了充分发挥这一现代化的教学方法和手段，推动我校教学改革，进一步提高教学质量，加强管理并使用好多媒体教室，特制定本办法：\r\n\r\n一、教师职责\r\n\r\n1、多媒体教室的课堂教学模式采用的是\"软件+硬件\"，而不是过去的\"粉笔+黑板\"，该教室系无尘教室，全部采用电子教案授课。\r\n\r\n2、使用多媒体教室的教师应保持教室清洁，不得乱扔废纸，尽量减少粉尘飞扬。\r\n\r\n3、所有多媒体教室的计算机均装有文件保护装置及密码，未经教室管理人员审核擅自拷入的文件，计算机将不予保留。\r\n\r\n4、教师需在多媒体计算机内拷贝软盘者，应提前2天携软盘或光盘在电教科进行软件杀毒，并自行装入到上课用的多媒体计算机内,以便熟悉使用过程。\r\n\r\n5、教师在多媒体计算机内拷入的文件，教室管理人员只根据教务处授课安排的学时保留，超过使用期限的文件将予以删除，以确保其他课程软件的使用空间。\r\n\r\n6、爱护多媒体设备。教师应按操作规程进行操作，课后盖好计算机、关闭电源开关和照明开关，以防尘防火。\r\n\r\n二、学生职责\r\n\r\n1、学生应自觉保持教室清洁，不得在室内抽烟、吐谈、吃东西、乱扔果皮纸屑等。\r\n\r\n2、严禁在桌椅、墙壁上乱写乱画或随意拉扯窗帘。\r\n\r\n3、严禁学生在计算机上插盘，拷贝计算机内的文件，以免病毒传入。\r\n\r\n4、不得在课间利用计算机进行娱乐，不得乱动教室设备，不得在主控台前围观，不得在教室内喧哗。凡损坏教室任何设备者，照价赔偿。\r\n\r\n5、违反上述规定者，除罚款外，还将视情节轻重给予行政处分。\r\n\r\n三、管理人员职责\r\n\r\n1、协助教师使用多媒体设备，并及时处理教师在授课中因设备使用不当而出现的各种突发性问题。\r\n\r\n2、管理人员应定期检修设备。并定期对计算机进行磁盘整理和杀毒，为投影机除尘，同时应保持多媒体计算机主控台桌面清洁。\r\n\r\n3、协助后勤部门搞好教室的环境卫生。所有的多媒体教室卫生工每天要打扫1次，每周拖地1次。\r\n\r\n4、管理人员应根据授课安排的时间，按时打开和关闭教室大门，以确保教学正常进行。\r\n\r\n5、课后检查设备是否完好无损，检查电源开关和照明开关及吊扇是否关闭，其后关闭并锁好所有门窗。\r\n\r\n四、多媒体教室的课程安排依照教务处下发的授课计划执行。临时加课或校里有重要活动使用，经教务处批准，由电教科负责安排。');
INSERT INTO `educate_manage` VALUES ('1002', '西安科技大学教材工作条例', '2011-11-09 22:15:00', '为了适应高等教育事业的发展和教学改革的需要,为了进一步加强我校的教材建设工作，根据教育部颁发的《高等学校教材工作规程》精神，结合我校的实际情况，特制定本条例。\r\n\r\n一、总则\r\n\r\n第一条 教材是体现教学内容和教学方法的知识载体，是进行教学的基本工具,也是深入教学改革,提高教学质量的重要保证。教材质量的高低，直接影响到教学质量。因此,教材工作是高等学校一项重要的基本建设工作。\r\n\r\n第二条 学校各级领导应正确认识高等学校教材工作的地位和作用，把教材工作放到应有的位置，切实加强对教材工作的领导。\r\n\r\n第三条 教材工作的范围主要包括教材建设、教材研究和教材供应三个方面。其基本任务是根据学校各层次（研究生、本科、高职高专）教育的培养目标、培养计划与课程建设的要求，认真贯彻落实国家和上级有关部门的方针政策，统筹规划和组织完成教材的编著、编译、印刷出版、选用以及保障供给等工作。逐步建立起一套适应我校教学需要，具有我校学科优势的教材体系，不断提高我校的教材工作水平。\r\n\r\n二、组织领导\r\n\r\n第四条加强组织领导，完善教材管理体制，提高管理水平，由教学主管校长领导教材工作。并下设：\r\n\r\n1、教材建设委员会，其职责是：审定全校教材建设规划；落实教材工作中的各项方针政策；组织指导各学科教材的研究和评价工作；评选校级优秀教材；审查、申报省（部）级及国家级优秀教材；指导各院、系（部）教材建设小组开展教材建设工作。\r\n\r\n2、教务处设专人负责教材建设工作。\r\n\r\n3、教材科在主管校长和教务处领导下，履行教材选用、采购和日常管理工作。\r\n\r\n第五条 学校及各相关部门应根据教材工作发展需要，努力创造条件，逐步提高教材工作的软硬件环境，保证教材工作高效运行。\r\n\r\n三、教材建设和研究\r\n\r\n第六条 教材建设工作的目标是：全面贯彻国家的教育方针和科教兴国战略，不断深化教材工作改革，大力提高教材质量，积极扩大教材种类，努力搞好教材管理，为推进全面素质教育服务。\r\n\r\n第七条 我校教材建设工作的指导方针是：加强领导，加大投入，突出特色，支持重点。实施精品战略，抓好重点规划，注重专业配套，促进推广选用。编写、出版一批适应教育事业发展与改革需要，反映当代科学技术先进水平和我校学科特色的高水平教材。\r\n\r\n第八条 教材建设必须有计划、有组织地进行。教材建设规划要从实际教学工作需要出发，提倡精益求精，反对粗制滥造；倡导改革精神，树立精品意识。\r\n\r\n第九条 学校应广泛开展教材的评价和研究工作，建立健全教材评估制度，建立与教材工作评估相应的政策措施，充分调动教师和各级管理干部深入开展教材研究的积极性。\r\n\r\n四、教材的选用与供应\r\n\r\n第十条 选用优秀教材是教材工作的重要组成部分，它直接关系到教学质量和人才素质的提高，学校教材建设委员会和各院、系（部）要加强对教材选用的指导和管理，严把教材质量关，防止不合格的教材进入课堂。\r\n\r\n第十一条 教材的供应要及时、准确，教材供应部门必须做到“课前到书、人手一册”。\r\n\r\n五、附则\r\n\r\n第十二条 本条例由校教材建设委员会负责解释。\r\n\r\n第十三条 本条例自公布之日起实施。');

-- ----------------------------
-- Table structure for educate_resource
-- ----------------------------
DROP TABLE IF EXISTS `educate_resource`;
CREATE TABLE `educate_resource` (
  `educate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `educate_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  PRIMARY KEY (`educate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of educate_resource
-- ----------------------------
INSERT INTO `educate_resource` VALUES ('1001', '在线网络课程资源', '2015-11-16 14:59:00', '请大家注意尊重相关网站知识产权，尽量保存自己喜欢的网址，直接访问。\r\n\r\n一、中国大学精品开放课程（视频、课件）（在线）\r\n\r\nhttp://www.icourses.cn/\r\n\r\n（1）高等数学 东南大学 潮小李\r\n\r\nhttp://www.icourses.cn/coursestatic/course_3579.html\r\n\r\n（2）高等数学 西安电子科技大学 杨有龙\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6645.html\r\n\r\n（3）高等数学 西安交通大学 李继成\r\n\r\nhttp://www.icourses.cn/coursestatic/course_4121.html\r\n\r\n（4）高等数学 空军工程大学 冯有前\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6567.html\r\n\r\n（5）高等数学 同济大学 李雨生\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2181.html\r\n\r\n（6）线性代数 电子科技大学 黄廷祝\r\n\r\nhttp://www.icourses.cn/coursestatic/course_4134.html\r\n\r\n（7）线性代数 东南大学 陈建龙\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2501.html\r\n\r\n（8）线性代数 中国科学技术大学 陈发来\r\n\r\nhttp://www.icourses.cn/coursestatic/course_3066.html\r\n\r\n（9）线性代数 西安电子科技大学 刘三阳\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6647.html\r\n\r\n（10）线性代数 哈尔滨工业大学 郑宝东\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2924.html\r\n\r\n（11）概率论与数理统计 国防科学技术大学 吴翊\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6556.html\r\n\r\n（12）概率论与数理统计 中国科学技术大学 缪柏其\r\n\r\nhttp://www.icourses.cn/coursestatic/course_3068.html\r\n\r\n（13）概率论与数理统计 北京工业大学 程维虎\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6165.html\r\n\r\n（14）复变函数与积分变换 华中科技大学 李红\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2561.html\r\n\r\n（15）复变函数 西安交通大学 彭济根\r\n\r\nhttp://www.icourses.cn/coursestatic/course_7104.html\r\n\r\n（16）大学物理 华中科技大学 项林川\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6180.html\r\n\r\n（17）大学物理 北京交通大学 吴柳\r\n\r\nhttp://www.icourses.cn/coursestatic/course_3346.html\r\n\r\n（18）大学物理 同济大学 顾牡\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2182.html\r\n\r\n（19）大学物理 东南大学 周雨青\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2532.html\r\n\r\n（20）大学物理 西安交通大学 王小力、徐忠锋\r\n\r\nhttp://www.icourses.cn/coursestatic/course_4129.html\r\n\r\n（21）大学物理 国防科学技术大学 黄明球\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6555.html\r\n\r\n（22）大学物理 上海交通大学 高景\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2931.html\r\n\r\n（23）大学物理 清华大学 安宇\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2996.html\r\n\r\n（24）流体力学上海交通大学 薛雷平\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2943.html\r\n\r\n（25）材料力学 清华大学 殷雅俊\r\n\r\nhttp://www.icourses.cn/coursestatic/course_3947.html\r\n\r\n（26）流体力学 清华大学 符松\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2992.html\r\n\r\n（27）工程力学 同济大学 徐鉴\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2204.html\r\n\r\n（28）工程力学 北京交通大学 汪越胜\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6399.html\r\n\r\n（29）理论力学 湖南大学 刘又文\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2804.html\r\n\r\n（30）弹性力学 清华大学 冯西桥\r\n\r\nhttp://www.icourses.cn/coursestatic/course_2991.html\r\n\r\n（31）工程制图 中国矿业大学 江晓红\r\n\r\nhttp://www.icourses.cn/coursestatic/course_6166.html\r\n\r\n（32）工程制图 北京理工大学 张彤\r\n\r\nhttp://www.icourses.cn/coursestatic/course_5978.html\r\n\r\n（33）工程制图 西安交通大学 郑镁\r\n\r\nhttp://www.icourses.cn/coursestatic/course_4119.html\r\n\r\n二、精品课（课件）（可下载）\r\n\r\nhttp://www.jingpinke.com/\r\n\r\n（1）高等数学 郑志明 北京航空航天大学课件\r\n\r\nhttp://course.jingpinke.com/details?uuid=8a833999-2031c13b-0120-31c13b9e-0035\r\n\r\n（2）高等数学 金路 复旦大学 课件\r\n\r\nhttp://course.jingpinke.com/details?uuid=b30ef440-12ac-1000-8f70-bd3919efaddd\r\n\r\n（3）大学物理 吴柳 北京交通大学 课件\r\n\r\nhttp://course.jingpinke.com/details?uuid=8a833999-2031c13b-0120-31c13b9d-002f\r\n\r\n（4）大学物理 陈信义 清华大学 课件\r\n\r\nhttp://course.jingpinke.com/details?uuid=8a833996-18ac928d-0118-ac929217-069e\r\n\r\n三、超星学术视频（视频）（可下载）\r\n\r\nhttp://video.chaoxing.com/\r\n\r\n（1）高等数学（上） 李换琴 西安交通大学\r\n\r\nhttp://video.chaoxing.com/serie_400004641.shtml\r\n\r\n（2）概率论 何书元 北京大学\r\n\r\nhttp://video.chaoxing.com/serie_400001605.shtml\r\n\r\n（3）线性代数 沈灏 上海交通大学\r\n\r\nhttp://video.chaoxing.com/serie_400001251.shtml\r\n\r\n（4）基础物理 周彬 北京师范大学\r\n\r\nhttp://video.chaoxing.com/serie_400001563.shtml\r\n\r\n（5）大学物理（一） 董占海 上海交通大学\r\n\r\nhttp://video.chaoxing.com/serie_400002235.shtml\r\n\r\n四、网易公开课（视频、课件）（可下载）\r\n\r\n（1）耶鲁大学开放课程：基础物理\r\n\r\nhttp://open.163.com/special/fundamentalsofphysics/\r\n\r\n（2）耶鲁大学公开课：基础物理II\r\n\r\nhttp://open.163.com/special/opencourse/physicsii.html\r\n\r\n（3）麻省理工公开课：线性代数\r\n\r\nhttp://open.163.com/special/opencourse/daishu.html\r\n\r\n（4）麻省理工学院公开课：经典力学\r\n\r\nhttp://open.163.com/special/opencourse/classicalmechanics.html\r\n\r\n（5）北京理工大学公开课：力学概论\r\n\r\nhttp://open.163.com/special/cuvocw/lixuegailun.html\r\n\r\n五、番薯学院（视频）（在线）\r\n\r\nhttp://www.fanshuxueyuan.com/\r\n\r\n（1）大学物理西安电子科技大学\r\n\r\nhttp://www.fanshuxueyuan.com/article_2738.html\r\n\r\n（2）高等数学兰州大学\r\n\r\nhttp://www.fanshuxueyuan.com/article_2881.html\r\n\r\n六、可汗学院（网易）（视频）（可下载）\r\n\r\nhttp://open.163.com/khan/\r\n\r\n（1）可汗学院公开课：线性代数\r\n\r\nhttp://v.163.com/special/Khan/linearalgebra.html\r\n\r\n（2）可汗学院公开课：物理学\r\n\r\nhttp://v.163.com/special/Khan/physics.html\r\n\r\n（3）可汗学院官网\r\n\r\nhttps://www.khanacademy.org/\r\n\r\n七、中国高等学校教学资源网\r\n\r\nhttp://www.cctr.net.cn/');

-- ----------------------------
-- Table structure for lab
-- ----------------------------
DROP TABLE IF EXISTS `lab`;
CREATE TABLE `lab` (
  `lab_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `lab_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '实验室名称',
  `lab_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` date DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '实验室类型',
  PRIMARY KEY (`lab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lab
-- ----------------------------
INSERT INTO `lab` VALUES ('1001', '物理实验中心', '物理实验教学中心简介', '2011-11-24', '西安科技大学物理实验教学中心始建于1958年，其前身为基础部物理实验室。1990年起扩大规模，分设普通物理实验室、近代物理实验室、物理演示实验室、模拟演示实验室和综合设计实验室等。历经五十多年的建设，物理实验教学中心现有教学面积2000m2，固定资产300多万。实验中心现有实验教师和技术人员30人，其中博士后3人，具有硕士、博士学位的老师约占80%，承担全校各类物理实验课程教学和创新设计性实验。物理实验室多次获省部级及校级奖励，1990年通过煤炭部高校基础课实验室评估验收，被评为先进实验室；1991被评为陕西省高校先进实验室；1998年通过陕西省基础课实验室评估验收，为合格实验室；1988年、2005和2009年三次被评为西安科技大学优秀实验室;在2006~2007年＂学评教活动中〃实验类课程被测评为优秀等级。', '实验中心概况');
INSERT INTO `lab` VALUES ('1002', '力学实验中心', '力学实验中心简介', '2011-11-22', '矿山工程力学实验教学中心的前身是力学实验室，由原来的材料力学性能测试实验室发展而来，是原西安矿业学院最早建立的的公共基础实验室之一。1980年增设电测实验室、光弹性实验室，2004年整体搬迁到临潼校区，增设低周疲劳实验室、振动测试实验室、冲击疲劳实验室。2011年通过校内资源整合，增设了岩石混凝土MTS测试中心、岩石物理力学实验室、物理相似材料模拟实验室、数值模拟实验室等实验内容。中心现有专、兼职实验人员23人，其中教授10人 ，副教授或高工2人，博士10人，硕士7人。用房总面积近2000平方米，大型实验仪器设备200余台（套），固定资产总值1300余万元，具有较强的实验基础。1990年通过煤炭部高校基础课实验室评估验收，被评为优秀实验室；1991被评为陕西省高校先进实验室；1998年通过陕西省基础课实验室评估验收，被评为合格实验室；1997年、2005年分别被评为西安科技大学实验室先进集体。实验教学中心在2004年教育部本科教学水平评估中得到好评。中心实验场地宽敞，师资队伍结构合理，设备较先进，管理到位，具有较强的实验教学能力和科研能力。\r\n\r\n矿山工程力学实验教学中心本着教学与科研并举的原则，充分发挥学校在煤炭行业的技术优势，寻求工程力学与地矿行业工程实践的结合点，建设矿山工程力学实验教学中心。坚持以服务地方经济建设为宗旨，积极开展面向生产实际的应用型科研课题研究；鼓励教师参加教育教学改革项目研究，逐步形成了一支结构合理、素质较高的师资队伍。科研经费增长迅速，呈现出良好的发展态势。\r\n\r\n近五年来，中心成员发表教改论文15篇，承担国家级教改项目1项，省级教改项目2项，获省级优秀教学成果二等奖3项，出版著作1部，编写教材5部。全国“力学教学优秀教师”1人，获得陕西省青年突击手称号2人，陕西省青年科技奖获得者1人，中国岩石力学与工程学会青年科技奖获得者1人。发表科研论文100余篇,其中SCI和EI收录论文40余篇；获得省（部）级科技进步一等奖2项，国家专利2项，已鉴定或结题国家自然科学基金2项，教育部博士点基金项目1项，目前承担国家自然科学基金3项，教育部新世纪优秀人才支持计划资助项目1项，教育部科学技术研究重点项目1项，陕西省自然科学基金、教育厅专项4项，企业委托、协作项目20余项。', '实验中心概况');
INSERT INTO `lab` VALUES ('1003', '数学实验室', '数学实验室简介', '2011-11-22', '本实验室从我校的实际出发，以科学发展观为指导，全面贯彻我校“十一五”发展规划，经过深思熟虑、统筹安排，以搭建全校公共基础实验平台和学科（专业）基础实验平台为基本出发点，以强化专业特色、体现办学特色的专业（学科）特色实验室建设为重点，以创造有利于学生实践能力、创新精神和创新能力培养与提高的良好实验教学条件为基本目标，同时兼顾研究生培养和教师科研实验需求。\r\n\r\n本实验室现有高配置计算机34套、高性能服务器一台、高端ARM单片学习机60台、便携式投影设备一台。\r\n\r\n本实验室拥有高素质的教学及科研队伍，其中：教授2人、副教授5人、讲师13人，专职实验员1人，具有数套高质量数学实验软件。多年来一直为数学建模提供硬件资源及人力资源，建模队伍中有60%的教练来自数学与应用数学系，有力地支持了我校全国大学数学建模的开展，数学建模成绩逐年提高，连续4年获得全国优秀奖。同时，也支持了本科生及研究生的正常课内教学及实践教学，利用率达到95%以上。', '实验中心概况');
INSERT INTO `lab` VALUES ('1004', '图形图像实验室', '图形图像实验室简介', '2011-11-22', '图形图像实验室为工程制图系列课程提供教学科研服务。它由资料室、模型挂图室、测绘模型室和计算机房、多媒体教室组成。资料室存放着与工程制图有关的各类杂志、教材和制图标准，供教学参考；模型挂图室存放着大量的模型和挂图，供教师讲课时使用；测绘模型室存放着供学生测绘时使用的金属零件和测绘工具；计算机房有多台计算机、打印机和扫描仪等，供教师备课和研究科研课题使用', '实验中心概况');
INSERT INTO `lab` VALUES ('1005', '物理实验中心', '实验仪器与设备', '2020-09-10', '尚无资料', '实验仪器与设备');
INSERT INTO `lab` VALUES ('1006', '物理实验中心', '开设实验', null, '尚无资料\r\n', '开设实验');
INSERT INTO `lab` VALUES ('1007', '力学实验中心', '仪器设备配置情况', '2011-11-22', '1．仪器设备购置经费保障\r\n\r\n仪器设备装备水平是保证教学质量的物质基础。中心具备的常规仪器设备能满足实验教学的需要。\r\n\r\n每年学校下拨的配套经费，财政部中央-地方共建高校专项资金项目、省财政拨款、学校自筹资金等是教学仪器设备购置经费的主要来源，每年20-50万元。\r\n\r\n2．仪器设备更新情况和利用率\r\n\r\n近五年来购置的仪器设备经费投入500余万元，主要用于更新陈旧仪器设备、补充仪器设备套数、购置一定数量的计算机和计算软件、购置高水平科研项目所需要的设备、补充专业课程及学科建设所需要的设备等。中心大型设备年更新率在5%以上，电子仪器15%以上，计算机25%以上。\r\n\r\n中心各实验室仪器设备的完好率在95%以上，利用率大于95%，今后将不断加大“开放式、研究性”实验开设，提高仪器设备利用率。\r\n\r\n3．自制仪器设备情况\r\n\r\n中心十分重视新实验开发、教学仪器研制工作。近年来，中心组织教师和工程技术人员人员自行研制了一批相似模拟实验用的实验设备、教学仪器，改进了一批教学实验，提高了实验教学水平和教学质量，形成了鲜明的实验教学特色。\r\n\r\n4．仪器设备情况\r\n\r\n经过校内实验资源整合，使得专业有相似点、功能相近的若干实验室的基础实验设备得到了学校统筹调配，建立了实验资源的校内共享，这样，既提高了仪器设备的利用率，又可以减少重复建设，节约了资金，对经费紧张的学校和实验教学中心来说，资源整合、共享是一个解决资金困难的好办法。目前，实验教学中心有主要仪器设备200余台（件），设备资产约1300余万元。大型精密仪器面向实验教学，每台、套设备使用机时都在每学年400机时以上，平均达到600机时。', '实验仪器与设备');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻编号',
  `news_title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '新闻标题',
  `person` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '记者',
  `date` datetime NOT NULL COMMENT '日期',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '新闻内容',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('20200101', '我校代表队在2020年中国大学生物理学术竞赛西北赛区中获佳绩', '闫小乐', '2020-09-04 09:25:00', '2020年中国大学生物理学术竞赛（CUPT）西北赛区近日成功举办。我校派出来自全校不同专业的十名同学（宋海龙、李婧漪、周子涵、杨瑱、梁国友、王帅、叶彪、邹彬、王佳丽、张悦）组成2支代表队参赛，理学院物理系的闫小乐、庞绍芳、鱼海涛、翟啸波四名教师作为指导教师和裁判参加了本次比赛。经过连续五轮紧张激烈的辩论比赛，我校代表队以优异的成绩荣获本次比赛的团队一等奖1项，二等奖1项，邹彬同学获得最佳评论方奖。\r\n\r\n2020年CUPT西北赛区竞赛由兰州大学承办，受新冠疫情影响，比赛改为线上进行。来自西北地区的西安交通大学、西北工业大学、长安大学、西北大学、兰州大学、西安电子科技大学、陕西师范大学等20所高校的48支代表队参加了本次竞赛。我校学生和指导教师克服了备赛期间居家，比赛期间恰逢返校考试等困难，积极利用网络与团队成员和指导教师交流讨论，自制了“摩擦振子实验装置”、“流体多边形旋转台”等实验装置。参赛队员通过细致认真的备赛，良好的团队协作和冷静沉着的表现，获得了优异成绩。这充分体现了我校物理课程教学创新人才培养所取得的成效。\r\n\r\n本次CUPT比赛得到了校领导、教务处、理学院和其他有关学院的大力支持。通过本次比赛，我校学生与双一流高校学生进行深入交流，在全国高水平竞赛的舞台上展现了我校学生的实力和风采，探索了学科竞赛+学术科研驱动创新型一流本科人才培养的多维度模式。');
INSERT INTO `news` VALUES ('20200102', '理学院召开2021届本科生考研与就业动员大会', '侯斌刚', '2020-09-02 11:46:00', '8月31日下午，理学院在临潼校区在骊山校园实验楼220会议室分班级召开2021届本科生考研及就业动员大会。理学院党委副书记高欣老师﹑毕业班辅导员侯斌刚老师以及学院全体2017级本科毕业生参加会议。\r\n\r\n辅导员侯斌刚老师通报了学院近两年考研和就业情况，希望同学们结合自身实际，合理定位，积极行动，结合专业特点，找准自身定位，以积极的心态面对考研和就业。\r\n\r\n学院党委副书记高欣老师结合我院工程力学和数学与应用数学专业近几年毕业生实际考研就业情况，强调同学们要转变就业观念，明确就业形势，做好就业准备。希望准备考研的同学理清考研思路，掌握好考研方法，调节好心态。并鼓励同学们要以时不我待、只争朝夕的奋斗精神，坚持不懈、奋力拼搏，交出一份让家长、老师满意，让自己无悔的答卷。\r\n\r\n此次动员大会，帮助2017级全体学生对考研和就业都有了更加明确的认识，为学院后期考研和就业工作的开展奠定了坚实基础。');
INSERT INTO `news` VALUES ('20200103', '理学院班主任刘金瑄老师召开职业规划主题班会', '赵明', '2020-09-01 15:47:00', '8月31日下午，理学院数学与应用数学1902班班主任刘金瑄教授主持召开“职业规划”主题班会，数学与应用数学1902班全体同学参加了会议，数学系主任乔宝明教授受邀参加会议。\r\n\r\n两位老师以数学专业为例，深刻讲解了职业规划对大二学生的重要性及必要性，指出在职业规划过程中最常出现目标与现实不匹配的现象，并细致剖析了职业规划中的常见问题，还强调了数学专业学生应重视分析问题和解决问题的能力，培养个人理解、书面及口头表达等能力和吃苦耐劳的精神。最后，刘金瑄进行了总结。通过这次班会，同学们都有了更加明确的目标和方向，认识到规划好大学生涯的重要意义。');

-- ----------------------------
-- Table structure for outstand_alumna
-- ----------------------------
DROP TABLE IF EXISTS `outstand_alumna`;
CREATE TABLE `outstand_alumna` (
  `outstand_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `outstand_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `hiredate` datetime DEFAULT NULL COMMENT '任职时间',
  `job` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工作',
  `photo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '照片',
  `brief` text,
  PRIMARY KEY (`outstand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outstand_alumna
-- ----------------------------
INSERT INTO `outstand_alumna` VALUES ('1001', '何琳', '2017-12-11 23:10:00', '院士', '../static/imgs/outstand/heling.jpg', '何琳，海军工程大学教授、博士生导师、振动与噪声研究所所长。1957年生，1981年毕业于西安科技大学理学院，2005年以来，组织研制出我国第一代舰船噪声监测系统，为实现舰船声学特征管理奠定了基础。以上成果均已得到广泛应用，同时获得多项国家发明专利。近年来，组织开展了\"主被动混合隔振技术\"研究工作，取得了多项关键技术的突破和进展。\r\n\r\n自主研发的系列抗高压平衡式挠性接管，具有突出的管路振动隔离性能，解决了部分重要应用的管路减振降噪难题，获得2009年国家科技进步二等奖。\r\n\r\n2017年当选中国工程院院士。');
INSERT INTO `outstand_alumna` VALUES ('1002', '魏悦广', '2017-12-11 23:07:00', '院士', '../static/imgs/outstand/weiyueguang.jpg', '魏悦广，力学家，北京大学教授。1960年1月出生于陕西渭南，籍贯陕西渭南。1981年毕业于西安科技大学理学院，1986年毕业于中国矿业大学北京研究生部获硕士学位，1992年毕业于清华大学获博士学位。2017年当选为中国科学院院士。现任《力学学报》主编等。\r\n\r\n魏悦广院士主要从事跨尺度力学、弹塑性断裂力学、复合材料力学等研究。在国际上建立了协同考虑应变梯度和表界面效应的跨尺度力学理论；建立了可压缩应变梯度理论和适合应变梯度理论的有限元方法，并由此预测出金属的微尺度断裂强度高达其宏观屈服强度十倍以上的重要结论，突破了传统力学理论的预测极限，引起了国际上对于跨尺度力学的广泛研究。近年来，他将跨尺度力学理论成功应用于发动机叶片先进热障涂层强韧及破坏机制的表征。相关成果获国家自然科学二等奖两项和三等奖一项。\r\n\r\n2017年当选中国科学院院士。');

-- ----------------------------
-- Table structure for party
-- ----------------------------
DROP TABLE IF EXISTS `party`;
CREATE TABLE `party` (
  `party_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `party_title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `person` varchar(20) DEFAULT NULL COMMENT '人名',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  `picture` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`party_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1005 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of party
-- ----------------------------
INSERT INTO `party` VALUES ('1001', '理学院本科生党支部开展“不忘初心，牢记使命”主题志愿服务活动', '2019-11-11 11:41:00', '赵明', '为深入学习贯彻习近平新时代中国特色社会主义思想，全面扎实开展“不忘初心，牢记使命”主题教育，发挥党员的先锋模范带头作用，11月10日上午，理学院本科生党支部全体党员前往芷阳湖养老院开展志愿服务活动。\r\n\r\n出发前，党支部副书记赵明先向党员们讲解了到养老院开展志愿的注意事项和方法技巧，强调了活动纪律和安全问题。到了养老院，党员们在工作人员的指导下先进行卫生清洁工作，擦桌椅、拖地面、扫院子，党员们干劲十足。之后，党员们向全院一百余位老人赠送了棉手套，并分发到每一位老人手里。接下来，党员们自行分组与老人们结对聊天，了解他们的身体和生活状况，倾听他们的需求和愿望，并给一位过生日的老人集体唱了生日快乐歌，赠送小礼物表达祝福。最后，党员们进行合影留念。\r\n\r\n此次“不忘初心、牢记使命”主题志愿服务活动营造了良好的“尊老、敬老、爱老、助老”社会氛围，让老人们感受到了来自党和社会的关怀和帮助。党员们纷纷表示，希望支部多开展这样的志愿服务活动，真正做到守初心、担使命、全心全意为人民服务。', '../static/imgs/party/buwangchuxin.jpg', '党员活动');
INSERT INTO `party` VALUES ('1002', '组织结构', '2015-09-10 00:00:00', '', '', '../static/imgs/party/zuzhijiegou.jpg', '组织结构');
INSERT INTO `party` VALUES ('1003', '理学院物理系党支部开展对照党章找差距活动', '2019-11-18 11:00:00', '杨华平', '11月15日，理学院物理系党支部在雁塔校区创新大楼1807室召开了支部党员会议，会议号召全体教师党员对照党章找差距，把“不忘初心，牢记使命”落到实处。\r\n\r\n与会党员首先认真学习了党章中党员的八条义务以及基层党组织的八项基本任务，结合“不忘初心，牢记使命”主体教育活动，党员们对照党章讨论了工作中存在的不足和差距，明确了党员在工作中要起到模范带头作用，除了学习科学知识，还要带头认真学习党的路线、方针、政策和决议，学习党的基本知识，学习科学、文化、法律和业务知识，努力提高为人民服务的本领，立足本职工作，以学生为中心，服务学生，引导学生，在工作中以身作则，为国育才，为党育人，培养合格的社会主义事业的接班人。党员们通过学习，提高了认识，对本职的教学工作提出了更高要求，不仅要教书，更要育人，在学习上要严格要求学生，在思想上要引导学生，做好课程思政工作，为学生的健康成长提供助力。\r\n\r\n会议由支部书记杨华平讲了主题为“不忘初心，牢记使命，以身作则，立德树人”专题党课。党课深入讲述了主题教育的五个具体目标，读原著，学原文，悟原理，做到“理论学习有收获”，从思想上认识到主题教育的重要性，使得“思想政治受洗礼”，兢兢业业做事，认认真真教书，做到“干事创业敢担当”， 以学生为中心，要做到“为民服务解难题” ，清清白白做人，严格遵守党的纪律和法律，要做到“清正廉洁作表率”，要求广大党员教师结合本职工作，把主题教育活动落实到教学中来，认真在教学工作中提高自己，做好学生的引路人。\r\n\r\n最后，与会党员共同学习了习近平关于“不忘初心、牢记使命”论述摘编中的“加强学习，深入开展调查研究，全面增强执政本领”，通过学习原文，使党员们认识到学习科学知识很重要，学习党的理论知识同样重要，要用新时代中国特色社会主义理论指导实践。', '../static/imgs/party/lilunxuexi.jpg', '理论学习');
INSERT INTO `party` VALUES ('1004', '物理学术竞赛的引领者闫小乐先进事迹材料', '2018-06-11 11:05:00', '侯斌刚', '闫小乐，理学院物理系教师。2000年7月西北工业大学本科毕业后进入西安科技大学工作至今。他忠诚于党的教育事业，扎根基层，长期在教学一线从事物理学的教学科研工作；兢兢业业，教书育人，在平凡的岗位上做出了不平凡的事业。\r\n\r\n一、坚定理想信念，做新时代合格党员。\r\n\r\n闫小乐同志思想上追求进步，于2001年加入中国共产党。作为一名党员，能够认真学习贯彻习近平新时代中国特色社会主义思想和党的十九大精神，坚持“两学一做”常态化学习，在政治思想方面始终能和党中央保持一致。在各项工作中，他始终以合格党员要求自己，具有高度的政治责任感和大局意识。积极参加政治学习和党的组织生活，热烈响应党组织的号召，按时足额缴纳党费、积极为贫困地区捐款捐物。在党支部组织的赴武功县寺背后小学、洛南县常湾小学献爱心活动中，自费给学生带去了笔、本子和字典等学习用品。他被评为2011-2013年度西安科技大学优秀共产党员、2005-2006年度及2015-2017年度理学院优秀共产党员。\r\n\r\n二、爱岗敬业，积极进取，潜心教学科研。\r\n\r\n作为一名基层教师，闫小乐同志始终将教书育人作为为师之本。在教学工作中不畏困难、勇挑重担，积极主动承担、完成各项教学工作任务。执教以来，他承担的教学工作既有全校性公共基础课，其他院系的相关物理课程，也有研究生的专业课程。先后讲授《大学物理》、《大学物理实验》、《建筑物理》、《嵌入式应用系统实验》和《现代测试技术》等课程。在教学工作中，他始终将“国家对人才的发展所需”和“学生的发展”放在首位，以此为灵魂思考、设计有效的大学课堂教学，展现出了一名大学教师深厚的教育责任和情怀，以及扎实的专业知识素养和教育教学能力。在研究生教学中，他采用理论和实验教学相结合的方式，在学习完每章内容后安排相应的实验项目，并进行详细分析与讨论，充分调动了学生的学习积极性和动手能力。在本科生的大学物理和大学物理实验教学的过程中，他思考课程教学怎样才能真正促进学生的发展，确立了“培养科学思维，发展科学精神”的教学理念，并将此贯穿于教学之中。他注重课程的目标导向，突出物理概念与思想，跟进学科发展前沿；注重课程的思维性，讲求条理清晰；设计多样的学习活动，调动学生参与，激活课堂，极大地提高了课堂学习效果。他严格要求自己，坚持详尽、细致备课，精心设计教案，不断充实新的内容，创新调整教学方法，注意与学生的沟通与交流，注重把好教学环节中的每一关。闫小乐同志在担任的全校基础课程《大学物理》教学工作中已逐步形成了自己特有的教学风格。\r\n\r\n闫小乐同志非常关注教学改革，经常在繁琐的日常教学工作中进行反思。曾经针对大学物理教学中的技术理性主义取向及其出路问题展开思考，发表了相关的教学研究论文。他积极捕捉新的教学变革动向，参与专业教学改革，主动探索、创新提升大学课堂教学的新途径。他参与的《提高物理教学质量的辅助手段的研究与实践》的项目获校级教学成果二等奖。根据研究生课程特点及学生需求，他主持了“基于虚拟仪器的《测试技术与仪器》课程建设”研究生课程改革项目。\r\n\r\n闫小乐老师在认真完成教学工作的同时，积极关注学科发展前沿，努力保持学术的敏锐性和独立创新性，不断探索，积极进取，努力提高自己的科研能力和业务水平。2004年获得硕士学位，2012年获得博士学位。闫小乐意识到科学研究是优质大学教学的保证，更是大学教师的重要职责和使命。科学研究奠基于对真理的尊重和敬畏，来不得半点虚假。从教以来，他始终将此作为自己的座右铭，秉承求真务实、严谨治学的学术精神，在学术研究中深度选题，严谨实验，客观论证，准确定论。目前他已经在国内外高水平期刊上发表论文多篇，主持和参加省部级课题2项，参与教材编写3部，获国家发明专利和实用新型专利5项。\r\n\r\n三、勇于担当比奉献，潜心育人做楷模。\r\n\r\n“不为名所惑，不为利所驱”，这是闫小乐同志从教以来的真实写照。近年来，学校日益加大科研奖励，但是闫小乐不为金钱奖励所驱动，没有把全部精力投入到写文章拿项目中去，而是坚持“教学为主、科研辅助教学”的教学科研相结合模式。为了提升学生物理素养和创新能力，激发学生的学习热情和学习积极性，他率先组建了大学生物理学术小组，带领学生对现代工程技术中的物理问题进行探索。并在2017年作为领队和指导教师带领西安科技大学校队参加了“中国大学生物理学术竞赛陕西省竞赛”。在炎热的暑假中，他不畏酷暑，奔波于西安和临潼之间，自费购买仪器和实验材料，组织、指导学生分组实验，从早到晚与学生一起在实验楼中研讨竞赛题目，使学生在实验技能和理论分析能力上获得了很大的提高。在与西安交通大学、西北工业大学等陕西省各高校队伍同台交流竞赛中，经过五轮激烈比赛，以扎实的实验设计、严谨的物理思维辨析和默契的团队配合赢得评委的一致好评，获得团队二等奖。这对于提升西安科技大学学生的学术竞争力和学校声誉起到了非常好的宣传作用。\r\n\r\n为了进一步推动我校大学生物理素养和创新能力的发展，提升我校大学物理教学的实效，闫小乐于2017年9月向教务处申请负责筹办“西安科技大学第一届大学生物理学术竞赛”，并开展了大量的准备工作，于12月底顺利举办了首届大学生物理学术竞赛。以后每年都将举办“西安科技大学大学生物理学术竞赛”，这项赛事填补了我校物理类竞赛的空白，不仅为学生提供了相互交流和学习物理的平台，而且为广大教师提供了交流、合作的平台。\r\n\r\n作为一名普通的共产党员，作为一名普通的高校教师，闫小乐同志用自己的实际行动诠释了“平凡的岗位、不平凡的青春”。', '../static/imgs/party/houbingang.jpg', '党员风采');

-- ----------------------------
-- Table structure for science_achieve
-- ----------------------------
DROP TABLE IF EXISTS `science_achieve`;
CREATE TABLE `science_achieve` (
  `science_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `science_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `person` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '人名',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  PRIMARY KEY (`science_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of science_achieve
-- ----------------------------
INSERT INTO `science_achieve` VALUES ('1003', '尚无内容', null, null, null);

-- ----------------------------
-- Table structure for science_info
-- ----------------------------
DROP TABLE IF EXISTS `science_info`;
CREATE TABLE `science_info` (
  `science_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `science_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `person` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '人名',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  PRIMARY KEY (`science_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of science_info
-- ----------------------------
INSERT INTO `science_info` VALUES ('1001', '理学院召开2018年国家自然科学基金学院评审会', '', '2018-01-30 14:00:00', '近日，理学院克服了大雪天气的影响，召开2018年国家自然科学基金内评会。本次评审会除理学院的评审专家外，还邀请到西安交通大学及西北工业大学三位校外知名专家。\r\n\r\n会上，各位专家对我院教师的国家自然基金申报书做出点评并提出修改建议。通过本次评审会，提高了基金申报书的质量，加强了我院与西安交通大学及西北工业大学的交流与合作，为理学院2018年国家自然科学基金的申报工作打下了坚实的基础。');
INSERT INTO `science_info` VALUES ('1002', '理学院举办国家自然科学基金申报专题讲座', '侯斌刚', '2017-12-12 11:10:00', '为进一步推动国家自然科学基金的申报工作并提高申报质量，12月11日上午，理学院邀请军事科学院系统工程研究院卫勤保障技术研究所研究员、天津理工大学特聘教授张西正作了题为《申请国家自然科学基金应注意的问题与影响因素》的专题讲座，讲座由张仲华副院长主持，党委书记孙颜红、院长李明、副院长张涛和学院约40余名教职工聆听了讲座。\r\n\r\n张西正教授从怎样认识国家自然科学基金、影响申请项目获批的因素、申请中应注意的问题、2018年国家自然科学基金重点问题等几个方面做了详细的讲解。他还结合自身的丰富经验和具体实例，从选题、研究内容、可行性分析、摘要等方面进行了全面剖析。讲座结束后，张教授和教师们进行了深入的交流。\r\n\r\n本次讲座不仅对申请书的准备、质量的提升以及学院保质保量完成2018年国家自然科学基金项目申报工作具有重大的指导意义，而且也提高了老师们的申报积极性。');

-- ----------------------------
-- Table structure for science_teambuild
-- ----------------------------
DROP TABLE IF EXISTS `science_teambuild`;
CREATE TABLE `science_teambuild` (
  `science_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `science_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `person` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '人名',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  PRIMARY KEY (`science_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of science_teambuild
-- ----------------------------
INSERT INTO `science_teambuild` VALUES ('1003', '尚无内容', null, null, '');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` varchar(50) DEFAULT NULL COMMENT '时间',
  `person` varchar(20) DEFAULT NULL COMMENT '人名',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  `picture` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1001', '理学院举办大学生创新创业项目宣讲暨团队纳新会', '2020-08-12 14:20:00', '赵明', '为深入开展创新创业教育，推动理学院学生科技创新活动的开展，8月11日晚，理学院举办了线上科技创新项目宣讲暨团队招新动员会，邀请张涛教授担任主讲，由团委书记赵明主持，理学院2019级全体同学及部分其它年级同学聆听了讲座。\r\n\r\n张涛首先做了题为《声表面波集成传感技术研究》的报告，从课题的研究背景、意义、原理及应用前景等几个方面进行了讲解；接着，介绍了其所在的科研团队的研究领域及优势；之后，讲解了同学们加入团队后将如何开展学习研究、能够从中获得哪些方面成长和提高；最后，师生进行了问答互动，张涛回答了同学们关心的问题。\r\n\r\n本次活动，一方面拓展了同学们的视野，使大家了解了最前沿的科研成果，有利于培养同学们开展科研活动的兴趣，另一方面介绍了张涛教授及其科研团队，为团队纳新提供了一种新的途径，是一次有益的尝试。', '../static/imgs/student/chuangjiuye.jpg', '学工动态');
INSERT INTO `student` VALUES ('1002', '尚无资料', '', '', '', '', '学工队伍');
INSERT INTO `student` VALUES ('1003', '西安科技大学勤工助学岗位申请表', '2013-11-14 09:36:00', null, '西安科技大学勤工助学岗位申请表\r\n\r\n附件【西安科技大学勤工助学岗位申请表.doc】已下载125次', null, '学生资助');
INSERT INTO `student` VALUES ('1004', '西安科技大学国家助学金实施办法', '2013-11-13 15:37:00', null, '第一章  总    则\r\n\r\n第一条  为体现党和政府对家庭经济困难学生的关怀，帮助他们顺利完成学业，根据财政部、教育部《普通本科高校、高等职业学校国家助学金管理暂行办法》（财教〔2007〕92号）和陕西省人民政府《关于建立健全普通本科高校高等职业学校和中等职业学校家庭经济困难学生资助政策体系的实施意见》（陕政发〔2007〕26号）精神以及《陕西省高等学校国家助学金管理暂行办法》有关规定，结合我校实际情况，制定本实施办法。\r\n\r\n第二条  国家助学金用于资助计划内全日制本专科（含高职、第二学士学位）在校生中的家庭经济困难学生。\r\n\r\n第二章  资助标准与申请条件\r\n\r\n第三条  国家助学金主要资助家庭经济困难学生的生活费用开支。具体分为两档：家庭经济特别困难的学生每生每年2500元，一般困难的学生每生每年1500元。\r\n\r\n第四条  国家助学金的申请条件：\r\n\r\n1．热爱社会主义祖国，拥护中国共产党的领导；\r\n\r\n2．遵守宪法和法律，遵守学校规章制度，未受过严重警告及以上处分，无考试违纪行为；\r\n\r\n3．诚实守信，道德品质良好；\r\n\r\n4．勤奋学习，积极上进；\r\n\r\n5．热爱劳动，积极参加公益活动和集体活动；\r\n\r\n6．家庭经济困难，生活俭朴，无铺张浪费行为；\r\n\r\n7．被认定为家庭经济困难学生并已建立信息档案。\r\n\r\n第三章  名额分配\r\n\r\n第五条  国家助学金的资助名额根据各院（系、部）在校本专科生人数及贫困生、特困生人数确定，并对国管专业予以适当倾斜。\r\n\r\n第六条  省教育厅向学校下达国家助学金预算，学校按各院\r\n\r\n（系、部）本专科在校生人数占全校本专科在校生总数的比例向各单位分配国家助学金预算。各个资助级次的名额分配由各单位根据贫困生、特困生的认定情况确定，但不得改变资助标准。\r\n\r\n第四章  申请与评审\r\n\r\n第七条  国家助学金按学年申请和评审。\r\n\r\n第八条  国家助学金申请与评审工作由校学生资助管理中心组织实施。\r\n\r\n第九条  家庭经济困难学生根据本办法规定的国家助学金的申请条件和学校的有关规定，在每年9月底之前填写《陕西省高等学校国家助学金申请表》，向学校提出申请。\r\n\r\n第十条  院（系、部）负责收集家庭经济困难学生递交的申请资料，并组织进行初审，按照我校家庭经济困难学生认定的具体规定，提出国家助学金受助学生初审名单，报校学生资助管理中心审核，最终由学校学生资助工作领导小组审批，确定国家助学金受助学生名单。\r\n\r\n第十一条  学校在每年10月底之前，将我校当年国家助学金政策落实情况报至省教育厅备案。\r\n\r\n第五章  助学金发放、管理与监督\r\n\r\n第十二条  学校按月将国家助学金发放到受助学生“校园一卡通”内，每年按十个月发放。\r\n\r\n第十三条  有关单位应切实加强管理，认真做好国家助学金的评审和发放工作，确保国家助学金用于资助家庭经济困难的学生。\r\n\r\n第十四条  学校按照国家相关法规和规定，对国家助学金实行专户管理，分账核算，专款专用，同时接受财政、审计、纪检监察等部门的检查和监督。\r\n\r\n第十五条  凡有下列行为之一的，学校将视情节分别给予通报批评、停止资助以及追回资助资金等处罚，并追究直接责任人和负责人的责任。\r\n\r\n1．资助对象不符合条件；\r\n\r\n2．弄虚作假、虚报冒领资助资金；\r\n\r\n3．截留、挤占、挪用资助资金。\r\n\r\n第十六条  资助对象出现下列情形之一的，学校将视情况停止资助或追回资助资金。\r\n\r\n1．退学、休学；\r\n\r\n2．学习成绩明显下降；\r\n\r\n3．无故不参加公益活动和集体活动；\r\n\r\n4．经常旷课、迟到早退，违反考试纪律；\r\n\r\n5．受到严重警告及以上处分；\r\n\r\n6．生活奢侈，铺张浪费。\r\n\r\n第六章  附    则\r\n\r\n第十七条  本实施办法由学生处负责解释。\r\n\r\n第十八条  本实施办法自印发之日起施行。', null, '规章制度');

-- ----------------------------
-- Table structure for student_party
-- ----------------------------
DROP TABLE IF EXISTS `student_party`;
CREATE TABLE `student_party` (
  `party_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `party_title` varchar(60) DEFAULT NULL COMMENT '文件标题',
  `party_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '文件名',
  `file` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '文件',
  PRIMARY KEY (`party_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_party
-- ----------------------------
INSERT INTO `student_party` VALUES ('1001', '第一部分陕西省发展党员工作规程（试行）', '第一部分陕西省发展党员工作规程（试行）.doc', 'E:\\WorkSpace\\idea\\UniversityScienceSys\\src\\main\\resources\\static\\file\\student\\party\\第一部分陕西省发展党员工作规程（试行）.doc');
INSERT INTO `student_party` VALUES ('1002', '第六部分参考模板', '第六部分参考模板.doc', 'E:\\WorkSpace\\idea\\UniversityScienceSys\\src\\main\\resources\\static\\file\\student\\party\\第六部分参考模板.doc');
INSERT INTO `student_party` VALUES ('1003', '第五部分附件4 发展党员工作档案袋', '第五部分附件4 发展党员工作档案袋.doc', 'E:\\WorkSpace\\idea\\UniversityScienceSys\\src\\main\\resources\\static\\file\\student\\party\\第五部分附件4+发展党员工作档案袋.doc');

-- ----------------------------
-- Table structure for student_union
-- ----------------------------
DROP TABLE IF EXISTS `student_union`;
CREATE TABLE `student_union` (
  `union_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `union_title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` varchar(50) DEFAULT NULL COMMENT '时间',
  `person` varchar(20) DEFAULT NULL COMMENT '人名',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  `picture` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`union_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_union
-- ----------------------------
INSERT INTO `student_union` VALUES ('1001', '理学院团委、学生会机构图', '2013-11-11', '', '', '../static/imgs/student/union/jigoutu.jpg', '组织机构');
INSERT INTO `student_union` VALUES ('1002', '学生社团', '', '', '尚无资料\r\n', '', '学生社团');
INSERT INTO `student_union` VALUES ('1003', '理学院法制教育观影活动圆满举行', '2016-03-16 15:09:00', '龚子腾', '3月15日晚，由理学院分团委宣传部策划的主题为“学法守法用法  做合格大学生”的法制教育观影活动于理学院会议室召开，参加本次活动的有理学院2014级全体学生。\r\n\r\n本次活动分为两部分，19时到20时观看微电影《黑白日记》，20时开始观看2016年315晚会。本次主持人由宣传部副部长张羽嫣担任。活动开始后，主持人首先向大家介绍了本次活动的主题及流程，随后大家开始观看法制教育微电影《黑白记忆》，观影过程中所有同学认真观看，深深被电影的剧情吸引。随后二十点进行本次活动下部分观看315晚会直播，今年315晚会主题是“共筑消费新生态”，从国内GDP到国外消费，反映出人们对国内消费环境的信心不足。\r\n\r\n通过本次活动，我院学生对法制有了更深的了解，同时提高了我院学生维护自己合法消费权益的意识。希望通过这次的活动，能让越来越多的同学认识到自己的权益，更能维护自己的合法权益！', '../static/imgs/student/union/fazhijiayu.jpg', '学生活动');
INSERT INTO `student_union` VALUES ('1004', '理学院“弘扬雷锋精神，践行社会主义核心价值观”集中讨论学习会顺利召开', '2016-03-14 15:24:00', '龚子腾', '3月13日晚七点，主题为“弘扬雷锋精神，践行社会主义核心价值观”的集中讨论学习会于理学院会议室召开，参加本次活动的有理学院分团委书记赵明老师，分团委学生会主席团成员、各部门部长，部分干事以及2014、2015级各班班干部。\r\n\r\n分团委副书记张堂基主持学习会，致开幕词，并组织观看了相关开幕视频，引入话题。视频之后由各个部门代表，班级代表发表感想，他们就自己对雷锋精神的理解进行了精彩的发言。接下来，主持人组织观看了关于由彭宇案引起的不良社会影响的视频，警示大家要与网络谣言斗争，现在的社会需要的是拒绝冷漠，雷锋归来。\r\n\r\n视频结束后，由袁普主持主题为“学习雷锋精神需要制度约束还是精神宣传”的辩论赛，双方辩手各抒己见，慷慨陈词，以新颖的形式宣传了雷锋精神的知识。\r\n\r\n学习会最后，赵明老师总结会议，具体阐述了何为雷锋精神，要求同学们将雷锋精神落实在真正的大学生活中，要艰苦奋斗、乐于助人、热心公益，在以后的工作中做好螺丝钉，弘扬敬业精神。他指出雷锋精神和国家命运息息相关，和每个人息息相关，制度约束是约束底线，精神宣传是宣传高度。他提醒同学们作为大学生，国家未来的主人，应该有一定的社会责任感，雷锋精神永不过时。', '../static/imgs/student/union/leifengjingshen.jpg', '学生活动');
INSERT INTO `student_union` VALUES ('1005', '理学院“三走”素质拓展活动成功举办', '2013-11-14 09:36:00', '龚子腾', '11月29 日，中午11：30，理学院分团委学生会于田径场举办了“理学院‘三走’素质拓展活动”。出席活动的有理学院分团委副书记张堂基，学生会主席贺隆，学生会副主席马刘娜，秘书长段文慧以及分团委学生会各部长及干事。\r\n\r\n \r\n\r\n12点整，本次活动正式开始。活动内容共分为七个环节，依次是信任背摔，考验了大家的心理素质和互相信任；心心相印，两个人用背夹着气球走路；整齐划一，大家的脚被绑在一起，然后一齐奔跑；篮球对抗，这是一场所有男生参与的友谊赛；珠行万里 ，每个队员拿一根半圆形的球槽，将球连续传动到下一个队员的球槽中，并迅速地排到队伍的末端，继续传送前方队员传来的球，直到球安全的到达指定的目的地为止；匍匐前进，所有人排成一排，把脚搭在后方人的肩膀上，一起向前进；最后一项是拔河比赛，所有成员被分为两组，在这场拉锯中大家团结一致的品质也被体现的淋漓尽致。\r\n\r\n \r\n\r\n本次素质拓展活动在欢笑声中增进了彼此之间的感情，增加了凝聚力，还实现了理学院学生 “走下网络、走出宿舍、走向操场”的“三走”目标。', '../static/imgs/student/union/sanzou.jpg', '学生活动');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '教师编号',
  `teacher_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `teacher_brief` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师简介',
  `hiredate` datetime DEFAULT NULL COMMENT '任职时间',
  `job` varchar(20) DEFAULT NULL COMMENT '岗位',
  `photo` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '照片',
  `background` text COMMENT '教育背景',
  `experience` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '工作经历',
  `research` text COMMENT '研究方向',
  `teachcourse` text COMMENT '所授课程',
  `social` text COMMENT '社会职务',
  `paper` text COMMENT '论文',
  `textbook` text COMMENT '著作及教材',
  `task` text COMMENT '课程',
  `award` text COMMENT '获奖',
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('00000010001', '李明', '李明，男，1963年9月生', '2017-12-11 23:30:00', '教授', '../static/imgs/teacher/liming.jpg', '1988年获硕士学位。1991年晋升为讲师，1997年晋升为副教授，1995年考入西安交通大学攻读博士学位，1999年获得博士学位，2000-2002年南京航空航天大学博士后，2002年晋升为教授。2004年遴选为安全技术及工程专业博士生导师，2005年3月至10月在日本东北大学从事科学研究。现为西安科技大学理学院院长、教授、博士生导师。', '1988-今年在西安科技大学工作', '研究领域为：转子动力学、复杂机械系统动力学与控制、结构振动理论及其应用、故障诊断与监测。', '本科生《振动力学》、《非线性振动》、《理论力学》、《工程力学》、《材料力学》硕士生《振动理论》，《高等动力学》博士生《非线性动力学》', '1、陕西省力学学会理事2、西安科技大学学报编委3、国家自然科学基金项目同行评议专家、中国博士后基金项目评审专家', '1、Li M. He L. Dynamics of parallel-misaligned and unbalanced rotor system under the action of nonlinear oil film forces. Proceedings of the Institution of Mechanical Engineers, Part C, Journal of Mechanical Engineering Science, 2010, 224(9):1875-1889（SCI和、EI收录）2、Li M. Nonlinear dynamic behavior of rotor-bearing system trained by bevel gears. Proceedings of the Institution of Mechanical Engineers, Part C, Journal of Mechanical Engineering Science, 2008,222(C4):617-629.（SCI和、EI收录）3、Li Ming. Nonlinear dynamics of a rotor system subject to a holonomic constraint of parallel misalignment. Dynamics of Continuous, Discrete and Impulsive Systems Series B: Applications & Algorithms, 2007,V14b(S5): 222-226.4、Li M，Hu H Y. Dynamic analysis of a spiral bevel geared rotor-bearing system. Journal of Sound and Vibration. 2003;259(3): 605-624.（SCI、EI收录）5、Li M，Hu H Y, Jiang P L, et al. Coupled axial-lateral-torsional dynamics of a rotor-bearing system geared by spur bevel gears. Journal of Sound and Vibration. 2002;254(3): 427-446.（SCI、EI收录）6、Li M, Yu L. Analysis of the coupled lateral torsional vibration of a rotor-bearing system with a misaligned gear coupling. Journal of Sound and Vibration. 2001,243(2): 283-300.（SCI、EI收录）7、李明,孙涛,胡海岩.齿轮传动转子—轴承系统动力学的研究进展.振动工程学报, 2002; 15(3): 249-256.8、李明,胡海岩.完整约束下齿轮啮合转子系统的弯扭耦合振动稳态响应.振动工程学报, 2003; 16(1) :1-6.9、李明,虞烈等.转子—齿轮联轴器系统的弯扭耦合振动研究.航空动力学报, 1999; 14(1): 60-64.10、李明,虞烈等.轴承-转子-齿轮联轴器系统的振动研究.机械工程学报, 1998;34(3): 39-45.', '1、《振动理论及其应用》讲义，西安科技大学，2010年。（34万字）2、现代设计与先进制造技术，2001年，中国矿业大学出版社。(12.5万字)', '1、军地合作项目：《推进装置一体化隔振系统力学特性研究》2011(主持)；2、国家自然科学基金项目：《转子间具有完整约束的大型多转子耦合系统非线性动力学研究及软件开发》。2010(主持)；3、军地合作项目：《轴承动、静态特性分析和实验研究》2009(主持)；4、陕西自然科学基金项目：《圆锥齿轮-转子-轴承系统的纵弯扭耦合振动》2006(主持)。', '1、全国力学教学优秀教师奖，2006年(独立)；2、《具有几何约束的多转子耦合系统动力学研究》，获2005年西省高等学校科学技术奖二等奖；3、第七届高等院校青年教师三等奖（霍英东奖），2000年(独立)。');
INSERT INTO `teacher` VALUES ('00000010002', '班丽瑛', '班丽瑛，女，1969年5月生', '2017-12-11 23:58:00', '副教授', '../static/imgs/teacher/banliying.jpg', '1992年获物理学学士学位。1997年晋升为讲师，2006年晋升为副教授。2010年遴选为通信与信息系统专业硕士生导师。现为西安科技大学理学院物理系副教授、硕士生导师', '1992-今在西安科技大学理学院物理系承担教学工作', '研究领域为：普通物理学、工程光学、光纤传感。研究方向为：光电检测。', '本科生《大学物理》，《物理实验》，《工程光学》', '（1）陕西省物理学会会员', '1、《高阶非线性效应下飞秒光脉冲间的相互作用》，《激光与红外》2005年第10期。2、《刚体转动惯量实验中影响阻力矩因素研究》，《煤矿机械》2006年第4期。', '1、《大学物理学习与指导》，西北工业大学出版社，2008年版。（主编）(13.6万字)2、《大学物理实验》，陕西科学技术出版社，2003年版。 （副主编）（2.8万字）3、《大学物理》，西北工业大学出版社，2011年版。（副主编）（15.6万字）', '1、西安科技大学培育基金项目：《大学物理演示实验的制作与整理》。(主持) 20082、陕西省科技厅工业攻关项目：《非接触式煤与瓦斯突出的光纤检测与预报系统的研究》。(主持) 2009', '1、西安科技大学2002年青年教师“四个一工程”二等奖2、2006年西安科技大学师德先进个人3、2009年陕西高等学校优秀党员4、西安科技大学2001-2003年度优秀党员5、西安科技大学2005-2007年度优秀党员6、西安科技大学2006-2008年度工会先进工作者');

-- ----------------------------
-- Table structure for train_graduate
-- ----------------------------
DROP TABLE IF EXISTS `train_graduate`;
CREATE TABLE `train_graduate` (
  `train_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `train_title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` varchar(30) DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  `major` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`train_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_graduate
-- ----------------------------
INSERT INTO `train_graduate` VALUES ('1001', '数学硕士点简介', '2020-06-01', '数学学科于2017年在应用数学二级学科硕士学位授权点的基础上获得一级学科硕士学位授权点。数学学科目前拥有一支教学水平精湛、科研能力突出的教学科研团队，其中教授7人，副教授17人。在非线性方程、金融数学、生物数学、多元统计等领域形成了稳定的研究方向并取得了丰硕的成果。自2010年来数学学科共获国家自然科学基金10项，先后获批省部级以上的科研项目和奖励20余项，科研经费数达300余万元，发表SCI、EI论文60余篇，获“陕西省师德建设先进集体”、“陕西省工科数学教学团队”等。\r\n\r\n自2001年以来，数学学科已经培养创新能力较强的高素质硕士研究生近150人，研究生共发表学术论文100余篇，在“全国研究生数学建模竞赛”、“全国电子设计大赛”、“陕西省研究生创新创业竞赛”等赛事中取得了骄人的成绩。毕业后主要进入招商银行、中铁十二局、新疆医科大学、陕西国防工业职业技术学院等教育、金融、地矿等行业就业，年均就业率达95%，受到社会和相关行业的一致好评。\r\n\r\n', '数学', '硕士点简介');
INSERT INTO `train_graduate` VALUES ('1002', '数学培养方案', '', '尚无资料', '数学', '培养方案');
INSERT INTO `train_graduate` VALUES ('1003', '工程力学硕士点简介', '2012-03-01', '工程力学是力学与现代工程技术交叉发展的一门力学分支学科，是个工程领域众现代工程技术的理论基础。工程力学体现了多学科交叉发展与相互促进、融合的发展方向与趋势，是力学与工程密切结合的产物。目前工程力学已在土木、机械、矿山、水利、交通运输、自动化技术、材料与加工、石油化工、环境保护、航空与航天及国防建设等领域中得到广泛应用。\r\n\r\n本学科以力学理论为基础，采用计算机技术及实验技术解决在机械、土木和矿业等重大工程领域中与力学相关的各种工程问题，培养具有良好数学和力学理论基础，在特色领域与交叉学科中具有科学研究与技术开发能力的高级专门人才。\r\n\r\n工程力学学科在多年的教学和科学实践中，已逐步形成了一支水平高、结构合理、人员稳定、具有鲜明特色的教学科研队伍。目前，工程力学学科拥有教授6人，副教授4人。出版专著和教材10余部，共发表了150余篇各类学术论文，其中30余篇被SCI、EI、ISTP收录，多项教学和科技成果获得省部级以上奖励。在转子动力学、结构振动及其控制、结构强度、疲劳断裂和损伤、机械结构优化与可靠度设计；岩土断裂损伤、位移反分析、结构大变形、岩体稳定性预测等方面，取得了大量的理论和应用研究成果。经过长期的研究和努力，目前已经形成了工程结构动力学与强度、岩土力学与工程、矿山工程力学与实验技术、力学计算方法及工程应用等多个研究方向。所取得的成果在机械工程、土木工程、矿业工程等领域得到了应用，受到了良好的社会效益和经济效益。\r\n\r\n研究方向：\r\n\r\n1、工程结构动力学与强度\r\n\r\n2、岩土力学与工程\r\n\r\n3、矿山工程力学与实验技术\r\n\r\n4、力学计算方法及工程应用', '工程力学', '硕士点简介');
INSERT INTO `train_graduate` VALUES ('1004', '工程力学培养方案', '', '尚无资料', '工程力学', '培养方案');
INSERT INTO `train_graduate` VALUES ('1005', '固体力学硕士点简介）', '2012-03-01', '固体力学是研究工程结构和材料强度、港督、稳定性及材料本构关系问题的一门科学。本学科理论性强，应用范围广，具有理科和工科的双重特点。固体力学主要致力于工程结构在外界因素下发生的变形、破坏规律及本构关系的理论、方法研究。特别侧重于采用计算机技术求解工程与力学相关的偶合问题，应用微观和宏观相结合的方法对工程结构的损伤与断裂、动力学效应及工程应用等问题进行研究，为工程提供分析和预测手段，具有理论研究与工程应用的桥梁作用。其理论与应用研究处于固体力学与计算机方法、损伤与断裂力学和岩土力学理论与应用等研究领域的前沿。\r\n\r\n本学科现有教授5人，副教授8人。出版专著教材20余部，发表学术论文200余篇，获省部级以上科技进步奖10余项。经过长期的研究和努力，在岩土力学数值计算、岩土损伤与断裂理论、机械结构优化与可靠度设计、疲劳断裂与寿命估计、工程稳定性分析及动态仿真技术，以及工程材料柳编、动力、大变形分析、结构稳定预测、预报等方面，取得了大量的理论和应用研究成果。所取得的成果在军工、交通、水利水电、城镇、矿业工程等领域取得了广泛应用，收到了良好的社会效益和经济效益。\r\n\r\n研究方向：\r\n\r\n1、固体力学与计算机方法\r\n\r\n2、损伤与断裂力学\r\n\r\n3、岩土力学理论与应用\r\n\r\n4、振动理论与应用', '固体力学', '硕士点简介');
INSERT INTO `train_graduate` VALUES ('1006', '固体力学培养方案', '', '\r\n尚无资料', '固体力学', '培养方案');
INSERT INTO `train_graduate` VALUES ('1007', '物理学学科简介', '2020-06-01', '硕士点物理学科以凝聚态物理、光学、声学及其交叉学科的前沿热点课题研究为特色，并与我校相关优势学科相互交叉融合。学科设有材料物理与理论计算、纳米结构与低维物理、光学理论及光电信息处理、光电器件与功能材料、光电信息材料、声学材料与微声学器件及计算凝聚态物理等研究方向。物理学科拥有一支学术水平高、创新能力强的导师队伍，共有研究成员44人，其中博士学位获得者三十余人，研究生导师二十余人。近三年来主持国家级、省部级以上纵向项目共计30余项，在国内外学术刊物上发表研究论文一百多篇，出版著作多部，获批多项国家专利。学科实验室拥有磁控溅射镀膜、电子束蒸发镀膜、光刻机、薄膜压电极化装置、高温炉、真空炉、球磨机、键合机等先进的实验设备和研究平台，拥有理论计算用的高性能服务器和多台小型计算工作站。为开展硕士研究生培养和科学研究奠定了坚实的基础。毕业研究生就业范围宽泛，大部分研究生进入国内知名企业工作，部分毕业生进一步攻读博士学位，就业率达到100%。', '物理学', '硕士点简介');
INSERT INTO `train_graduate` VALUES ('1008', '物理学培养方案', null, '尚无资料\r\n', '物理学', '培养方案');

-- ----------------------------
-- Table structure for train_regular
-- ----------------------------
DROP TABLE IF EXISTS `train_regular`;
CREATE TABLE `train_regular` (
  `train_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `train_title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` varchar(30) DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  `major` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`train_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_regular
-- ----------------------------
INSERT INTO `train_regular` VALUES ('1001', '数学与应用数学专业简介', '2011-11-24', '本专业培养掌握数学科学的基本理论与基本方法，具备运用数学知识、使用计算机解决实际问题的能力，受到良好的数学教育和计算机基本技能训练、能运用所学数学知识借助计算机解决实际问题、具有一定创新精神和研发能力的应用型高级专门人才。本专业具有硕士学位授予权。\r\n\r\n本专业具有理工结合、学科交叉、理论联系实际的特色。毕业生适合到科研、生产、工程、管理部门和高等院校从事科学研究、技术开发、管理和教学工作；也可以继续攻读应用数学专业或与之相关的高新技术学科、交叉学科及其它学科的硕士学位。', '数学与应用数学专业', '专业简介');
INSERT INTO `train_regular` VALUES ('1002', '数学与应用数学专业人才培养方案（本科）', '2011-11-09', '第一章  课程补考、重修规定\r\n\r\n第一条  每学期教学计划规定的课程，学生考核不合格时参加补考，补考后仍不及格的学生参加重修。实践性教学环节考核不合格必须参加下一年级相同专业重修。重修合格后方可获得该门课程学分。\r\n\r\n第二条  经考核不合格的课程应按教务处规定时间及时参加补考，对未按时参加补考的课程必须在相同学期参加重修学习和考试。\r\n\r\n第三条  对重修后仍未及格的课程，必须在毕业前最后一学期参加重修后方可考试。\r\n\r\n \r\n\r\n第二章  补考、重修办理程序\r\n\r\n第四条  每学期开课前一周，由教务处将参加补考学生名单下发各院系、部，各院、系、部组织学生到教务处办理补考手续。\r\n\r\n第五条  教务处在小学期开始前一周统计本学年须参加重修学习的学生名单和课程，并下发到各院、系、部、财务处。各院、系、部通知学生到财务处缴纳相关学习费用并办理重修手续。\r\n\r\n \r\n\r\n第三章   补考、重修安排\r\n\r\n第六条  补考考试在开学前一周内开始进行。\r\n\r\n第七条  基础课和专业基础课参加重修的学生人数达到30人以上，专业课参加重修的学生人数达到15人以上，单独组班，按重修计划在小学期内开班。重修课程结束后，由教务处组织学生参加考试。\r\n\r\n第八条  参加重修的人数达不到第七条规定的人数时，学生重修课程可随其它班级听课或自学重修。\r\n\r\n第九条  单独组班重修课程的授课学时，一般取计划学时的百分之六十，教师应按教学大纲要求讲授。\r\n\r\n第十条  学生重修课程必须按规定完成作业、实验、实习等教学环节所包含的内容。重修课程的作业，任课教师必须全收全改，并作好记录。\r\n\r\n第十一条  重修班的学生应严格遵守学校的考勤纪律规定，不能随意缺课，缺课三分之一时，不能参加重修考试，按旷考处理。\r\n\r\n \r\n\r\n第四章  补考、重修课程的考核\r\n\r\n第十二条  教学计划规定的考试课程，教研室（授课教师）根据课程考试大纲命A、B、C、D四套试题，其中任抽两套作为补考、重修考试试题。教学计划规定的考查课程补考和重修的考试试卷，由各院、系、部组织命题小组按考试大纲要求单独命题（对有试题库的课程应利用试题库命题），不得使用相同年级期末考试试卷。\r\n\r\n第十三条  补考、重修考试阅卷，由院、系、部组织2位以上教师阅卷，全校性公共基础课应采用流水作业方式阅卷。成绩送交时必须由各院、系、部主管教学主任复查签字，重考、重修试卷保存三年，以备核查。\r\n\r\n第十四条  重修课程考核时，如因学生外出实习等原因无法参加考核，应提前向院、系、部提出申请，报教务处批准。由教务处和院、系、部协商另行安排。\r\n\r\n第十五条  每学期缓考的学生，应与最临近一次补考课程的学生同堂同卷考试，届时不参加者按旷考论处。\r\n\r\n   \r\n\r\n第五章  补考、重修的成绩记载与学籍处理\r\n\r\n第十六条  补考考试成绩按卷面成绩记入学籍管理系统（注补考字样），重修考试成绩按学籍管理条例第二章第八条计算总评成绩。多次重修的成绩，取最高分记入学籍管理系统（注重修字样）。\r\n\r\n第十七条  对不按时参加重修的学生，各学期遗留课程的学分累计相加，按学籍管理条例相关条款处理。\r\n\r\n第十八条  学生到毕业时，所得学分少于培养计划规定的总学分，可延长学习期限一年或作结业处理。\r\n\r\n \r\n\r\n第六章  附  则\r\n\r\n第十九条  本条例未尽事宜，由教务处负责解释。', '数学与应用数学专业', '培养计划');
INSERT INTO `train_regular` VALUES ('1003', '数学与应用数学专业主干课程简介', '2011-11-09', '《数学分析》课程简介\r\n\r\n课程编号：A2012011             课程名称：数学分析\r\n\r\n课内学时：272                   学    分：17\r\n\r\n英文译名：Mathematical Analysis\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：\r\n\r\n内容概要： 数学分析是数学专业最重要的基础课，该课程对学生数学思想的形成，后继课程的学习都有着重要的意义。本课程基本的内容有：极限理论、一元函数微分学、一元函数积分学、级数理论、多元函数微积分学，广义积分、含参量积分、场论等。其中最基本的理论是极限理论，最重要的定理是微积分基本定理。课程的目的是通过三个学期学习和系统的数学训练，使学生逐步提高数学修养，特别是分析的修养，积累从事进一步学习所需要的数学知识，掌握数学的基本思想方法，最终使学生的数学思维能力得到根本的提高。\r\n\r\n主要教材及参考资料：\r\n\r\n1  《数学分析》   华东师范大学编\r\n\r\n2  《数学分析》   吉林大学编\r\n\r\n \r\n\r\n《高等代数》课程简介\r\n\r\n课程编号：A2012021             课程名称：高等代数\r\n\r\n课内学时：176                  学    分：11\r\n\r\n英文译名：Elementary Algebra\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：\r\n\r\n内容概要：高等代数是数学与应用数学专业本科生基础课，是学习和研究近代数学的重要基础，在自然科学、社会科学、经济领域都有重要应用。通过这门课的学习，使学生学习和了解多项式、线性空间和线性变换等基本知识。 培养培养学生独立思维能力和解决实际问题能力，从而为进一步学习专业课打下良好的基础。\r\n\r\n主要教材及参考资料：\r\n\r\n1  《高等代数》   北京大学编\r\n\r\n2  《高等代数》   复旦大学编\r\n\r\n \r\n\r\n《解析几何》课程简介\r\n\r\n课程编号：A2012031            课程名称：解析几何\r\n\r\n课内学时：48                  学    分：3\r\n\r\n英文译名：Analytic Geometry\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：\r\n\r\n内容概要：解析几何是数学与应用数学专业本科生基础课。通过坐标法运用初等的代数工具研究几何问题的一门学科，它把数学的两个基本对象——数与形有机地联系起来，对高等数学的发展起了巨大的推动作用。内容包括空间直角坐标系，向量代数，空间的平面与直线，特殊曲面以及二次曲面等。\r\n\r\n主要教材及参考资料：\r\n\r\n1  《解析几何》   清华大学编\r\n\r\n \r\n\r\n《常微分方程》课程简介\r\n\r\n课程编号：A2012041            课程名称：常微分方程\r\n\r\n课内学时：48                学    分：3\r\n\r\n英文译名：Ordinary Differentical Equations\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、高等代数、解析几何\r\n\r\n内容概要：常微分方程是数学与应用数学专业本科生基础课，是学习泛函、偏微、微分几何等课程的基础，是数学在工程技术中发挥作用的拳头之一。内容包括：微分方程建模、初等积分法、线性系统、常系数线性系统、若干振动问题、一般理论、定性理论初步。\r\n\r\n主要教材及参考资料：\r\n\r\n1  《常微分方程》   北京大学编\r\n\r\n2  《常微分方程》   中山大学编\r\n\r\n \r\n\r\n《概率论》课程简介\r\n\r\n课程编号：A2012051             课程名称：概率论\r\n\r\n课内学时：64                    学    分：4\r\n\r\n英文译名：Probability Theory\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、解析几何\r\n\r\n内容概要：概率论是数学与应用数学专业本科生基础课，是认识、刻画、分析各种随机现象的入门课，具有明显的实际背景和广阔的应用范围，和数学的诸多分支有密切的联系。学习概率论的目的是对随机现象有充分的感性认识和比较准确的理解，初步掌握处理不确定性事件的理论和方法。主要内容包括：随机事件；概率空间，随机变量及其分布；独立性，数学期望和方差，特征函数，各种收敛定义及其相互关系，大数定律和中心极限定理等。\r\n\r\n主要教材及参考资料：\r\n\r\n1  《概率论》   复旦大学编\r\n\r\n2  《概率论》   北京大学编\r\n\r\n \r\n\r\n《数理统计》课程简介\r\n\r\n课程编号：A2012071             课程名称：数理统计\r\n\r\n课内学时：48                    学    分：3\r\n\r\n英文译名：Mathematical Statistics\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、高等代数、概率论\r\n\r\n内容概要：数理统计是数学与应用数学专业本科生基础课，是研究随机现象客观规律性为主的课程。通过本课程的教学，培养学生用概率论的方法、数理统计的方法去分析和解决实际问题的能力。主要内容有：统计量、充分性、抽样分布、矩法估计、极大似然估计、贝叶斯估计、无偏性、有效性、相合性、UMVUE、C-R下界、置信区间、容许区间、假设检验、广义似然比检验、符号检验、秩和检验、分布检验等。\r\n\r\n主要教材及参考资料：\r\n\r\n1  《数理统计》   北京大学编\r\n\r\n《多元统计分析》课程简介\r\n\r\n课程编号：A2012311             课程名称：多元统计分析\r\n\r\n课内学时：36                    学    分：2\r\n\r\n英文译名：Multi-Variate Statistical Analysis\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、高等代数、概率论、数理统计\r\n\r\n内容概要：多元统计分析是数理统计的一门分支课程，它在社会经济领域中有着广泛的应用。主要内容包括：多元正态分布的定义、性质、矩阵正态分布和一些常见的多元抽样分布，如Wishart分布、T2分布、Wilks分布等、多元正态分布参数的估计及其检验问题。还讲授多维数据的分析方法，包括聚类分析、判别分析、主成分分析、因子分析和典型相关分析，着重于方法与应用。\r\n\r\n主要教材及参考资料：\r\n\r\n1  《高等代数》   北京大学编\r\n\r\n《数值分析》课程简介\r\n\r\n课程编号：A2012141             课程名称：数值分析\r\n\r\n课内学时：80                    学    分：5\r\n\r\n英文译名：Numerical Analysis\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、高等代数、常微分方程\r\n\r\n内容概要：数值分析是数学与应用数学专业本科生基础课。通过本课程的学习，使学生理解并掌握现代科学计算中常用的数值计算方法及其原理，包括线性方程组的数值解、非线性方程（组）的数值解法、插值法、函数的最佳一致逼近与最佳平方逼近、曲线拟合、数值积分与数值微分、常微分方程的数值解法以及数值求解矩阵的特征值与特征向量等。并通过上机实习熟练数值方法与一些数学软件的结合运用，达到理论与实践的和谐统一。为解决科学与工程中的实际问题打好基础，同时为后继课程的学习提供必要的知识。\r\n\r\n \r\n\r\n主要教材及参考资料：\r\n\r\n1  《数值分析》   清华大学编\r\n\r\n2  《数值分析》   武汉大学编\r\n\r\n \r\n\r\n数学建模\r\n《数学建模》课程简介\r\n\r\n课程编号：A2012151             课程名称：数学建模\r\n\r\n课内学时：64                    学    分：4\r\n\r\n英文译名：Mathematical Modening\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、高等代数、常微分方程、概率论、数理统计\r\n\r\n内容概要：数学建模是数学与应用数学专业本科生基础课，是数学理论知识与实践完美结合的一门课程。本课程内容包括数学建模概述、简单实例、数学建模过程、常用建模方法、建模综合实例和计算软件包等。通过这一个个典型的数学建模案例，使学生深入体会建立数学模型与所面对实际问题的特征间的对应关系，同时引导学生学习数学建模的基本思路方法，提高学生应用数学解决实际问题的综合能力。\r\n\r\n \r\n\r\n主要教材及参考资料：\r\n\r\n1  《数学建模》   北京师范大学编\r\n\r\n《模糊数学》课程简介\r\n\r\n课程编号：A2012211             课程名称：模糊数学\r\n\r\n课内学时：48                    学    分：3\r\n\r\n英文译名：Fuzzy Mathematics\r\n\r\n适用专业：数学与应用数学\r\n\r\n前导课程：数学分析、高等代数\r\n\r\n内容概要：模糊数学是数学与应用数学专业本科生基础课。本课程讲授的主要内容有模糊集合及其运算、模糊聚类分析、模糊模型识别、模糊决策、模糊线性规划等以及它们在科学技术与经济管理中的应用。通过本课程的学习，使学生掌握模糊数学的基本概念、基本原理和方法为学习后续课程奠定良好的基础。\r\n\r\n \r\n\r\n主要教材及参考资料：\r\n\r\n1  《模糊数学》   武汉大学编\r\n\r\n \r\n\r\n \r\n\r\n \r\n\r\n《运筹学》课程简介\r\n\r\n课程编号：A2012131             课程名称：运筹学\r\n\r\n课内学时：64                   学    分：4\r\n\r\n英文译名：Operational Research\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、高等代数\r\n\r\n内容概要：运筹学是数学与应用数学专业本科生基础课，也是信息管理与信息系统、信息技术与计算科学、管理科学等多个本科专业的专业基础课程，是应用数学方法对经济、民政、国防等部门在内外环境的约束条件下合理分配安排人力、物力、财力等资源,使实际系统有效运行的技术科学。它可以用来预测发展趋势,制定行动规划或优选可行方案，为管理人员作决策提供科学依据。\r\n\r\n \r\n\r\n主要教材及参考资料：\r\n\r\n1  《运筹学》  清华大学编\r\n\r\n \r\n\r\n《偏微分方程及其数值解》课程简介\r\n\r\n课程编号：A2012081             课程名称：偏微分方程及其数值解\r\n\r\n课内学时：80                    学    分：5\r\n\r\n英文译名：Numerical Solution of Partial Differential Equation\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、高等代数、常微分方程\r\n\r\n内容概要：偏微分方程及其数值解是计算数学的一个重要分支，也是数学与应用数学专业本科生基础课，与计算机应用密切结合。本课程主要介绍如何将用连续数量关系建立起来的数学模型问题进行离散化，从而可由计算机进行处理和实现。主要内容包括：椭圆型边值问题、抛物型和双曲型初边值问题的差分方法，以及椭圆边值问题的有限元方法简介等等。通过本课程的学习，使学生能够掌握偏微分方程数值方法的基本理论和分析问题、解决问题的基本方法与技巧，以及良好的编程和上机调试能力，为今后解决实际问题或从事专门信息处理奠定良好的数学基础，以及应用计算机去解决实际问题的能力. 要求学生掌握偏微分方程差分方法的基本理论和基本技巧；掌握一些典型、常用、有效的数值格式的构造方法，较熟练地编程在计算机上实现。\r\n\r\n \r\n\r\n主要教材及参考资料：\r\n\r\n1  《偏微分方程及其数值解》   北京大学编\r\n\r\n2  《偏微分方程及其数值解》   吉林大学编\r\n\r\n \r\n\r\n \r\n\r\n《实变函数与泛函分析》课程简介\r\n\r\n课程编号：A2012091             课程名称：实变函数与泛函分析\r\n\r\n课内学时：64                    学    分：4\r\n\r\n英文译名： Functions of Real Variable & Functional Analysis\r\n\r\n适用专业：数学与应用数学、信息与计算机科学\r\n\r\n前导课程：数学分析、高等代数、解析几何\r\n\r\n内容概要：实变函数与泛函分析是数学与应用数学专业本科生基础课，是整个分析数学中最年轻的学科之一。实变函数与泛函分析是联系各门经典课程的纽带，也是一门内容丰富、方法系统、体系完整、应用广泛的课程。对于任何一个从事纯粹数学与应用数学研究的学者来说，它都是不可缺少的知识。实变函数主要讲授Lebesque测度和Lebesque积分的理论，泛函分析则讲授关于抽象空间和算子的理论，二者合在一起构成现代数学的重要基础。\r\n\r\n \r\n\r\n主要教材及参考资料：\r\n\r\n1  《实变函数与泛函分析》   华东师范大学编\r\n\r\n2  《实变函数与泛函分析》   北京大学编\r\n\r\n \r\n\r\n《复变函数》课程简介\r\n\r\n课程编号：A2012061             课程名称：复变函数\r\n\r\n课内学时：48                    学    分：3\r\n\r\n英文译名：Complex Variables Functions\r\n\r\n适用专业：数学与应用数学\r\n\r\n前导课程：数学分析、解析几何\r\n\r\n内容概要：复变函数是数学与应用数学专业本科生基础课，是培养学生学会用复变函数方法解决实际问题能力的一门重要的必修课，广泛地应用于自然科学的众多领域，如理论物理，空气动力学，流体力学，弹性力学，地质学以及自动控制学等。内容包括：复数与复变函数，解析函数，复变函数的积分，级数，留数，共形映射等。\r\n\r\n \r\n\r\n主要教材及参考资料：\r\n\r\n1  《复变函数》   武汉大学编\r\n\r\n2  《复变函数》   复旦大学编\r\n\r\n \r\n\r\n《小波分析》课程简介\r\n\r\n课程编号：A2012251             课程名称：小波分析\r\n\r\n课内学时：48                   学    分：3\r\n\r\n英文译名：Wavelets\r\n\r\n适用专业：数学与应用数学\r\n\r\n前导课程：数学分析、解析几何\r\n\r\n内容概要：小波分析是数学与应用数学专业本科生基础课，是近二十多年发展起来的一个新兴的数学分支，本课程介绍小波分析的基础及简单应用，通过本课程的学习了解小波分析的基本概念，掌握连续小波变换、离散小波变换的方法、多分辨分析原理、小波奇异性检测原理，了解小波基的构造方法，了解小波变换系数的后处理方法，了解小波分析在信号处理、故障诊断、电力系统中的应用。\r\n\r\n \r\n\r\n主要教材及参考资料：\r\n\r\n1  《小波分析及应用》   华中科技大学编\r\n\r\n2  《小波分析理论及应用》西安电子科技大学编', '数学与应用数学专业', '课程简介');
INSERT INTO `train_regular` VALUES ('1004', '工程力学专业专业简介', '2011-11-24', '本专业培养本专业培养适应社会主义现代化建设需要，德、智、体全面发展，既有扎实的数学、力学理论基础，又有较强的外语、数值分析和计算机应用软件开发能力，能在有关工程领域从事工程分析、科学计算、各类工程对象动静态理论研究、计算机辅助分析与优化、国内外大型工程软件应用与开发和力学教学工作的具有一定创新精神和研发能力的应用型高级专门人才。\r\n\r\n本专业学生主要学习数学和力学的基础理论、基本方法，受力模型建立、实验能力、科学计算和国内外大型工程软件开发与应用等方面的基本训练，具有较好的科学素养，初步具备科学研究、教学、解决实际问题及开发软件等方面的基本能力。', '工程力学专业', '专业简介');
INSERT INTO `train_regular` VALUES ('1005', '工程力学专业人才培养方案（本科）', '2011-11-09', '一、培养目标\r\n\r\n本专业培养本专业培养适应社会主义现代化建设需要，德、智、体全面发展，既有扎实的数学、力学理论基础，又有较强的外语、数值分析和计算机应用软件开发能力，能在有关工程领域从事工程分析、科学计算、各类工程对象动静态理论研究、计算机辅助分析与优化、国内外大型工程软件应用与开发和力学教学工作的具有一定创新精神和研发能力的应用型高级专门人才。\r\n\r\n二、业务培养要求\r\n\r\n本专业学生主要学习数学和力学的基础理论、基本方法，受力模型建立、实验能力、科学计算和国内外大型工程软件开发与应用等方面的基本训练，具有较好的科学素养，初步具备科学研究、教学、解决实际问题及开发软件等方面的基本能力。\r\n\r\n毕业生应获得以下几个方面的知识和能力：\r\n\r\n1．具有扎实的数学力学基础，受到较严格的科学思维训练，初步掌握力学科学的思想方法；\r\n\r\n2．初步掌握力学基本实验技能和试验分析方法，具有应用力学知识去解决实际问题，特别是建立力学模型的初步能力，了解工程应用领域的基本知识；\r\n\r\n3．了解土木、机械等相近专业的一般原理和知识；\r\n\r\n4．能熟练使用计算机（包括常用语言、工具及一些大型工程软件），具有编写简单应用程序的能力；\r\n\r\n5．了解国家科学技术等有关政策和法规；\r\n\r\n6．了解力学科学某些新的进展和应用前景；\r\n\r\n7．有较强的语言表达能力，掌握资料查询、文献检索及运用现代信息技术获取相关信息的基本方法，具有一定的科学研究和教学能力。\r\n\r\n8．掌握英语基本应用能力，能顺利阅读工程力学专业英文资料。  \r\n\r\n三、学制和授予学位\r\n\r\n4年，授予工学学士学位。\r\n\r\n四、主干学科和主要课程\r\n\r\n主干学科：力学\r\n\r\n主要课程：理论力学、材料力学、结构力学、弹性力学、流体力学、实验力学、振动力学、有限元法、大型工程软件应用、FORTRAN语言程序设计等以及根据相应的应用方向选择的基本课程。\r\n\r\n五、主干课程\r\n\r\n马克思主义基本原理、毛泽东思想、邓小平理论和“三个代表”重要思想概论、高等数学、大学物理、物理实验、大学英语、体育、线性代数、Fortran语言程序设计、计算机文化基础、工程制图、理论力学、材料力学、结构力学、弹性力学、实验力学、塑性力学、有限单元法、大型工程软件应用等。\r\n\r\n六、主要实践性教学环节\r\n\r\n包括计算机实习、生产实习、课程设计、科研训练、毕业设计（论文）等。\r\n\r\n七、主要专业实验\r\n\r\n固体力学实验、工程结构实验、现代力学测试技术。\r\n\r\n八、毕业条件\r\n\r\n完成总学分206，其中通识教育和专业教育共计186学分（详见知识体系结构学分分布），综合教育20学分。', '工程力学专业', '培养计划');
INSERT INTO `train_regular` VALUES ('1006', '工程力学专业主干课程简介', '2011-11-09', '《理论力学》课程简介\r\n\r\n课程编号：A2015012                     课程名称：理论力学\r\n\r\n课内学时： 96                           学    分：6\r\n\r\n英文译名：Rigid body mechanics\r\n\r\n适用专业：工程力学\r\n\r\n前导课程：高等数学\r\n\r\n内容概要：理论力学是一门理论性较强的技术基础课，它是各门力学的基础，并在许多工程技术领域中有着广泛的应用。本课程的任务是使学生掌握质点、质点系和刚体机械运动(包括平衡)的基本规律和研究方法，为学习有关的后继课程打好必要的基础，并为将来学习和掌握新的科学技术创造条件；培养学生初步学会应用理论力学的理论和方法分析、解决一些简单的工程实际问题的能力。\r\n\r\n主要教材及参考资料：\r\n\r\n1．《理论力学》（第六版）.高等教育出版社，哈尔滨工业大学理力教研室编, 2002.\r\n\r\n2．《理论力学》（第五版）.高等教育出版社，哈尔滨工业大学理力教研室编, 1996.\r\n\r\n3．《理论力学学习指导书》.高等教育出版社，哈尔滨工业大学理力教研室编, 1994.\r\n\r\n4．《理论力学》.煤炭工业出版社，王永岩主编，1993.\r\n\r\n \r\n\r\n《材料力学》课程简介\r\n\r\n课程编号：A2015022                     课程名称：材料力学\r\n\r\n课内学时： 96                           学    分：7\r\n\r\n英文译名：Material mechanics\r\n\r\n适用专业：工程力学\r\n\r\n前导课程：高等数学、理论力学\r\n\r\n内容概要：材料力学是一门技术基础课。其任务是使学生掌握材料力学中的基本概念、基本原理以及研究问题的基本方法，能够分析杆件在各种变形时的内力、应力和变形计算，正确运用强度、刚度和稳定性条件对简单受力杆件进行校核和截面选择，培养分析问题和解决问题的能力。\r\n\r\n主要教材及参考资料：\r\n\r\n1．《材料力学》上、下册(第四版) .高等教育出版社，刘鸿文主编，2003.\r\n\r\n2．《材料力学》上、下册(第二版) .高等教育出版社，苏翼林主编，1984.\r\n\r\n3．《材料力学实验》.西安科技学院自编，张天军等主编，2001.\r\n\r\n4．《材料力学》上、下册(第三版) .高等教育出版社，刘鸿文主编，1979.\r\n\r\n \r\n\r\n \r\n\r\n《结构力学》课程简介\r\n\r\n课程编号：A01150060                     课程名称：结构力学\r\n\r\n课内学时： 64                           学    分：4\r\n\r\n英文译名：Structure mechanics\r\n\r\n适用专业：工程力学\r\n\r\n前导课程：理论力学、材料力学\r\n\r\n内容概要：结构力学是工程力学等专业的一门重要技术基础课，其任务是使学生了解杆件结构的组成规律，掌握静定和超静定结构的内力和位移的计算方法，了解结构矩阵分析方法，了解结构动力和稳定的计算方法。同时在计算能力和抽象思维能力等方面受到严格的训练，提高科学素质。\r\n\r\n主要教材及参考资料：\r\n\r\n1．《结构力学》(第四版) .高等教育出版社，李廉锟主编，2004.\r\n\r\n2．《结构力学》. 高等教育出版社，龙驭球主编，2006.\r\n\r\n3．《结构力学学习方法及解题指导》.同济大学出版社，徐新济主编，2002.\r\n\r\n4．《结构力学学习指导》.高等教育出版社，雷钟和主编，2005.\r\n\r\n \r\n\r\n《弹性力学》课程简介\r\n\r\n课程编号：A2015032                     课程名称：弹性力学\r\n\r\n课内学时： 64                           学    分：4\r\n\r\n英文译名：Elastic mechanics\r\n\r\n适用专业：工程力学\r\n\r\n前导课程：理论力学、材料力学\r\n\r\n内容概要：弹性力学是工程力学等专业的一门重要的专业基础课。通过本课程的学习，使学生掌握弹性力学的基本概念，基本内容和基本方法，熟悉弹性力学的内容体系。熟练掌握平面问题的直角坐标解答和极坐标解答，掌握差分法、变分法及有限单元法，了解较简单的空间问题的解决方法。培养学生分析、解决实际问题的能力，为学好后继课程，从事专业技术工作和科学研究打下必要的力学基础。\r\n\r\n主要教材及参考资料：\r\n\r\n1.《弹性力学》(第三版). 高等教育出版社，徐芝纶编，1990.\r\n\r\n2.《弹性力学基础》.科学出版社，陈  森编，1981.\r\n\r\n3.《弹性理论》.科学出版社，王龙甫编，1979.\r\n\r\n4.《弹性力学简明教程》（第二版）.高等教育出版社，徐芝纶编，1983.\r\n\r\n \r\n\r\n《实验力学》课程简介\r\n\r\n课程编号：A2015040                    课程名称：实验力学\r\n\r\n课内学时： 32                         学    分：4\r\n\r\n英文译名：Experiment mechanics\r\n\r\n适用专业：工程力学\r\n\r\n前导课程：高等数学、大学物理\r\n\r\n内容概要：本课程是工程力学专业的核心课程，也是一门实验技能训练课程。目的是使学生通过本课程的学习，掌握一些力学测试方法，培养学生的动手能力和应用所学的实验技术去解决工程实际问题，也为学生今后能从事力学理论的研究打下基础。\r\n\r\n主要教材及参考资料：\r\n\r\n1.《实验力学》. 西安科技大学，张天军编，2006.\r\n\r\n2.《实验应力分析》.机械工业出版社，张如一主编, 1981.\r\n\r\n3.《应变电测与传感器》.清华大学出版社，张如一主编,1999.\r\n\r\n4.《实验力学》. 中国科学技术大学, 中国力学学会编, 1986.\r\n\r\n \r\n\r\n《塑性力学》课程简介\r\n\r\n课程编号：A2015050                     课程名称：塑性力学\r\n\r\n课内学时： 32                           学    分：2\r\n\r\n英文译名：Plastic mechanics\r\n\r\n适用专业：工程力学\r\n\r\n前导课程：材料力学、弹性力学\r\n\r\n内容概要：塑性力学是工程力学专业的一门主要专业课。它是固体力学的一个分支，其主要任务是在学习材料力学和弹性力学等课程的基础上，研究固体发生塑性变形时的应力分布和应变分布的规律，从而可以更准确地估计结构的承载能力，还可以利用结构的塑性变形，直接为工程应用服务。\r\n\r\n主要教材及参考资料：\r\n\r\n1. 《塑性力学》.中国建材工业出版社，王春玲主编，2004.\r\n\r\n2. 《塑性理论教程》.清华大学出版社，徐秉业、陈森灿主编，1981.\r\n\r\n3. 《塑性力学》.机械工业出版社，蒋泳秋、穆霞英主编，1981.\r\n\r\n4. 《弹塑性力学引论》.清华大学出版社，杨桂通主编，2004.\r\n\r\n \r\n\r\n《有限单元法》课程简介\r\n\r\n \r\n\r\n课程编号：A2015060                     课程名称：有限单元法\r\n\r\n课内学时： 48                          学    分：4\r\n\r\n英文译名：Finite element method\r\n\r\n适用专业：工程力学\r\n\r\n前导课程：材料力学、弹性力学、Fortran语言程序设计\r\n\r\n内容概要：有限单元法是工程力学专业的一门重要专业课，它的基本任务是学习本课程的计算机数值方法，掌握本课程的理论、列式和程序设计方法，并应用于结构分析。要求掌握有限元法的原理与基本方程的建立，连续体结构的离散化，边界条件的引入，有限元法程序调试和使用等。\r\n\r\n主要教材及参考资料：\r\n\r\n1.《工程结构的有限元方法》. 西北工业大学出版社，屈钧利主编，2004.\r\n\r\n2.《固体力学有限单元法及程序设计》. 西安地图出版社, 李云鹏、王芝银主编, 1994.\r\n\r\n3.《固体力学有限元理论方法及程序》.水利电力出版社, 徐次达、华伯浩主编, 1983.\r\n\r\n \r\n\r\n《计算力学》课程简介\r\n\r\n \r\n\r\n课程编号：A2015070                     课程名称：计算力学\r\n\r\n课内学时： 16                          学    分：2\r\n\r\n英文译名Calculation mechanics\r\n\r\n适用专业：工程力学\r\n\r\n前导课程：有限元法、弹性力学、振动理论等\r\n\r\n内容概要：计算力学是工程力学专业的一门理论性很强的专业选修课，主要对大型工程结构进行力学分析，是土木、机械、能源、航空等领域必不可少的基本知识。本课程以ANSYS作为主要的学习内容，使学生掌握有限元建模、工程结构的位移场和应力场的分析、系统的模态分析和动力响应分析的方法，注重培养学生应用工程软件解决实际问题的能力。\r\n\r\n主要教材及参考资料：\r\n\r\n1.《电脑辅助工程分析》.中国铁道出版社，陈精一，蔡国忠主编，2001.\r\n\r\n2.《实用工程数值模拟技术及其在ANSYS上的实践》.西北工业大学出版社，王国强主编，1999.\r\n\r\n3. 《FLAC原理、实例及应用指南》.人民交通出版社，刘波主编，2005.', '工程力学专业', '课程简介');

-- ----------------------------
-- Table structure for train_system
-- ----------------------------
DROP TABLE IF EXISTS `train_system`;
CREATE TABLE `train_system` (
  `train_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `train_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`train_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_system
-- ----------------------------
INSERT INTO `train_system` VALUES ('1001', '西安科技大学本、专科生学费管理条例', '2011-11-09 22:44:00', '第一章 总 则\r\n\r\n第一条 西安科技大学是根据 《中华人民共和国教育法》开办的、具有独立法人资格的高等学校。依法办学是我国高等教育体制改革的重要内容。为保证学校经济良好运行，特制定本条例。\r\n\r\n第二条 本条例所指学费是每个新学年，按国家规定学生应向学校交纳的一个学年内的全部费用。\r\n\r\n第三条 本条例所称的本、专科生是指依照国家招生计划招收的在校学习的全日制本、专科学生。\r\n\r\n第四条 本条例所称的贫困生是指在校学习期间，基本生活、学习费用没有保障的本、专科学生。\r\n\r\n第五条 欠费额累计超过一个学年规定学费的30%时，称为大额欠费，其它称为一般欠费。\r\n\r\n第六条 高等教育为非义务教育，按时交纳学费是每个学生承担的责任。交费上大学和对品学兼优的贫困生给予资助，是高等学校在社会主义市场经济条件下运行的一个重要特征。学校及所属各单位，应通过各种形式，积极帮助品学兼优的贫困生完成学业。\r\n\r\n第七条 享受“国家奖学金”的学生在符合有关条件的情况下，可在一年后或毕业前减免一年的学费；享受“西部开发助学工程”的学生，按陕教文明办[2004]15号文件规定执行。除此之外，校内的任何工作人员和部门，均无权决定减免学费。\r\n\r\n第二章 学费收缴办法\r\n\r\n第八条 学费按学年收缴。每个新学年开始的前三天为学生交纳学费的时间，由学生本人到学校财务处交纳。\r\n\r\n第九条 交纳学费后，学生持交费收据和学生证到本人所在院、系、部办理注册手续。\r\n\r\n第十条 学生的学籍变动后，应按照新编入班级的学费标准交纳学费。\r\n\r\n第十一条 学生不按期交纳学费、住宿费，学校将按银行的同期贷款利率收取滞纳金。住宿费未缴清者，公寓不予安排住宿。\r\n\r\n第三章 校内各单位的职责\r\n\r\n第十二条 追缴欠交学费的工作关系到学校各项事业的正常运转。各院、系、部和各职能部门要各负其责，密切配合。\r\n\r\n第十三条 学工部、团委和各院、系、部应深入细致做好学生的思想工作，使在校的每个学生认识到，按时交纳学费是自己承担的义务。各院、系、部负责向欠交学费的学生家长或经济供养人通报情况。\r\n\r\n第十四条 财务处应在收缴学费的时限后一周内，向各院、系、部和职能部门提供欠交学费学生名单，并提供对欠交学费学生名单的查询。\r\n\r\n第十五条 学工部负责就纪律和管理方面，对不按时注册的学生的相应处理。\r\n\r\n第十六条 教务处负责对欠费学生的学籍处理。\r\n\r\n第十七条 校内所有单位，在接到校财务处通报的欠交学费的学生名单后，停止向欠费学生办理一切业务。\r\n\r\n第十八条 校内所有单位和教职工，应积极帮助品学兼优的贫困生完成学业。各单位在其业务范围内，应积极帮助品学兼优的贫困生安排勤工俭学的岗位。\r\n\r\n第十九条 学校鼓励所有的学生参加勤工俭学活动。\r\n\r\n第四章 对欠交学费学生的处理办法\r\n\r\n第二十条 大额欠费学生不得注册，学校允许大额欠费的学生停学，离校勤工俭学。所有大额欠费停学学生必须在学院（系）、部及校教务处办理停学手续，否则按自动退学处理。\r\n\r\n第二十一条 停学以一学年为单位。每次停学不得跨学年。学生在校期间停学最多不能超过两次，即不能超过两年。第一次停学到期，允许再连续停学一学年，但必须第二次提出申请。\r\n\r\n第二十二条 经学校批准停学的学生，不得参加各教学环节的学习和考试，若私自参加考试，成绩不予登记。停学期间只保留学籍，不享受在校生和休学学生的待遇。触及法律时，由本人承担全部责任。\r\n\r\n第二十三条 大额欠费未能注册、且未办理停学手续者，以及保留学籍期满不办理复学手续者，视为旷课，并根据情节予以相应的纪律或学籍处理，直至按自动退学处理。在交清所欠学费后，发放肄业证书。\r\n\r\n第二十四条 申请停学的时间与新学年交纳学习费用和报到注册的时间相同。\r\n\r\n第二十五条 欠费停学学生停学期满后，必须先行处理欠费，方可申请复学。对符合复学条件的学生，由学生本人写出书面申请，所在院（系）、部同意，财务处签字盖章后，编入下一年级的相同专业学习。\r\n\r\n第二十六条 一般欠费的学生参加考试后，教务处不登记该生的成绩，学费交请后再进行登记。\r\n\r\n第二十七条 毕业学生欠交学费时，不得毕业。校有关部门不办理欠费学生的毕业手续。\r\n\r\n第二十八条 欠费的学生从学校提供的勤工俭学岗位和其它奖励等方面获得的收入，应首先冲抵本人所欠的学费。\r\n\r\n第五章 附  则\r\n\r\n第二十九条 本条例由财务处、教务处负责解释。\r\n\r\n第三十条 本条例自发布之日起实施。', '本科生');
INSERT INTO `train_system` VALUES ('1002', '西安科技大学课程补考、重修管理条例（修订稿）', '2011-11-09 22:40:00', '第一章  课程补考、重修规定\r\n\r\n第一条  每学期教学计划规定的课程，学生考核不合格时参加补考，补考后仍不及格的学生参加重修。实践性教学环节考核不合格必须参加下一年级相同专业重修。重修合格后方可获得该门课程学分。\r\n\r\n第二条  经考核不合格的课程应按教务处规定时间及时参加补考，对未按时参加补考的课程必须在相同学期参加重修学习和考试。\r\n\r\n第三条  对重修后仍未及格的课程，必须在毕业前最后一学期参加重修后方可考试。\r\n\r\n \r\n\r\n第二章  补考、重修办理程序\r\n\r\n第四条  每学期开课前一周，由教务处将参加补考学生名单下发各院系、部，各院、系、部组织学生到教务处办理补考手续。\r\n\r\n第五条  教务处在小学期开始前一周统计本学年须参加重修学习的学生名单和课程，并下发到各院、系、部、财务处。各院、系、部通知学生到财务处缴纳相关学习费用并办理重修手续。\r\n\r\n \r\n\r\n第三章   补考、重修安排\r\n\r\n第六条  补考考试在开学前一周内开始进行。\r\n\r\n第七条  基础课和专业基础课参加重修的学生人数达到30人以上，专业课参加重修的学生人数达到15人以上，单独组班，按重修计划在小学期内开班。重修课程结束后，由教务处组织学生参加考试。\r\n\r\n第八条  参加重修的人数达不到第七条规定的人数时，学生重修课程可随其它班级听课或自学重修。\r\n\r\n第九条  单独组班重修课程的授课学时，一般取计划学时的百分之六十，教师应按教学大纲要求讲授。\r\n\r\n第十条  学生重修课程必须按规定完成作业、实验、实习等教学环节所包含的内容。重修课程的作业，任课教师必须全收全改，并作好记录。\r\n\r\n第十一条  重修班的学生应严格遵守学校的考勤纪律规定，不能随意缺课，缺课三分之一时，不能参加重修考试，按旷考处理。\r\n\r\n \r\n\r\n第四章  补考、重修课程的考核\r\n\r\n第十二条  教学计划规定的考试课程，教研室（授课教师）根据课程考试大纲命A、B、C、D四套试题，其中任抽两套作为补考、重修考试试题。教学计划规定的考查课程补考和重修的考试试卷，由各院、系、部组织命题小组按考试大纲要求单独命题（对有试题库的课程应利用试题库命题），不得使用相同年级期末考试试卷。\r\n\r\n第十三条  补考、重修考试阅卷，由院、系、部组织2位以上教师阅卷，全校性公共基础课应采用流水作业方式阅卷。成绩送交时必须由各院、系、部主管教学主任复查签字，重考、重修试卷保存三年，以备核查。\r\n\r\n第十四条  重修课程考核时，如因学生外出实习等原因无法参加考核，应提前向院、系、部提出申请，报教务处批准。由教务处和院、系、部协商另行安排。\r\n\r\n第十五条  每学期缓考的学生，应与最临近一次补考课程的学生同堂同卷考试，届时不参加者按旷考论处。\r\n\r\n   \r\n\r\n第五章  补考、重修的成绩记载与学籍处理\r\n\r\n第十六条  补考考试成绩按卷面成绩记入学籍管理系统（注补考字样），重修考试成绩按学籍管理条例第二章第八条计算总评成绩。多次重修的成绩，取最高分记入学籍管理系统（注重修字样）。\r\n\r\n第十七条  对不按时参加重修的学生，各学期遗留课程的学分累计相加，按学籍管理条例相关条款处理。\r\n\r\n第十八条  学生到毕业时，所得学分少于培养计划规定的总学分，可延长学习期限一年或作结业处理。\r\n\r\n \r\n\r\n第六章  附  则\r\n\r\n第十九条  本条例未尽事宜，由教务处负责解释。', '本科生');
INSERT INTO `train_system` VALUES ('1003', '西安科技大学学生出国（境）的审批办法', '2011-11-09 22:38:00', '根据教育部外留[2003]1号《教育部关于简化大专以上学历人员自费出国留学审批手续的通知》精神，结合西安科技大学学生管理的有关规定，制定本办法。\r\n\r\n一、本办法所指学生包括：通过考试统招的在读研究生、通过全国高考入学的在读本科生、专科生。\r\n\r\n二、学生出国（境）的审批程序\r\n\r\n1、申请自费出国的学生写出书面申请并请家长签字，本科生或专科生留学申请人到教务处领取《西安科技大学本、专科（高职）学生出国（境）申请表》，研究生在研究生出领取。\r\n\r\n2、申请出国（境）学生将书面申请递交所在院（系、部），留学申请人应附填写好的“申请表”和国外学校的入学通知书等有关证明文件。经审核，在确保申请出国（境）的学生无未完结的协议责任或民事纠纷、无犯罪记录、无学费拖欠的情况下，院（系、部）签署意见并加盖院（系、部）公章。\r\n\r\n3、委托培养或享受定向奖学金的学生按学生与定向单位协议办理。\r\n\r\n4、申请出国（境）的本科生、专科生将院（系、部）审核签字盖章的申请文书和上述文件递交学生工作处、教务处审核，研究生交研究生部。\r\n\r\n5、主管外事工作的校领导批准。\r\n\r\n三、申请出国留学的学生在获得签证后应办理离校手续，符合肄业条件的可申领肄业证书，短期探亲访友、旅游者则不需办理离校手续。\r\n\r\n四、学生在申办出国（境）手续的过程中应按时注册上课，无故旷课的将按学籍管理规定处理。\r\n\r\n五、凡个人联系经学校批准并办理完离校手续的自费出国留学的学生，有意保留学记者应在教务处或研究生部办理学籍保留手续，自办理离校之日起可保留学籍一年。学生出国（境）期间的学籍保留应按规定交学籍保留费。通过校际合作项目出国留学的学生起学籍按在册学生管理。\r\n\r\n六、申请出国探亲访友、旅游的学生，学校不予办理在校学习成绩单以及与探亲访友等无关的其它证明材料。\r\n\r\n七、出国探亲访友、旅游的学生应按期返校，逾期不返者按旷课论，由学生所在院（系、部）上报教务处、研究生处，按学籍管理有关规定进行处理。\r\n\r\n八、学生出国（境）期间一切责任自负。\r\n\r\n九、本办法自2003年12月1日起执行，由校办负责解释。学校以往发布的有关学生办理出国（境）的审批办法停止执行。', '本科生');
INSERT INTO `train_system` VALUES ('1004', '西安科技大学学术道德行为规范', '2011-11-22 19:24:00', '第一条 为了维护学术道德，规范学术行为,净化学术风气，保护知识产权，崇尚诚实劳动，鼓励科技创新，根据《中华人民共和国著作权法》、《中华人民共和国专利法》、《中华人民共和国商标法》、《中华人民共和国合同法》等相关法律法规及教育部《关于加强学术道德建设的若干意见》，结合学校实际制定本规范。\r\n第二条 本规范适用于以西安科技大学名义从事学术活动的所有人员。\r\n第三条 学术道德行为规范。\r\n1. 倡导实事求是的科学精神。在数据采集分析和科研成果公布等过程中保证资料真实性、有效性和准确性。\r\n2. 遵守知识产权法律法规。按照知识产权法要求及学校各类项目管理办法，在学术活动中自觉维护学校声誉和利益，反对各种形式的不正当学术行为。学术研究中涉及他人成果时，要充分尊重其知识产权。专利申请中应严格区分职务发明与非职务发明的界限，学术论著中使用他人研究成果必须注明原文出处，引用他人成果的部分不能作为自己成果的核心内容，申报科研项目与科研奖励等活动中，需要使用他人成果时，须征得他人同意。\r\n3. 遵守公正原则。对竞争者和合作者做出的贡献应给予恰当认同与评价；对研究成果中的错误和失误，应以适当方式予以承认；不得以各种不正当手段妨碍竞争对手的学术工作。\r\n4. 遵守公开原则和保密规定。必须在保守国家机密和保护知识产权前提下公开科研过程和结果的相关信息。教职员工在岗、学生在读期间不得故意隐匿重要科研成果和科学发现。取得的一切成果必须以西安科技大学名义发表、发布，因合作研究需要以合作单位名义发表、发布的须征得学校同意。\r\n5. 遵守声明与回避原则。在研究、调查、出版、向媒体发布、提供材料、资助申请、鉴定验收、评奖、聘用和提职等活动中可能发生利益关系时，有关人员应声明与其有直接、间接和潜在利益关系的组织和个人，必要时应当回避。\r\n6. 避免学术浮夸。坚持严谨、科学、自律的治学态度，反对投机取巧、粗制滥造、盲目追求数量而忽视质量、虚报科研成果的浮夸作风和欺骗行为。\r\n7. 遵守学术成果发表和署名规范。学术成果的发表及发布应通过正常渠道；学术论文正式发表后，若需二次发表必须征得原载体同意并注明。合作成果署名应按贡献大小确定顺序，未参与工作者不得署名，所有署名人应对其完成部分负责，成果主持人应对成果整体负责。\r\n第四条 有下列行为之一者视为违反学术道德行为规范。\r\n1．教职员工违反学术道德行为规范的表现。\r\n（1）在公开发表的成果中，未标明引用他人研究成果及出处，或所引用部分构成了自己研究成果的主要部分或实质部分。\r\n（2）侵占、抄袭他人已发表或未发表的研究成果；剽窃他人学术观点、学术思想；雇用、代替他人撰写论文。\r\n（3）在填报有关学术成果表格时提供虚假学术成果、虚报学术经历、伪造专家鉴定意见、伪造证书或其他证明学术能力的材料。\r\n（4）为得出某种符合自己主观愿望的结论而捏造、篡改研究成果、实验数据或引用的资料。\r\n（5）通过不正当手段更换署名、改动署名顺序，或未经他人同意将合作研究成果仅以个人署名发表。\r\n（6）故意夸大研究成果的学术价值、经济价值和社会影响且造成不良后果。\r\n（7）在参与各种推荐、专利申请、项目评审、成果评奖、鉴定验收、论文答辩、职称评定等学术评审活动中，弄虚作假，或故意对他人进行虚假评价而影响评审结果。\r\n（8）违反国家有关保密的法律、法规或学校有关保密的规定，将应保密学术事项对外泄露。\r\n（9）其他违背学术界公认的学术道德行为与表现。\r\n2．学生违反学术道德与学术行为规范的表现。\r\n（1）捏造、篡改研究成果、实验数据或引用资料。\r\n（2）剽窃、抄袭他人研究成果。\r\n（3）在提供答辩的学位论文和公开发表的成果中，不加注明的使用他人成果；将他人学术观点、学术思想改头换面据为己有；直接袭用他人的成果构架与文字。\r\n（4）雇用或代替他人撰写论文。\r\n（5）在填写有关个人学术成果时，虚报学术经历、学术成果；提供伪造的导师或专家签名、鉴定、证书及其他学术能力证明材料。\r\n（6）未经指导教师或任课教师许可，擅自将老师讲义、课堂记录或属集体的实验结果署名发表。\r\n（7）未参加实际研究，在别人发表的成果上署名；未经他人同意，签署他人姓名；未经项目负责人同意标注资助基金项目等。\r\n（8）违反国家有关保密的法律、法规或学校有关保密的规定，将应保密的学术内容对外泄露或公开宣布。\r\n（9）其他违背学术界公认的学术道德规范的行为与表现。\r\n第五条 违反学术道德行为规范的惩戒措施。\r\n1．对违反学术道德行为规范的教职员工，学校将视情节轻重给予相应处理。\r\n（1）凡有第四条第（一）款表现之一者，在组织和人事任用、职称评审和岗位聘用中实行一票否决，并追回、取消或建议取消由此行为取得的一切利益、荣誉和资格。\r\n（2）凡有第四条第（一）款表现之一者，依情节轻重给予相应处分。\r\n2．对违反学术道德行为规范的学生，学校将视情节轻重给予相应处理。同时，将根据情节追究指导教师责任。\r\n（1）凡有第四条第（二）款表现之一者，在校期间，均不得参加各类奖励评定；毕业离校后被发现的，依情节给予相应的追加处分，并视情况通报所在单位。\r\n（2）凡撰写的学位论文有弄虚作假、剽窃行为者，学校不授予学位，已经授予学位的，取消已授学位。\r\n（3）凡有第四条第（二）款表现之一者，依情节轻重给予相应处分。\r\n第六条 举报和投诉。校学术委员会负责受理学术道德行为问题的举报和投诉。校学术委员会办公室在受理举报过程中，采取必要措施，保护举报人和证人。\r\n第七条 处理程序。\r\n1. 校学术委员会负责对违反学术道德行为规范问题的调查与审议，对存在违反学术道德行为规范者，建议学校给予当事人相应处理。\r\n2. 对于审议结果有异议者，须在接到审议结果3日内向校学术委员会提出复议，校学术委员会复议结果为最终裁定结果。\r\n3. 学校根据校学术委员会的处理建议或最终裁定结果，对当事人作出最终处理。\r\n第八条 本规范由校学术委员会负责解释。\r\n第九条 本规范自公布之日起执行。', '研究生');
INSERT INTO `train_system` VALUES ('1005', '西安科技大学研究生学位论文规范', '2011-11-22 19:23:00', '为适应我国社会主义现代化建设的需要，培养社会主义市场经济所需的高层次人才，不断提高我校研究生学位论文质量，特制定本规范。\r\n\r\n一、学位论文用字、打印、用纸\r\n\r\n（1）学位论文用纸一律为A4纸。\r\n\r\n（2）论文打印要求加页眉，在每一页的最上方，用5号楷体，居中排列，页眉之下双划线。页眉应写章次及章标题，页码写在页脚居中。\r\n\r\n（3）论文要求打印。汉字一律使用规范的简化字，不得使用不合规定的繁体字、简化字、复合字、异体字或自造汉字。论文正文用小四号宋体字。文内标题采用3级标注，即1，1.1，1.1.1。\r\n\r\n（4）论文版芯要求：每页页边距上边35 mm，下边30mm；左、右留边25mm。每页字数为34（行）×38（字）；页眉为25mm；页脚为20mm。\r\n\r\n二、论文顺序和装订\r\n\r\n论文顺序依次为：封面、中文摘要、英文摘要、目录、主要符号表、正文、结论、致谢、参考文献、附录、攻读学位期间发表的论文、专利、获奖及社会评价情况。主要符号表和附录可按需列入。\r\n\r\n博士学位论文装订20本，评阅、答辩12本，导师1本，研究生2本，交研究生学院学位办5本。\r\n\r\n硕士学位论文装订8本：评阅人2本，导师1本，研究生1本，交研究生学院学位办4本。\r\n\r\n装订后论文规格206mm×293mm。\r\n\r\n三、学位论文前置部分\r\n\r\n前置部分包括封面、中文摘要、英文摘要、目录及主要符号表。\r\n\r\n3.1封面\r\n\r\n按国家规定的格式由研究生学院统一印制。\r\n\r\n密级：秘密、机密、绝密。\r\n\r\n分类号：按学科类别，利用《中国图书资料分类法》确定论文的分类号。\r\n\r\n论文题目：中文（包括副标题和标点符号）不超过20字；英文为中文标题的正确译文。\r\n\r\n指导老师：为招生时所确定的导师（或经研究生学院同意更换的导师）姓名及职称、协助指导的导师不填。\r\n\r\n学科门类：填“法学”、“理学”、“工学”、“管理学”、“经济学”。\r\n\r\n3.2摘要\r\n\r\n3.2.1中文摘要\r\n\r\n在论文的第一页，简要说明研究工作的目的、方法、成果和结论，重点说明本论文的成果和新见解。中文摘要字数为500～1000字左右。中文摘要中除个别英文缩写外，一律用汉字写成，不得出现公式、图、表和参考文献等。\r\n\r\n3.2.2英文摘要\r\n\r\n（1）用词应准确，使用本学科通用的词汇；\r\n\r\n（2）关键词按相应专业的标准术语写出；\r\n\r\n（3）中、英文摘要的内容一致。\r\n\r\n3.2.3学位论文中英文摘要排版要求\r\n\r\n（1）学位论文中文、英文摘要不加页眉和页脚，不标页码；\r\n\r\n（2）版心与正文要求相同；\r\n\r\n（3）中文摘要排版要求：\r\n\r\n（以下标题和内容为四号黑体，1.5倍行距）\r\n\r\n论文题目：\r\n\r\n专 业：\r\n\r\n硕士生：×××(签名)\r\n\r\n指导教师：×××(签名)\r\n\r\n\r\n摘 要\r\n\r\n……（摘要正文部分采用小四号宋体字，单倍行距。）\r\n\r\n（以下标题为小四号黑体，1.5倍行距，内容为小四号宋体）\r\n\r\n关键词：\r\n\r\n研究类型：\r\n\r\n（4）英文摘要排版要求：\r\n\r\n①英文摘要字体采用Times New Roman\r\n\r\n②英文摘要排版要求如下：\r\n\r\n（以下标题和内容为四号字体加黑，1.5倍行距）\r\n\r\nSubject ：\r\n\r\nSpecialty：\r\n\r\nName ：×××（Signature）\r\n\r\nInstructor：×××（Signature）\r\n\r\n\r\nABSTRACT\r\n\r\n……（英文摘要内容采用小四号字体，单倍行距。）\r\n\r\n（以下标题为四号加黑，内容为小四号字体，1.5倍行距）\r\n\r\nKey words：\r\n\r\nThesis ：\r\n\r\n3.3关键词\r\n\r\n（1）关键词应选取能反映论文主体内容的词或词组，每篇选取3～8个。\r\n\r\n（2）关键词应尽可能从《汉语主题词表》中选取，新学科的重要术语也可选用。\r\n\r\n（3）中外文关键词应一一对应，分别排在中外文摘要下方。\r\n\r\n论文的类型，论文类型分理论研究、应用研究、用于生产、其它四种，作者根据自己的工作，选择一种。\r\n\r\n3.4目录\r\n\r\n（1）目录中章、节号均使用阿拉伯数字，如章为1，分层次序为1.1及1.1.1等3个层次。章为小四号黑体字，节为小四号宋体字；\r\n\r\n（2）目录中章节应有页号，页号从正文开始至全文结束；\r\n\r\n（3）目录页号另编，并加页眉。\r\n\r\n3.5主要符号表\r\n\r\n（1）全文中常用的符号及意义在主要符号表中列出；\r\n\r\n（2）符号排列顺序按英文其它相关文字顺序排出；\r\n\r\n（3）主要符号表页号另编，并加页眉。\r\n\r\n四、学位论文主体部分\r\n\r\n主体部分包括绪论（引言、前言）、正文、结论、致谢及参考文献。\r\n\r\n主体部分层次格式：\r\n\r\n1 X X X（三号黑体、三倍行距）......（居中排）章节层次\r\n\r\n1.1 XXX（四号黑体、二倍行距）......（不接排） 节级层次\r\n\r\n1.1.1 XXX（四号楷体、二倍行距）......（不接排）\r\n\r\n(1)XXX(小四号宋体)XX（接排） 条款层次\r\n\r\n①XXX(小四号宋体)XX（接排）\r\n\r\n硕士学位论文为3～5万字，博士学位论文为7～10万字（含图表）。\r\n\r\n4.1绪论\r\n\r\n绪论应简要说明研究工作的目的、范围、相关领域的前人工作和知识空白、理论基础和分析、研究设想、研究方法和实验设计，预期结果和意义等。应言简意赅，不要与摘要雷同，不要成为摘要的诠释。一般教科书中有的知识，在绪论中不必赘述。\r\n\r\n4.2正文\r\n\r\n学位论文的正文是核心部分，占主要篇幅，包括理论分析、数据资料、实验方法、仪器设备、材料原料、实验结果、现场试验与观测，以及图表，形成的论点和结论。\r\n\r\n由于研究工作涉及的学科、选题、研究方法有很大的差异，对正文内容不能作统一的规定。但是，必须实事求是，客观真实，合乎逻辑，层次分明。论文不得模糊研究生与他人的工作界限，参考或引用了他人的学术成果或学术观点，必须在引用处注出参考文献序号，严禁抄袭、占有他人的成果。\r\n\r\n4.3结论\r\n\r\n结论是最终和总体的结论，不是正文中各段的小结的简单重复。结论应该准确、完整、明确、精炼。语句不能模棱两可，含糊其词。\r\n\r\n可以在结论中提出建议、研究设想、仪器设备改进意见，尚待解决的问题等。\r\n\r\n4.4致谢\r\n\r\n可以在正文后对下列方面致谢：\r\n\r\n（1）指导教师；\r\n\r\n（2）国家科学基金、合同单位、资助或支持的企业、组织或个人；\r\n\r\n（3）协助完成研究工作和提供便利条件的组织或个人；\r\n\r\n（4）在研究中提出建议和提供帮助的人。\r\n\r\n谢词谦虚诚恳，实事求是。\r\n\r\n4.5参考文献\r\n\r\n4.5.1一般要求\r\n\r\n（1）参考文献一般应是作者直接阅读过的对学位论文有参考价值的发表在正式出版物上的文献，除特殊情况外，一般不应间接使用参考文献；\r\n\r\n（2）参考文献应具有权威性，要注意应用最新的文献；\r\n\r\n（3）引用他人的学术观点或学术成果，必须列在参考文献中；\r\n\r\n（4）参考文献在整个论文中按出现的次序列出；\r\n\r\n（5）参考文献的数量\r\n\r\n博士学位论文参考文献一般约在80～100篇，其中外文参考文献应在30篇以上；\r\n\r\n硕士学位论文参考文献一般约在30～50篇，其中外文参考文献应在10篇左右；\r\n\r\n4.5.2参考文献的著录格式\r\n\r\n严格按下列6类文献的著录实例进行著录\r\n\r\n[1]杨更社.节理岩体损伤与分形几何的关系.西安矿业学院学报, 1995, 15 (4): 294～296\r\n\r\n[2]潘国斌等.拆除爆破与特种爆破.西安:西安地图出版社, 1997. 203～205\r\n\r\n[3]田水承.运用系统工程的观点和方法努力认识采场煤自燃环境特征.见:周文安编.全国煤矿系统工程学术会议文集.泰安:山东出版社泰安分社, 1992. 102～107\r\n\r\n[4]任建喜.基于数值分析的岩石地下工程支护决策专定系统的研究: [学位论文].西安:西安矿业学院, 1993\r\n\r\n[5]茅兴富.气体碳氮共渗钢锯条最佳锯切性能研究.中国专利, 971056073. 1997-07-20\r\n\r\n[6]全国文献工作标准化技术委员会第六分会. GB6447-86文献编写规则.北京:中国标准出版社, 1986\r\n\r\n4.6论文的插图、表格、公式\r\n\r\n（1）插图\r\n\r\n①所有插图按分章编号，如第1章，第3张图为“图1.3”，所有插图均需有图题（图的说明），图号及图题应在图的下方5号宋体居中标出；\r\n\r\n②一幅图如有若干分图，均应编分图号，用（a），（b），（c）．．．．．．按顺序编排；\r\n\r\n③插图须紧跟文述。在正文中，一般应先见图号及图的内容后再见图，一般情况下不能提前见图，特殊情况需延后的插图不应跨节；\r\n\r\n④图形符号及各种线型画法须按现行的国家标准；\r\n\r\n⑤坐标图中坐标上须注明标度值，并标明坐标轴所表示的物理量名称及量纲（沿坐标轴指向顺序标出），应按国际标准（SI）标注，例如：kw，m/s，N.m等；\r\n\r\n⑥提供照片应大小适宜，主题明确，层次清楚，照片一定要有放大倍数；\r\n\r\n⑦图应具有“自明性”，即只看图、图题和图例，不阅读正文，就可理解图意；\r\n\r\n⑧插图中须完整标注条件，如实验条件、结构参数等；\r\n\r\n⑨图中用字最小为5号字；\r\n\r\n⑩使用他人插图须注明出处。\r\n\r\n（2）表格\r\n\r\n①表格应按章编号，如表2.1，并需有表题（表的说明），表格应为三线表（特殊情况例外）。表内同一栏的数字必须上下对齐。表内不宜用“同上”、“同右”、“//”和类似词，一律填入具体数字或文字。表内“空白”代表未测或无此项；\r\n\r\n②表号标题（5号宋体加黑）应从表格上居中排列；\r\n\r\n③表格的设计应紧跟文述。若为大表或作为工具使用的表格，可作为附表在附录中给出；\r\n\r\n④表中各物理量及量纲均按国际标准（SI）及国家规定的符号和法定计量单位标注；\r\n\r\n⑤使用他人表格须注明出处。\r\n\r\n（3）数学、物理和化学式\r\n\r\n①公式均需有公式号；\r\n\r\n②公式号按章编排，如式（2.3），公式居中，编号右对齐；\r\n\r\n③公式中各物理量及量纲均按国家标准（SI）及国家规定的法定符号和法定计量单位标注，禁止使用已废弃的符号和计量单位；\r\n\r\n④公式中用字、符号、字体要符合科学规范。较长的公式，转行时居中排列，转行只能在+、－、*、/处，上下式尽可能在等号“=”处对齐。\r\n\r\n五、附录部分\r\n\r\n附录是作为论文主体的补充项目，并不是必须的。\r\n\r\n5.1附录\r\n\r\n附录的内容包括：\r\n\r\n（1）正文中过长的公式推导与证明过程可在附录中依次给出；\r\n\r\n（2）与本文紧密相关的非作者自己的分析，证明及工具用表格等；\r\n\r\n（3）在正文中无列出的实验数据。\r\n\r\n5.2攻读学位期间所发表的论文、专利、获奖及社会评价\r\n\r\n在学位论文的最后，应附上研究生本人在攻读学位期间所发表的论文（写法同参考文献），获得的专利、获奖、鉴定及工程实践的社会评价及有关资料（一般只写目录清单即可）。\r\n\r\n六、学位论文详细摘要\r\n\r\n学位论文详细摘要仅要求硕士研究生撰写。\r\n\r\n学位论文详细摘要可供答辩委员会成员和出版学位论文摘要汇编时使用。\r\n\r\n详细摘要应具有独立性和自含性，应能概括论文的要点和主要结论，充分反映论文的研究成果和价值。这种摘要应控制在5000字左右，它实际上是硕士学位论文的缩影。包括以下内容：\r\n\r\n（1）从事研究工作的目的和重要性；\r\n\r\n（2）研究内容和过程的概括性叙述；\r\n\r\n（3）获得的主要结论，论文的新见解中，这是本摘要的中心内容；\r\n\r\n（4）必要的少量图表；\r\n\r\n（5）结论的意义。\r\n\r\n七、本规范自发布之日起实施，解释权归研究生学院。', '研究生');
INSERT INTO `train_system` VALUES ('1006', '西安科技大学研究生优秀学位论文评选办法', '2011-11-22 19:22:00', '研究生学位论文的质量是衡量研究生教育水平的重要标志之一。为了进一步提高我校博士、硕士学位论文质量，鼓励研究生及其导师积极探索，不断创新，为科技进步和社会发展做出贡献，特设立研究生优秀学位论文奖。\r\n\r\n一、评选原则\r\n\r\n（一）凡在我校获得博士学位后两年内、获得硕士学位后一年内（从获得学位之日算起），均有资格申报。\r\n\r\n（二）评选工作遵循科学公正、注重创新、坚持标准、宁缺勿滥的原则。\r\n\r\n（三）评选工作每年进行一次。\r\n\r\n（四）每年评选优秀博士学位论文、优秀硕士学位论文数量均为当年毕业研究生的5%左右。\r\n\r\n二、评选标准\r\n\r\n根据《中华人民共和国学位条例暂行实施办法》中对博士、硕士学位论文的要求，提出评选标准。\r\n\r\n（一）优秀博士学位论文评审标准\r\n\r\n1、选题为本学科前沿，具有开创性，具有较大的理论意义和实用价值，研究方向明确。\r\n\r\n2、在理论或方法上有创新，对本学科的发展具有重要作用。\r\n\r\n3、取得创造性成果，具有较大的社会效益和经济效益。\r\n\r\n4、学习年限为3～5年，原则上不超过6年。\r\n\r\n5、具有良好的社会评价。申请者从攻读博士学位开始到获得学位后两年内，应以第一作者或第二作者（导师为第一作者）身份至少在国内外重要刊物上发表与其学位论文有关的学术论文5篇，且满足下列条件之一：\r\n\r\n（1）至少有2篇公开发表的学术论文用外文撰写，并有2篇被SCI收录或有4篇被EI、ISTP收录。\r\n\r\n（2）获得与学位论文有关的国家级科技奖，本人持有获奖证书；或获得省级科技奖，本人排列前三名，并有1篇被SCI收录或有2篇被EI、ISTP收录。\r\n\r\n6、论文表达准确，书写规范，推理严密，层次分明，体现出作者严谨的学风，坚实宽广的理论基础与系统深入的专门知识，很强的独立从事科学研究的能力。\r\n\r\n7、申报优秀的博士学位论文答辩成绩应为良好及以上，均需为研究生学院负责双盲送审，且成绩均为80分及以上。\r\n\r\n（二）优秀硕士学位论文评审标准\r\n\r\n1、选题为本学科前沿或紧密结合生产实际，具有较大的理论意义和实用价值，研究方向明确。\r\n\r\n2、对所研究的课题有新的见解。\r\n\r\n3、取得了一定的成果，具有一定的社会效益和经济效益。\r\n\r\n4、应届毕业生学习年限应为2.5～3年，原则上不超过3年。\r\n\r\n5、具有良好的社会评价。申请者从攻读硕士学位开始到申请优秀硕士论文截至，必须取得下列成果之一：\r\n\r\n（1）以第一作者或第二作者（导师为第一作者）身份在国际学术期刊和国内核心期刊上发表与其学位论文有关的学术论文，其中应届生要求发表1篇，往届生要求发表2篇；\r\n\r\n（2）以第一作者或第二作者（导师为第一作者）身份公开发表1篇与其学位论文有关的学术论文，并被SCI、EI、ISTP收录；\r\n\r\n（3）获得与其学位论文相关的省级及以上科技进步三等奖及以上科研成果奖，本人持有获奖证书；\r\n\r\n（4）获得与其学位论文相关的厅局级科技进步三等奖及以上科研成果奖，本人排列前三名。\r\n\r\n6、论文表达准确，书写规范，推理严密，层次分明，体现出作者严谨的学风，坚实的理论基础与系统的专门知识，较强的从事科学研究工作或独立担负专门技术工作的能力。\r\n\r\n7、申报优秀硕士学位论文者，其学位课成绩和答辩成绩均为良好及以上，学位论文送审为由研究生学院或者学院组织的双盲送审，且成绩均为80分及以上。\r\n\r\n三、评选程序\r\n\r\n（一）学位论文作者经导师同意后，向所在学院提出申请；\r\n\r\n（二）学院对申请者的学位论文及其成果进行形式审核；\r\n\r\n（三）形式审核通过后，填写研究生优秀学位论文评审表；\r\n\r\n（四）硕士学位论文须由两位硕士研究生导师专家推荐，博士学位论文须由两位博士研究生导师推荐；\r\n\r\n（五）学院学位分委员会审查并签署意见，同时递交以下材料：\r\n\r\n1、研究生优秀学位论文评审表；\r\n\r\n2、专家推荐书；\r\n\r\n3、学位论文1份；\r\n\r\n4、与学位论文相关的社会评价材料，包括公开发表的论文、获奖、专利、应用证明等。\r\n\r\n（六）校学位委员会评审。由校学位评定委员会主持，研究生学院负责组织进行。\r\n\r\n四、奖励办法\r\n\r\n（一）学校设立优秀博士、硕士学位论文基金，对评选为优秀学位论文的研究生及其导师给予奖励并颁发荣誉证书。优秀博士学位论文奖金5000元，优秀硕士学位论文奖金1000元，奖金分配为导师和学生各50%。\r\n\r\n（二）学校优秀博士学位论文可以推荐参加陕西省和国家优秀博士学位论文评选，被省上推荐参加国家优秀博士学位论文评选或获得国家优秀博士学位论文，另行奖励。\r\n\r\n五、异议与批准\r\n\r\n（一）为了保证评选结果的公正性，设立为期2周的异议期，异议期从评审结果公布之日算起。\r\n\r\n（二）异议期结束后，由学校批准优秀学位论文获得者名单。\r\n\r\n（三）对已获准的优秀学位论文，一经发现剽窃、作假或论文的主要研究结论不能成立等严重问题，撤销其称号及奖励，并予以公布。\r\n\r\n六、其他\r\n\r\n（一）本办法从二〇〇九年九月一日起执行。\r\n\r\n（二）本办法由研究生学院负责解释。', '研究生');

-- ----------------------------
-- Table structure for train_tutor
-- ----------------------------
DROP TABLE IF EXISTS `train_tutor`;
CREATE TABLE `train_tutor` (
  `train_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '导师编号',
  `train_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `hiredate` datetime DEFAULT NULL COMMENT '任职时间',
  `job` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工作',
  `photo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '照片',
  `brief` text,
  `remark` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `subject` varchar(20) DEFAULT NULL COMMENT '专业',
  PRIMARY KEY (`train_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_tutor
-- ----------------------------
INSERT INTO `train_tutor` VALUES ('1001', '张慧梅', '2017-05-08 10:59:00', '教授', '../static/imgs/train/tutor/zhanghuimei.jpg', '1.个人简介\r\n\r\n张慧梅，女，1968年12月出生，工学博士，教授，博士生导师。1990年7月毕业于西安公路交通大学工程力学专业，获工学学士学位；2010年毕业于西安科技大学安全技术及工程专业，获工学博士学位。从事力学及岩土工程方面的研究工作。现任陕西省力学学会理事会理事，西安科技大学力学系主任，固体力学学科带头人，工程力学专业省级教学团队主要成员。\r\n\r\n2.论文、论著\r\n\r\n[1]张慧梅,杨更社.冻融与荷载耦合作用下岩石损伤模型的研究,岩石力学与工程学报, 2010, 29(3):471~476.( EI收录)\r\n\r\n[2]张慧梅,杨更社.冻融荷载耦合作用下岩石损伤力学特性,工程力学学报, 2011, 28(5): 161~165.(EI收录)\r\n\r\n[3]张慧梅,杨更社.岩石冻融力学实验及损伤扩展特性,中国矿业大学学报, 2011, 40(1): 140~145. (EI收录)\r\n\r\n[4] Huimei Zhang, Yuan Liang, Chuangao Chen, Haibo Cao. Analysis on coupling of temperature field and stress field for tunnel surrounding rock in cold region, Advanced Materials Research, 2012, Vol.594-597: p2578~2581.(EI收录)\r\n\r\n[5]张慧梅,杨更社.冻融岩石损伤劣化及力学特性试验研究,煤炭学报, 2013, 38(10): 1756~1763.(EI收录)\r\n\r\n[6]张慧梅,杨更社.水分及冻融循环对红砂岩物理力学特性的影响,实验力学, 2013, 28(5): 635~641.\r\n\r\n[7] Huimei Zhang, Xiangmiao Xie, Gengshe Yang. The studies of rock damage softening Statistical constitutive model under true triaxial stress state, Applied Mechanics and Materials，2014, Vol.580-583:312~315. ( EI收录)\r\n\r\n[8]张慧梅,雷利娜,杨更社.温度与荷载作用下岩石损伤模型,岩石力学与工程学报, 2014, 33(S2): 3391~3396. ( EI收录)\r\n\r\n[9]张慧梅,雷利娜,杨更社.等围压条件下岩石本构模型及损伤特性,中国矿业大学学报, 2015, 44(1):59~63. ( EI收录)\r\n\r\n[10]张慧梅,谢祥妙,张蒙军，杨更社.真三轴应力状态下岩石损伤本构模型[J].力学与实践2015, 37(1):75~78\r\n\r\n3.项目\r\n\r\n（1）寒区冻融循环条件下受荷岩石的损伤力学特性研究，国家级，国家自然科学基金，55万，1/8，2012，结题\r\n\r\n（2）冻融循环条件下受荷岩石的损伤力学特性，省级，陕西省自然科学基金，3万，1/6，2012，结题\r\n\r\n（3）冻融与荷载作用下岩石损伤力学特性研究，厅级，陕西省教育厅专项基金，2万，1/6，2012，结题\r\n\r\n（4）西部寒区裂隙岩体冻融过程中水热力耦合研究，省级，陕西省自然科学基金，2万，1/6，2009，结题\r\n\r\n（5）寒区隧道岩体冻融过程中水热力耦合研究分析，厅级，陕西省教育厅专项基金，2万，1/6，2009，结题\r\n\r\n4.获奖\r\n\r\n（1）全国徐芝纶力学优秀教师奖，优秀教师，，中国力学学会，1/1，2015\r\n\r\n（2）冻融循环条件下受荷岩石的损伤力学特性，科学技术奖，二等奖，西安科技\r\n\r\n大学，1/5，2015\r\n\r\n（3）岩石冻融力学实验及损伤扩展特性，西安市第14届自然科学优秀学术论文，一等奖，西安市科学技术协会，1/2，2013\r\n\r\n（4）教学名师奖，教学名师，西安科技大学，1/1，2014\r\n\r\n（5）岩石冻融损伤力学特性及水热力耦合研究，优秀（博士）学位论文奖，西安科技大学，1/1，2011', '博导', '工程力学、固体力学');
INSERT INTO `train_tutor` VALUES ('1002', '李明', '2017-12-19 10:59:00', '教授', '../static/imgs/train/tutor/liming.jpg', '魏悦广，力学家，北京大学教授。1960年1月出生于陕西渭南，籍贯陕西渭南。1981年毕业于西安科技大学理学院，1986年毕业于中国矿业大学北京研究生部获硕士学位，1992年毕业于清华大学获博士学位。2017年当选为中国科学院院士。现任《力学学报》主编等。\r\n\r\n魏悦广院士主要从事跨尺度力学、弹塑性断裂力学、复合材料力学等研究。在国际上建立了协同考虑应变梯度和表界面效应的跨尺度力学理论；建立了可压缩应变梯度理论和适合应变梯度理论的有限元方法，并由此预测出金属的微尺度断裂强度高达其宏观屈服强度十倍以上的重要结论，突破了传统力学理论的预测极限，引起了国际上对于跨尺度力学的广泛研究。近年来，他将跨尺度力学理论成功应用于发动机叶片先进热障涂层强韧及破坏机制的表征。相关成果获国家自然科学二等奖两项和三等奖一项。\r\n\r\n2017年当选中国科学院院士。', '博导', '工程力学、固体力学');
INSERT INTO `train_tutor` VALUES ('1003', '金浩', '2020-05-27 09:52:00', '教授,博导', '../static/imgs/train/tutor/jinhao.jpg', '1. 个人简介\r\n\r\n金浩，1980年生，博士，教授，博导，陕西省“科技新星”，享受“三秦人才”津贴，校首届“胡杨人才工程”特聘教授。2017年留学美国北德克萨斯大学。\r\n\r\n主要从事能源经济与管理、非线性时间序列分析等方面的教学与研究工作。近年来，主持国家自然科学基金青年，面上各1项、中国博士后基金面上，特别资助各1项、陕西省科技厅基金3项、教育厅基金1项；有关科研成果获中国煤炭工业协会科学技术奖三等奖，陕西省优秀教学成果二等奖1项、中国煤炭教育协会优秀教学成果一等奖1项，陕西省高等学校科学技术一等奖1项、二等奖4项、三等奖1项；发表论文50余篇，其中被SCI、EI检索20余篇，他引次数达50余次，授权国家发明专利3项。\r\n\r\n2. 论文、著作\r\n\r\n[1] 金浩, 高奎, 基于Bootstrap方法的重尾相依序列均值变点 Ratio检验[J]. 统计与决策,2019(23):11-16.\r\n\r\n[2] Jin Hao, Zhang Si, Spurious regression between long memory series due to mis-specified structural break[J]. Communication in Statistics-Simulation & Computation, 2018,47(3): 692-711.\r\n\r\n[3] Jin Hao, Zhang Si, Zhang Jinsuo, Modified tests for change point in variance in the possible presence of mean breaks[J]. Journal of Statistical Computation and Simulation, 2018,88(14): 2651-2667.\r\n\r\n[4] Jin Hao, Zhang Si, Zhang Jinsuo, Bootstrap procedures for variance break test in time series with a changing trend[J]. Communication in Statistics-Theory & Method,2018,47(18): 4609-4627.\r\n\r\n[5] Jin Hao, Zhang Si, Zhang Jinsuo, Spurious regression due to the neglected of non-stationary volatility[J]. Computational Statistics, 2017,32(3): 1065-10811.\r\n\r\n[6] Jin Hao, Zhang Danshi, Zhang Jinsuo, Evidence of spurious regression driven by heavy tail observations with structural changes[J]. Communication in Statistics-Simulation &Computation, 2017,46(2): 1086-1101.\r\n\r\n[7] Jin Hao, Zhang Jinsuo, Zhang Si, The spurious regression of AR(p) infinite variance series in presence of structural break[J]. Computational Statistics and Data Analysis, 2013,67(4): 25-40.\r\n\r\n[8] Jin Hao, Zhang Jinsuo, Modified tests for variance changes in autoregressive regression[J]． Mathematics & Computers in Simulation,2011,81(6):1099–1109.\r\n\r\n[9] Jin Hao, Zhang Jinsuo, Subsampling tests for variance changes in presence of autoregressive parameter shifts[J]. Journal of Multivariate Analysis, 2010,101(10): 2255-2265.\r\n\r\n[10] Jin Hao, Zhang Jinsuo, Estimation mean change point in ARCH model with heavy tailed innovations[J]. Communications in Statistics-Simulation & Computation, 2010,39(2):390-404.\r\n\r\n\r\n', '博导', '数学');
INSERT INTO `train_tutor` VALUES ('1004', '丁正生', '2017-12-19 09:59:00', '教授', '../static/imgs/train/tutor/dingzhengsheng.jpg', null, '', '数学');
INSERT INTO `train_tutor` VALUES ('1005', '杨静', '2017-12-19 13:03:00', '博士', '../static/imgs/train/tutor/yangjing.jpg', '1.个人简介\r\n\r\n杨静，女，1987年11月出生于陕西商洛，中共党员，讲师。2010年7月自陕西师范大学物理系本科毕业，被保送到中国科学院高能物理研究所硕博连读，师从国内正电子技术著名专家王宝义和于润升研究员。博士期间获得博士研究生国家奖学金，被评为北京市优秀毕业生。2015年7月博士毕业，同年进入西安科技大学理学院工作至今。现为“微纳米技术及其先进材料”校级第一层次科技创新团队成员，是微纳米科学与智能技术实验室课题组研究成员，兼任中国物理学会陕西省物理学会分会会员和中国微米纳米学会会员。目前主要研究领域为压电功能材料及其微观机理、正电子湮没谱学技术等应用研究。目前主持和参与国家级自然科学基金课题4项，主持校级研究课题2项，发表SCI论文10余篇。主要承担微纳米加工技术实验、大学物理、大学物理实验等课程的教学工作。\r\n\r\n2.论文、论著（列出个人代表性著作，限10篇）：\r\n\r\n[1] Yang J, Zhang T, Han L A, et al. The ability of the Coincidence Doppler Broadening Spectroscopy to characterize polymers containing different chemical elements[J]. Spectrochimica Acta Part A:Molecular and Biomolecular Spectroscopy,177: 97-103，2017.（SCI）\r\n\r\n[2] Yang J, Zhang P, Cao X Z, et al.Positron irradiation effect on positronium formation in gamma-irradiated LDPE and unplasticized PVC[J]. Radiation Physics and Chemistry, 2017.（SCI）\r\n\r\n[3] Yang J, Li Z X, Zhao B Z, et al. Study of gamma irradiation effect on positron annihilation mechanism in PFA[J].Chemical Physics Letters, 597: 26-29,2014.（SCI）\r\n\r\n[4] Yang J, Zhang P, Lu E Y, et al. Depth profiles of the Doppler-broadening S parameter for polymers obtained with two measuring patterns: The role of accumulated charges[J]. Nuclear Instruments and Methods in Physics Research Section B: Beam Interactions with Materials and Atoms, 323: 71-74,2014.（SCI、EI）\r\n\r\n[5] Yang J, Zhang P, Cheng G D, et al. Depth-dependent positron annihilation in different polymers[J]. Applied Surface Science, 280: 109-112,2013.（SCI、EI）\r\n\r\n[6] Wang B Y, Yang J, Cao X Z, et al.Study of gamma irradiation effect on unplasticized PVC by positron annihilation[C]//Materials Science Forum. Trans Tech Publications, 2016.\r\n\r\n[7] Han L, Yang J, Yang H, et al.Structural and magnetocaloric properties of bilayered manganite Nd1.4Sr1.6Mn2O7[J]. Journal of Alloys and Compounds, 695: 1854-1858, 2017.（SCI、EI）\r\n\r\n[8] Han L, Yang J, Yang H P, et al. Critical Behavior of Amorphous Fe65 V 15 B 12Si8 Alloy Ribbon[J]. Journal of Superconductivity and Novel Magnetism, 29(7): 1917-1921,2016.（SCI、EI）\r\n\r\n[9] Han L, Yang J, Yang H, et al. Structure and Large Magnetic Entropy Change in Double-Layered Manganese Oxide Pr1. 4Sr1.6Mn2O7[J]. Journal of Superconductivity and Novel Magnetism, 30(1):209-214,2017.（SCI、EI）\r\n\r\n[10] Zeng M, Qi C, Yang J, et al. A highly efficient and stable palladium catalyst entrapped within the cross-linked chitosan membrane for Heck reactions[J]. Industrial & Engineering Chemistry Research, 53(24): 10041-10050,2014.（SCI、EI）\r\n\r\n3.项目\r\n\r\n（1）PZT基压电陶瓷准同型相界处微观缺陷演化及其对相变和电性能的影响研究，国家自然科学基金，国家自然科学基金委，23万，2017（主持）\r\n\r\n（2）低活化钢主体材料Fe9Cr合金中微观缺陷捕获氢同位素和氦行为研究，国家自然科学基金，国家自然科学基金委，23万，2016（参与）\r\n\r\n（3）辐照聚合物中正电子湮没机制的新型复合测量技术研究，国家自然科学基金，国家自然科学基金委，69万，2012（参与）\r\n\r\n（4）正电子湮没技术研究聚合物中电子偶素特性，博士启动金，西安科技大学，2万，2016（主持）\r\n\r\n（5）正电子湮没技术研究PMnN-PZ-PT陶瓷准同型相界附近优异性能起源，西安科技大学培育基金，西安科技大学，0.6万，2016（主持）', '', '物理学');
INSERT INTO `train_tutor` VALUES ('1006', '郭长立', '2020-06-01 13:06:00', '教授', '../static/imgs/train/tutor/guozhangli.jpg', '1. 个人简介\r\n\r\n郭长立，教授，1966年12月出生，1990年毕业于清华大学工程物理系，工学学士；主要研究方向光学理论及应用，教育部大学物理课程教学指导委员会西北地区分委员会委员，历任物理实验室主任（兼教研室副主任）、理学院副院长、教务处副处长、教师教学发展中心常务副主任。主持教育部教学指导委员会课题2项，主持陕西省教育厅项目4项，省高等教育学会重点项目1项，负责大学物理实验省级精品资源共享课程建设，参与国家自然科学基金项目2项，获省高教学会优秀教学科研成果奖二等奖2项，获中国煤炭教育协会优秀教学成果二等奖1项，优秀教材二等奖1项，获校优秀教学成果奖一等奖2项，二等奖2项，优秀教材二等奖1项。以第一发明人获得授权发明专利8项，实用新型专利7项。\r\n\r\n2. 论文、著作\r\n\r\n[1] 郭长立，冯小强，光学玻璃挠曲刚度的光学测量方法研究[J]. 光学技术（CSCD），2018，44（2）：231-236.\r\n\r\n[2]郭长立，杨曼，郭朝霞，王授全，杨易.基于光干涉法的光学玻璃应力测量方法研究[J].应用光学（CSCD），2015，36（6）：687-694.\r\n\r\n[3] 高峰，郭长立，落体法测刚体转动惯量的误差分析，力学与实践，2019, 41 (3): 345-348.  核心\r\n\r\n[4]郭长立.激光牛顿环现象分析及应用[J].实验室研究与探索，2011.30（6）：18-20。\r\n\r\n[5]郭长立.迈克尔逊干涉仪影响因素的测量不确定度分析[J].实验室研究与探索，2010.29（7）：37-40。\r\n\r\n[6]郭长立.李三庆，落体法测刚体转动惯量的测量方法比较[J].力学与实践，2005.27（3）：69-72。\r\n\r\n[7]郭长立，周国全，非接触式及嵌近切割式牛顿环仪工作原理[J].西安科技大学学报，2005.25(2):260,262\r\n\r\n[8] Changli Guo,Yanqing,Zhang,Optic Method to Measure the Density of Gas and the Analysis On Uncertainty of Measurement, Advanced Materials Research,2011\r\n\r\n[9]郭长立,孟全水，渊小春.大学物理实验[M].陕西西安：陕西科学技术出版社，2006.2。\r\n\r\n[10]郭长立，郝丽梅，王瑞平.西北工业大学出版社,2009.6\r\n\r\n3. 项目\r\n\r\n（1）钙钛矿锰氧化物/铁电体二维异质结构在应力作用下的界面耦合及光响应特性（11804272）,纵向，国家自然科学基金，10万，2/5，2018，在研\r\n\r\n（2）声表面波气体传感器气敏薄膜制备关键技术研究（2016GY-041），纵向，陕西省科技厅工业科技公关项目，10万，2/5，2016，在研\r\n\r\n（3）煤尘-瓦斯复合火焰巷道演变的动力学机理研究（2015JM1027），纵向，陕西省自然科学基金，2万，2/5，2015，在研\r\n\r\n（4）情感注入与物理美学相融合的物理类课程育人体系构建与实践（19BY059），省教育厅，4万，1/6，2019，在研\r\n\r\n（5）基于工程教育认证形势下的大学物理实验课程体系建设与改革研究，纵向，教育部高等学校大学物理学课程教学指导委员会，0.2万，2014，1/5，在研\r\n\r\n4. 获奖及专利\r\n\r\n获奖：\r\n\r\n（1）本科论文抄袭现象的思考与对策，陕西省高等教育学会，优秀教学成果，二等奖，陕西省高等教育学会，1/2，2013\r\n\r\n（2）大学物理实验教材，中国煤炭教育协会优秀教材，二等奖，中国煤炭教育协会，1/3，2010\r\n\r\n（3）本科毕业论文抄袭问题的治理及效果比较，陕西省高等教育学会，优秀教学成果，二等奖，陕西省高等教育学会，1/3，2016\r\n\r\n（4）教师教学自觉发展理念养成的探索与实践，西安科技大学，优秀教学成果，一等奖，1/8，2019.\r\n\r\n专利：\r\n\r\n（1）一种利用光干涉法测量光学平板玻璃弹性模量的方法，发明专利，1/5，2019\r\n\r\n（2）一种利用光干涉法测量光学平板玻璃弯曲刚度的方法，发明专利，1/5，2019\r\n\r\n（3）一种基于光干涉法测玻璃体应力的测量方法，发明专利，1/5，2016', '', '物理学');
INSERT INTO `train_tutor` VALUES ('1007', '刘伟', '2020-06-01 11:51:00', '博士', '../static/imgs/train/tutor/liuwei.jpg', '1. 个人简介\r\n\r\n刘伟，硕导，博士，现任应用物理系副主任。1981年10月生于陕西。1999年进入北京师范大学物理系学习，2003年本科毕业后保送北师大物理系理论物理专业研究生，于2008年获得博士学位。主要研究方向为复杂系统与统计物理、计算凝聚态物理以及超冷原子气体的相变。毕业后进入西安科技大学理学院应用物理系工作至今，并于2015年至2016赴美国乔治亚大学物理系访学，跟随国际著名计算物理学家David P. Landau教授开展合作研究。学习工作期间，在美国物理物理评论，欧洲物理杂志等多个国际期刊发表文章多篇。承担国家自然科学基金两项，陕西省教育厅基础研究计划一项。参与项目获得陕西省高等学校科学技术进步二等奖。\r\n\r\n2. 论文、著作：\r\n\r\n[1] Jian-yang Zhu,Wei Liu, and Han Zhu, Small-world network effect in competing Glauber- and Kawasaki-type dynamics, Euro. Phys. J. B (2003) 36 545\r\n\r\n[2] Wei Liu, Wen-yuan Xiong, and Jian-yang Zhu, One-dimensional Ising model built on small-world networks: Competing dynamics, Phys. Rev. E (2005) 71 056123 \r\n\r\n[3] Jian-zhen Chen, Wei Liu, and Jian-yang Zhu, Two-dimensional small-world networks: Navigation with local information, Phys. Rev. E (2006) 73 056111\r\n\r\n[4] Wei Liu and Jian-yang Zhu, Bosonic atoms in optical lattices with random chemical potential, Mod. Phys. Lett. B (2009) 23, 1391\r\n\r\n[5] Qing-kuan Meng, Wei Liu and Jian-yang Zhu, Ternary Social Networks: Dynamic Balance and Self-Organized Criticality, arXiv:1001.0309, (2010) \r\n\r\n[6] Wei Liu and Qing-kuan Meng, Social Balance in the Triangle Growing Networks, Social networking(2013) 2 152\r\n\r\n[7] Wei Liu，Zhengxin Yan，Methane desorption from homogeneous distributed micro-pores of coal，Journal of applied mathematics and physics，2015，3(6):643~648\r\n\r\n[8] 刘伟，基于三角生长的局域社会平衡动力学，科技导报，2016.1.28，34(2):318~322\r\n\r\n[9] Wei Liu, Zhengxin Yan, and Gaoliang Zhou, Non-equilibrium Phase Transitions in 2D Small-World Networks: Competing Dynamics, Open Physics, 2019.2.21, 17(1):1-7.', '', '物理学');

-- ----------------------------
-- Table structure for work_info
-- ----------------------------
DROP TABLE IF EXISTS `work_info`;
CREATE TABLE `work_info` (
  `work_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `work_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work_info
-- ----------------------------
INSERT INTO `work_info` VALUES ('1001', '理学院2020年调剂系统开放公告', '2020-05-28 17:15:00', '各位考生，理学院硕士研究生调剂系统开放时间：\r\n\r\n \r\n\r\n应用统计（非全日制）（（学科代码：025200）：）5月28日18：00-5月29日15:00；\r\n\r\n \r\n\r\n欢迎达到国家A类线的相关专业考生调剂到我院。');
INSERT INTO `work_info` VALUES ('1002', '理学院2020年调剂系统开放公告', '2020-05-25 10:30:00', '各位考生，理学院硕士研究生调剂系统开放时间：\r\n\r\n \r\n\r\n应用统计（非全日制）（（学科代码：025200）：）5月25日11：00-5月27日9:00；\r\n\r\n \r\n\r\n欢迎达到国家A类线的相关专业考生调剂到我院。');
INSERT INTO `work_info` VALUES ('1003', ' 理学院2020年调剂系统开放公告', '2020-05-25 10:30:00', '各位考生，理学院硕士研究生调剂系统开放时间：\r\n\r\n\r\n应用统计（非全日制）（（学科代码：025200）：）5月25日11：00-5月27日9:00；\r\n\r\n \r\n\r\n欢迎达到国家A类线的相关专业考生调剂到我院。');

-- ----------------------------
-- Table structure for work_job
-- ----------------------------
DROP TABLE IF EXISTS `work_job`;
CREATE TABLE `work_job` (
  `work_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `work_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `person` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '人名',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '内容',
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work_job
-- ----------------------------
INSERT INTO `work_job` VALUES ('1001', '\r\n理学院邀请陕建十一建集团有限公司来校招聘', '赵明', '2018-10-09 17:01:00', '10月9日下午，中铁二十五局集团有限公司人力资源部招聘主任刘东栋、西北分公司人力资源部部长靳帅一行受我院邀请来校召开招聘宣讲会。会议在临潼校区骊山校园实验楼220会议室进行，由刘东栋主讲，众多应届毕业生积极到会。\r\n\r\n刘主任先对中铁二十五局集团有限公司进行了介绍，其隶属于国资委下属的中国铁建股份有限公司(CRCC)，年综合施工生产能力在200亿元以上，在世界500强企业中排名第58位。之后又说明对于本次招聘，面试合格者当场就可以签订就业协议，上岗后公司会统一组织入职教育培训。对应聘者提出了要求，主要是面对2019年全日制二本及以上学历的专业对口的应届毕业生展开招聘，同时要求学生具有良好的品质修养，能独立完成岗位工作。如果是中共党员或担任过学生干部、有一定特长或荣获过其他荣誉者可以优先考虑。\r\n\r\n此次招聘会给广大应届毕业生提供了一个良好的平台，让他们多了一份选择。希望广大毕业生能够积极参加招聘会，解决自己的就业问题。');
INSERT INTO `work_job` VALUES ('1002', '四川正升声学科技有限公司招聘简章', '赵明', '2015-09-21 16:39:00', '\r\n四川正升声学科技有限公司招聘简章\r\n2015-09-21 16:39 赵明 \r\n一、企业简介  \r\n\r\n \r\n\r\n四川正升声学科技有限公司（简称正升声学）网址http://www.chinazisen.com/是一家噪声防控解决方案的专业服务商。\r\n\r\n \r\n\r\n  正升声学由四川正升环保科技有限公司（简称正升环保）于2008年组建成立。在正升环保原有相关资产、人才和业务的基础上，整合业内优秀的人才和科研资源，力求在声学科研领域做到更专业，更卓越。\r\n\r\n \r\n\r\n正升环保涉足噪声治理业务始于1999年，十年来一直致力于工业噪声治理产品设计，制造及工程设计施工。涵盖石油、天然气、化工、电力、冶金、交通、建筑、市政等领域，服务区域涉及中国、泰国、伊朗、印度尼西亚、巴基斯坦等国家和地区。\r\n\r\n \r\n\r\n公司秉承“创新每一天，做好每件事”的正升精神，不断推进技术及业务模式的沿革，以整合资源，为需要系统化解决噪声问题的客户提供“最优服务”的战略，来完成“让科技还世界以宁静“的崇高使命。\r\n\r\n \r\n\r\n二、岗位名称：设计工程师\r\n\r\n \r\n\r\n岗位职责：\r\n\r\n \r\n\r\n1项目前期的声学咨询工作（如可行性研究报告、环境影响评价报告、声学规划、声学预测、声学顾问等）；\r\n\r\n \r\n\r\n2、工程现场踏勘，编制技术方案，进行技术交流\r\n\r\n \r\n\r\n3、编制项目招投标文件等工作；\r\n\r\n \r\n\r\n4、完成降噪工程初步设计、施工图设计；\r\n\r\n \r\n\r\n5、负责项目各阶段噪声测试、数据分析，提供分析报告；\r\n\r\n \r\n\r\n6、负责工程项目现场声学问题的处理以及项目完工后的声学检测，工程总结\r\n\r\n \r\n\r\n任职要求：\r\n\r\n \r\n\r\n1、大学本科及以上文化程度，环境工程、热能动力工程、车辆工程专业优先考虑；\r\n\r\n \r\n\r\n2、具备一定的声学（噪声振动）基础知识；\r\n\r\n \r\n\r\n3、熟练操作CAD、熟悉并会使用SounDPLAN或CadnaA其中一款软件；\r\n\r\n \r\n\r\n三、宣讲会时间地点\r\n\r\n \r\n\r\n  时间：2015年9月23日上午10:00\r\n\r\n \r\n\r\n  地点：西安科技大学雁塔校区 理学院会议室（1208）\r\n\r\n \r\n\r\n联系我们：  \r\n\r\n \r\n\r\n地址：成都市温江区海峡科技园海科路西段57号\r\n\r\n \r\n\r\n网址：http://www.chinazisen.com\r\n\r\n \r\n\r\n联系人：周杰         联系电话：028-61933007-8480       邮箱：784863955@qq.com');
INSERT INTO `work_job` VALUES ('1003', '理学院邀请中铁二十五局集团有限公司来校招聘', '赵明', '2018-10-09 17:01:00', '10月9日下午，中铁二十五局集团有限公司人力资源部招聘主任刘东栋、西北分公司人力资源部部长靳帅一行受我院邀请来校召开招聘宣讲会。会议在临潼校区骊山校园实验楼220会议室进行，由刘东栋主讲，众多应届毕业生积极到会。\r\n\r\n刘主任先对中铁二十五局集团有限公司进行了介绍，其隶属于国资委下属的中国铁建股份有限公司(CRCC)，年综合施工生产能力在200亿元以上，在世界500强企业中排名第58位。之后又说明对于本次招聘，面试合格者当场就可以签订就业协议，上岗后公司会统一组织入职教育培训。对应聘者提出了要求，主要是面对2019年全日制二本及以上学历的专业对口的应届毕业生展开招聘，同时要求学生具有良好的品质修养，能独立完成岗位工作。如果是中共党员或担任过学生干部、有一定特长或荣获过其他荣誉者可以优先考虑。\r\n\r\n\r\n此次招聘会给广大应届毕业生提供了一个良好的平台，让他们多了一份选择。希望广大毕业生能够积极参加招聘会，解决自己的就业问题。');
