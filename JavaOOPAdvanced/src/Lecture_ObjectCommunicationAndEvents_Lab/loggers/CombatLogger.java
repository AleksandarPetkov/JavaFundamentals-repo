package Lecture_ObjectCommunicationAndEvents_Lab.loggers;


import Lecture_ObjectCommunicationAndEvents_Lab.enums.LogType;
import Lecture_ObjectCommunicationAndEvents_Lab.abstractClasses.AbstractLogger;

public class CombatLogger extends AbstractLogger{

    //Ако е ATTACK || MAGIC аз мога да го обработя. Ако не продължавам нататък по веригата
    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ATTACK || type == LogType.MAGIC){
            System.out.println(type.name() + ": " + message);
        } else {
            if (super.getNextHandler() != null){
                super.getNextHandler().handle(type, message);
            }
        }
    }

}
