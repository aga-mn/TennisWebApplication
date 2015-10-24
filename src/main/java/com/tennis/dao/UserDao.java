package com.tennis.dao;

import com.tennis.model.User;

/**
 * Created by amolda on 22.04.15.
 */
public interface UserDao {

    User findByUserName(String username);
}
