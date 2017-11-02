package com.Dao;

import com.model.Cat;
import org.hibernate.SessionFactory;

/**
 * Created by USER on 01.11.2017.
 */
public class CatDao {
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public void save (Cat cat){
        sessionFactory.getCurrentSession().persist(cat);
    }
}
