package com.tolisto.api_gateway.infrastructure.config.webSockets;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class CustomWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // Cuando la conexión se establece
        System.out.println("Conexión WebSocket establecida con: " + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Maneja los mensajes recibidos
        System.out.println("Mensaje recibido: " + message.getPayload());
        session.sendMessage(new TextMessage("Respuesta: " + message.getPayload()));  // Responder al cliente
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        // Cuando la conexión se cierra
        System.out.println("Conexión WebSocket cerrada con: " + session.getId());
    }
}
