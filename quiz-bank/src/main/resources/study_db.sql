CREATE database `study`;
use study;
CREATE USER 'study'@'%' IDENTIFIED BY 'pass';
drop user 'study'@'*';
GRANT ALL PRIVILEGES ON *.* TO 'study'@'%';
flush privileges;
drop database study;
CREATE DATABASE `study` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;



CREATE TABLE `quiz` (
	`quiz_no`	int(50)	primary key auto_increment,
	`test_category_no`	int(50)	NOT NULL,
	`subject_category_no`	int(50)	NOT NULL,
	`quiz_content`	varchar(1000)	NULL,
	`option1`	varchar(100)	NULL,
	`option2`	varchar(100)	NULL,
	`option3`	varchar(100)	NULL,
	`option4`	varchar(100)	NULL,
	`option5`	varchar(100)	NULL,
	`quiz_answer`	varchar(100)	NULL,
	`used_yn`	boolean	NULL
);
select * from quiz;


CREATE TABLE `test_category` (
	`test_category_no`	int(50)	primary key auto_increment,
	`test_category`	varchar(50)	NOT NULL,
	`used_yn`	boolean	NULL
);
alter table test_category auto_increment = 100;

CREATE TABLE `subject_category` (
	`subject_category_no`	int(50)	primary key auto_increment,
	`test_category_no`	int(50)	NOT NULL,
	`subject_category`	varchar(50)	NULL,
	`used_yn`	boolean	NULL
);
alter table subject_category auto_increment = 10000; 



CREATE TABLE `quiz_solve` (
	`solve_no`	int(50)	primary key auto_increment,
	`quiz_no`	int(50)	NOT NULL,
	`solve_dt`	datetime,
	`correct_wrong`	boolean	NULL
);