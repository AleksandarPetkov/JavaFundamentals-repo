package Lecture_ObjectCommunicationAndEvents_Exercises.p01_EventImplementation.io;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String line) {
        System.out.println(line);
    }
}
