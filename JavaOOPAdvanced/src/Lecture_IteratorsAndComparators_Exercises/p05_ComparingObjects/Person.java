package Lecture_IteratorsAndComparators_Exercises.p05_ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public int compareTo(Person othrerPerson) {
        int comparatorByName = this.name.compareTo(othrerPerson.name);
        if (comparatorByName != 0) {
            return comparatorByName;
        }

        int comparatorByAge = this.age - othrerPerson.age;
        if (comparatorByAge != 0) {
            return comparatorByAge;
        }

        return this.town.compareTo(othrerPerson.town);
    }

}
