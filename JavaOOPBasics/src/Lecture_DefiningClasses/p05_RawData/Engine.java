package Lecture_DefiningClasses.p05_RawData;

public class Engine {
    private int enginePower;
    private int engineSpeed;


    public Engine(int ePower, int eSpeed){
        this.enginePower = ePower;
        this.engineSpeed = eSpeed;
    }

    public int getEnginePower(){
        return this.enginePower;
    }
}
