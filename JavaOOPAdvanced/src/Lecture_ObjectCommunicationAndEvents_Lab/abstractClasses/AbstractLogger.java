package Lecture_ObjectCommunicationAndEvents_Lab.abstractClasses;

import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Handler;

public abstract class AbstractLogger implements Handler{
    private Handler nextHandler;

    protected Handler getNextHandler() {
        return this.nextHandler;
    }

    @Override
    public void setSuccessor(Handler handler) {
        this.nextHandler = handler;
    }
}
