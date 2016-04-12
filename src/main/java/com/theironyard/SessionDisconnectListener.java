package com.theironyard;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import java.util.HashMap;

/**
 * Created by zach on 4/12/16.
 */
@Component
public class SessionDisconnectListener implements ApplicationListener<SessionDisconnectEvent> {
    @Override
    public void onApplicationEvent(SessionDisconnectEvent event) {
        HashMap m = new HashMap<>();
        m.put("id", event.getSessionId());
        WebSocketController.messenger.convertAndSend("/remove-player", m);
    }
}
