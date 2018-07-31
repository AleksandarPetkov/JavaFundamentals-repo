package Lecture_ObjectCommunicationAndEvents_Lab.models;

import Lecture_ObjectCommunicationAndEvents_Lab.enums.LogType;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Handler;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Observer;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Subject;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Target;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements Target, Subject{

    private static final String THIS_DIED_EVENT = "%s dies";

    private String id;
    private int hp;
    private int reward;
    private boolean eventTriggered;
    private Handler handler;
    private List<Observer> observerList;

    public Dragon(String id, int hp, int reward, Handler handler) {
        this.id = id;
        this.hp = hp;
        this.reward = reward;
        this.handler = handler;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void receiveDamage(int dmg) {
        if (!this.isDead()) {
            this.hp -= dmg;
        }

        if (this.isDead() && !eventTriggered) {
            this.handler.handle(LogType.EVENT,String.format(THIS_DIED_EVENT, this));
            this.eventTriggered = true;
            this.notifyObservers();
        }
    }

    @Override
    public boolean isDead() {
        return this.hp <= 0;
    }

    @Override
    public String toString() {
        return this.id;
    }

    @Override
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.reward);
        }
    }
}
