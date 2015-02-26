package com.levelup.dao.impl;

import com.levelup.model.Teacher;
import com.sun.tools.javac.util.List;

/**
 * Created by GEO on 26.02.15.
 */
public interface TeacherRepo {
    void createTeacher(Teacher teacher);
    Teacher getTeacherByLastName(String lastName);

    List<Teacher> getAllTeacher();
}
