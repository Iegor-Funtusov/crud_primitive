package ua.com.alevel.dao;

import ua.com.alevel.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Iehor Funtusov, created 22/09/2020 - 9:23 PM
 */

public class StudentDao {

    private List<Student> students = new ArrayList<>();

    public void createStudent(Student student) {
        student.setId(UUID.randomUUID().toString());
        students.add(student);
        System.out.println("students = " + students);
    }

    public Student readById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
