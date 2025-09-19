package lk.ise.eca.course.service.impl;

import lk.ise.eca.course.entity.Course;
import lk.ise.eca.course.repository.CourseRepository;
import lk.ise.eca.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    @Override
    public Course create(Course course) {
        return repository.save(course);
    }

    @Override
    public Course update(String id, Course course) {
        course.setId(id);
        return repository.save(course);
    }

    @Override
    public Optional<Course> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
