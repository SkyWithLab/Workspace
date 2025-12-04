--✓JOIN, TABLE 관련 과제
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------


DROP TABLE STUDENT;	    --같은 이름의 테이블이 존재하면 오류발생하기때문에 미리 드랍해줌
-------------------------------학생 테이블 만들기---------------------------------
CREATE TABLE STUDENT(
   	STUDENT_NUM NUMBER(10) PRIMARY KEY,
   	STUDENT_NAME VARCHAR2(20),
   	STUDENT_MAJOR VARCHAR2(20)
);

INSERT INTO STUDENT(STUDENT_NUM, STUDENT_NAME , STUDENT_MAJOR) VALUES('17123456', '신짱구', '체육');
INSERT INTO STUDENT(STUDENT_NUM, STUDENT_NAME , STUDENT_MAJOR) VALUES('18791011', '김철수', '컴퓨터공학');
INSERT INTO STUDENT(STUDENT_NUM, STUDENT_NAME , STUDENT_MAJOR) VALUES('18121314', '한유리', '행정');
INSERT INTO STUDENT(STUDENT_NUM, STUDENT_NAME , STUDENT_MAJOR) VALUES('19151617', '이훈이', '간호');
INSERT INTO STUDENT(STUDENT_NUM, STUDENT_NAME , STUDENT_MAJOR) VALUES('19181920', '흰맹구', '기계공학');
INSERT INTO STUDENT(STUDENT_NUM, STUDENT_NAME , STUDENT_MAJOR) VALUES('19212223', '이흰둥', '국어국문');
COMMIT;

SELECT  *
FROM STUDENT;
-------------------------------수강 테이블 만들기---------------------------------
--CREATE TABLE LESSON (
--	LESSON_NUM1 CHAR(8),
--	LESSON_NUM2 CHAR(20),
--	LESSON_NUM3 CHAR(20)