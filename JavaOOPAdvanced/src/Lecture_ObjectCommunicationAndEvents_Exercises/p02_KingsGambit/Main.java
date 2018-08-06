package Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit;

import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.core.Engine;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.ConsoleReader;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.ConsoleWriter;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.Reader;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.Writer;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.repository.UnitRepository;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        UnitRepository repository = new UnitRepository();
        Engine engine = new Engine(reader, writer, repository);
        engine.run();
    }
}
