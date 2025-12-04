/*
Join,,
        :두개 이상의 테이블 연결해서 하나의 가상테이블처럼 조회한다...

관계형 데이터베이스. 에서는 최소한의 데이터를 각각의 테이블에 저장..이유는 중복저장 최소호ㅘ하기 위해
최대한 쪼개서 관리

오라클 에서은 join은 크게 ANSI (국제 표준협회에서 지정)
--------------------------------------------------------------------------------
    
     
     오라클 전용구문      |   ANSI 구문       
                                           
                                         
--------------------------------------------------------------------------------
    등가조인?            |   내부조인
    (EWUAL JOIN)        |   INNER JOIN) 
    
--------------------------------------------------------------------------------
    포괄조인             |   외부조인
    OUTER JOIN          | LEFT RIGHT FULL OUTER JOIN
    
--------------------------------------------------------------------------------
    자체조인(SELF)       | 동일한 테이블에 JOIN ON사용
    비동가조인(NON EWUAL  | JOIN ON +비교연산자 (BETWEEN , > < = ...
    
--------------------------------------------------------------------------------
    
*/

--전체 사원ㄷ들의 사버느 사원명, 부서코드 조회하기
SELECT EMP_ID, EMP_NAME, DEPT_CODE
FROM EMPLOYEE;

--부서코드 부서명 조회하기

SELECT DEPT_ID, DEPT_TITLE
FROM DEPARTMENT;

-- 위 두개의 테이블을 결합할거임/ 
/*
조건이 같을 떄 (EQUAL JOIN)/내부조인
두 테이블의 연결되는 컬럼 ,, 같은 값인 행들만 결과에 포함된다.
즉 조건에 일치하지 않는거는 결과제외
*/
--오라클 전용구문//// ANSI구문으로 해볼거임
--FROM절에 조회하고자 하는 테이블 나열 , 로 구분함
--WHERE절에 매칭시킬 컬럼 조건을 작성
SELECT EMP_ID, EMP_NAME, DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID
ORDER BY EMP_NAME;
---> EMPLOYEE 테이블에서 부서코드 가 NULL인 사원은 결과ㅈ에서 제외됨

-- 사번, 사원명 , 직급명 조회하기 (오라클)
SELECT EMP_ID, EMP_NAME, JOB_CODE
FROM EMPLOYEE E, JOB J
WHERE E.JOB_CODE = J.JOB_CODE

-- FROM절에 기분이 되는 테이블을 하나 작성,, JOIN절에 조인하고자하는 테이블을 작성+
--매칭시키고자 하는 조건을 작성
--사번, 사원명, 부서명 조회할거임(ANSI)
SELECT EMP_NAME, JOB_CODE, DEPT_CODE
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;
    
--------------------------------------------------------------------------------

--대리 직급인 사원의 사번, 사원명, 직급명 급여 조회

--오라클 구문
SELECT EMP_ID,...
FROM EMPLOYEE E, JOB J
WHERE E.JOB_CODE = J.JOB_CODE
    AND JOB_NAME = '대리';
--ANSI 구문
SELECT EMP_ID, 



--------------------------------------------------------------------------------

--퀴즈--

--1. 인사관리부 부서의 사원들의 사번, 사원명, 보너스 조회
--오라클 
SELECT EMP_ID, EMP_NAME, BONUS
FROM EMPLOYEE, DEPARTMENT 
WHERE DEPT_CODE = DEPT_ID
    AND DEPT_TITLE = '인사관리부';
--AMSI
SELECT EMP_ID, EMP_NAME, BONUS
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;

--2. 전체 부서의 부서코드, 부서명, 지역코드, 지역명 조회하기
--
--오라클 
--
--AMSI

--3. 보너스를 받는 사원의 사번, 사워명, 보너스, 부서명 조회하기

--
--오라클 
--
--AMSI
--4. 총무부가 아닌 사원들의 사원명 급여조회
--오라클 
--SELECT --사원명, 급여
--FROM 사원들,총무부
--WHERE DEPT_CODE = DEPT_ID
--    AND DEPT_TITLE = '총무부';

--AMSI
--SELECT --사원명, 급여
--FROM 사원들
--    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
--WHERE DEPT_TITLE <> '총무부';

--------------------------------------------------------------------------------

/*
포괄 조인/ 외부 조인

두 테이블을 조인할 때 조인 조건에 맞지 않는 행도 결과에 포함하는 거

LEFT OUTER JOIN 두 테이블 중 왼쪽에 작성된 테이블을 기분으로 조인
                (왼쪽 테이블의 모든 행 + 조건에 맞는 오른쪽 테이블 행

RIGHT OUTER JOIN 두 테이블 중 오른쪽에 작성된 테이블을 기준으로 조인


FULL OUTER JOIN 두 테이블이 가진 모든 행을 조회하는 굼누(오라클 전용 구문X)
*/

