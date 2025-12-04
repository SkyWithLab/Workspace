/*
PL, SQL 
오라클 자체에 내장되어 있는,(JDK,JRE같은=SQL이들어있음) 절차적 언어
SQL의 단점을 보완하여 SQL 문장 내에서 변수의 정의 조건처리 ,반복처리등
ㄴ>DDL DML DCL DQL TCL(단행실행방법에 나타는단점을보완하여 SQL문장 등을 진행하여 단행으로 처리했던SQL 문으로 모아사 한번에실행

[구조]
[선언부] : DECLARE 로 시작 (변수 상수를 선언하고 초기화한다)
실행부 : BEGIN으로 시작한다 END로 종료 SQL문 제어문:조건문 반복문 을 사용하여 로직을 구현할 수 있다 
[예외처리부] EXCEPTION 으로 시작. 예외가 발생하면 처리
*/
-- PL SQL 실행하면 그 결과값을 볼수 있는 화면설정
SET SERVEROUTPUT ON;

-- PL SQL 문 작성하기,화면에 HELLO WORLD 출력 하는 프로그램
--SYSTEM.OUT.PRINTLN("HELLO WORLD"); (자바에서

--[선언부] : DECLARE 로 시작 (변수 상수를 선언하고 초기화한다)
BEGIN
    DBMS_OUTPUT.PUT_LINE('HELLO WORLD');
END;
/

-- BEGIN으로 시작한다 SQL문 제어문:조건문 반복문 을 사용하여 로직을 구현할 수 있다 
--[예외처리부]
--------------------------------------------------------------------------------
--변수타입 선언문
--DECLARE(선언부): 변수 또는 상수를 선언하는 부분, 초기값도설정할 수 있다.
--1. 데이터 타입
--일반타입
--레퍼런스 타입
--ROW타입 

--선언방식 
--    변수명[CONSTANT] 자료형[:=];
--    주의 - 상수선언 할때는 [CONSTANT] 넣어라
--    주의 - 젼수에 초기값을 설정할때는 := 사용한다

--아이디와 이름을 선언하고 각 변수에 상수값을 주고 출력하기
DECLARE
    EMP_ID NUMBER;
    EMP_NAME VARCHAR2(20);
    
BEGIN
    EMP_ID:=100;
    EMP_NAME :='홍길동';
    DBMS_OUTPUT.PUT_LINE('아이디 ='|| EMP_ID);
    DBMS_OUTPUT.PUT_LINE('이름 = '||EMP_NAME);
END;
/
--||문자열과 합해주는거



-- 레퍼런스 타입과 직접 상수값을 입력하지 않고 셀렉트 문을 이용해서 변수에 값을 저장한ㄷ,
--구조 ) 아이디와 이름을 선언하고 각 변수에 셀렉트문을 통해서 주고 출력한다.
--구조) SELET 값 INTO 선언된변수
-- SELECT 문을 진행할때 사용자에게 찾고자 하는 ENP_ID 입력받도록 한다 SCANNER = '&사용자정의변수'
--        FROM /GROUP BY , HAVING, ORDER BY .....
DECLARE
    EMP_ID EMPLOYEE.EMP_ID%TYPE;
    EMP_NAME EMPLOYEE.EMP_NAME%TYPE;
BEGIN
    SELECT EMP_ID, EMP_NAME INTO EMP_ID, EMP_NAME
    FROM EMPLOYEE
    WHERE EMP_ID = '&USER_ID';
    
DBMS_OUTPUT.PUT_LINE('아이디 ='|| EMP_ID);
DBMS_OUTPUT.PUT_LINE('이름 = '||EMP_NAME);
    
END;
/
--------------------------------------------------------------------------------

--레코드 타입 ROW타입
--( 테이블명%ROWTYPE)와 직접 상수값을 입력하지 않고 SELECT 문을 이용해서 한 레코드 타입값을 변수에 값을 저장한다.
--RORTYPE 을 선언하고 EMPLOYEE 테이블을 선언하고 각 변수에 SELECT문을 통해서 받고 출력한다.
--EMPLOYEE ㅔㅌ이블에서 SELECT 문을 진행할 때 사용자에게 찾고자 하는 EMP_NAME

DECLARE
    E EMPLOYEE%ROWTYPE;
    
BEGIN 
    SELECT * INTO E
    FROM EMPLOYEE;
    WHERE EMP_ID = '&USER_ID';
    
