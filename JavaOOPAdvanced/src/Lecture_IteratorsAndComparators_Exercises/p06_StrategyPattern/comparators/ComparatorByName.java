package Lecture_IteratorsAndComparators_Exercises.p06_StrategyPattern.comparators;

import Lecture_IteratorsAndComparators_Exercises.p06_StrategyPattern.Person;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int comparatorByNameLenght = o1.getName().length() - o2.getName().length();
        if (comparatorByNameLenght != 0){
            return comparatorByNameLenght;
        }

        int comparatorByFirstLetter = String.valueOf(o1.getName().charAt(0)).compareToIgnoreCase(String.valueOf(o2.getName().charAt(0)));
        return comparatorByFirstLetter;
    }
}
