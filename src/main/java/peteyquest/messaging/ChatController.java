package peteyquest.messaging;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage send(final ChatMessage message) {
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new ChatMessage(message.getFrom(), message.getText(), time);
    }

}
