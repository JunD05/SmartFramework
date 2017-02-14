CREATE TABLE demo.customer (
  id bigint(20) NOT NULL AUTO_INCREMENT COMMENT '客户ID',
  name varchar(50) DEFAULT NULL COMMENT '客户姓名',
  contact varchar(255) DEFAULT NULL COMMENT '联系人',
  telephone varchar(255) DEFAULT NULL COMMENT '手机号码',
  eamil varchar(255) DEFAULT NULL COMMENT '邮箱地址',
  remark text DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  AUTO_INCREMENT = 1
  CHARACTER SET utf8
  COLLATE utf8_general_ci
  COMMENT = '客户表';


SET NAMES 'utf8';
INSERT INTO demo.customer(id, name, contact, telephone, eamil, remark) VALUES
  (1, '张三', '李四', '1234567890', 'lisi@163.com', NULL);
INSERT INTO demo.customer(id, name, contact, telephone, eamil, remark) VALUES
  (2, '王五', '赵六', '1234567890', 'zhaoliu@163.com', NULL);