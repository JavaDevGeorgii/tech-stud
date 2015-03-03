package com.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by GEO on 26.02.15.
*/
 public class HibernateSessionProvider {
    private static SessionFactory sessionFactory;
    public static synchronized Session getSession() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            } catch (Throwable e) {
                throw new ExceptionInInitializerError(e);
            }
        }
        return sessionFactory.openSession();
    }
}

/*
public class HibernateSessionProvider {
    private static SessionFactory sessionFactory;

    private HibernateSessionProvider() {
    }

    public static void getSessionFactory() {

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

}
*/