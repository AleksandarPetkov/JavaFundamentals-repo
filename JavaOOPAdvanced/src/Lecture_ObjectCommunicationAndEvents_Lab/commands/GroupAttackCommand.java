package Lecture_ObjectCommunicationAndEvents_Lab.commands;

import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.AttackGroup;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Command;

public class GroupAttackCommand implements Command {
    private AttackGroup attackGroup;

    public GroupAttackCommand(AttackGroup attackGroup) {
        this.attackGroup = attackGroup;
    }

    @Override
    public void execute() {
        this.attackGroup.groupAttack();
    }
}
