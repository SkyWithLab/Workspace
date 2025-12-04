--DELETE: 테이블의 행을 삭제하는 구문
--주의: 하나의 아이템은 지울수가 없다,
--      WHERE 사용하지 않으면 모든 ROW가 삭제된다.
--      제약조건을 FOREIGN KEY 를 체크해야한다.

--[구조]
--DELETE FROM 테이블명 [WHERE 조건식];
--
SELECT * 
FROM EMPLOYEE;

DELETE FROM EMPLOYEE
WHERE EMP_ID =216;

SELECT *
FROM EMPLOYEE;
--바로 이전에 COMMIT 이후에 모든 내용들은 복구가 진행됨
--지웠던 내용을 다시 복구하기
ROLLBACK;
SELECT * FROM EMPLOYEE;

DELETE FROM EMPLOYEE_COPY
WHERE DEPT_TITLE = '인사관리부';

ROLLBACK;

--참조무결성 제약조건에 위배되는 사항.DEPARTMENT 참조하는 테이블이 있
SELECT * FROM DEPARTMENT
WHERE DEPT_ID = 'D9';

--LOC 테이블을 만들어서 DEPARTMENT참조하시오 ,,D_ID , LOCAL
CREATR TABLE LOCAL(
    D_ID VARCHAR2(5),
    LOCAL VARCHAR2(10),
    CONSTRAIT FK_LOC_DEPT_DID FOREIGN KEY(D_ID) REFERENCES DEPERTMENT(

);   
--LOC 입력을 한다. (D8광주 D9서울) 입력

INSERT INTO LOC VALUES('D8', '광주');
INSERT INTO LOC VALUES('D9', '서울');

SELECT * FROM 



);


--**9참조무결성 제약조건때문에 삭제가 불가능할때 해결방법
--1, 참조 제약조건을 해지한다.
--2,삭제 진행한다
--3,참조하고 있는 컬럼을 NULL로 세팅한다
--4,참조제약조건을 복구시킨다.
--

DELETE FROM DEPARTMENT WHERE DEPT_ID = 'D9';

--1 포린키를 가지고 잇는 테이블을 해지시켜야함.LOC
ALTER TABLE LOC 
DISABLE CONSTRAINT FK_LOC_DEPT_DID CASCADE
--2. 삭제
DELETE FROM DEPARTMENT WHERE DEPT_ID = 'D9';
--3. 참조하고있는 D_ID =D9 컬럼을 NULL로 수정하기
--ALTER TABLE LOC 
--ENABLE CONSTRAINT FK_LOC_DEPT_DID;
UPDATE LOC SET D_ID = NULL WHERE D_ID = 'D9';

4. 참조제약조건 복구
ALTER TABLE LOC
ENABLE CONSTRAINT FK_LOC_DEPT_DID

--------------------------------------------------------------------------------
--
--10 TRUNCATE 테이블에서 행(레코드)를 삭제
--참조1 테이블 구조를 삭제하지 않는다?
--DELETE보다 빠르다 속도
--주의: 한번 삭제된 레코드는 POLLBACK 복구되지 않는다(주의바람)

--구조)) TRUNCATE TABLE 테이블명:
TRUNCATE TABLE LOC;
--지웠던 내용을 롤백으로 복구했지만 복구되지 않는다. 이유는,, DDL 기능은 롤백기능을 지원하지않는다.
