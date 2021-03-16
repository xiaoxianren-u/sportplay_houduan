
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
                       id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
                       username VARCHAR (12) NOT NULL DEFAULT '' COMMENT '用户名',
                       `password` VARCHAR (10) NOT NULL DEFAULT '' COMMENT '密码',
                       email VARCHAR (50) NOT NULL DEFAULT '' COMMENT '邮箱',
                       `state` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '角色',
                       PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';