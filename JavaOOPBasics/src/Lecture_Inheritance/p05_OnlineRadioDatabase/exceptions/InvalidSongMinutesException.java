package Lecture_Inheritance.p05_OnlineRadioDatabase.exceptions;

public class InvalidSongMinutesException extends  InvalidSongLengthException{
    public InvalidSongMinutesException(String mesage){
        super(mesage);
    }
}
