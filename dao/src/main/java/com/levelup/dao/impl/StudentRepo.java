package com.levelup.dao.impl;

import com.levelup.model.Student;
import com.sun.tools.javac.util.List;

/**
 * Created by GEO on 26.02.15.
 */
public interface StudentRepo {

    void createStudent(Student student);

    List <Student> getStudentByTeacherId(Long id);
    Student getStudentByName(String lastName);
}
