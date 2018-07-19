package Lecture_EnumerationsAndAnnotations_Lab.p01_Weekdays;

import java.util.Comparator;

public class WeeklyEntry {
    public static final Comparator<WeeklyEntry> BY_WEEKDAY = getCompByDay();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday, this.notes);
    }

    private static Comparator<WeeklyEntry> getCompByDay() {
        return (x1,x2) -> x1.weekday.compareTo(x2.weekday);
    }
}
