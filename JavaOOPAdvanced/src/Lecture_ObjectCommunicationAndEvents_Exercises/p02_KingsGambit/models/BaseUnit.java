package Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models;


import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.Writer;

public abstract class BaseUnit {
    private Writer writer;
    private String name;

    protected BaseUnit(String name, Writer writer) {
        this.name = name;
        this.writer = writer;
    }

    public Writer getWriter() {
        return this.writer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
