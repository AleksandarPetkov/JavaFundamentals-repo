package Lecture_ObjectCommunicationAndEvents_Lab.interfaces;

public interface AttackGroup {
    void addMember(Attacker attacker);

    void groupTarget(Target target);

    void groupAttack();
}
