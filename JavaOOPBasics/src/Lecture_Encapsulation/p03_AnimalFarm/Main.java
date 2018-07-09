package Lecture_Encapsulation.p03_AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String name = reader.readLine();
         int age = Integer.parseInt(reader.readLine());

         Chicken chicken = null;
         try {
              chicken = new Chicken(name, age);
         } catch (IllegalArgumentException iae){
             System.out.println(iae.getMessage());
             return;
         }

         if (chicken.calculateProductPerDay(age) < 1){
             System.out.printf("Chicken %s (age %d) can produce 0.75 eggs per day.",chicken.getName(), chicken.getAge());
         } else {
             System.out.printf("Chicken %s (age %d) can produce %.0f eggs per day.",chicken.getName(), chicken.getAge(), chicken.calculateProductPerDay(age));
         }

    }
}
