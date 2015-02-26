package com.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by GEO on 26.02.15.
 */
public class HibernateSessionProvider {
    private static SessionFactory sessionFactory;
    public static synchronized Session getSession() {
        if (sessionFactory == null)
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        return sessionFactory.openSession();
    }
}
