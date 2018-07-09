package Lecture_Inheritance.p06_Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String type = reader.readLine();
            if (type.equals("Beast!")) {
                break;
            }
            String[] tokens = reader.readLine().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String denger = tokens[2];

            switch (type) {
                case "Animal":
                    try {
                        Animal animal = new Animal(name, age, denger);
                        System.out.println(type);
                        System.out.println(animal);

                    } catch (IllegalArgumentException iea) {
                        System.out.println(iea.getMessage());
                    }
                    break;

                case "Cat":
                    try {
                        Cat cat = new Cat(name, age, denger);
                        System.out.println(type);
                        System.out.println(cat);

                    } catch (IllegalArgumentException iea) {
                        System.out.println(iea.getMessage());
                    }
                    break;

                case "Dog":
                    try {
                        Dog dog = new Dog(name, age, denger);
                        System.out.println(type);
                        System.out.println(dog);

                    } catch (IllegalArgumentException iea) {
                        System.out.println(iea.getMessage());
                    }
                    break;
                case "Frog":
                    try {
                        Frog frog = new Frog(name, age, denger);
                        System.out.println(type);
                        System.out.println(frog);
                    } catch (IllegalArgumentException iea) {
                        System.out.println(iea.getMessage());
                    }
                    break;

                case "Kitten":
                    try {
                        Kitten kitten = new Kitten(name, age, denger);
                        System.out.println(type);
                        System.out.println(kitten);
                    } catch (IllegalArgumentException iea) {
                        System.out.println(iea.getMessage());
                    }
                    break;

                case "Tomcat":
                    try {
                        Tomcat tomcat = new Tomcat(name, age, denger);
                        System.out.println(type);
                        System.out.println(tomcat);
                    } catch (IllegalArgumentException iea) {
                        System.out.println(iea.getMessage());
                    }

                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }


    }
}
