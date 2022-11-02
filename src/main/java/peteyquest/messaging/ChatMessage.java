package peteyquest.messaging;

import lombok.Data;

@Data
public class ChatMessage {

    private final String time;
    private final String from;
    private final String text;
}
