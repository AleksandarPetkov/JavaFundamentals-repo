package Lecture_DefiningClasses.p06_CarSelesman;

public class Engine {
    private static int DEFAULT_COUNT_OF_ENGINES = 0;

    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, String efficiency) { // 3 elements ends with STRING
        DEFAULT_COUNT_OF_ENGINES++;
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {  // 3 elements ends with INTEGER
        DEFAULT_COUNT_OF_ENGINES++;
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    Engine(String model, int power) {
        DEFAULT_COUNT_OF_ENGINES++;
        this.model = model;
        this.power = power;
    }

    Engine(String model, int power, int displacement, String efficiency) {
        DEFAULT_COUNT_OF_ENGINES++;
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder engine = new StringBuilder();

        engine .append(String.format("%s:", this.model))
                .append(System.lineSeparator())
                .append(String.format("Power: %d", this.power))
                .append(System.lineSeparator())
                .append(String.format("Displacement: %s", this.displacement == 0 ? "n/a" : this.displacement))
                .append(System.lineSeparator());


        if (this.efficiency == null) {
            engine.append("Efficiency: n/a");
        } else {
            engine.append(String.format("Efficiency: %s", this.efficiency));
        }

        return engine.toString();
    }
}
