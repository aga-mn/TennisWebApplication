package com.tennis.service;

import com.tennis.model.User;

/**
 * Created by amolda on 22.04.15.
 */
public interface UserService {
    User findByUserName(String username);
}
