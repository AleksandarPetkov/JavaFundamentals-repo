package Lecture_Inheritance.p05_OnlineRadioDatabase.exceptions;

public class InvalidSongException extends IllegalArgumentException {

    public InvalidSongException(String message){
        super(message);
    }
}
