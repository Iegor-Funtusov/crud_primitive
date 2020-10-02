package ua.com.alevel.controller;

import ua.com.alevel.model.Student;
import ua.com.alevel.service.StudentService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Iehor Funtusov, created 22/09/2020 - 9:40 PM
 */

public class StudentController {

    private StudentService studentService = new StudentService();

    public StudentController() {

    }

    public void runConsole() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Input");
                int num = Integer.parseInt(reader.readLine());
                switch (num) {
                    case 1 : {
                        String name = reader.readLine();
                        createStudent(name);
                    } break;
                    case 2 : {
                        String id = reader.readLine();
                        getStudentById(id);
                    } break;
                    case 3 : {
                        String id = reader.readLine();
                        deleteStudent(id);
                    } break;
                    case 4 : {
                        String id = reader.readLine();
                        String name = reader.readLine();
                        updateStudent(id, name);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }

    private void createStudent(String name) {
        Student student = new Student();
        student.setName(name);
        studentService.createStudent(student);
    }

    private void getStudentById(String id) {
        Student student = studentService.readById(id);
        System.out.println("student = " + student);
    }

    private void deleteStudent(String id) {
        studentService.delete(id);
    }

    private void updateStudent(String id, String name) {
        Student student = studentService.readById(id);
        student.setName(name);
        studentService.updateStudent(student);
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "studentService=" + studentService +
                '}';
    }
}
