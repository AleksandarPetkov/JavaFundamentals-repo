package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;

import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.ISpecialisedSoldier;

public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier{
    private final String DEFAULT_AIRFORCES = "Airforces";
    private final String DEFALT_MARINES = "Marines";

    private String corbs;

    public SpecialisedSoldier(String firstName, String lastName, String id, double salary, String corbs) {
        super(firstName, lastName, id, salary);
        setCorbs(corbs);
    }

    private void setCorbs(String corbs) {
       if (DEFALT_MARINES.equals(corbs) || DEFAULT_AIRFORCES.equals(corbs)){
           this.corbs = corbs;
       } else {
           throw new IllegalArgumentException();
       }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator())
                .append(String.format("Corps: %s",this.corbs)).append(System.lineSeparator());
        return sb.toString();
    }
}
