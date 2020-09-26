package ua.com.alevel.dao;

import ua.com.alevel.model.Student;
import ua.com.alevel.util.CustomArrayList;

import java.util.UUID;

/**
 * @author Iehor Funtusov, created 22/09/2020 - 9:23 PM
 */

public class StudentDao {

    private CustomArrayList students = new CustomArrayList();

    public void createStudent(Student student) {
        student.setId(UUID.randomUUID().toString());
        students.add(student);
        System.out.println("students = " + students);
    }

    public void updateStudent(Student student) {
        for (int i = 0; i < students.length(); i++) {
            Object o = students.get(i);
            if (o != null) {
                Student currentStudent = (Student) o;
                if (currentStudent.getId().equals(student.getId())) {
                    students.update(i, student);
                }
            }
        }
        System.out.println("students = " + students);
    }

    public Student readById(String id) {
        for (int i = 0; i < students.length(); i++) {
            Object o = students.get(i);
            if (o != null) {
                Student student = (Student) o;
                if (student.getId().equals(id)) {
                    return student;
                }
            }
        }
        return null;
    }

    public Object[] getAll() {
        return students.getAll();
    }

    public void delete(String id) {
        for (int i = 0; i < students.length(); i++) {
            Object o = students.get(i);
            if (o != null) {
                Student student = (Student) o;
                if (student.getId().equals(id)) {
                    this.students.delete(i);
                    break;
                }
            }
        }
        System.out.println("students = " + students);
    }
}
