create database nybikedb;

use nybikedb;

CREATE TABLE t_operation_v2(
id INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
opt_type INT    COMMENT '操作类型，0-点击，1-缩放，2-拖拽',
user_ip VARCHAR(60)    COMMENT '用户IP' ,
created_time DATETIME    COMMENT '创建时间' ,
PRIMARY KEY (id)
);

CREATE TABLE t_opt_click(
opt_id INT    COMMENT '关联的主表ID' ,
station_id VARCHAR(60)    COMMENT '站点ID' ,
station_name VARCHAR(100)    COMMENT '站点名称'
);

CREATE TABLE t_opt_zoom(
opt_id INT    COMMENT '关联的主表ID' ,
zoom_start_level DOUBLE(32,8)    COMMENT '缩放起始级别' ,
zoom_end_level DOUBLE(32,8)    COMMENT '缩放终止级别'
);

CREATE TABLE t_opt_drag(
opt_id INT    COMMENT '关联的主表ID' ,
drag_start_lat DOUBLE(32,8)    COMMENT '拖拽起始纬度' ,
drag_start_lon DOUBLE(32,8)    COMMENT '拖拽起始经度' ,
drag_end_lat DOUBLE(32,8)    COMMENT '拖拽终止纬度' ,
drag_end_lon DOUBLE(32,8)    COMMENT '拖拽终止经度'
);