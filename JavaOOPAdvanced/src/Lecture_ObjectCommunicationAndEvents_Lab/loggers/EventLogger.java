package Lecture_ObjectCommunicationAndEvents_Lab.loggers;

import Lecture_ObjectCommunicationAndEvents_Lab.enums.LogType;
import Lecture_ObjectCommunicationAndEvents_Lab.abstractClasses.AbstractLogger;

public class EventLogger extends AbstractLogger{

    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.EVENT){
            System.out.println(type.name() + ": " + message);
        } else {
            if (super.getNextHandler() != null){
                super.getNextHandler().handle(type, message);
            }
        }
    }

}
