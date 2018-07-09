package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;

import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.ISpy;

public class Spy extends Soldier implements ISpy{
    private String codeNumber;

    public Spy(String firstName, String lastName, String id, String codeNumber) {
        super(firstName, lastName, id);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString())
                .append(System.lineSeparator())
                .append("Code Number: ").append(this.codeNumber);

        return sb.toString();
    }
}
