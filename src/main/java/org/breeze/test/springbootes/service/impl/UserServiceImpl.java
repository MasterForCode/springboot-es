package org.breeze.test.springbootes.service.impl;

import org.breeze.test.springbootes.dao.UserDao;
import org.breeze.test.springbootes.entity.User;
import org.breeze.test.springbootes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wb on 2019/1/7.
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findOne(String id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public User addOne(User user) {
        return userDao.save(user);
    }
}