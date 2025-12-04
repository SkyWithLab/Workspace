/*
    *함수(FUNCTION)
    :전달된 컬럼 값을 실행한 결과값을 반환 
    
    -단일 행 함수:N개의 값을 읽어서 N개로 결과값을 반환(행마다 함수의 실행한 결과를 반환)
    
    -그룹 함수 : N개의 값을 읽어서 1개의 결과값을 반환한다(그룹을 지어 그룹별로 함수의 결화를 반환한다.)
    
    -> SELECT절에는 단일행 함수와 그룹 함수를 함께 사용할 수 없음..
    -> 함수식을 사용할 수 있는 위치: SELECT WHERE ORDER GROUPBY HAVING 절 FROM빼고
*/
--==========================단일행 함수============================

/*
    *문자타입의 데이터 처리함수
    -> VARCHAR2(n), CHAR(n)
    
    *LENGTH(컬럼명 또는 '문자열'):문자열의 길이를 반환(글자수)
    *LENGTHB(컬럼명 또는 문자열): 문자열의 바이트수를 반환
    
    -> 영문자, 숫자, 특수문자 는 글자당 1BYTE임
    -> 한글은 글자당 3BYTE
*/
-- '오라클' 단어의 글자수와 바이트수 확인하기 ->
SELECT LENGTH('오라클') 글자수, LENGTHB('오라클') 바이트수--|3|9|
FROM DUAL; -- DUAL 임시 테이블 ,, 테이블 없을 때

--'ORACLE' 단어의 글자수와 바이트수 확인
SELECT LENGTH ('ORACLE')글자수, LENGTHB('ORACLE')바이트수 --|6|6|
FROM DUAL;

--사원 정부 중 사원명, 사원명의 글자수, 사원명의 바이트수
--              이메일, 이메일 글자수, 이메일 바이트수 
--SELECT EMP_NAME, LENGTH(EMP_NAME) "사원명(글자수)", LENGTHB(EMP_NAME)
--          EMAIL, LENGTH(EMAIL) "사원명(글자수)", LENGTHB(EMAIL) 이메일
--FROM EMPLOYEE;

/*
    *INSTR: 문자열로 부터 특정 문자의 시작위치를 반환한다.
    
    -INSTR(컬럼 또는 '문자열', '찾고자하는 문자'[찾을 위치의 시작값, 순번])
    -> 결과는, 숫자타입으로
*/
--SELECT INSTR('AABAACAABBAA', 'B') FROM DUAL;
--SELECT INSTR('AABAACAABBAA', 'B')
--SELECT INSTR('AABAACAABBAA', 'B')
--SELECT INSTR('AABAACAABBAA', 'B')

--사원 정보 중 이메일 에 _의 첫 번째위치, @의 첫번째위치 조회하기(이메일, _의 위치, @의 첫번째 위치)
SELECT EMAIL, INSTR(EMAIL,'_',1) "_위치", INSTR(EMAIL,'@')"@위치"
FROM EMPLOYEE;

--==========================================================================
/*
    SUBSTR:문자열에서 특정 문자열을 추출해서 반환
    -SUBSTR('문자열'또는 컬럼, 시작위치[,길이)
    -> 길이를 지정하지 않으면 문자열 끝까지 추출함...
*/

SELECT SUBSTR('ORACLE SQL DEVELOPER',10) FROM DUAL; --10부터 끝까지
SELECT SUBSTR('ORACLE SQL DEVELOPER',8,3)FROM DUAL; --8번째에서 3개까지만,
SELECT SUBSTR('ORACLE SQL DEVELOPER',-3) FROM DUAL; --뒤에서 3개만

--사원들의 이름, 주민번호 조회하기
SELECT EMP_NAME, EMP_NO
FROM EMPLOYEE;
--여자 사원들의 이름, 주민번호만 조회해보기
SELECT EMP_NAME, EMP_NO 
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1)='2' OR SUBSTR(EMP_NO,8,1)='4';

