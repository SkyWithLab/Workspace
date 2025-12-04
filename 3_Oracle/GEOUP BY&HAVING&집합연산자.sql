/*
GRUOP BY절

:그룹 기준을 제시할 수 있는 구문
:여러 개의 값들을 하나의 그룹으로 묶어서 조회하기 위한 목적으로 사용
*/
--전체사원의 급여 총 합 조회
SELECT SUM(SALART)
FROM EMPLOYEE;

--부서별 급여 총 합 조회
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--부서 내 직급별로 사원수, 급여총합 조회
SELECT DEPT_CODE, JOB_CODE,COUNT(*) "사원수", SUM(SALARY) "급여총합"
FROM EMPLOYEE
GROUP BY DEPT_CODE, JOB_CODE
ORDER BY DEPT_CODE;
--------------------------------------------------------------------------------
 /*
 HAVING절
 :그룹에 대한 조건을 제시할 때 사용하는 구문
 --각 부서별평균급여 조회(반올림해서)
 */
 --각 부서별 평균급여가 300만원 이상인 부서만 조회
 SELECT DEPT_CODE, ROUND (AVG(SALARY)) "평균급여"
 FROM EMPLOYEE
 GROUP BY DEPT_CODE
 HAVING AVG(SALARY) >=3000000;
 
--직급 별 직급코드, 총 급여합 조회( 직급별 급여 합이 1000만원 이상인 직급조회
SELECT JOB_CODE, SUM(SALARY) "총급여합"
FROM EMPLOYEE
GROUP BY JOB_CODE
HAVING SUM(SALARY) >= 10000000;

SELECT DEPT_CODE, JOB_CODE,SUM(SALARY) "급여총합"
FROM EMPLOYEE
GROUP BY ROLLUP(DEPT_CODE,JOB_CODE)
ORDER BY 1;

SELECT DEPT_CODE, JOB_CODE,SUM(SALARY) "급여총합"
FROM EMPLOYEE
GROUP BY CUBE(DEPT_CODE,JOB_CODE)
ORDER BY 1;
--------------------------------------------------------------------------------
--SELET문

--SELECT *|컬럼AS"별칭"|함수식|연산식   5
--FROM 테이블|DUAL  1
--WHERE 조건식(연산자들을 활용하여 작성)  2
--GROUP BY 그룹화가 기준이 되는컬럼 | 함수식  3
--HAVING 조건식(그룹함수를 활용하여 작성) 4
--ORDER BY 컬럼| 별칭| 컬럼순번[ASC|DESC][HULL RIEST LAST]  6

--오라클에서는 순서(위치) 1부터 시작

--------------------------------------------------------------------------------

/*
집합연산자
:여러개의 쿼리문을 하나의 쿼리문으로 만들어주는 연산자
UNION 교집합
INTERSECT 교집합 -> AND 와 유사하구나,....
UNION ALL 합집합인데 교집합 결과를 더해서 중복되는 부분이 두번 조회 될 수 있다..전부
MINUS 차집합 앞의 결과갚에서 후 결과값을 뺀 나머지
*/

--------UNION
--부서코드가 D5인 사원 또는 급여가 300만원 초과인 사원들의 정보를 조회
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5' OR SALARY > 3000000;

/*
-----------------------------집합 연산자 사용 시 주의사항----------------------------
1) 쿼리문들의 컬럼 개수가 동일해야함
2) 컬럼 자리마다 동일한 타입으로 작성해줘야 함
3) 정렬하고자 한다면 ORDER BY 절은 마지막에 작성해야한다.
*/
SELECT EMP_ID, EMP_NAME, DEPT_CODE,SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5' --6
--ORDER BY EMP_ID 오류발생--
UNION
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE