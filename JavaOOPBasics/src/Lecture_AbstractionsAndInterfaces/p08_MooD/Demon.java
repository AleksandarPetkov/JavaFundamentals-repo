package Lecture_AbstractionsAndInterfaces.p08_MooD;

public class Demon extends GameObjects implements  GameFunctional {
    private double specialPoints;

    public Demon(String username, double specialPoints, int level) {
        super(username, level);
        this.specialPoints = specialPoints;
    }

    @Override
    public int unlockHashedPassword(String username) {
        return username.length() * 217;
    }

    @Override
    public String reverseUsername(String name) {
        return null;
    }

}
