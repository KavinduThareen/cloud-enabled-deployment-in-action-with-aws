package lk.ise.eca.course.controller;

import lk.ise.eca.course.entity.Course;
import lk.ise.eca.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // TODO: Restrict in production
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        Course saved = courseService.create(course);
        return ResponseEntity.created(URI.create("/api/v1/courses/" + saved.getId())).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<Course>> list() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> get(@PathVariable String id) {
        return courseService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Course> update(@PathVariable String id, @RequestBody Course course) {
        return ResponseEntity.ok(courseService.update(id, course));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        courseService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
