package Lecture_DefiningClasses.p07_PokemonTrainer;

public class Pokemon {
    private String name;
    private String element;
    private long health;

    public Pokemon(String name, String element, long health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }
    public String getElement(){
        return this.element;
    }
    public void setHealth(){
        this.health -= 10;
    }
    public long getHealth(){
        return this.health;
    }
}
