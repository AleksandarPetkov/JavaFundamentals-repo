package Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion;

import Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.core.Calculator;
import Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.core.Engine;
import Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.core.PrimitiveCalculator;
import Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.io.ConsoleReader;
import Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.io.ConsoleWriter;
import Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.io.Reader;
import Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.io.Writer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        Calculator calculator = new PrimitiveCalculator();
        Engine engine = new Engine(reader, writer, calculator);
        engine.run();
    }
}
