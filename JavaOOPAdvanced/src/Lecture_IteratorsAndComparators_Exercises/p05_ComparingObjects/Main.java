package Lecture_IteratorsAndComparators_Exercises.p05_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();
        while (true){
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("END")){
                break;
            }

            Person person = new Person(tokens[0], Integer.valueOf(tokens[1]), tokens[2]);
            people.add(person);
        }
        int checkThisPerson = Integer.parseInt(reader.readLine());
        if (checkThisPerson < 0 || checkThisPerson > people.size() - 1){
            System.out.println("No matches");
            return;
        }

        Person currentPerson = people.get(checkThisPerson);
        int countOfEqualPeople = 0;
        for (Person person : people) {
            if (currentPerson.compareTo(person) == 0){
                countOfEqualPeople++;
            }
        }

        if (countOfEqualPeople == 0){
            System.out.println("No matches");
        } else {
            System.out.println(String.format("%d %d %d", countOfEqualPeople, people.size() - countOfEqualPeople, people.size()));
        }
    }
}
