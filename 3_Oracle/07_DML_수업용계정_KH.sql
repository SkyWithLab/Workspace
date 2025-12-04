--DML 
--CURD

--INSSERT INTO 테이블명
-- 제약조건5가지 , 
--UPDATE 테이블명

--SET

--DELETE FROM 테이블명
--------------------------------------------------------------------------------

--1.SELECT 컬럼명 FROM WHERE GROUP BY HAVING ORDER BY해당내용 DESC/ASC
--2.INSERT INTO 테이블명(컬럼명) VALUES(컬럼갯수)
--  INSERT INTO 테이블명 VALUES(모두 컬럼갯수 값을 입력)
--3.UPDATE 테이블명SET(SETTER생각) 컬럼명=값, 컬럼명 =값 WHERE~ 
--4.DELETE FROM 테이블명 WHERE 

SELECT * 
FROM EMPLOYEE;

DESC EMPLOYEE;
SELECT * FROM EMPLOYEE;
INSERT INTO EMPLOYEE
VALUES(1, '홍길동', '820114-1010101', 'hong_kd@kh.or.kr', '01099998888', 'D5', 'J2', 'S4',
 3800000, NULL, '200', SYSDATE,  NULL, DEFAULT);
 
SELECT * FROM EMPLOYEE WHERE EMP_ID = 1;
 
UPDATE EMPLOYEE
SET EMP_ID = 290
WHERE EMP_NAME = '홍길동';

DELETE FROM EMPLOYEE
WHERE EMP_NAME = '홍길동';


--------------------------------------------------------------------------------

CREATE TABLE EMP_DEPT_D1
 AS EMP_ID, EMP_NAME, DEPT_CODE, HIRE_DATE
 FROM EMPLOYEE
 WHERE 1 = 0;