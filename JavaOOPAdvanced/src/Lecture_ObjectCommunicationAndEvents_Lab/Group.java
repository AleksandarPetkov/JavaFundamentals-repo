package Lecture_ObjectCommunicationAndEvents_Lab;

import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.AttackGroup;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Attacker;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Target;

import java.util.ArrayList;
import java.util.List;

public class Group implements AttackGroup {
    private List<Attacker> attackerList;

    public Group() {
        this.attackerList = new ArrayList<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        this.attackerList.add(attacker);
    }

    @Override
    public void groupTarget(Target target) {
        for (Attacker attacker : this.attackerList) {
            attacker.setTarget(target);
        }
    }

    @Override
    public void groupAttack() {
        for (Attacker attacker : attackerList) {
            attacker.attack();
        }
    }
}
