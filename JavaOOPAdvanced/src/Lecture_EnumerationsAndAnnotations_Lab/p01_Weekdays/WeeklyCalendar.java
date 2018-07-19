package Lecture_EnumerationsAndAnnotations_Lab.p01_Weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {
    private List<WeeklyEntry> weeklyEntries;

    public WeeklyCalendar() {
        this.weeklyEntries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes){
        WeeklyEntry currentEntry = new WeeklyEntry(weekday, notes);
        this.weeklyEntries.add(currentEntry);
    }

    public Iterable<WeeklyEntry> getWeeklySchedue(){
        Collections.sort(weeklyEntries, WeeklyEntry.BY_WEEKDAY);
        return this.weeklyEntries;
    }
}
