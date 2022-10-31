package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {
    List<Student> student = new ArrayList<>();


    public List<Student> findAllStudents() {
        return DataHolder.students;
    }


    public List<Student> findAllByNameOrSurname(String text) {
        return DataHolder.students.stream().filter(r->r.getName().contains(text)
                || r.getSurname().contains(text)).collect(Collectors.toList());
    }


    public Student save(Student c) {
        if (c==null || c.getName()==null || c.getName().isEmpty()){
            return null;
        }
        DataHolder.students.removeIf(r -> r.getName().equals(c.getName()));
        DataHolder.students.add(c);//dodavanje na  kategorija
        return c;
    }
}

