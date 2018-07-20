package Lecture_EnumerationsAndAnnotations_Exercises.p06_CustomEnumAnnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        if (line.equals("Rank")){
            Class<CardRank> cardRankClass= CardRank.class;
            CustomEnumAnnotation currentRank = cardRankClass.getAnnotation(CustomEnumAnnotation.class);

            System.out.printf("Type = %s, Description = %s%n",currentRank.type(), currentRank.description());
        } else {
            Class<CardSuits> cardSuitsClass= CardSuits.class;
            CustomEnumAnnotation currentSuits = cardSuitsClass.getAnnotation(CustomEnumAnnotation.class);

            System.out.printf("Type = %s, Description = %s%n",currentSuits.type(), currentSuits.description());
        }

    }
}
