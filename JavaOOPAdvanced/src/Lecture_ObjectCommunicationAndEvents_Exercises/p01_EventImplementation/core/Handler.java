package Lecture_ObjectCommunicationAndEvents_Exercises.p01_EventImplementation.core;

import Lecture_ObjectCommunicationAndEvents_Exercises.p01_EventImplementation.io.Writer;

public class Handler implements NameChangeListener{
    private Writer writer;

    public Handler(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void handleChangedName(NameChange event) {
        this.writer.write("Dispatcher's name changed to " + event.getName() + ".");
    }
}
