package Lecture_ObjectCommunicationAndEvents_Lab.commands;

import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Attacker;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Command;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Target;

public class TargetCommand implements Command{
    private Attacker attacker;
    private Target target;

    public TargetCommand(Attacker attacker, Target target) {
        this.attacker = attacker;
        this.target = target;
    }


    @Override
    public void execute() {
       this.attacker.setTarget(this.target);
    }
}
