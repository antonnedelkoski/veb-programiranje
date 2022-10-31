package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CourseRepository {
    List<Course> findAllCourses() {
        return DataHolder.courses;
    }

    public Course findById(Long courseId) {
        return (Course) DataHolder.courses.stream().filter(r->r.getCourseId() == (courseId));
    }

    List<Student> findAllStudentsByCourse(Long courseId) {
        return null;
    }

    Course addStudentToCourse(Student student, Course course) {
        return null;
    }

    public Course save( Course c) {
    if( c == null || c.getName() == null || c.getName().isEmpty()){
        return null;
    }
    DataHolder.courses.removeIf(r ->r.getName().equals(c.getName()));
    DataHolder.courses.add(c);
    return c;
    }

}
