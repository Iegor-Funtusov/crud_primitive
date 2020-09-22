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

    public void createStudent() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Input");
                int num = Integer.parseInt(reader.readLine());
                switch (num) {
                    case 1 : {
                        String name = reader.readLine();
                        Student student = new Student();
                        student.setName(name);
                        studentService.createStudent(student);
                    } break;
                    case 2 : {
                        String id = reader.readLine();
                        System.out.println("student: " + studentService.readById(id));
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
