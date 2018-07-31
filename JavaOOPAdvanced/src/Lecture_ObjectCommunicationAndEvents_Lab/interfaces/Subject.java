package Lecture_ObjectCommunicationAndEvents_Lab.interfaces;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

}
