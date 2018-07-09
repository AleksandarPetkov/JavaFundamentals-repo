package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;


import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.IEngineer;

import java.util.Set;

public class Engineer extends SpecialisedSoldier implements IEngineer{
    private Set<Repair> repairSet;

    public Engineer(String id, String firstName, String lastName, double salary, String corbs, Set<Repair> repairs) {

        super(id, firstName, lastName, salary, corbs);
        this.repairSet = repairs;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Repairs:").append(System.lineSeparator());
        for (Repair repair : repairSet) {
            sb.append(repair.toString());
        }
        return sb.toString();
    }
}
