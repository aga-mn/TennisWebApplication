package com.tennis.service;

import com.tennis.dao.TournamentDao;
import com.tennis.dao.UserDao;
import com.tennis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by amolda on 22.04.15.
 */
@Service
@Transactional
public class UserServiceHibernate implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findByUserName(String username) {
        return userDao.findByUserName(username);
    }
}
