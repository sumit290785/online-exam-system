--
-- Database: 'online-exam'
-- added by echo

--
-- loading data for table 'exam_categorys'
--
truncate table exam_answers;
truncate table exam_categorys;
truncate table questions;
truncate table qustion_option;
truncate table users;
truncate table user_category;
INSERT INTO exam_categorys (CATEGORY_ID, OBJ_VERSION, CREATED, LASTMODIFIED, CATEGORY_NAME, TOTAL_SCORE, TOTAL_QUESTION, PASSED_SCORE, EXAM_TIME) VALUES
(1, 0, '2010-02-19 02:02:47', '2010-02-19 02:02:47', 'ITIL 2.0', 100, 10, 6,120);

INSERT INTO exam_categorys (CATEGORY_ID, OBJ_VERSION, CREATED, LASTMODIFIED, CATEGORY_NAME, TOTAL_SCORE, TOTAL_QUESTION, PASSED_SCORE, EXAM_TIME) VALUES
(2, 0, '2010-02-19 02:02:47', '2010-02-19 02:02:47', 'J2EE 1.4', 100, 10, 6, 120);

--
-- loading data for table 'questions'
--

INSERT INTO questions (QUESTION_ID, OBJ_VERSION, CREATED, LASTMODIFIED, QUESTION_CONTENT, IS_ESSAY,  CATEGORY_ID) VALUES
(1, 1, '2010-02-19 02:08:38', '2010-02-19 02:08:38', 'Which of the following is NOT one of the five individual aspects of Service Design?', b'0',  1),
(2, 1, '2010-02-19 02:17:45', '2010-02-19 02:17:45', 'Which of the following is NOT the responsibility of the Service Catalogue Manager?', b'0',  1),
(3, 1, '2010-02-19 02:21:24', '2010-02-19 02:21:24', 'Which of the following statements is CORRECT?', b'0',  1),
(4, 1, '2010-02-19 02:23:11', '2010-02-19 02:23:11', 'Which of the following is NOT a characteristic of a process?', b'0',  1),
(5, 1, '2010-02-19 02:28:23', '2010-02-19 02:28:23', 'Which of the following statements about processes is INCORRECT?', b'0', 1),
(6, 1, '2010-02-19 02:29:51', '2010-02-19 02:29:51', 'What is a RACI model used for?', b'0', 1),
(7, 1, '2010-02-19 02:30:56', '2010-02-19 02:30:56', 'The group that authorizes changes that must be installed faster than the normal process is called the?', b'0',  1),
(8, 1, '2010-02-19 02:32:10', '2010-02-19 02:32:10', 'Contracts relating to an outsourced Data Centre would be managed by?', b'0',  1),
(9, 1, '2010-02-19 02:32:59', '2010-02-19 02:32:59', 'Which Service Design process makes the most use of data supplied by Demand Management?', b'0',  1),
(10, 1, '2010-02-19 02:33:56', '2010-02-19 02:33:56', 'Which of the following CANNOT be stored and managed by a tool?', b'0',  1),
(11, 1, '2010-02-19 02:34:48', '2010-02-19 02:34:48', 'The BEST description of the purpose of Service Operation is?', b'0',  1);

INSERT INTO questions (QUESTION_ID, OBJ_VERSION, CREATED, LASTMODIFIED, QUESTION_CONTENT, IS_ESSAY,  CATEGORY_ID) VALUES
(12, 1, '2010-02-19 02:08:38', '2010-02-19 02:08:38', 'Which of the following is NOT one of the five individual aspects of Service Design?', b'0',  2),
(13, 1, '2010-02-19 02:17:45', '2010-02-19 02:17:45', 'Which of the following is NOT the responsibility of the Service Catalogue Manager?', b'0',  2),
(14, 1, '2010-02-19 02:21:24', '2010-02-19 02:21:24', 'Which of the following statements is CORRECT?', b'0',  2),
(15, 1, '2010-02-19 02:23:11', '2010-02-19 02:23:11', 'Which of the following is NOT a characteristic of a process?', b'0',  2),
(16, 1, '2010-02-19 02:28:23', '2010-02-19 02:28:23', 'Which of the following statements about processes is INCORRECT?', b'0', 2),
(17, 1, '2010-02-19 02:29:51', '2010-02-19 02:29:51', 'What is a RACI model used for?', b'0', 2),
(18, 1, '2010-02-19 02:30:56', '2010-02-19 02:30:56', 'The group that authorizes changes that must be installed faster than the normal process is called the?', b'0',  2),
(19, 1, '2010-02-19 02:32:10', '2010-02-19 02:32:10', 'Contracts relating to an outsourced Data Centre would be managed by?', b'0',  2),
(20, 1, '2010-02-19 02:32:59', '2010-02-19 02:32:59', 'Which Service Design process makes the most use of data supplied by Demand Management?', b'0',  2),
(21, 1, '2010-02-19 02:33:56', '2010-02-19 02:33:56', 'Which of the following CANNOT be stored and managed by a tool?', b'0',  2),
(22, 1, '2010-02-19 02:34:48', '2010-02-19 02:34:48', 'The BEST description of the purpose of Service Operation is?', b'0',  2);
--
-- loading data for table 'qustion_option'
--

