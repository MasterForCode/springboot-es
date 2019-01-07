package org.breeze.test.springbootes.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by wb on 2019/1/7.
 */
@Data
@Document(indexName = "myindex", type = "user")
public class User {
    @Id
    private String id;
    private String name;
    private String age;
}