package Lecture_EnumerationsAndAnnotations_Lab.p02_WarningLevels;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<Message> messages;
    private Importance importanceLevel;

    public Logger(String importanceLevel) {
        this.importanceLevel = Enum.valueOf(Importance.class, importanceLevel.toUpperCase());
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message){
        if (this.importanceLevel.compareTo(message.getImportance()) <= 0){
            messages.add(message);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Message message : messages) {
            sb.append(message.getImportance()).append(": ").append(message.getMessage()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
