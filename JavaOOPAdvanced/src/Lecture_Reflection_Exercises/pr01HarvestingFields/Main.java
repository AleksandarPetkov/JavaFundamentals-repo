package Lecture_Reflection_Exercises.pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String command = reader.readLine();
            if (command.equals("HARVEST")) {
                break;
            }

            RichSoilLand richSoilLand = new RichSoilLand();
            switch (command) {
                case "private":
                    findAndPrintPrivateFields(richSoilLand);
                    break;
                case "public":
                    findAndPrintPublicFields(richSoilLand);
                    break;
                case "protected":
                    findAndPrintProtectedFields(richSoilLand);
                    break;
                case "all":
                    findAndPrintAllFields(richSoilLand);
                   break;
            }
        }
    }

    private static void findAndPrintAllFields(RichSoilLand richSoilLand) {
        Field[] allFields = richSoilLand.getClass().getDeclaredFields();
        for (Field currentField : allFields) {
            int proModifier = currentField.getModifiers();
            boolean chekForProtected = Modifier.isProtected(proModifier);
            boolean chekForPublic = Modifier.isPublic(proModifier);
            boolean chekForPrivate = Modifier.isPrivate(proModifier);
            if (chekForProtected == true && chekForPrivate == false && chekForPublic == false) {
                System.out.println(String.format("protected %s %s", currentField.getType().getSimpleName(),
                        currentField.getName()));
            }
            if (chekForProtected == false && chekForPrivate == true && chekForPublic == false) {
                System.out.println(String.format("private %s %s", currentField.getType().getSimpleName(),
                        currentField.getName()));
            }
            if (chekForProtected == false && chekForPrivate == false && chekForPublic == true) {
                System.out.println(String.format("public %s %s", currentField.getType().getSimpleName(),
                        currentField.getName()));
            }
        }
    }

    private static void findAndPrintProtectedFields(RichSoilLand richSoilLand) {
        Field[] protectedFields = richSoilLand.getClass().getDeclaredFields();
        for (Field currentField : protectedFields) {
            int proModifier = currentField.getModifiers();
            boolean chekForProtected = Modifier.isProtected(proModifier);
            if (chekForProtected == true) {
                System.out.println(String.format("protected %s %s", currentField.getType().getSimpleName(),
                        currentField.getName()));
            }
        }
    }

    private static void findAndPrintPublicFields(RichSoilLand richSoilLand) {
        Field[] publicFields = richSoilLand.getClass().getDeclaredFields();
        for (Field currentField : publicFields) {
            int pubModifier = currentField.getModifiers();
            boolean chekForPublic = Modifier.isPublic(pubModifier);
            if (chekForPublic == true) {
                System.out.println(String.format("public %s %s", currentField.getType().getSimpleName(),
                        currentField.getName()));
            }
        }
    }

    private static void findAndPrintPrivateFields(RichSoilLand richSoilLand) {
        Field[] privateFields = richSoilLand.getClass().getDeclaredFields();
        for (Field currentField : privateFields) {
            int prModifier = currentField.getModifiers();
            boolean chekisPrivate = Modifier.isPrivate(prModifier);
            if (chekisPrivate == true) {
                System.out.println(String.format("private %s %s", currentField.getType().getSimpleName(),
                        currentField.getName()));
            }
        }
    }
}
