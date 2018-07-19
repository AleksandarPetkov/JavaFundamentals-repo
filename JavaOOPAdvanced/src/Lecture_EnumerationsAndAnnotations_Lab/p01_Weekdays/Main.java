package Lecture_EnumerationsAndAnnotations_Lab.p01_Weekdays;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
        weeklyCalendar.addEntry("Friday", "Beer all night");
        weeklyCalendar.addEntry("Saturday", "Eat SHKEMBE on the morning");
        weeklyCalendar.addEntry("Saturday", "Sleep all day");

        Iterable<WeeklyEntry> schedule = weeklyCalendar.getWeeklySchedue();
        for (WeeklyEntry weeklyEntry : schedule) {
            System.out.println(weeklyEntry.toString());
        }
    }
}
