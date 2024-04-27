package com.example.kaadiai.controller;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @Autowired
    private ChatClient chatClient;
    @GetMapping("/")
    public String chat(String query){
        String response = chatClient.call(query);
        return response;
    }
}
