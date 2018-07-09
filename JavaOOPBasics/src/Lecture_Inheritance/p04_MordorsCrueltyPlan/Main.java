package Lecture_Inheritance.p04_MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> foods = Arrays.asList(reader.readLine().split("\\s+"));

        Gandalf gandalf = new Gandalf(foods);
        int points = gandalf.getGandalfPoints();
        System.out.println(points);
        System.out.println(gandalf.GandalfMoods(points));

    }
}
