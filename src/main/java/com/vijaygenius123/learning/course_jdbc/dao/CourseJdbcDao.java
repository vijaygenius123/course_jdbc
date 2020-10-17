package com.vijaygenius123.learning.course_jdbc.dao;

import com.vijaygenius123.learning.course_jdbc.models.Course;

import java.util.List;
import java.util.Optional;

public class CourseJdbcDao implements DAO<Course {


    @Override
    public List<Course> list() {
        return null;
    }

    @Override
    public void create(Course course) {

    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
