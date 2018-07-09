package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;
import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.ICommando;

import java.util.Set;

public class Commando extends SpecialisedSoldier implements ICommando{
    private Set<Missions> missions;

    public Commando(String firstName, String lastName, String id, double salary, String corbs, Set<Missions> missions) {
        super(firstName, lastName, id, salary, corbs);
        this.missions = missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Missions:").append(System.lineSeparator());
        for (Missions mission : missions) {
            sb.append(mission.toString());
        }
        return sb.toString();
    }
}
