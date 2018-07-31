package Lecture_ObjectCommunicationAndEvents_Lab.commands;

import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.AttackGroup;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Command;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Target;

public class GroupTargetCommand implements Command {

    private AttackGroup attackGroup;
    private Target target;

    public GroupTargetCommand(AttackGroup attackGroup, Target target) {
        this.attackGroup = attackGroup;
        this.target = target;
    }


    @Override
    public void execute() {
        this.attackGroup.groupTarget(this.target);
    }
}