--ORDER BY EMP_NAME; -- 가나다 순으로 정렬
--함수 중첩사용 가능..
--사원정보중 사원명, 이메일, 아이디(이메일에서 @앞까지의 값)조회
--[1]이메일에서 @의 위치 찾기 INSTR
--[2]이메일 값에서 1번째 위치부터 @위치 전까지 추출-> SUBSTR함수 사용
SELECT EMAIL, INSTR(EMAIL,'@'), INSTR(EMAIL,'@')-1,SUBSTR(EMAIL,1,INSTR (EMAIL,'@')-1)
FROM EMPLOYEE;

--=========================================================================
 /*
    *LPAD / RPAD: 문자열을 조회할 떄 통일감있게 조회하고자 할 때 사ㅛㅇ
                    문자열에 덧붙이고자 하는 문자를 왼쪽 또는 오른쪽에 붙여서 최종 길이만큼 문자열 반환
                    
    -LPAD('문자열'또는 컬럼, 최종길이[덧붙일문자])--> 왼쪽에 덧붙일 문자를 채움
    -RPAD('문자열'또는 컬럼, 최종길이[덧붙일문자])--> 오른쪽에 덧붙일 문자를 채움
    -> 덧붙일 문잘 생략 시 기본값으로 공백으로 채움
 */
 --사원 정보중, 사원이름을 왼쪽을 공백으로 채워서 조회하기 길이는 20정도..
 SELECT EMP_NAME, LPAD(EMP_NAME,20) "이름2"
 FROM EMPLOYEE;
 
 --사원명, 에미일 조회(이메일을 오른쪽 정렬-> 왼쪽에 공백 채우기,,
 SELECT EMP_NAME, LPAD(EMAIL,20) "EMAIL"
 FROM EMPLOYEE;
 
 --#으로 왼쪽 채우기. 이메일..
 
  SELECT EMP_NAME, LPAD(EMAIL,20,'#') "EMAIL" --공백, 옆에 덧붙일거#임..
 FROM EMPLOYEE;
 
 --주민등록번호 뒷자리 다른값으로 표시하기..
 SELECT RPAD('000202-1',14,'*')FROM DUAL;
 
 --사원들 정보중 사원명, 주민번호 조회하기 /(xxxxxx-x******) 형식으로 조회하기
-- SELECT EMP_NAME 사원명, LPAD(SUNSTR(EMP_NO,
-- FROM EMPLOEE;

--=========================================================================

--LTRIM / RTRIM: 문자열에서 특정문자를 제거한 후 나머지를 반환

--LRRIM 문자열 또는 컬럼 제거하고자하는 문자들 -> 왼쪽에서 제거
--RTRIM 문자열 또는 컬럼 제거하고자하는 문자들 -> 오른쪽에서 제거
---> 제거할 문자들을 생략 시 공백을 제거함

SELECT LTRIM('      H I') FROM DUAL; -- 왼쪽의 공백들이 모두 제거 문자있는데까지,..
SELECT RTRIM('      H I     ') FROM DUAL; --오른쪽부터 공백이 아닌 문자가 있는 위치까지 공백 모두 제거..

SELECT LTRIM('123123H123', '123') FROM DUAL; --한글자한글자 인식하는거임

SELECT RTRIM('123123H123', '123') FROM DUAL;

/*
    TRIM문자열 앞 뒤 양쪽에 있는 지정한 무자들을 제거한 후 나머지 값을 반환ㅎ해ㄴ주는 함수
        옵션을 정해주기!!
        
    -TRIM[LEADING또는TRAILING또는BOTH][제거할문자 FROM]('문자열' 또는 컬럼명을 작성)
    -> 사용방법
     -> 제거할 문자 생략시 공백제거
     -> 위치 옵션 생략시 기본이 양쪽 제거임.    
*/

SELECT TRIM('      H I     ')"값" FROM DUAL; -- 양쪽 공백 제거됨
SELECT TRIM('L'FROM 'LLLLLHLLLLL') FROM DUAL; -- 양쪽 L만 제거됨
SELECT TRIM(LEADING 'L'FROM 'LLLLLHLLLLL') FROM DUAL; -- 왼쪽에 L들만 제거됨,,,LTRIM 유사
SELECT TRIM(TRAILING 'L'FROM 'LLLLLHLLLLL') FROM DUAL; -- 오른쪽에 L들만 제거됨,RTRIM 유사 
SELECT TRIM(BOTH 'L'FROM 'LLLLLHLLLLL') FROM DUAL; --양쪽 L들 제거됨...

--------------------------------------------------------------------------------
/*
    *LOWER UPPER INITCAP
    
    -LOWER ('문자열'또는 컬럼): 알파벳을 모두 소문자로 변환
    -UPPER ('문자열'또는 컬럼): 알파벳을 모두 대문자로 변환
    -INITCAP ('문자열'또는 컬럼): 띄어쓰기 기준으로 첫 글자마다 대문자로 변경하여 반환해줌
*/
--No pain No gain
SELECT LOWER('No pain No gain') FROM DUAL;-- 소문자로 전부 변경
SELECT UPPER('No pain No gain') FROM DUAL;-- 대문자로 전부 변경
SELECT INITCAP('No pain No gain') FROM DUAL; -- 앞글자만 대문자로 전부 변경 띄어쓰기 기준
--------------------------------------------------------------------------------
/*
CONCAT : 문자열 두개를 하나의 문자열로 합쳐서 반환
CONCAT('문자열1' , '문자열2')
*/

--'KH' ,'D강의장' 문자 두개를 합쳐서 조회하기
SELECT 'KH'||' D강의장' FROM DUAL;
SELECT CONCAT('KH',' D강의장')FROM DUAL;

--사원 번호와 사원명을 사용하여 조회( 조회형식: {사원번호}{사원명}님)
SELECT CONCAT(EMP_ID,CONCAT (EMP_NAME,'SLA'))사원정보
FROM EMPLOYEE;

--------------------------------------------------------------------------------
/*
REPLACE
REPLACE
*/
SELECT REPLACE('서울시 강남구 역삼동','역삼동','삼성동') FROM DUAL;

--SELECT *
--FROM EMPLOYEE;
--사원 정보중 잉메일의 @KH.OR.KR부분 @GMAIL.COM으로 변경하여 조회하기
SELECT EMAIL, REPLACE(EMAIL,'@kh.or.kr','@GMAIL.COM')
FROM EMPLOYEE;

/*
[숫자타입의 데이터 처리 함수]

ABS: 숫자의 절대값을 구해주는 함수이다ㅣ.
*/
SELECT ABS(-10)"-10의 절대값"FROM DUAL;

SELECT ABS(-7.7)"-7.7의 절대값"FROM DUAL;
--------------------------------------------------------------------------------
/*
MOD: 두 수를 나눈 나무지 값을 구해주는 함수
-MOD(숫자2,숫자2)-->숫자1%숫자2
*/
SELECT MOD(10,3) FROM DUAL;

SELECT MOD(10.9,3) FROM DUAL;
--------------------------------------------------------------------------------
/*
ROUND:반올림한 결과를 구해주는 함수이다.
ROUND(숫자[,위치]) 위치: 소숫점N번째자리
=> 반올림 위치 생략 시 첫재자리에서 반올림
*/
SELECT ROUND(123.456) FROM DUAL; -- 결과123
SELECT ROUND(123.456,1) FROM DUAL; --123.5
SELECT ROUND(123.456,2) FROM DUAL; --123.46

SELECT ROUND(123.456,-1) FROM DUAL; -- 120 일의 자리에서 반올림됨....
--------------------------------------------------------------------------------
/*
CEIL 올림처리 한 결과를 구해주는 함수이다.
CEIL(숫자)
*/
SELECT CEIL(123.456) FROM DUAL; --123뒤에를 올림처리해서 124로 결과
/*
FLOOR 버림 처리 한 결과를 구해주는 함수이다.
FLOOR(숫자)
*/
SELECT FLOOR(123.456) FROM DUAL; --123뒤에는 버림

/*
TRUNC 버림 처리한 결과를 구해주는 함수 위치 지정 기능
TRUNC(숫자[,위치])
*/





--------------------------------------------------------------------------------
/*
날짜 타입의 데이터 처리함수
*/
--SYSDATE : 시스템기준, 서버기준 현재날짜 및 시간 조회
SELECT SYSDATE FROM DUAL;

/*
MONTHS_BETWEEN: 두 날짜의 개월 수를 반환함
*/
SELECT EMP_NAME,HIRE_DATE
,CONCAT(CEIL(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)),'개월차')
FROM EMPLOYEE;

--------------------------------------------------------------------------------
/*
ADD_MONTHS: 특정 날짜에 N개월 수를 더해서 반환
ADD_MONTHS(날짜, 더할 개월 수)
*/

--현재 날짜 기준 3개월 후 조회
SELECT ADD_MONTHS(SYSDATE,3) FROM DUAL;

--사원 정보 사원명,입사일,입사일+3개월"수습종료일"조회
SELECT EMP_NAME, HIRE_DATE, ADD_MONTHS(HIRE_DATE,3)"수습종료일"
FROM EMPLOYEE;
--------------------------------------------------------------------------------
/*
NEXT_DAY: 특정 날짜 이후로 지정한 요일의 가장 가까운 날짜르 반환
NEXT_DAY(날짜,요일)
->요일의 경우 문자 또는 숫자
    1:일,2:월,...7:토
*/
--현재 날짜 기준으로 가장 가까운 금요일의 날짜 조회
SELECT SYSDATE, NEXT_DAY(SYSDATE,6) FROM DUAL;
--숫자는 언어설정 상관없이 동작됨

--------------------------------------------------------------------------------
/*
LAST_DAY : 해당월의 마지막 날짜를 구해주는 함수
LAST_DAY(날짜)
*/
SELECT LAST_DAY(SYSDATE) FROM DUAL;

--사원명, 입사일, 입사한 달의 마지막 날짜,입사한 달의근무일수 조회하기
SELECT EMP_NAME, HIRE_DATE, LAST_DAY(HIRE_DATE),LAST_DAY(HIRE_DATE) - HIRE_DATE +1

FROM EMPLOYEE;

--------------------------------------------------------------------------------
/*
EXTRACT: 특정 날짜로부터 년도/월/일/값을 추출해서반환해주는 함수
EXTRACT(YEAR FROM 날짜):년도 추출
EXTRACT(MONTH FROM 날짜):월 추출
EXTRACT(DAY FROM 날짜):일 추출
*/
--현재 날짜 기준 년도, 월, 일 각각 추출하여 조회
SELECT EXTRACT(YEAR FROM SYSDATE)"년도"
    ,EXTRACT(MONTH FROM SYSDATE)"월"
     ,EXTRACT(DAY FROM SYSDATE)"일"
     FROM DUAL;
--------------------------------------------------------------------------------
/*형변환함수
데이터 타입을 변환해주는 함수이다.
문자타입/ 숫자타입/ 날자타입

문자타입으로변환하는 함수
TO_CHAR: 숫자 또는 날짜 타입의 값을 문자 타입으로 변환해주는 함수

TO_CHAR(숫자또는날짜[,포멧형식])
*/
--숫자 타입에서 --> 문자타입으로 변환하는것
SELECT 1234 "숫자타입의 데이터", TO_CHAR(1234)"문자로 변환한 데이터" FROM DUAL;
--------------------------------------------------------------------------------
--날짜 -> 문자

SELECT SYSDATE, TO_CHAR(SYSDATE)"날짜타임을 문자타입으로" FROM DUAL;
/*
    HH: 시
    24시간 -> HH24
    MI: 분
    SS: 초
*/
SELECT TO_CHAR(SYSDATE,'HH:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE,'HH24:MI:SS') FROM DUAL;
/*
YYYY: 연도
YY: 연도 두글자 표현

MM:월
DD:일
*/
SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD HH24:MI:SS') FROM DUAL;
/*
DAY: 요일정보(월요일 화요일......등....)
DY: 월, 화,,,,,,,,등
*/
SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD-DAY DY') FROM DUAL;

/*
MONTH , MON:월 정보 (X월)
*/
SELECT TO_CHAR(SYSDATE,'MONTH MON') FROM DUAL;

--ALTER SESSION SET NLS_LANGUAGE=

--사원 정보 주 사원명,입사날자 조회(입사날짜 XXXX년XX월XX일 형식으로 조회하기
SELECT EMP_NAME, TO_CHAR (HIRE_DATE, 'YYYY"년"') "입사날짜"
FROM EMPLOYEE;
--> 표시할 문자를 큰따옴표로 ,,,
--------------------------------------------------------------------------------
/*
TO DATE: 숫자 타입 또는 문자 타입을 날짜 타입으로 변환해주는 함수
TO_DATE(숫자 또는 문자[,포멧])
*/
SELECT TO_DATE(20250911)
FROM DUAL;

SELECT TO_DATE(250911)
FROM DUAL;
SELECT TO_DATE(950911)--->자동으로 50년 이상 데이터는 19XX로 변환
FROM DUAL;

--SELECT TO_DATE(020911) --리터럴이 형식 문자열과 일치하지 않음//
--FROM DUAL;
SELECT TO_DATE('020911') --숫자는 0부타 시작하면 안되기 때문에 문자타입으로 작성을해라;
FROM DUAL;

--SELECT TO_DATE('250911 142700','YYMMDY HH24NISS') FROM DUAL;
-->시간정보가 포한된 데이터의 경우 형식지정하면됨

--------------------------------------------------------------------------------

/*
    NULL처리 함수
    NVL: 해당 컬럼의 값이 NULL인 경우 다른 값으로 대체해주는 함수
    NVL(컬럼, 해당값이 NULL인 경우 사용할값)
*/

--사원 정보 중 사원명, 보너스 정보를 조회(보너스 값이 NULL인 경우 0으로 조회
SELECT EMP_NAME,NVL(BONUS,0) BONUS
FROM EMPLOYEE;

--사원명보너스포함연봉
SELECT EMP_NAME, (SALARY+(SALARY*NVL(BONUS,0) ))*12
FROM EMPLOYEE;

/*
NVL2: 해당 컬럼이 NULL인 경우 표시할 값을 지정하고 NULL이 아닐경우 표시할 값 지정할 수 있는 함수
*/
--사원명, 보너스유무 (OX)조회
SELECT EMP_NAME,BONUS, NVL2(BONUS,'O','X')"보너스유무"
FROM EMPLOYEE;

-- 사원명, 부서코드, 부서배치여부(배정완료/미배정)조회
SELECT EMP_NAME, DEPT_CODE, NVL2(DEPT_CODE,'배정완료','미배정')"부서배치유무"
FROM EMPLOYEE;

/*
NULLIF : 두 값이 일치하면 NULL, 일치하지 않으면 비교대상 첫번째값을 반환한다.
NULLIF(비교대상1,비교대상2)
*/
--SELECT NULLIF('999,'999') FROM DUAL;
--SELECT NULLIF('999,'777') FROM DUAL;

/*
선택함수
DECODE(비교대상,비교값1,결과값1,비교값2,결과값2.....)
    +비교대상:컬럼, 연산식, 함수식 ...
*/
-- * 사번, 사원명, 주민번호, 성별 조회
--1남 2여 3남 4여 (조건,
SELECT EMP_ID, EMP_NAME, EMP_NO, DECODE(SUBSTR(EMP_NO,8,1),1,'남',2,'여',3,'남','4','여''알수없음') 성별
FROM EMPLOYEE;
--사원명, 기존급여, 인상될 급여 조회
/*
직급이 J7인 사원은 10%인상
직급이 J6인 사원은 15%인상
직급이 J5인 사원은 20%인상

그외에는 5% 인상
*/
SELECT EMP_NAME, JOB_CODE, SALARY, SALARY,
    DECODE(JOB_CODE,'J7', SALARY*1.1
                    ,'J6',SALARY*1.15
                    ,'J5',SALARY*1.2
                    ,SALARY*1.05) "인상될급여"
FROM EMPLOYEE;

/*
    CASE WHEN THEN: 조건식에 따라 결과값을 반환해주는 함수
    CASE
        WHEN 조건식1 THEN 결과값1
        WHEN 조건식2 THEN 결과값2
        ...
        ELSE 위의 조건을 만족하지 않는 결과값
    END 끝
*/

--사원명, 급여, 급여에 따른 등급 조회
--급여가 500만원 이상 고급
--급여가 300만원 이상 중급
--그외 초급
SELECT EMP_NAME,SALARY, 
    CASE 
        WHEN SALARY >=5000000 THEN '고급'
        WHEN SALARY >=3500000 THEN '중급'
        ELSE '초급'
    END
FROM EMPLOYEE;

--------------------------------------그룹함수-----------------------------------

/*
SUM : 해당컬럼값들의 총 합을 구해주는 함수이다.
*/
--전체사원들의 총 급여 조회하기!
SELECT SUM(SALARY) "총급여"
FROM EMPLOYEE;

--xxx,XXX,XXX 이런식으로 표시해보기
SELECT TO_CHAR(SUM(SALARY),'L999,999,999') "총급여"
FROM EMPLOYEE;

--부서코득 D5인 사원들의 총 연봉 (급여*12) 조회
SELECT SUM(SALARY*12) "D5부서총연봉"
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';
--------------------------------------------------------------------------------

/*
AVG: 해당 컬럼의 값들이 평균을 구해주는 함수

AVG(숫자타입컬럼)
*/
--전체 사원드르이 평균급여 조회(반올림)
SELECT ROUND(AVG(SALARY)) "평균급여"
FROM EMPLOYEE;
/*
MIN:해당컬럼의 값들 중 가장작은 값 반환해주는 함수
MIN(모든타입의 컬럼)
*/
SELECT MIN(EMP_NAME) "문자타입 최소값",MIN(SALARY)"숫자타입 최소값"
,MIN(HIRE_DATE) "날짜타입 최소값"
FROM EMPLOYEE;

/*
MAX:해당 컬럼의 값들중 가장 큰 값을 반환해주느 함수이당.
MAX(모든타입의 컬럼)
*/
SELECT MAX(EMP_NAME) "문자타입 최대값",MAX(SALARY)"숫자타입 최대값"
,MAX(HIRE_DATE) "날짜타입 최대값"
FROM EMPLOYEE;

/*
COUNT: 행의 갯수를반환해주는 함수이다.....단.조건이 있을 경우.. 조건에 맞는 행의 갯수반환
COUNT(*):조회된 결과에 모든 행의 갯수 반환
COUNT(컬럼): 해당 컬럼값이 NULL이 아닌것만 세서 반환함
COUNT(DISTINCT컬럼): 해당컬럼값의 중복을 제거한 후의 개수를 반환-> 중복 제거 시 NULL은 포함하지 않고 세어짐
*/
--*전체사원수 조회
SELECT COUNT(*) "전체사원수"
FROM EMPLOYEE;