INSERT INTO qustion_option (OPTION_ID, OBJ_VERSION, OPTION_CONTENT, IS_CORRECT, QUESTION_ID) VALUES
(1, 0, 'The design of Market Spaces', b'1', 1),
(2, 0, 'The design of new or changed services', b'0', 1),
(3, 0, 'The design of the Service Portfolio, including the Service Catalogue', b'0', 1),
(4, 0, 'The design of the technology architecture and management systems', b'0', 1),
(5, 0, 'Ensuring that information within the Service Pipeline is accurate', b'1', 2),
(6, 0, 'Ensuring that all operational services are recorded in the Service Catalogue', b'0', 2),
(7, 0, 'Ensuring that information within the Service Pipeline is accurate', b'0', 2),
(8, 0, 'Ensuring that information in the Service Catalogue is consistent with information in the Service Portfolio', b'0', 2),
(9, 0, 'The Configuration Management System (CMS) is part of the Known Error Data Base (KEDB)', b'0', 3),
(10, 0, 'The CMS is part of the Configuration Management Data Base (CMDB)', b'0', 3),
(11, 0, 'The Service Knowledge Management System (SKMS) is part of the CMS', b'0', 3),
(12, 0, 'The KEDB and the CMS form part of the larger SKMS', b'1', 3),
(13, 0, 'It is measurable', b'0', 4),
(14, 0, 'A method of structuring an organization', b'1', 4),
(15, 0, 'Delivers specific results', b'0', 4),
(16, 0, 'Responds to specific events', b'0', 4),
(17, 0, 'The output from a process has to conform to operational norms derived from business objectives', b'0', 5),
(18, 0, 'The definition of Process Control is The activity of planning and regulating a process, with the objective of achieving Best Practice', b'1', 5),
(19, 0, 'A process may define policies, standards and guidelines', b'0', 5),
(20, 0, 'A process may define policies, standards and guidelines', b'0', 5),
(21, 0, 'Recording Configuration Items', b'0', 6),
(22, 0, 'Performance analysis', b'0', 6),
(23, 0, 'Monitoring services', b'0', 6),
(24, 0, 'Defining roles and responsibilities', b'1', 6),
(25, 0, 'Urgent Change Authority (UCA)', b'0', 7),
(26, 0, 'Urgent Change Board (UCB)', b'0', 7),
(27, 0, 'Emergency CAB (ECAB)', b'1', 7),
(28, 0, 'CAB Emergency Committee (CAB/EC)', b'0', 7),
(29, 0, 'IT Operations Control', b'0', 8),
(30, 0, 'Service Desk', b'0', 8),
(31, 0, 'Technical Management', b'0', 8),
(32, 0, 'Facilities Management', b'1', 8),
(33, 0, 'Service Level Management', b'0', 9),
(34, 0, 'Service Catalogue Management', b'0', 9),
(35, 0, 'IT Service Continuity Management', b'0', 9),
(36, 0, 'Capacity Management', b'1', 9),
(37, 0, 'Wisdom', b'0', 10),
(38, 0, 'Information', b'0', 10),
(39, 0, 'Data', b'1', 10),
(40, 0, 'Knowledge', b'0', 10),
(41, 0, 'To deliver and support IT Services at agreed levels to business users and customers', b'1', 11),
(42, 0, 'To design and build processes that will meet business needs', b'0', 11),
(43, 0, 'To decide how IT will engage with suppliers during the Service Management Lifecycle', b'0', 11),
(44, 0, 'To proactively prevent all outages to IT Services', b'0', 11);

