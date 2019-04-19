package com.jzp.common.websocket;

import com.jzp.model.websocket.User;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;

/**
 * @author Hongyi Zheng
 * @date 2019/1/3
 */
public class WebSocketInterceptor implements ChannelInterceptor {
    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        StompHeaderAccessor accessor = MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);
//        if (StompCommand.CONNECT.equals(accessor.getCommand())) {
//            User user = accessor.getSessionAttributes().get(Constants.WS_USER_KEY);
//        }
        return null;
    }

    @Override
    public void postSend(Message<?> message, MessageChannel channel, boolean sent) {

    }

    @Override
    public void afterSendCompletion(Message<?> message, MessageChannel channel, boolean sent, Exception ex) {

    }

    @Override
    public boolean preReceive(MessageChannel channel) {
        return false;
    }

    @Override
    public Message<?> postReceive(Message<?> message, MessageChannel channel) {
        return null;
    }

    @Override
    public void afterReceiveCompletion(Message<?> message, MessageChannel channel, Exception ex) {

    }
}
