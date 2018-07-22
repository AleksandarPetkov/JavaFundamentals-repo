package Lecture_Reflection_Exercises.pr02PrivateClassFiddling;

import Lecture_Reflection_Exercises.pr02PrivateClassFiddling.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Create new instance from BlackBoxInt by Reflection
        Constructor blackBoxConstructor = BlackBoxInt.class.getDeclaredConstructor();
        blackBoxConstructor.setAccessible(true);
        BlackBoxInt boxInt = (BlackBoxInt) blackBoxConstructor.newInstance();
        while (true) {
            String token = reader.readLine();
            if (token.equals("END")) {
                break;
            }
            String[] tokens = token.split("_");

            switch (tokens[0]) {
                case "add":
                    addValueAndPrintResult(boxInt, tokens);
                    break;
                case "subtract":
                    addValueAndPrintResult(boxInt, tokens);
                    break;
                case "multiply":
                    addValueAndPrintResult(boxInt, tokens);
                    break;
                case "divide":
                    addValueAndPrintResult(boxInt, tokens);
                    break;
                case "leftShift":
                    addValueAndPrintResult(boxInt, tokens);
                    break;
                case "rightShift":
                    addValueAndPrintResult(boxInt, tokens);
                    break;
            }
        }
    }

    private static void addValueAndPrintResult(BlackBoxInt boxInt, String[] tokens) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        Method addMethod = boxInt.getClass().getDeclaredMethod(tokens[0], int.class);
        addMethod.setAccessible(true);
        addMethod.invoke(boxInt, Integer.valueOf(tokens[1]));
        Field fiel = boxInt.getClass().getDeclaredField("innerValue");
        fiel.setAccessible(true);
        // get int value on the field
        System.out.println(fiel.get(boxInt));
    }
}
