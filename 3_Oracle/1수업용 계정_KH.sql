/* 
시퀀스(SEQUENCE)
1) 자동으로 번호를 발생시켜주는 객체
2) 정수값을 순차적으로 일정한 값을 시켜서 생성

[구조]
CREATE SEQUENCE 시퀀스명
① [START WITH 숫자] →처음 발생시킬 시작 값, 기본값 1
②[INCREMENT BY 숫자] →다음 값에 대한 증가치, 기본값 1
③[MAXVALUE숫자 | NOMAXVALUE] →발생시킬 최대값, 10의 27승-1까지 가능
④[MINVALUE숫자 | NOMINVALUE] →발생시킬 최소값, -10의 26승
⑤[CYCLE | NOCYCLE] → CYCLE: 시퀀스가 최대값까지 증가 완료 시 다시갈수 있는 결정 CYCLE은 START WITH 설정 값으로 돌아감
                            NOCYCLE은 에러 발생 기본값은 NOCYCLE
일반적인 개념 캐쉬: 자주사용되는(메모리: RAN) 데이터관련된 자료는 시피유가 메모리가 가면 속도가 맞지 않기 때문에 속도가 맞은 캐쉬메모리에서 데이터를
저장하면 빠르게 데이터를 가져올 수 있다. 
⑥[CACHE| NOCACHE] → CACHE는 메모리 상에서 시퀀스 값 관리 기본값 20
*/
-- 시퀸스(SEQ_EMPNO)를 생성하자. (시작값: 300, 증가치 : 5, 최대값: 310, NOCYCLE, NOCACHE )
CREATE SEQUENCE SEQ_EMPNO
START WITH 300
INCREMENT BY 5
MAXVALUE 310
NOCYCLE
NOCACHE; 

-- 시퀸스(SEQ_EMPNO) 활용해서 사용해보자
-- SEQ_EMPNO.NEXTVAL : 값을 생성시킴(시퀀스값에 일정 값을 증가시켜 발생한 결과값)
-- SEQ_EMPNO.CURRVAL : 값을 보여줌.(현재 시퀀스 값)
-- SEQ_EMPNO.NEXTVAL, SEQ_EMPNO.CURRVAL 발생시키고, 보여줄것
SELECT SEQ_EMPNO.NEXTVAL FROM DUAL;  -- 300값을 발생시킴
SELECT SEQ_EMPNO.CURRVAL FROM DUAL;  -- 현재값이 300값이므로 300을 보여준다.

SELECT SEQ_EMPNO.NEXTVAL FROM DUAL;  -- 305값을 발생시킴
SELECT SEQ_EMPNO.CURRVAL FROM DUAL;  -- 현재값이 305값이므로 305을 보여준다.

SELECT SEQ_EMPNO.NEXTVAL FROM DUAL;  -- 310값을 발생시킴
SELECT SEQ_EMPNO.CURRVAL FROM DUAL;  -- 현재값이 310값이므로 310을 보여준다.

-- 315값을 발생시킴 최대값 한계치로 증가하지 못한다.
-- [결과] ORA-08004: 시퀀스 SEQ_EMPNO.NEXTVAL exceeds MAXVALUE은 사례로 될 수 없습니다
SELECT SEQ_EMPNO.NEXTVAL FROM DUAL;  
SELECT SEQ_EMPNO.CURRVAL FROM DUAL;  -- 현재값이 310값이므로 310을 보여준다.

/*
SEQUENCE 정보 확인하기
SELECT * FROM USER_SEQUENCES;
*/ 
-- SEQUENCE 정보 확인
SELECT * FROM USER_SEQUENCES;

/*
>SEQUENCE 객체 삭제하기 
DROP SEQUENCE 시퀸스명; 
>시퀀스 정보확인하기
SELECT * FROM USER_SEQUENCES;
*/
-- SEQ_EMPNO 시퀸스 삭제하시오.
DROP SEQUENCE SEQ_EMPNO;

/*
NEXTVAL/CURRVAL 사용 가능 여부
사용가능부분
1)서브쿼리가 아닌 SELECT문
2)INSERT문의 SELECT절
3)INSERT문의 VALUE절
4)UPDATE문의 SET절
*/
-- 시퀸스(EMP_SEQ)를 생성한다. 시작값 : 1, 증가치 : 1 
CREATE SEQUENCE EMP_SEQ
    START WITH 1
    INCREMENT BY 1; 
SELECT * FROM USER_SEQUENCES;
    
-- 1)서브쿼리가 아닌 SELECT문
SELECT EMP_SEQ.NEXTVAL FROM DUAL;
SELECT EMP_SEQ.CURRVAL FROM DUAL;

-- 2)INSERT문의 SELECT절 사용한다.
-- 2.1 테이블(EMP_TARGET)을 생성한다.  EMP_NO, NAME, SALARY 제약조건 EMP_ID(PK)
CREATE TABLE EMP_TARGET(
    EMP_NO  NUMBER PRIMARY KEY,
    NAME VARCHAR2(20),
    SALARY NUMBER(9)
); 

-- 2.2 INSERT문(EMP_TARGET) 의 SELECT절(EMPLOYEE 사용) 적용한다. 
INSERT INTO EMP_TARGET(EMP_NO, NAME, SALARY)  
    SELECT EMP_SEQ.NEXTVAL, EMP_NAME, SALARY FROM EMPLOYEE; 

SELECT * FROM EMP_TARGET;

-- 3)INSERT문의 VALUE절 사용된다. 
-- 3.1)EMP_TARGET