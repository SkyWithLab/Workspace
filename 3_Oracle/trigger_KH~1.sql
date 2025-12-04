/*TRIGGER
테이블이나 뷰가 INSERT UPDATE DELETE 등 변경될경우 
자동으로 실행될 내용을 정의하여 저장하는 객체

변경시점
BEFORE TRIGGER, 
AFTER TRIGGER
BEFORE TRIGGER 지정한 테이블에서 이벤트가 발생하기 전에 트리거를 실행

CREATE OR REPLACE TRIGGER TRG_01
AFTER INSERT
ON EMPLOYEE
BEGIN
*/
--------------------------------------------------------------------------------
CREATE TABLE PRODUCT(
    PCODE NUMBER PRIMARY KEY,
    PNAME CARCHAR2(30),
    BRAND VARCHAR2(30),
    PRICE NUMBER,
    STOCK NUMBER DEFAULT 0 
);
CREATE TABLE PRO_DETAIL(
    DCODE NUMBER PRIMARY KEY,
    PCODE NUMBER,
    PDATE DATE,
    AMOUNT NUMBER,DEFAULT 0 
    STATUS VARCHAR2(10) CHECK(STATUS) IN '입고','출고')),
    FOREIGN KEY(PCODE) REFERENCES PRODUCT(PCODE)
);
--------------------------------------------------------------------------------
SEQUENCE
INCREMENT BY
NOCACHE
CONSTRAINTS
NEXTVAL
BEFORE AFTER
EXCEPTION
FOR EACH
REPLACE

DDL->INDEX
--------------------------------------------------------------------------------

