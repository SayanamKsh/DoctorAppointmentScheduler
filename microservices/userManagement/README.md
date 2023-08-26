# userManagement

#table details
CREATE TABLE user (
    id INT PRIMARY KEY ,
    user_name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    mail_id VARCHAR(255)  NOT NULL,
    phone_no VARCHAR(255) UNIQUE NOT NULL,
    role VARCHAR(255) NOT NULL
);

CREATE TABLE doctor (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT ,
    specialty VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE patient (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT ,
    FOREIGN KEY (user_id) REFERENCES user(id)
);