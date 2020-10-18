package com.vijaygenius123.learning.course_jdbc;

import com.vijaygenius123.learning.course_jdbc.dao.DAO;
import com.vijaygenius123.learning.course_jdbc.models.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CourseJdbcApplication {

    private static DAO<Course> dao;

    public CourseJdbcApplication(DAO<Course> dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {
        SpringApplication.run(CourseJdbcApplication.class, args);


        System.out.println("Create Course");

        Course vue = new Course("Vue", "This Is A Vue Course", "");
        dao.create(vue);


        System.out.println("All Courses");

        List<Course> courses = dao.list();

        courses.forEach(System.out::println);

    }

}
