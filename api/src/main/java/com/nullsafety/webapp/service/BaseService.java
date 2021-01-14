package com.nullsafety.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public abstract class BaseService <T>{

    @Autowired
    MongoTemplate mongoTemplate;

    public void save(T model){
        mongoTemplate.save(model);
    }
}
