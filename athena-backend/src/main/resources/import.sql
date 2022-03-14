INSERT INTO tb_user(email, password,logged_in) VALUES ('douglasrecode55@gmail.com', '123456', false)
INSERT INTO tb_user(email, password,logged_in) VALUES ('guilherme55@gmail.com', '654321',false)
INSERT INTO tb_user(email, password,logged_in) VALUES ('manoel55@gmail.com', '456123',false)

INSERT INTO tb_course(name,description,duration,image ) VALUES ('HTML5 e CSS3', 'Introdução a criação de websites com HTML5 e CSS3', 6, 'https://openwebsolutions.in/blog/wp-content/uploads/2018/01/banner-1-1024x497.jpg')
INSERT INTO tb_course(name,description,duration,image ) VALUES ('JavaScript', 'Sintaxe Básica em JavaScript', 7, 'https://media.vlpt.us/images/lwoody/post/e7abcb71-86ba-43ab-ad79-8a0d1b695789/javascript_banner_sxve2l.jpg')
INSERT INTO tb_course(name,description,duration,image ) VALUES ('ReactJS', 'Introdução ao ReactJS', 6, 'https://coursework.vschool.io/content/images/2017/08/react.png')

INSERT INTO tb_registration(course_id, user_id, date) VALUES (3, 1, '10/01/2022')
INSERT INTO tb_registration(course_id, user_id, date) VALUES (1, 2, '11/02/2022')
INSERT INTO tb_registration(course_id, user_id, date) VALUES (2, 3, '12/04/2022')