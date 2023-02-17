package DealOrganization.backend.Chatting;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatModel sendMessage(@Payload ChatModel chatModel) {
        return chatModel;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatModel addUser(@Payload ChatModel chatModel, SimpMessageHeaderAccessor messageHeaderAccessor) {
        messageHeaderAccessor.getSessionAttributes().put("username", chatModel.getSender());
        return chatModel;
    }
}
