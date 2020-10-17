CREATE TABLE course (
    course_id INTEGER IDENTITY NOT NULL,
    title VARCHAR(80) NOT NULL,
    description VARCHAR(500) NOT NULL,
    link VARCHAR(255) NOT NULL,
    CONSTRAINT pk_course_id PRIMARY KEY (course_id)
);