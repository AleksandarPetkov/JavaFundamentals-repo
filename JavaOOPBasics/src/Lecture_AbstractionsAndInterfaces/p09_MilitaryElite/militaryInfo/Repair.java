package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;

import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.IRepair;

public class Repair implements IRepair{
    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    public String getPartName() {
        return this.partName;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

//    Repairs:
//    Part Name: Boat Hours Worked: 2

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(String.format(" Part Name: %s Hours Worked: %d",this.partName, this.hoursWorked)).append(System.lineSeparator());
       return sb.toString();
    }
}
