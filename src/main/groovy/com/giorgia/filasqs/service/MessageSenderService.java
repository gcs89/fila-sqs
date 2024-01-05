package com.giorgia.filasqs.service;
import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
@Service
public class MessageSenderService {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    public void send (String message){
        queueMessagingTemplate.convertAndSend("${cloud.aws.end-point.uri}", message);
    }

}

// SqsTemplate