-- 
--모든 사원의 사원명, 부서명, 급여 ,연봉조회
--LEFT OUTER JOIN 으로 해보게씀

--오라클
--->기준이 되지 않는 테이블의 컬럼 옆에 (+) 기호를 넣어 표현
SELECT EMP_NAME, DEPT_TITLE, SALARY, SALARY*12 "연봉"
FROM EMPLOYEE,DEPARTMENT
WHERE 
--ANSI
SELECT EMP_NAME, DEPT_TITLE, SALARY, SALARY*12 "연봉"
FROM EMPLOYEE,
--LEFT JOIN,,,,,,,ON,,,,,,,;



--RIGHT OUTER JOIN으로 해보게씀

--FULL OUTER JOIN -오라클 구문 없음 // ANSI만 있음
SELECT EMP_NAME, DEPT_TITLE, SALARY, SALARY*12 "연봉"
FROM EMPLOYEE
    FULL JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);
    
--------------------------------------------------------------------------------

/*
비등가조인 NON EQUAL JOIN 
- 같은 비교가 아니라 범위비교,, 할때 사용
= 대신에 < > BETWEEN LIKE 등의 비교 연산자를 사용해서 매칭하는 조인..
(주로 범위 조건으로 매칭할 때 사용함)

ANSI 구문에서는 USING ON만 사용 가능
*/

--사원에 대한 급여등급 조회 ... 사원명,급여,급여등급
--
--사원 EMPLOYEE 급여등급 SAL_GEADE
--오라클구문
--WHERE SALARY >= MIN_SAL AND SALARY <= MAX_SAL;
--ANSI구문
--FROM EMPLOYEE
--    JOIN SAL_GRADE ON (SALARY BETWEEN MIN_SAL AND MAX SAL);

--------------------------------------------------------------------------------
/*
SELF JOIN 하나의 테이블을 마치 서로 다른 테이블처럼 별칭을 A,B 처럼 주어 조인하는 구문.
이유: 테이블 내 자기자신과 관계있는 데이터를 조회할 때 사용한다.
*/
--전체사원의 사번, 사원명 부서코드
--               사수 사번, 사수 사원명, 사수 부서코드 조회
--              오라클구문  
SELECT E.EMP_ID,E.EMP_NAME, E.DETP_CODE
        M.EMP_ID,M.EMP_NAME,M.DETP_CODE
FROM EMPLOYEE E, EMPLOYEE M
WHERE E.MANAGER_ID = M.ENP_ID      --두 사원을 사번을 조인시킴

--ANSI구문
SELECT E.EMP_ID,E.EMP_NAME, E.DETP_CODE
        M.EMP_ID,M.EMP_NAME,M.DETP_CODE
FROM EMPLOYEE E
     JOIN EMPLOYEE M ON (E.MANAGER_ID = M.EMP_ID);
     
--------------------------------------------------------------------------------
/*
다중 조인: 2개 이상의 테이블을 조인하는것
*/
-- 사번, 사원명 부서명 직급명 조회
--



--------------------------------------------------------------------------------

--사번 사원명 부서명 지역명
--LOCATION EMPLOYEE DEPARTMENT
--FROM 기준이되는 조회할 테이블
--EMPLOYEE DEPARTMENT 연결
--    LOCATION DEPARTMENT 결합
--> ANSI 구문에서는 JOIN 시 순서에 유의해야한다...
--------------------------------------------------------------------------------

--문제!

--1) 사번 사원명 부서명 지역명 국가명 
--오라클
SELECT EMP_ID, EMP_NAME, DEPT_TITLE,LOCAL_NAME, NATIONAL_CODE
FROM EMPLOYEE DEPARTMENT , LOCATION L, NATIONAL N,
WHERE DEPARTMENT EMPLOYEE 연결
AND DEPARTMENT LOCATION 연결
AND LOCATION NATIONAL 연결
--ANSI
SELECT EMP_ID, EMP_NAME, DEPT_TITLE,LOCAL_NAME, NATIONAL_CODE
FROM EMPLOYEE
    JOIN DEPARTMENT ON 컬럼 = 컬럼
    JOIN LOCATION ON 컬럼 = 컬럼
    JOIN NATIONAL USING 컬럼;

--2) 사번 사원명 부서명 직급명 국가명 급여등급 
--오라클
SELECT EMP_ID, EMP_NAME, DEPT_TITLE,LOCAL_NAME, NATIONAL_CODE
FROM EMPLOYEE

--ANSI






--------------------------------------------------------------------------------