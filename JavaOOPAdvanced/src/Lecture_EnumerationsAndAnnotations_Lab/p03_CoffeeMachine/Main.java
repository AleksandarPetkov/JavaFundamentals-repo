package Lecture_EnumerationsAndAnnotations_Lab.p03_CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         CoffeeMashine coffeeMashine = new CoffeeMashine();
         while (true){
             String[] tokens = reader.readLine().split("\\s+");
             if (tokens[0].equals("END")){
                 break;
             }

             if (tokens.length == 1){
                 coffeeMashine.insertCoin(tokens[0]);
             } else {
                 try {
                     coffeeMashine.buyCoffee(tokens[0], tokens[1]);
                 }catch (IllegalArgumentException iae){
                     System.out.println(iae.getMessage());
                     return;
                 }
             }
         }
         coffeeMashine.coffeesSold().forEach(x -> System.out.println(x.toString()));
    }
}
