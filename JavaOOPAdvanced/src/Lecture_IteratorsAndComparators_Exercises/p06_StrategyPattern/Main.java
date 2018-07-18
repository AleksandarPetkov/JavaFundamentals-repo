package Lecture_IteratorsAndComparators_Exercises.p06_StrategyPattern;

import Lecture_IteratorsAndComparators_Exercises.p06_StrategyPattern.comparators.ComparatorByAge;
import Lecture_IteratorsAndComparators_Exercises.p06_StrategyPattern.comparators.ComparatorByName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> setPersonByName = new TreeSet<>(new ComparatorByName());
        Set<Person> setPersonByAge = new TreeSet<>(new ComparatorByAge());

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            setPersonByAge.add(person);
            setPersonByName.add(person);
        }

        setPersonByName.forEach(x -> System.out.println(x.toString()));
        setPersonByAge.forEach(x -> System.out.println(x.toString()));
    }
}
