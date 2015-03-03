package com.levelup.dao.impl;

import com.levelup.model.Student;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by GEO on 26.02.15.
 */
public interface StudentRepo {

    void createStudent(Student student) throws SQLDataException;

    List<Student> getStudentByTeacherId(Long id) throws SQLDataException;
    Student getStudentByName(String lastName) throws SQLDataException;
}
