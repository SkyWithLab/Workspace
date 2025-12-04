-- 한 줄 주석
/*
    여러줄 주석
*/

--현재모든 계정 정보를 조회해보기!
SELECT * --*은 모든데이터를 의미
FROM DBA_USERS;
-- * 명령문 실행: CTRL + ENTER 키보드 입력 또는 재생버튼. 클릭!

-- 일반 사용자 계정을 생성하기 -> 관리자 계정으로만 사용자계정을 생성할수있다
--표현법 )) CREATE USER 계정명 IDENTIFIED BY 비밀번호; -- 계정추가할때 명령문임
--* 12C 버전 이후로는 계정명 앞에 C##을 붙여줘야 한다.(변경됨)

--KH / KH 계정생성
CREATE USER C##KH IDENTIFIED BY KH;

--생성된 계정에 권한을 부여하기
--표현법 )) GRANT 권한1,권한2,...TO계정명;

--KH계정에 최소한의 권한 부여( 접속, 데이터관리)
GRANT CONNECT, RESOURCE TO C##KH;
-- CONNECT 연결권한
--RESOURCE 데이터베이스에서 객체(테이블, 시퀀스, 프로시져...등 다양한 객체들에대한 생성권한을부여했다.)

--테이블 스페이스설정
ALTER USER C##KH DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;
