package com.giorgia.filasqs.service;

import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {
    @SqsListener("Fila-Dois")
    public void receiveMessage(String message){
        System.out.println("Mensagem recebida: " + message);
    }
}
