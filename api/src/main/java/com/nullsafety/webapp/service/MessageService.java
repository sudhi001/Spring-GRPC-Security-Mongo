package com.nullsafety.webapp.service;

import com.nullsafety.webapp.entity.Message;
import com.nullsafety.webapp.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService extends BaseService<Message> {

    @Autowired
    MessageRepository messageRepository;

}
