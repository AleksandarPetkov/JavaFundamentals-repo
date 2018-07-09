package Lecture_Inheritance.p05_OnlineRadioDatabase.exceptions;

public class InvalidSongLengthException extends InvalidSongException {
    public InvalidSongLengthException(String message){
        super(message);
    }
}
