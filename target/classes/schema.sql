DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE (
EMP_ID INT AUTO_INCREMENT PRIMARY KEY,
EMP_NAME VARCHAR(50) NOT NULL,
EMP_SAL INT(8) NOT NULL,
EMP_DEPT VARCHAR(50) NOT NULL
);