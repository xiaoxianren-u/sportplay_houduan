-- auto Generated on 2021-03-06
-- DROP TABLE IF EXISTS sub_menu;
use easyuser

CREATE TABLE main_menu(
                          id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
                          title VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'title',
                          `path` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'path',
                          PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'main_menu';