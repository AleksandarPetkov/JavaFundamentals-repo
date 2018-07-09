package Lecture_AbstractionsAndInterfaces.p08_MooD;

public class Archangel extends GameObjects implements GameFunctional{
    private int specialPoints;

    public Archangel(String username, int specialPoints, int level) {
        super(username, level);
        this.specialPoints = specialPoints;
    }


    public String reverseUsername(String name) {
        String result = new StringBuffer(name).reverse().toString();
        return result;
    }

    @Override
    public int unlockHashedPassword(String username) {
        return username.length() * 21;
    }

}
