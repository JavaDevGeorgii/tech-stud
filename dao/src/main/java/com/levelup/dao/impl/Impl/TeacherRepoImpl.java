package com.levelup.dao.impl.Impl;

import com.levelup.dao.impl.HibernateSessionProvider;
import com.levelup.dao.impl.TeacherRepo;
import com.levelup.model.Teacher;
import com.sun.tools.javac.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Created by GEO on 26.02.15.
 */
public class TeacherRepoImpl implements TeacherRepo{

    public TeacherRepoImpl() {

    }

    @Override
    public void createTeacher(Teacher teacher) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        session.persist(teacher);
        session.beginTransaction().commit();
        session.close();
    }

    @Override
    public Teacher getTeacherByLastName(String lastName) {
        Session session=HibernateSessionProvider.getSession();
        session.beginTransaction();
        Teacher teacher= (Teacher) session.get(Teacher.class, lastName);
        session.beginTransaction().commit();;
        session.close();
        return teacher;
    }

    @Override
    public List<Teacher> getAllTeacher() {
        Session session=HibernateSessionProvider.getSession();
        session.beginTransaction();
        Query query = session.createQuery("from Teacher t");
        List<Teacher> teachers= (List<Teacher>) query.list();
        session.beginTransaction().commit();
        session.close();
        return teachers;
    }
}
