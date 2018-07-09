package Lecture_AbstractionsAndInterfaces.p03_Ferrari;

public class Ferrari implements Car{
    private String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }

    public String useBreak(){
       return ("Brakes!");
    }

    public String pushTheGas(){
        return ("Zadu6avam sA!");
    }

    public String getDriver() {
        return driver;
    }

    public String getModel() {
        return "488-Spider";
    }
}
