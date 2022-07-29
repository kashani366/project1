package com.anisa.provider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateProviderXml {

    private static SessionFactory sessionFactory;

    private static SessionFactory createSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            System.out.println("hibernate config file loaded");
            return configuration.buildSessionFactory();
        } catch (Exception e) {
            System.out.println("create session factory failed");
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = createSessionFactory();
        }
        return sessionFactory;
    }


}
