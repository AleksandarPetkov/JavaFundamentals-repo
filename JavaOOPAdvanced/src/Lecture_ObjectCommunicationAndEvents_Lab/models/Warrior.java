package Lecture_ObjectCommunicationAndEvents_Lab.models;

import Lecture_ObjectCommunicationAndEvents_Lab.abstractClasses.AbstractHero;
import Lecture_ObjectCommunicationAndEvents_Lab.enums.LogType;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Handler;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Target;

public class Warrior extends AbstractHero{

    private static final String ATTACK_MESSAGE = "%s damages %s for %s";

    public Warrior(String id, int dmg, Handler handler) {
        super(id, dmg, handler);
    }

    @Override
    protected void executeClassSpecificAttack(Target target, int dmg) {
        super.getHandler().handle(LogType.ATTACK, String.format(ATTACK_MESSAGE, this, target, dmg));
        target.receiveDamage(dmg);
    }

    @Override
    public void update(int reward) {
        super.getHandler().handle(LogType.EVENT, super.getId() + " earns " + reward);
    }
}
