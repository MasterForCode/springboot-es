package org.breeze.test.springbootes.dao;/**
 * Created by wb on 2019/1/7.
 */

import org.breeze.test.springbootes.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * project: springboot-es
 * description:
 * author: Mr.Wang
 * create: 2019-01-07 23:39
 **/
@Component
public interface UserDao extends ElasticsearchRepository<User, String> {
}
