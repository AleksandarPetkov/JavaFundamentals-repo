package Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.io;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String line) {
        System.out.println(line);
    }
}