DBMS_OUTPUT.PUT_LINE('아이디 ='|| EMP_ID);
DBMS_OUTPUT.PUT_LINE('이름 = '||EMP_NAME);
DBMS_OUTPUT.PUT_LINE('월급 ='|| EMP_ID);

END;
/
--------------------------------------------------------------------------------

--TYPE 테이브렴ㅇ 컬럼명 %TYPE 과 직접상수값을 입력하지않고 SELECT 문을 이용해서 한 레코드 타입값을 레퍼런스 TYPE 변수에 값을 저장ㄹ한다.
--레퍼런스 TYPE 선언 EMPLOYEE 각 변수에 SELECT 문을 통해서 받고 출력한다 BONUS NULL이면 0으로 값을 준다 
--EMPLOYEE 테이블에서 SELECT 문을 진행할 때 사용자에게 찾고자 하는 EMP_ID 입력받도록 한다
--만약에 BONUS가 없으면 '보너스를 지급받지 않는 사원입니다. 출력한다.
--구조 ) ) SELECT INTO (선언된 ROWTYPE 변수) FROM.A JOIN B ON(A.ID = B.U_ID)WHERE

DECLARE
    EMP_ID EMPLOYEE.EMP_ID%TYPE;
    EMP_NAME EMPLOYEE.EMP_NAME%TYPE;
    EMP_SALARY EMPLOYEE.EMP_SALARY%TYPE;
    EMP_BONUS EMPLOYEE.EMP_BONUS%TYPE;
    
BEGIN
    SELECT EMP_ID, EMP_NAME, SALARY, MVL(BONUS,0) INTO EMP_ID, EMP_NAME, SALARY, BONUS
    FROM EMPLOYEE 
    WHERE EMP_ID = '200';
    
    DBNS_OUTPUT.PUT_LINE('ID' || EMP_ID);
    DBNS_OUTPUT.PUT_LINE('NAME' || EMP_NAME);
    DBNS_OUTPUT.PUT_LINE('SALARY' || EMP_SALARY);
    DBNS_OUTPUT.PUT_LINE('BONUS' || EMP_BONUS);
    
    IF(BONUS = 0)
    THEN
         DBNS_OUTPUT.PUT_LINE('보너스를 지급받지 않는 사원입니다');
    END IF;
        DBMS_OUTPUT.PUT_LINE||'보너스율은'||BONUS * 100 ||%
END
/
--------------------------------------------------------------------------------

조인테스트 EMPOLYEE DEPARTMENT LOCATION

DESC EMPLOYEE;

DECLARE
    
BEGIN
    IF(NATIONAL_CODE = 'KO')
    THEN
        TEAM :='국내팀'
        TEAM :='해외팀'
        
        END IF;
        DBMS_OUTPUT.PUT_LINE('EMP_ID='||EMP_ID);
        DBMS_OUTPUT.PUT_LINE('EMP_NAME='||EMP_NAME);
        DBMS_OUTPUT.PUT_LINE('DEPT_TITLE='||DEPT_TITLE);
        DBMS_OUTPUT.PUT_LINE
        DBMS_OUTPUT.PUT_LINE
END;
/
--------------------------------------------------------------------------------

DECLARE
    SCORE NUMBER(3);
    GRADE VARCHAR2(2);
BEGIN
    SCORE >=&'SCORE';
    
    IF SCORE >= 90 THEN GRADE :='A';
    ELSIF SCORE >=80 THEN GRADE :='B';
    ELSIF SCORE >=70 THEN GRADE :='C';
    ELSIF SCORE >=60 THEN GRADE :='D';
    
    DBMS_OUTPUT.PUT_LINE(SCORE||'점의 점수 등급은'||GRADE||'등급입니다.');
END;
/
--------------------------------------------------------------------------------

--[무한루프문,,] 30개만 이해하면됨.
--[무한루프 구조]
--LOOP
----명령어
--IF(조건)THEN
--    EXIT;
--    END IF;
--END LOOP

--무한루프문을 사용해서 1-5 까지 출력하는 프로그램을 만들기

DECLARE
    NUM NUMBER :=1;       --초기값 주기(선언) 변수명 타입 := 타입에맞는초기값;
    
BEGIN
    LOOP
    DBMS_OUTPUT.PUT_LINE('NUM='||NUM);
    NUM :=NUM +1;
    IF(NUM >=5)THEN
    EXIT;
    END IF;
    END LOOP;
    
END;
/
--------------------------------------------------------------------------------
--WHILE 루프문

--WHILE LOOP문을 사용해서 1-5까지 출력하는 프로그램을 작성하시오
DECLARE
    NUM NUMBER(2) :=1;
