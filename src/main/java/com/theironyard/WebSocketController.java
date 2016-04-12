package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * Created by vajrayogini on 4/12/16.
 */
@Controller
public class WebSocketController {
    static SimpMessagingTemplate messenger;

    @Autowired //autowire whole constructor
    public WebSocketController(SimpMessagingTemplate template) {
        messenger = template;
    }

    @MessageMapping("/move")
    @SendTo("/move")
    public Message move(Message message) {
        return message;
    }
}

