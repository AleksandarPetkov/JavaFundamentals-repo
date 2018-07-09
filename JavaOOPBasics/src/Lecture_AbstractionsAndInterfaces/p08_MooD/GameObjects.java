package Lecture_AbstractionsAndInterfaces.p08_MooD;

public abstract class GameObjects {
    private String username;
    private int hashedPassword;
	private int level;

    public GameObjects(String username, int level) {
        this.username = username;
        this.level = level;
    }
}
