package com.levelup.service.impl;

import com.levelup.model.Student;
import com.sun.tools.javac.util.List;

/**
 * Created by GEO on 26.02.15.
 */
public interface StudentService {
    void createStudent(Student student);

    List<Student> getStudentByTeacherId(Long id);
    Student getStudentByName(String lastName);
}
