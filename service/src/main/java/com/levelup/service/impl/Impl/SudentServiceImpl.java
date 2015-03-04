package com.levelup.service.impl.Impl;

import com.levelup.dao.impl.Impl.StudentRepoImpl;
import com.levelup.dao.impl.StudentRepo;
import com.levelup.model.Student;
import com.levelup.service.impl.StudentService;
import com.sun.tools.javac.util.List;

/**
 * Created by GEO on 26.02.15.
 */
public class SudentServiceImpl implements StudentService {

    private StudentRepo studentRepo=new StudentRepoImpl();

    @Override
    public void createStudent(Student student) {
    }


    @Override
    public List<Student> getStudentByTeacherId(Long id) {
        return null;
    }

    @Override
    public Student getStudentByName(String lastName) {
        return null;
    }
}