INSERT INTO online_exam.qustion_option (OPTION_ID, OBJ_VERSION, OPTION_CONTENT, IS_CORRECT, QUESTION_ID) VALUES
(45, 0, 'The design of Market Spaces', b'1', 12),
(46, 0, 'The design of new or changed services', b'0', 12),
(47, 0, 'The design of the Service Portfolio, including the Service Catalogue', b'0', 12),
(48, 0, 'The design of the technology architecture and management systems', b'0', 12),
(49, 0, 'Ensuring that information within the Service Pipeline is accurate', b'1', 13),
(50, 0, 'Ensuring that all operational services are recorded in the Service Catalogue', b'0', 13),
(51, 0, 'Ensuring that information within the Service Pipeline is accurate', b'0', 13),
(52, 0, 'Ensuring that information in the Service Catalogue is consistent with information in the Service Portfolio', b'0', 13),
(53, 0, 'The Configuration Management System (CMS) is part of the Known Error Data Base (KEDB)', b'0', 14),
(54, 0, 'The CMS is part of the Configuration Management Data Base (CMDB)', b'0', 14),
(55, 0, 'The Service Knowledge Management System (SKMS) is part of the CMS', b'0', 14),
(56, 0, 'The KEDB and the CMS form part of the larger SKMS', b'1', 14),
(57, 0, 'It is measurable', b'0', 15),
(58, 0, 'A method of structuring an organization', b'1', 15),
(59, 0, 'Delivers specific results', b'0', 15),
(60, 0, 'Responds to specific events', b'0', 15),
(61, 0, 'The output from a process has to conform to operational norms derived from business objectives', b'0', 16),
(62, 0, 'The definition of Process Control is The activity of planning and regulating a process, with the objective of achieving Best Practice', b'1', 16),
(63, 0, 'A process may define policies, standards and guidelines', b'0', 16),
(64, 0, 'A process may define policies, standards and guidelines', b'0', 16),
(65, 0, 'Recording Configuration Items', b'0', 17),
(66, 0, 'Performance analysis', b'0', 17),
(67, 0, 'Monitoring services', b'0', 17),
(68, 0, 'Defining roles and responsibilities', b'1', 17),
(69, 0, 'Urgent Change Authority (UCA)', b'0', 18),
(70, 0, 'Urgent Change Board (UCB)', b'0', 18),
(71, 0, 'Emergency CAB (ECAB)', b'1', 18),
(72, 0, 'CAB Emergency Committee (CAB/EC)', b'0', 18),
(73, 0, 'IT Operations Control', b'0', 19),
(74, 0, 'Service Desk', b'0', 19),
(75, 0, 'Technical Management', b'0', 19),
(76, 0, 'Facilities Management', b'1', 19),
(77, 0, 'Service Level Management', b'0', 20),
(78, 0, 'Service Catalogue Management', b'0', 20),
(79, 0, 'IT Service Continuity Management', b'0', 20),
(80, 0, 'Capacity Management', b'1', 20),
(81, 0, 'Wisdom', b'0', 21),
(82, 0, 'Information', b'0', 21),
(83, 0, 'Data', b'1', 21),
(84, 0, 'Knowledge', b'0', 21),
(85, 0, 'To deliver and support IT Services at agreed levels to business users and customers', b'1', 22),
(86, 0, 'To design and build processes that will meet business needs', b'0', 22),
(87, 0, 'To decide how IT will engage with suppliers during the Service Management Lifecycle', b'0', 22),
(88, 0, 'To proactively prevent all outages to IT Services', b'0', 22);

--
-- loading data for table 'users'
--

INSERT INTO users (USER_ID, OBJ_VERSION, CREATED, LASTMODIFIED, USERNAME, PASSWORD, FIRST_NAME, LAST_NAME, EMAIL, PHONE, STREET, ZIPCODE, CITY, userType) VALUES
(9, 0, '2010-02-19 02:02:47', '2010-02-19 02:02:47', 'zhujoel', '11111111', 'Cai', 'Joel', 'joel.cai@hp.com', NULL, NULL, NULL, 'Shanghai', 'TEACHER'),
(8, 1, '2010-02-19 02:02:47', '2010-02-19 02:02:47', 'zhujoe', '11111111', 'Zhu', 'Joe', 'joe.zhu@hp.com', NULL, NULL, NULL, 'Shanghai', 'STUDENT'),
(7, 0, '2010-02-19 02:02:47', '2010-02-19 02:02:47', 'chenecho', '11111111', 'Chen', 'Echo', 'echo.chen@hp.com', NULL, NULL, NULL, 'Shanghai', 'ADMIN');

--
-- loading data for table 'user_category'
--

INSERT INTO user_category (USER_ID, CATEGORY_ID) VALUES
(8, 1);
INSERT INTO user_category (USER_ID, CATEGORY_ID) VALUES
(8, 2);