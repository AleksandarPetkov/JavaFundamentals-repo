package Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models;


import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.Writer;

public class RoyalGuard extends KillableUnit {
    public RoyalGuard(String name, Writer writer) {
        super(name, writer);
    }

    @Override
    public void respond() {
        super.getWriter().write(String.format("Royal Guard %s is defending!", super.getName()));
    }
}
