package com.levelup.dao.impl.Impl;

import com.levelup.dao.impl.HibernateSessionProvider;
import com.levelup.dao.impl.StudentRepo;
import com.levelup.model.Student;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 * Created by GEO on 26.02.15.
 */
public class StudentRepoImpl implements StudentRepo {

    @Override
    public void createStudent(Student student) {
        Session session=null;
        try {
            session = HibernateSessionProvider.getSession();
            session.beginTransaction();
            session.persist(student);
            session.beginTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(!(session != null) &&(session.isOpen())) {
                session.close();
            }
        }
    }

    @Override
    public List<Student> getStudentByTeacherId(Long id) {
        Session session = null;
        List<Student> result = null;
        try {
            session = HibernateSessionProvider.getSession();
            session.beginTransaction();
            Query query = session.createQuery("");
            query.setParameter("id", id);
            result = (List<Student>) query.list();
            session.beginTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (!(session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return result;
    }


    @Override
    public Student getStudentByName(String lastName) {
        Session session = null;
        Student student=null;
        try {
            session = HibernateSessionProvider.getSession();
            session.beginTransaction();
            student = (Student) session.get(Student.class, lastName);
            session.beginTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        return student;
    }
}
