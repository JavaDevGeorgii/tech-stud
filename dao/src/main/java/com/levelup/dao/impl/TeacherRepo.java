package com.levelup.dao.impl;

import com.levelup.model.Teacher;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by GEO on 26.02.15.
 */
public interface TeacherRepo {
    void createTeacher(Teacher teacher) throws SQLDataException;
    Teacher getTeacherByLastName(String lastName) throws SQLDataException;

    List<Teacher> getAllTeacher() throws SQLDataException;
}
