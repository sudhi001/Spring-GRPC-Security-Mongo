package com.nullsafety.webapp.repository;

import com.nullsafety.webapp.entity.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends BaseRepository<Message,String>{
}
