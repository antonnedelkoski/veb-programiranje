package mk.ukim.finki.wp.lab.model;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    long courseId;
    String name;
    String description;
    List<Student> students;

    public Course(long courseId, String name, String description, List<Student> students) {
        this.courseId = courseId;
        this.name = name;
        this.description = description;
        this.students = students;
    }
    public Course(String name) {this.name = name;}

    public long getCourseId() {
        return courseId;
    }
}
