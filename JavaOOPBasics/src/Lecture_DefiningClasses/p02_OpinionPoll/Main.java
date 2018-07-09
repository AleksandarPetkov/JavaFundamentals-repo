package Lecture_DefiningClasses.p02_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] tokens = line.split(" ");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            persons.add(person);
        }

        persons.stream().filter(x -> x.getAge() > 30).sorted((x1, x2) -> {
            int comp = x1.getName().compareTo(x2.getName());
            return comp;
        }).forEach(x -> System.out.println("" + x.getName() + " - " + x.getAge() + ""));
    }
}
