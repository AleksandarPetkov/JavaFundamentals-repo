package Lecture_Inheritance.p03_Manking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] studentTokens = reader.readLine().split("\\s+");
        String[] workerTokens = reader.readLine().split("\\s+");

        try {
            Student student = new Student(studentTokens[0], studentTokens[1], studentTokens[2]);
            System.out.print(student);

            double weekSalary = Double.valueOf(workerTokens[2]);
            double hours = Double.valueOf(workerTokens[3]);
            Worker worker = new Worker(workerTokens[0], workerTokens[1] ,weekSalary,hours);
            System.out.println(worker);

        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
