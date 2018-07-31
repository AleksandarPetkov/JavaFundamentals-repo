package Lecture_ObjectCommunicationAndEvents_Lab;

import Lecture_ObjectCommunicationAndEvents_Lab.abstractClasses.AbstractHero;
import Lecture_ObjectCommunicationAndEvents_Lab.commands.*;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.*;
import Lecture_ObjectCommunicationAndEvents_Lab.loggers.CombatLogger;
import Lecture_ObjectCommunicationAndEvents_Lab.loggers.EventLogger;
import Lecture_ObjectCommunicationAndEvents_Lab.models.Dragon;
import Lecture_ObjectCommunicationAndEvents_Lab.models.Warrior;

public class Main {
    public static void main(String[] args) {

        Handler combatLogger = new CombatLogger();
        Handler eventLogger = new EventLogger();

        //Навързвам си веригата, като аз определям от къде ще тръгнем
        combatLogger.setSuccessor(eventLogger);

        AbstractHero attackerWarrior = new Warrior("Jo", 12, combatLogger);
        AbstractHero attackerArcher = new Warrior("Mi", 10, combatLogger);
        AbstractHero attackerGunnar = new Warrior("Arsenal", 11, combatLogger);
        AbstractHero attackerOrc = new Warrior("MUAN", 5, combatLogger);
        AbstractHero attackerUndead = new Warrior("Butcher", 19, combatLogger);
        Dragon target = new Dragon("BOSS", 41 , 100, combatLogger);

        AttackGroup attackGroup = new Group();
        attackGroup.addMember(attackerWarrior);
        attackGroup.addMember(attackerArcher);
        attackGroup.addMember(attackerGunnar);
        attackGroup.addMember(attackerOrc);
        attackGroup.addMember(attackerUndead);

        target.register(attackerWarrior);
        target.register(attackerArcher);
        target.register(attackerGunnar);
        target.register(attackerOrc);
        target.register(attackerUndead);

        //WithOut Command pattern
//        attacker.setTarget(target);
//        attacker.attack();

        // With Command pattern and Mediator Pattern(use for group)
        Executor commandExecutor = new CommandExecutor();
        Command setTarget = new GroupTargetCommand(attackGroup, target);
        Command attackCommand = new GroupAttackCommand(attackGroup);
        commandExecutor.executeCommand(setTarget);
        commandExecutor.executeCommand(attackCommand);
    }
}
