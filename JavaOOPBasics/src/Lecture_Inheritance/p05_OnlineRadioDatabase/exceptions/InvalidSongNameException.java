package Lecture_Inheritance.p05_OnlineRadioDatabase.exceptions;

public class InvalidSongNameException extends InvalidSongException{
    public InvalidSongNameException(String message){
        super(message);
    }
}
