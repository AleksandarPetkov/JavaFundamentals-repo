package Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models;


import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.Writer;

public class Footman extends KillableUnit {
    public Footman(String name, Writer writer) {
        super(name, writer);
    }

    @Override
    public void respond() {
        super.getWriter().write(String.format("Footman %s is panicking!", super.getName()));
    }
}
