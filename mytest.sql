/*
Navicat MySQL Data Transfer

Source Server         : donm
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : mytest

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-06-28 21:16:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` int(11) NOT NULL,
  `adminPw` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '1234');
INSERT INTO `admin` VALUES ('10001', '123');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookId` int(11) NOT NULL,
  `bookName` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `press` varchar(255) NOT NULL,
  `bookDate` varchar(255) NOT NULL,
  `bookType` varchar(255) NOT NULL,
  `bookDesc` varchar(255) NOT NULL,
  `photo` varchar(255) NOT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '深入理解计算机系统', '小明', '清华大学出版社', '2016-11-11', '计算机', 'hello world', 'https://img12.360buyimg.com/n1/s200x200_jfs/t3310/143/1379472768/437459/d9d8bd99/582435faN7c9dd621.jpg');
INSERT INTO `book` VALUES ('2', '编程珠玑', '小露', '清华大学出版社', '2017-11-11', '计算机', 'hello world', 'https://img14.360buyimg.com/n1/s200x200_jfs/t733/236/713204451/71588/7e62c286/54d332abN7e74cb0b.jpg');
INSERT INTO `book` VALUES ('3', '高性能MySQL', '小花', '清华大学出版社', '2016-11-11', '计算机', 'hello world', 'https://img13.360buyimg.com/n1/s200x200_jfs/t5917/11/794709468/55255/5b2197c/592bf166N2ee13b0e.jpg');
INSERT INTO `book` VALUES ('4', '代码整洁之道', '小花', '清华大学出版社', '2016-11-11', '计算机', 'hello world!!!', 'https://img11.360buyimg.com/n1/s200x200_jfs/t5881/245/3369654271/326099/6da3ba73/593a4357N46699934.jpg');
INSERT INTO `book` VALUES ('5', '码农翻身', '小花', '清华大学出版社', '2016-11-11', '计算机', 'hello world', 'https://img14.360buyimg.com/n1/s200x200_jfs/t1/2387/37/10035/244618/5bc98f0fEd0031c63/cf9b8a4c93faecda.jpg');
INSERT INTO `book` VALUES ('6', '流浪地球', '小南', '清华大学出版社', '2016-11-11', '小说', 'hello novel', 'https://img12.360buyimg.com/n1/s200x200_jfs/t2815/69/1907110193/157728/297e9ede/5750ef8eN6e767bc8.jpg');
INSERT INTO `book` VALUES ('7', '剑指Offer', '小花', '清华大学出版社', '2016-11-11', '计算机', 'hello world', 'https://img14.360buyimg.com/n1/s200x200_jfs/t4324/224/3099445550/166356/d8c1775c/58db5d3bN661ab10f.jpg');
INSERT INTO `book` VALUES ('8', '春秋史', '小溪', '清华大学出版社', '2016-11-11', '历史', 'hello history', 'https://img13.360buyimg.com/n1/s200x200_jfs/t1/29441/19/15421/79201/5cb4034bEc3ec567f/76ee7cdefcee72f0.jpg');
INSERT INTO `book` VALUES ('9', '中国国家地理', '小巧', '清华大学出版社', '2016-11-11', '杂志', 'hello magazine', 'https://img14.360buyimg.com/n1/s200x200_jfs/t1/31789/20/149/341147/5c385a0dE8c7759f1/5600080dde3f1855.jpg');
INSERT INTO `book` VALUES ('10', '青年文摘', '小春', '清华大学出版社', '2016-11-11', '杂志', 'hello magazine', 'https://img11.360buyimg.com/n1/s200x200_jfs/t22069/365/1551322548/255596/d0188a17/5b2b662bNe1f8300d.jpg');
INSERT INTO `book` VALUES ('11', '孤独深处', '小宇', '清华大学出版社', '2016-11-11', '小说', 'hello novel', 'https://img14.360buyimg.com/n1/s200x200_jfs/t3880/150/831461238/355580/13c436c5/5860ab23N1d4130bf.jpg');
INSERT INTO `book` VALUES ('12', '沙丘', '小肖', '清华大学出版社', '2016-11-11', '小说', 'hello novel', 'https://img14.360buyimg.com/n1/s200x200_jfs/t8224/180/1431989036/736853/8d3f6e53/59ba4d4eN41898357.jpg');
INSERT INTO `book` VALUES ('13', '战国策', '小田', '人民邮电出版社', '2016-11-11', '历史', 'hello history', 'https://img11.360buyimg.com/n1/s200x200_jfs/t27334/330/2432809727/206103/f4afc589/5c011c4dNec555761.jpg');
INSERT INTO `book` VALUES ('14', '三体', '小陆', '清华大学出版社', '2016-11-11', '小说', 'hello novel', 'https://img14.360buyimg.com/n1/s200x200_jfs/t1705/189/702227414/177982/cc8c12f0/55dab54dN5271c377.jpg');
INSERT INTO `book` VALUES ('15', '微积分', '小明', '人民邮电出版社', '2015-11-11', '数学', 'hello math', 'https://img11.360buyimg.com/n1/s200x200_jfs/t1/6314/2/8176/217791/5c07da14Ef4bcf0d3/c3c1c1d916024ec9.jpg');
INSERT INTO `book` VALUES ('16', '数学之美', '小华', '人民邮电出版社', '2014-11-12', '数学', 'hello math', 'https://img12.360buyimg.com/n1/s200x200_jfs/t1/20474/35/5331/363820/5c3c1524E9282e87e/59dc2ac9633e3796.jpg');
INSERT INTO `book` VALUES ('17', '统计之美', '小楠', '电子工业出版社', '2015-12-10', '数学', 'hello math', 'https://img12.360buyimg.com/n1/s200x200_jfs/t1/14601/16/9247/614702/5c7cdf8fEa48b2815/d11cef0c74cd75d3.jpg');
INSERT INTO `book` VALUES ('18', '计算机科学中的数学', '小茜', '电子工业出版社', '2012-09-10', '数学', 'hello math', 'https://img10.360buyimg.com/n1/s200x200_jfs/t1/39267/17/1475/307984/5cbd5369E83774a42/a1993c5930d93d09.jpg');
INSERT INTO `book` VALUES ('19', '意林', '小小', '清华大学出版社', '2018-11-11', '杂志', 'hello magazine', 'https://img10.360buyimg.com/n1/s200x200_jfs/t1/19428/14/9800/579541/5c81ca08E038998f2/81cc37d08e55682a.jpg');
INSERT INTO `book` VALUES ('20', '读者', '小乔', '清华大学出版社', '2018-10-10', '杂志', 'hello magazine', 'https://img10.360buyimg.com/n1/s200x200_jfs/t18376/142/1336632808/685051/b54b78b4/5ac46461N23708484.jpg');
INSERT INTO `book` VALUES ('21', '明朝那些事儿', '小小', '人民邮电出版社', '2015-09-09', '历史', 'hello history', 'https://img11.360buyimg.com/n1/s200x200_jfs/t1/18664/4/2714/368728/5c1faf68E42bbfe8e/798de4892f9e7c4f.jpg');
INSERT INTO `book` VALUES ('22', '全球通史', '小胖', '人民邮电出版社', '2016-10-10', '历史', 'hello history', 'https://img13.360buyimg.com/n1/s200x200_jfs/t14263/96/2664829027/666391/326adbf2/5aaf7631N0ab39f79.jpg');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `opDate` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '1', '1000', '2019-06-11 20:30:54', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('2', '1', '1001', '2019-06-11 20:31:35', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('3', '1', '1002', '2019-06-11 20:32:18', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('4', '1', '1002', '2019-06-11 20:32:33', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('5', '1', '1005', '2019-06-11 20:32:47', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('6', '1', '1000', '2019-06-11 20:32:57', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('7', '1', '1002', '2019-06-11 20:33:06', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('8', '1', '1004', '2019-06-11 21:58:41', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('9', '1', '1003', '2019-06-11 21:58:49', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('10', '1', '1001', '2019-06-11 21:58:53', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('11', '1', '1002', '2019-06-11 21:58:57', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('12', '2', '1001', '2019-06-11 21:58:59', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('13', '2', '1005', '2019-06-11 21:59:02', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('14', '2', '1001', '2019-06-11 21:59:04', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('15', '2', '1002', '2019-06-11 21:59:06', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('16', '2', '1001', '2019-06-11 22:22:04', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('17', '2', '1002', '2019-06-11 22:22:07', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('18', '2', '1001', '2019-06-11 22:22:10', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('19', '2', '1005', '2019-06-11 22:22:12', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('20', '2', '1001', '2019-06-11 22:22:15', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('21', '2', '1000', '2019-06-11 22:23:19', '\r\n历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('23', '1', '1000', '2019-06-12 11:10:03', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('24', '2', '1000', '2019-06-12 11:10:36', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('25', '5', '1000', '2019-06-12 11:14:34', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('26', '5', '1000', '2019-06-12 11:14:40', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('27', '3', '1000', '2019-06-12 11:21:04', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('28', '5', '1000', '2019-06-12 11:29:18', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('29', '4', '1000', '2019-06-12 14:44:59', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('30', '6', '1000', '2019-06-13 15:07:53', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('31', '21', '1000', '2019-06-14 09:04:16', '机器学习是人工智能的一个分支。人工智能的研究历史有着一条从以“推理”为重点，到以“知识”为重点，再到以“学习”为重点的自然、清晰的脉络。显然，机器学习是实现人工智能的一个途径，即以机器学习为手段解决人工智能中的问题。');
INSERT INTO `comment` VALUES ('32', '16', '1000', '2019-06-14 09:04:57', '机器学习(Machine Learning, ML)是一门多领域交叉学科，涉及概率论、统计学、逼近论、凸分析、算法复杂度理论等多门学科。 专门研究计算机怎样模拟或实现人类的学习行为，以获取新的知识或技能，重新组织已有的知识结构使之不断改善自身的性能。');
INSERT INTO `comment` VALUES ('33', '3', '1000', '2019-06-21 13:06:22', 'Elasticsearch是一个基于Lucene库的搜索引擎。它提供了一个分布式、支持多租户的全文搜索引擎，具有HTTP Web接口和无模式JSON文档。Elasticsearch是用Java开发的，并在Apache许可证下作为开源软件发布。');
INSERT INTO `comment` VALUES ('34', '19', '1000', '2019-06-21 15:59:47', '历经打磨，@索尼中国 再献新作品—OLED电视A8F完美诞生。很开心一起参加了A8F的“首映礼”！[鼓掌]正如我们演员对舞台的热爱，索尼对科技与艺术的追求才创造出了让人惊喜的作品。作为A1兄弟款，A8F沿袭了黑科技“屏幕发声技术”和高清画质，色彩的出众表现和高端音质，让人在体验的时候如同身临其境。A8F，这次的“视帝”要颁发给你！ 索尼官网预售： O网页链接 索尼旗舰店预售：');
INSERT INTO `comment` VALUES ('35', '3', '1000', '2019-06-21 16:01:55', 'Elasticsearch是一个基于Lucene库的搜索引擎。它提供了一个分布式、支持多租户的全文搜索引擎，具有HTTP Web接口和无模式JSON文档。Elasticsearch是用Java开发的，并在Apache许可证下作为开源软件发布。');

-- ----------------------------
-- Table structure for interest
-- ----------------------------
DROP TABLE IF EXISTS `interest`;
CREATE TABLE `interest` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `myInterest` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interest
-- ----------------------------
INSERT INTO `interest` VALUES ('23', '1000', '计算机');
INSERT INTO `interest` VALUES ('24', '1000', '小说');
INSERT INTO `interest` VALUES ('25', '1000', '历史');
INSERT INTO `interest` VALUES ('26', '1000', '杂志');
INSERT INTO `interest` VALUES ('27', '1000', '数学');

-- ----------------------------
-- Table structure for recommend
-- ----------------------------
DROP TABLE IF EXISTS `recommend`;
CREATE TABLE `recommend` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `bookId` int(11) NOT NULL,
  `clickNum` int(11) unsigned zerofill NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recommend
-- ----------------------------
INSERT INTO `recommend` VALUES ('2', '1000', '1', '00000000033');
INSERT INTO `recommend` VALUES ('3', '1000', '2', '00000000011');
INSERT INTO `recommend` VALUES ('4', '1000', '3', '00000000033');
INSERT INTO `recommend` VALUES ('5', '1001', '2', '00000000020');
INSERT INTO `recommend` VALUES ('6', '1000', '20', '00000000003');
INSERT INTO `recommend` VALUES ('7', '1000', '11', '00000000001');
INSERT INTO `recommend` VALUES ('8', '1000', '18', '00000000001');
INSERT INTO `recommend` VALUES ('9', '1000', '12', '00000000002');
INSERT INTO `recommend` VALUES ('10', '1000', '19', '00000000004');
INSERT INTO `recommend` VALUES ('11', '1000', '4', '00000000001');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `bookId` int(11) NOT NULL,
  `opDate` varchar(255) NOT NULL,
  `returnDate` varchar(255) NOT NULL,
  `operation` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1', '1000', '1', '2017-11-11', '2017-11-11', '借阅');
INSERT INTO `record` VALUES ('2', '1000', '1', '2017-10-11', '2017-11-11', '借阅');
INSERT INTO `record` VALUES ('3', '1001', '2', '2016-12-10', '2016-12-10', '借阅');
INSERT INTO `record` VALUES ('4', '1002', '6', '2017-10-10', '2017-11-10', '借阅');
INSERT INTO `record` VALUES ('5', '1003', '3', '2016-10-10', '2016-11-10', '借阅');
INSERT INTO `record` VALUES ('6', '1004', '20', '2017-05-05', '2017-06-05', '借阅');
INSERT INTO `record` VALUES ('7', '1005', '4', '2017-01-12', '2017-02-12', '借阅');
INSERT INTO `record` VALUES ('8', '1006', '16', '2016-12-12', '2017-01-12', '借阅');
INSERT INTO `record` VALUES ('9', '1002', '16', '2017-09-09', '2016-10-09', '借阅');
INSERT INTO `record` VALUES ('10', '1002', '20', '2015-10-09', '2015-11-09', '借阅');
INSERT INTO `record` VALUES ('11', '1001', '19', '2014-10-10', '2014-11-10', '借阅');
INSERT INTO `record` VALUES ('12', '1003', '11', '2015-11-11', '2015-12-11', '借阅');
INSERT INTO `record` VALUES ('13', '1005', '12', '2014-11-16', '2014-12-16', '借阅');
INSERT INTO `record` VALUES ('14', '1005', '10', '2016-10-10', '2016-11-10', '借阅');
INSERT INTO `record` VALUES ('15', '1006', '6', '2016-09-09', '2016-10-09', '借阅');
INSERT INTO `record` VALUES ('16', '1007', '6', '2014-05-06', '2014-06-06', '借阅');
INSERT INTO `record` VALUES ('17', '1007', '1', '2018-11-11', '2018-12-11', '借阅');
INSERT INTO `record` VALUES ('18', '1007', '16', '2014-12-12', '2015-01-12', '借阅');
INSERT INTO `record` VALUES ('19', '1000', '1', '2019-07-13', '2019-06-13', '借阅');
INSERT INTO `record` VALUES ('20', '1000', '1', '2019-06-13', '2019-07-13', '借阅');
INSERT INTO `record` VALUES ('21', '1000', '22', '2019-06-13', '2019-07-13', '借阅');

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `role` varchar(255) NOT NULL,
  `adminId` int(11) NOT NULL,
  `adminName` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `photo` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `remark` varchar(255) NOT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('超级管理员', '1', '小明', '男', 'http://img4q.duitang.com/uploads/item/201505/23/20150523154720_Rwvje.thumb.700_0.png', '17774621486', '2639368531@qq.com', 'hello world!!!');
INSERT INTO `t_admin` VALUES ('管理员', '2', '小明', '男', 'https://p0.ssl.qhimgs1.com/sdr/400__/t011d496b9f70e58f24.jpg', '17774621486', '2639368531@qq.com', 'hello world!!!');
INSERT INTO `t_admin` VALUES ('运营人员', '3', '小露', '女', 'https://p0.ssl.qhimgs1.com/sdr/400__/t011d496b9f70e58f24.jpg', '17774621486', '2639368531@qq.com', 'hello world');
INSERT INTO `t_admin` VALUES ('超级管理员', '10001', '李东明', '男', 'https://p0.ssl.qhimgs1.com/sdr/400__/t011d496b9f70e58f24.jpg', '17774621486', '2639368531@qq.com', 'hello world!!!');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userPw` varchar(255) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `photo` varchar(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1000', '1234', '李东明', '男', '2639368531@qq.com', '18174632405', 'https://p0.ssl.qhimgs1.com/sdr/400__/t0133395dc840392c60.jpg');
INSERT INTO `t_user` VALUES ('1001', '123', '李东', '男', '2639368531@qq.com', '18174632405', 'https://p3.ssl.qhimgs1.com/sdr/400__/t013bfc080b4bdbbc13.jpg');
INSERT INTO `t_user` VALUES ('1002', '123', '李明', '男', '2639368531@qq.com', '18174632405', 'http://photo.l99.com/bigger/02/1385558675700_gr8647.png');
INSERT INTO `t_user` VALUES ('1003', '123', '李晓', '男', '2639368531@qq.com', '18174632405', 'http://p3.pstatp.com/large/5b470000fe64eb5aef99');
INSERT INTO `t_user` VALUES ('1004', '123', '小明', '男', '2639368531@qq.com', '18174632405', 'https://p3.ssl.qhimgs1.com/sdr/400__/t013bfc080b4bdbbc13.jpg');
INSERT INTO `t_user` VALUES ('1005', '123', '小露', '女', '2639368531@qq.com', '18174632405', 'https://p0.ssl.qhimgs1.com/sdr/400__/t0133395dc840392c60.jpg');
INSERT INTO `t_user` VALUES ('1006', '123', '小花', '女', '2639368531@qq.com', '18174632405', 'https://p0.ssl.qhimgs1.com/sdr/400__/t0133395dc840392c60.jpg');
INSERT INTO `t_user` VALUES ('1007', '123', '小鱼', '女', '2639368531@qq.com', '18174632405', 'https://p3.ssl.qhimgs1.com/sdr/400__/t013bfc080b4bdbbc13.jpg');
INSERT INTO `t_user` VALUES ('1008', '123', '小华', '男', '2639368531@qq.com', '18174632405', 'https://p5.ssl.qhimgs1.com/sdr/400__/t01c15a506c03a9457b.jpg');

-- ----------------------------
-- Function structure for handleClick
-- ----------------------------
DROP FUNCTION IF EXISTS `handleClick`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `handleClick`(`a` int,`b` int) RETURNS int(11)
BEGIN
	DECLARE temp INT(1) DEFAULT 0;
  SELECT COUNT(*) INTO temp FROM recommend WHERE userId=1 and bookId=1;
  RETURN 0;
END
;;
DELIMITER ;
