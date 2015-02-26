package com.levelup.dao.impl.Impl;

import com.levelup.dao.impl.HibernateSessionProvider;
import com.levelup.dao.impl.StudentRepo;
import com.levelup.model.Student;
import com.sun.tools.javac.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 * Created by GEO on 26.02.15.
 */
public class StudentRepoImpl implements StudentRepo {
    @Override
    public void createStudent(Student student) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        session.persist(student);
        session.beginTransaction().commit();
        session.close();
    }

    @Override
    public List<Student> getStudentByTeacherId(Long id) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        Query query=session.createQuery("");
        query.setParameter("id", id);
        List<Student> result = (List<Student>) query.list();
        session.beginTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public Student getStudentByName(String lastName) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        Student student= (Student) session.get(Student.class,lastName);
        session.beginTransaction().commit();
        session.close();
        return student;
    }
}
