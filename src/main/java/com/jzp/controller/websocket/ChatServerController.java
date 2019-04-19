package com.jzp.controller.websocket;

import com.jzp.model.websocket.BroadCastMessage;
import com.jzp.model.websocket.ChatLog;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Hongyi Zheng
 * @date 2018/12/27
 */
@Controller
public class ChatServerController {
    @MessageMapping("/send")
    @SendTo("/topic/broadcast")
    public ChatLog broadcast(BroadCastMessage message) throws Exception {
        long threadId = Thread.currentThread().getId();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return new ChatLog(threadId + ": " + HtmlUtils.htmlEscape(message.getMessage()), sdf.format(new Date()) + "(GMT +8)");
    }

}
