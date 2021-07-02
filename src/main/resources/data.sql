INSERT INTO BAND VALUES(1,'Metallica','metal');
INSERT INTO BAND VALUES(2,'Led Zeppelin','rock');
INSERT INTO BAND VALUES(3,'Alice In Chains','grunge');
INSERT INTO BAND VALUES(4,'Pink Floyd','rock');
INSERT INTO BAND VALUES(5,'Tool','metal');
INSERT INTO MEMBER VALUES('Producer',1,PARSEDATETIME('01-02-1950','dd-MM-yyyy'),'Jon','Zaula',NULL,TRUE,1);
INSERT INTO MEMBER VALUES('Musician',2,PARSEDATETIME('01-02-1956','dd-MM-yyyy'),'Lars','Urlich','Drums',NULL,1);
INSERT INTO MEMBER VALUES('Musician',3,PARSEDATETIME('01-02-1957','dd-MM-yyyy'),'James','Hetfield','Guitar',NULL,1);
INSERT INTO ALBUM VALUES(1,null,PARSEDATETIME('01-02-1983','dd-MM-yyyy'),'Kill"em all',1,1);