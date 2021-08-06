DROP TABLE IF EXISTS COVID_SURVEY;

CREATE TABLE COVID_SURVEY(ID number primary key,
                          NAME varchar2(30),
                          SOURCE varchar2(30),
                          DESTINATION varchar2(30),
                          CREATED_DATE date default sysdate not null,
                          COVID_REVIEW varchar2(2000)
);