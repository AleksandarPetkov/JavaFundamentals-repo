package Lecture_EnumerationsAndAnnotations_Exercises.p09_TrafficLights;



public class TrafficLights {
    private Signals signal;

    public TrafficLights(String signal) {
        this.signal = Signals.valueOf(signal);
    }

    public void changeSignal() {
        this.signal = Signals.values()[(this.signal.ordinal() + 1) % 3];
    }

    @Override
    public String toString() {
        return signal.name();
    }
}
