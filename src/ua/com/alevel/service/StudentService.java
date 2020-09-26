package ua.com.alevel.service;

import ua.com.alevel.dao.StudentDao;
import ua.com.alevel.model.Student;

/**
 * @author Iehor Funtusov, created 22/09/2020 - 9:37 PM
 */

public class StudentService {

    private StudentDao studentDao = new StudentDao();

    public void createStudent(Student student) {
        studentDao.createStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public Student readById(String id) {
        return studentDao.readById(id);
    }

    public Object[] getAll() {
        return studentDao.getAll();
    }

    public void delete(String id) {
        if (id == null) {
            return;
        }
        studentDao.delete(id);
    }
}
