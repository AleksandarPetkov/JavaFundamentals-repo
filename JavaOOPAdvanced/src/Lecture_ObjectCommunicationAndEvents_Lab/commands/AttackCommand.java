package Lecture_ObjectCommunicationAndEvents_Lab.commands;

import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Attacker;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Command;

public class AttackCommand implements Command{
    private Attacker attacker;

    public AttackCommand(Attacker attacker) {
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        this.attacker.attack();
    }
}
