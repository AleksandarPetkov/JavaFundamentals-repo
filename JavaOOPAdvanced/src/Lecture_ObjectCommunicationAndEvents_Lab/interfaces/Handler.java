package Lecture_ObjectCommunicationAndEvents_Lab.interfaces;

import Lecture_ObjectCommunicationAndEvents_Lab.enums.LogType;

public interface Handler {

    void handle(LogType type, String message);

    //Като дойде по веригата съобщение, гледа дали настоящият може да го обработи,
    //ако не, го предава на следващия
    void setSuccessor(Handler handler);

}
