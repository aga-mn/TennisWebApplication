package com.tennis.dao;

import com.tennis.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amolda on 22.04.15.
 */
@Repository
public class UserDaoHibernate implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findByUserName(String username) {
        List<User> users = new ArrayList<User>();

        users = sessionFactory.getCurrentSession()
                .createQuery("from User where username=?")
                .setParameter(0, username)
                .list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }
}