BEGIN
    WHILE(NUM <= 5)LOOP
     DBMS_OUTPUT.PUT_LINE('NUM ='
    END LOOP;
    
END;
/
--------------------------------------------------------------------------------

--FOR LOOP

DECLARE
BEGIN
    FOR K IN REVERSE 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('K = '||K);
    END LOOP;
END;
/
--------------------------------------------------------------------------------
--재정의 타입 변수선언
--:복잡한구조 ( 배열구조 ) 타입선언을 재정의한다.
--[구조] type 재정의타입명 IS TABLE OF 테이블.컬럼%TYPE INDEX BY BINARY_INTEGER;

--반복문 FOR LOOP 방식
--구조
--FOR 변수 IN 배열구조형식 LOOP
--명령어
--END LOOP;
--
--1) 타입을 재정의하시오 래퍼런스타입[] -> 테이블.컬럼%TYPE INDEX BY BINARY_INTEGER;
--1.1)EMPLOYEE.EMP_ID% TYPE[] 재정의하시오
--2.3)--EMPLOYEE.EMP_NAME% TYPE[]재정의하시오 
--재정의 타입으로 변수를 선언한다
--FOR LOOP를 통해서 EMPLOYEE 에 SELECT통해서 ROWTYPE 데이터를 받는다 
--FOR LOOP안에서 ROWTYPE에 각각 컬럼값을 TABLE 서언된 변수에 입력한다
--테이블 타입에 선언된 배열값을 출력한다(FOR LOOP)

DECLARE 
    TYPE EMP_ID_TABLE_TYPE IS TABLE OF EMPLOYEE.EMP_ID% TYPE INDEX BY BINARY_INTEGER;
    TYPE ENP_NAME_TABLE_TYPE IS TABLE OF EMPLOYEE.EMP_NAME%TYPE INDEX BY BINARY_INTEGER;
    EMP_ID_TABLE EMP_ID_TABLE_TYPE;
    EMP_NAME_TABLE EMP_NAME_TABLE_TYPE;
    
BEGIN
    FOR ROW_DATA IN (SELECT EMP_ID, EMP_NAME, FROM EMPLOYEE) LOOP
    
END LOOP;
/
--------------------------------------------------------------------------------
--위에 있는 프로그램을 레코드 타이브로 재정의 하고 리빌딩하기
DECLARE 
    TYPE EMP_RECORD_TYPE IS RECORD(
    EMP_ID EMPLOYEE.EMP_ID%TYPE,
    EMP_NAME EMPLOYEE.EMP_NAME%TYPE,

BEGIN
    DBMS 
END;
/
--------------------------------------------------------------------------------
--CASE 선택문
--구조 ) CASE 변수 
--WHEN 값 THEN 내용
--WHEN 값 THEN 내용
--WHEN 값 THEN 내용
--WHEN 값 THEN 내용
--ELSE 내용
--END;

DECLARE
    EMP_ROW EMPLOYEE%TYPE;
    DEPART_NAME VARCHAR2(50);
BEGIN
    SELECT * INTO EMP_ROW 
    FROM EMPLOYEE 
    WHERE EMP_ID = '&USER_EMP';
END;
/

SELECT * FROM EMPLOYEE;

--------------------------------------------------------------------------------

--EXCEPTION
--    WHEN 예외명 THEN 예외처리문;
--    WHEN 예외명 THEN 예외처리문;
--    WHEN 예외명 THEN 예외처리문;
--    
--    WHEN OTHERS THEN 예외처리문;
--[참고] OTHERS: 어떤 예외든 발생한것을 모두 받는다.
--오라클에서 미리 정의한 예외처리   -> 시스템예외
DUP_VAL_ON_INDEX 유일인덱스에 중복값을 입력했을 경우 발생되는예외
NO_DATA_FOUND 한건도 리턴하지 못했을경루 발생하는 예외
TOO_MANY_ROWS 두건이상의 행을 리턴헸을 때 발생되는 예외
ZERO_DIVIDE 0으로 나누려 했을 때발생하는 예외

--사용자에게사 값을 입력을 받아 100을 나는 결과값으로 출력하기
--주의: 사용자가 0을 입력하면 오류가 발생하므로 예외처리를 하시오

DECLARE
    NUM NUMBER;
    DATA_VALUE NUMBER;
    
EXCEPTION
    WHEN ZERO_DIVIDE THEN DBMS_OUTPUT.PUT_LINE('
BEGIN
    NUM :='&USER_NUM';
END;
/
--------------------------------------------------------------------------------

