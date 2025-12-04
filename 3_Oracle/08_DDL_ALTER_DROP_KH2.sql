--DDL : 데이터를 정의하는 언어이다.
--객체 = 테이블
--객체를(테이블을) 생성하고(CREATE), 변경(ALTER), 삭제(DROP)
--ALTER : 객체(테이블)구조를 변경하는 기능
--구조)ALTER TABLE 테이블명 변경할내용

--* 변경할 내용 
--테이블에 컬럼을 추가하거나 , 수정하거나, 삭제
--제약조건(5가지) 추가할 수 있고 삭제할 수 있다. 주의 : 수정은 안됨,, 제약조건의 이름은변경가능
--이름을 변경(테이블명)(컬럼명)(제약조건명)


--ALTER에 컬럼추가 하기  컬럼명CNAME , VARCHAR2(20)
--DEPT_COPY 컬럼추가 컬럼명 타입 제약조건
SELECT * FROM DEPT_COPY
SELECT * 
DESC DEPT_COPY;

ALTER TABLE DEPT_COPY
ADD CNAME VARCHAR2(20);
--ALTER TABLE DEPT_COPY ADD VARCHAR2(20)NOT NULL; -- 오류발생

--DEPT_COPY 컬럼추가 컬럼명LNAME 타입VARCHAR(40),DEFAULT'한국'
ALTER TABLE DEPT_COPY ADD PNAME VARCHAR2(40)DEFAULT '한국' NOT NULL;

--ALTER 컬럼 수정 MODIFY
--참조>데이터 타입 수정: MODIFY 컬럼명(존재하는 컬럼명)변경할데이터타입
--참조>기본값 수정 (DEFULT):MODIFY 컬럼명 DEFAULT 변경할기본값
-->주의사항: 데이터타입 수정가능하지만 안되는 경우가 있다..이유:데이터를 잃어버리거나 변형이 되는것은 안된다.

--데이터 타입 수정 CNAME VARCHAR2(20) -> VARCHAR2(30) 으로 수정
ALTER TABLE DEPT_COPY MODIFY CNAME VARCHAR2(30);
DESC DEPT_COPY;

--데이터타입 수정 LCNAME DEFAULT'한국' -> 대한민국으로 변경
ALTER TABLE DEPT_COPY MODIFY 

INSERT INTO DEPT_COPY VALUES('D10', '앱개발부', 'L1',NULL,DEFAULT,'강남');
UPDATE DEPT_COPY SET LNAME = '대한민국' WHERE LNAME <> '대한민국';

--삭제 DROP COLUMN 
DROP COLUMN 

--컬럼 삭제시 제약조간 위배하는 경우를 진행 프라이머리키에 해당되는  컬럼ㅇ을 삭제
-- LOC 테이블을 만들어서 DEPARTMENT(PK => FK 참조) 참조하시오.  D_ID, LOCAL
CREATE TABLE LOC(
    D_ID CHAR(2),
    LOCAL VARCHAR2(10),
    CONSTRAINT FK_LOC_DEPT_DID FOREIGN KEY(D_ID) REFERENCES DEPARTMENT(DEPT_ID) 
);
-- LOC 입력을 한다. (D8, 광주), (D9, 서울)
INSERT INTO  LOC VALUES('D8', '광주'); 
INSERT INTO  LOC VALUES('D9', '서울');


