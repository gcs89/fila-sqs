package com.giorgia.filasqs.controller;

import com.giorgia.filasqs.service.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private MessageSenderService messageSenderService;

    @PostMapping("/send")
    public ResponseEntity<?> sendMessage(@RequestBody String message){
        messageSenderService.send(message);
        return ResponseEntity.ok().body("Sua mensagem foi enviada com sucesso!" + message);
    }

    @GetMapping("/hello")
    public ResponseEntity<?> testeHello(){
        return ResponseEntity.ok().body("Hello world!");
    }
}
