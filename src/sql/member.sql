--계정생성
CREATE USER oracle IDENTIFIED BY password
--테이블 생성
CREATE TABLE meber(
 id VARCHAR2(10),
 pass VARCHAR2(10),
 name VARCHAR2(10),
 ssn VARCHAR2(14),
);
INSERT INTO member(id, name, pass, ssn)
VALUES('hong', '홍길동', '1', '900101-1234567');

SELECT * FROM member;

DELETE FROM member where name = '서동준';
