package lk.ise.eca.course.service;

import lk.ise.eca.course.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Course create(Course course);
    Course update(String id, Course course);
    Optional<Course> findById(String id);
    List<Course> findAll();
    void deleteById(String id);
}
