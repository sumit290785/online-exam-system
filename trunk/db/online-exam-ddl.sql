
    alter table EXAMS 
        drop 
        foreign key FK3F55414AB2A5BEA;

    alter table EXAMS 
        drop 
        foreign key FK3F55414D8756695;

    alter table EXAMS 
        drop 
        foreign key FK3F5541460F8DCF5;

    alter table EXAM_ANSWERS 
        drop 
        foreign key FK65930C35CEA7EC76;

    alter table EXAM_ANSWERS 
        drop 
        foreign key FK65930C356DC61D95;

    alter table QUESTIONS 
        drop 
        foreign key FK3BDD512DD8756695;

    alter table QUESTIONS 
        drop 
        foreign key FK3BDD512DCBB67AA3;

    alter table QUSTION_OPTION 
        drop 
        foreign key FK3FC9E1F16DC61D95;

    drop table if exists EXAMS;

    drop table if exists EXAM_ANSWERS;

    drop table if exists EXAM_CATEGORYS;

    drop table if exists QUESTIONS;

    drop table if exists QUSTION_OPTION;

    drop table if exists USERS;

    create table EXAMS (
        EXAM_ID integer not null auto_increment,
        OBJ_VERSION integer,
        CREATED datetime not null,
        LASTMODIFIED datetime not null,
        USED_TIME integer not null,
        EXAM_SCORE integer,
        USER_ID integer not null,
        CATEGORY_ID integer not null,
        exams_USER_ID integer,
        primary key (EXAM_ID)
    );

    create table EXAM_ANSWERS (
        ANSWER_ID integer not null auto_increment,
        OBJ_VERSION integer,
        EXAM_ANSWER integer,
        IS_MARK_REVIEW bit,
        IS_ANSWERED bit,
        Question_ID integer not null,
        primary key (ANSWER_ID)
    );

    create table EXAM_CATEGORYS (
        CATEGORY_ID integer not null auto_increment,
        OBJ_VERSION integer,
        CREATED datetime not null,
        LASTMODIFIED datetime not null,
        CATEGORY_NAME varchar(50) not null unique,
        TOTAL_SCORE integer not null,
        TOTAL_QUESTION integer not null,
        PASSED_SCORE integer not null,
        EXAM_TIME integer not null,
        primary key (CATEGORY_ID)
    );

    create table QUESTIONS (
        QUESTION_ID integer not null auto_increment,
        OBJ_VERSION integer,
        CREATED datetime not null,
        LASTMODIFIED datetime not null,
        QUESTION_CONTENT text not null,
        IS_ESSAY bit not null,
        OPTION_ANSWER integer,
        CATEGORY_ID integer not null,
        Questions_CATEGORY_ID integer,
        primary key (QUESTION_ID)
    );

    create table QUSTION_OPTION (
        OPTION_ID integer not null auto_increment,
        OBJ_VERSION integer,
        OPTION_CONTENT text not null,
        IS_CORRECT bit not null,
        QUESTION_ID integer,
        primary key (OPTION_ID)
    );

    create table USERS (
        USER_ID integer not null auto_increment,
        OBJ_VERSION integer,
        CREATED datetime not null,
        LASTMODIFIED datetime not null,
        USERNAME varchar(20) not null unique,
        PASSWORD varchar(20) not null,
        FIRST_NAME varchar(50),
        LAST_NAME varchar(50),
        EMAIL varchar(50),
        PHONE varchar(20),
        STREET varchar(255),
        ZIPCODE varchar(16),
        CITY varchar(100),
        userType varchar(255),
        primary key (USER_ID)
    );

    alter table EXAMS 
        add index FK3F55414AB2A5BEA (exams_USER_ID), 
        add constraint FK3F55414AB2A5BEA 
        foreign key (exams_USER_ID) 
        references USERS (USER_ID);

    alter table EXAMS 
        add index FK3F55414D8756695 (CATEGORY_ID), 
        add constraint FK3F55414D8756695 
        foreign key (CATEGORY_ID) 
        references EXAM_CATEGORYS (CATEGORY_ID);

    alter table EXAMS 
        add index FK3F5541460F8DCF5 (USER_ID), 
        add constraint FK3F5541460F8DCF5 
        foreign key (USER_ID) 
        references USERS (USER_ID);

    alter table EXAM_ANSWERS 
        add index FK65930C35CEA7EC76 (ANSWER_ID), 
        add constraint FK65930C35CEA7EC76 
        foreign key (ANSWER_ID) 
        references EXAMS (EXAM_ID);

    alter table EXAM_ANSWERS 
        add index FK65930C356DC61D95 (Question_ID), 
        add constraint FK65930C356DC61D95 
        foreign key (Question_ID) 
        references QUESTIONS (QUESTION_ID);

    alter table QUESTIONS 
        add index FK3BDD512DD8756695 (CATEGORY_ID), 
        add constraint FK3BDD512DD8756695 
        foreign key (CATEGORY_ID) 
        references EXAM_CATEGORYS (CATEGORY_ID);

    alter table QUESTIONS 
        add index FK3BDD512DCBB67AA3 (Questions_CATEGORY_ID), 
        add constraint FK3BDD512DCBB67AA3 
        foreign key (Questions_CATEGORY_ID) 
        references EXAM_CATEGORYS (CATEGORY_ID);

    alter table QUSTION_OPTION 
        add index FK3FC9E1F16DC61D95 (QUESTION_ID), 
        add constraint FK3FC9E1F16DC61D95 
        foreign key (QUESTION_ID) 
        references QUESTIONS (QUESTION_ID);
