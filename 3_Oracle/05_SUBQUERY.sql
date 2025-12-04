/*
    SUBQUERY
    :하나의 쿼리문 내에서 소괄호()로 감싸져사용되는 또 다른 쿼리문
    메인쿼리문 의 조건이나 결과를 위해 먼저 실행되어 값으 제공(보조역할 서브임...)
*/
--노옹철 사원과 같은 부서에 속한 사원정보를 조회
--1. 노옹철 사원의 부서코드를 조회
SELECT DEPT_CODE
FROM EMPLOYEE
WHERE EMP_NAME = '노옹철';

2. 부서코드가 D9인 사원들의 정보 조회
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE = 'D9';

--1.2. 쿼리문을 하나로 합치기 ( 1번 서브 // 2번 쿼리 )
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE = (
                    SELECT DEPT_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME = '노옹철'
                    );
                    
--전체 사원의 평균 급여보다 더 많은 급여를 받는 사원의 정보를 조회

--1. 전체사원의 평균급여조회
SELECT (AVG(SALARY))
FROM EMPLOYEE;

--2.평균 급여보다 많이 받는 사원의 정보 조회
SELECT *
FROM EMPLOYEE

--1,2 합체!!
SELECT *
FROM EMPLOYEE
WHERE SALARY > = (SELET ROUND(AVG(SALARY))
                    FROM EMPLOYEE);
                    
--서브쿼리으 ㅣ종류
--:서브쿼리를 수행한  결과의 행과 열 수에 따라 분류
--단일행 서브쿼리 : 서브쿼리의 수행 결과가 오로지 1개일 때(1행1열)
--다중행 서브쿼리 : 서브쿼리의 수행 결과가 여러 행일 때
--다중열 서브쿼리 : 서브쿼리의 수행 결과가 한 행이고 여러개의 컬럼일 때 (1행N열)
--다중행 다중열 서브쿼리 : 서브쿼리의수행 결과가 여러 행이고ㅡ 여러 컬럼일 때 N행 N열

-->>>종류에따라 서브쿼리 앞에 사용되는 연산자가 달라질 수 있다.
/*
단일행 서브쿼리 : 서브쿼리 결과가 오로지 1개

비교연산자 사용: = < > <= >=
*/

-- 전 직원의 평균급여보다 더 적게 (미만) 급여를 받는 사원의 사원명, 직급코드, 급여조회

SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY < (SELECT ROUND(AVG(SALARY)) FROM EMPLOYEE);

--최저 급여를 받는 사원의 사원명, 급여, 입사일 조회

SELECT EMP_NAME, SALARY, HIRE_DATE
FROM EMPLOYEE
WHERE SALARY = (SELECT MIN(SALARY)FROM EMPLOYEE);

--노옹철 사원의 급여보다 많이 받는 사원의 사원명, 부서코드 급여코드 조회
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > (SELECT SALARY FROM EMPLOYEE WHERE EMP_NAME = '노옹철');

--------------------------------------------------------------------------------
/*
다중행 서브쿼리 : 서브쿼리의 겨로가가 여러 행인경우 (N행1열)

IN (서브쿼리) :여러 개의 결과값중 하나라도 일치하는 값이 있다면 결과로 표시ㄹ를 해준다.

>ANY(서브쿼리): 여러개의 결과값중에서 하나라도 크면 결과로 표시
<ANY(서브쿼리): 

>ALL
<ALL
--유재식 사원 또는 윤은해 사원과 같은 직급인 사원들의 정보를 조회
(사번 사원명 직급코드 급여)

유재식 윤인해 사원의 직급 코드 

--------------------------------------------------------------------------------
*/

SELECT JOB_CODE
FROM EMPLOYEE
WHERE EMP_NAME IN ('윤은해','유재식');

SELECT EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE JOB_CODE IN ('J3','J7');

SELECT EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE JOB_CODE IN (
                    SELECT JOB_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME IN ('윤은해','유재식'));
                    
--대리직급인 사원들 중에 과장 직급인 사원의 최소 급여보다 많이 받는 사원 조회
--(사번 이름 직급명 급여)
--1. 과장직급인 사원들의 급여 조회
SELECT SALARY
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE)
WHERE JOB_NAME ='과장';

--3760000
--2200000
--2500000

-->ANY연산자를 사용하여 비교하자
SELECT EMP_ID, EMP_NAME, JOB_NAME, SALARY
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE)
    WHERE JOB_NAME = '대리'
        AND SALARY > ANY (
        
        
--------------------------------------------------------------------------------

--박나라 사원과 같은 직급이고, 같은 사수를 가지고 있느 사원의 정모조회
--사원명 직급코드 사수번호
SELECT JOB_CODE, MANAGER_ID
FROM EMPLOYEE
WHERE EMP_NAME = '박나라';

--------------------------------------------------------------------------------

--
--    * 순서를 매기는 함수 (WINDOW FUNCTION)
--    FANK () OVER ( 정렬기준 ) 동일한 순의 이후의 등수를 동일한 순위의 개수만큼 건너뛰고 계산
--    122256
--    DENSE_RANK OVER ( 정렬기준) 
--    122234

--급여가 높은 순서대로 순위를 매겨서 조회
SELECT EMP_NAME, SALARY,
            RANK()OVER(ORDER BY SALARY DESC) "순위"
FROM EMPLOYEE;

SELECT EMP_NAME, SALARY,
            DENSE_RANK() OVER(ORDER BY SALARY DESC) "순위"
            FROM EMPLOYEE;'
            
            
            
------------------------------------------------------------------------------- 

-- 1) ROWNUM을 활용하여 급여가 가장 높은 5명을 조회하려고 했으나, 제대로 조회가 되지 않았다.
SELECT ROWNUM, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE ROWNUM <= 5
ORDER BY SALARY DESC;

-- 문제점 : 
-- 해결 :
SELECT ROWNUM, EMP_NAME, SALARY
FROM (SELECT EMP_NAME, SALARY
           FROM EMPLOYEE
           ORDER BY SALARY DESC)
WHERE ROWNUM <= 5;

-- 2) 부서별 평균 급여가 270만원을 초과하는 부서에 해당하는 부서코드, 부서별 총 급여합, 부서별 평균급여, 부서별 사원 수를 조회하려고 했으나 제대로 조회가 되지 않았다.
SELECT DEPT_CODE, SUM(SALARY) "총합", FLOOR(AVG(SALARY)) "평균급여", COUNT(*) "사원수"
FROM EMPLOYEE
WHERE SALARY > 2700000
GROUP BY DEPT_CODE
ORDER BY DEPT_CODE ASC;

-- 문제점 : 
-- 해결 : 
SELECT DEPT_CODE, "총합", "평균급여", "사원수"
FROM (SELECT DEPT_CODE, SUM(SALARY) "총합", FLOOR(AVG(SALARY)) "평균급여", COUNT(*) "사원수"
           FROM EMPLOYEE
           GROUP BY DEPT_CODE)
WHERE 평균급여 > 2700000
ORDER BY DEPT_CODE ASC;