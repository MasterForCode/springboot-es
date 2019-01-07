package org.breeze.test.springbootes.service;/**
 * Created by wb on 2019/1/7.
 */

import org.breeze.test.springbootes.entity.User;

/**
 * project: springboot-es
 * description:
 * author: Mr.Wang
 * create: 2019-01-07 23:40
 **/
public interface UserService {

    User findOne(String id);

    User addOne(User user);
}
