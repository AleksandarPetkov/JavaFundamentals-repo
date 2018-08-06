package Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.interfaces;

public interface Subject {
    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    void notifyAllObservers();
}
