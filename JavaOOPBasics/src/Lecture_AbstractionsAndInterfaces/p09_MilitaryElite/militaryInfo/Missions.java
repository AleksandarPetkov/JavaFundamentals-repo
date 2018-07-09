package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;

import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.IMissions;

public class Missions implements IMissions{
    private final String STATE_IN_PROGRESS = "inProgress";
    private final String STATE_IN_FINISHED = "Finished";

    private String codeName;
    private String state;

    public Missions(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }


    public void completeMission(){};

    private void setState(String state) {
        if (STATE_IN_FINISHED.equals(state) || STATE_IN_PROGRESS.equals(state)){
            this.state = state;
        } else {
            throw new IllegalArgumentException();
        }
    }
//    Corps: Airforces
//    Missions:


    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(String.format(" Code Name: %s State: %s",this.codeName, this.state)).append(System.lineSeparator());
       return sb.toString();
    }
}
