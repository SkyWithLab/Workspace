
--ORACLE DATABASE
--구조화된 정보를 처리하도록 요청하는 언어 SQL


프로젝션? 
아이디가 1만인 행만 보고싶다
SELECT *
FROM TOPIC 
WHERE ID = 1;

--------------------------------------------------------------------------------
--출력된 결과의 정렬상태를 바꾸고 /출력되는 행의 갯수를 바꾸는 방법
--ORDER BY 

SELECT *
FROM TOPIC
ORDER BY ID DESC; 아이디를 기준으로해서 정렬,큰숫자가 먼저 나오게 한다.
DESC --큰숫자가 먼저 나오게 한다.
ASC -- 작은숫자가 먼저 나오게 한다.

--------------------------------------------------------------------------------
--페이지 기법
SELECT*
FROM TOPIC
OFFSET 1 ROWS;
--OFFSET 0번째 이후에 나오는 행들을 가져온다.
SELECT*
FROM TOPIC
OFFSET 0 ROWS;
FETCH NEXT 1 ROWS ONLY;
--FETCH 페이지의 기능을 구현할 수 있다.
--------------------------------------------------------------------------------
--행의 내용을 수정하고 싶을때
UPDATE TOPIC
 SET TITLE = 'MSSQL',
 DESCRIPTION = 'MSSQLIS...'
WHERE ID = 3; -- 3번아이디의 행만 바꾸는거임
--------------------------------------------------------------------------------
--삭제 DELETE
DELETE FROM TOPIC WHERE ID =3; -- 컬럼의 아이디값이 3인 행만을 삭제하겠다.
--COMMIT; 다했다.
COMMIT;
--------------------------------------------------------------------------------
문제1

테이블 Employees 가 있어. 컬럼은 employee_id, first_name, last_name, salary, department_id 이다.

요구사항: 모든 직원의 성(last_name)과 월급(salary)을 월급 내림차순으로 출력하라.


SELECT  last_name , SALARY
FROM Employees
ORDER BY salary DESC;
--------------------------------------------------------------------------------
식별자 = 중복되면 안된다.


