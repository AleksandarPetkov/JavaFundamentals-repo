package Lecture_AbstractionsAndInterfaces.p06_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<InterfaceImpl> allCitizen = new ArrayList<>();
        while (true){
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("End")){
                break;
            }

            if (tokens.length == 5){
                InterfaceImpl human = new Citizen(tokens[1], tokens[2], tokens[3], tokens[4]);
                allCitizen.add(human);

            } else if (tokens.length == 3 && tokens[0].equals("Pet")){
                InterfaceImpl robot = new Robot(tokens[1], tokens[2]);
                allCitizen.add(robot);
            }
        }

        String validId = reader.readLine();

        for (InterfaceImpl citizen : allCitizen) {
            boolean goInCity = citizen.checkId(validId);
            if (goInCity == true){
                System.out.println(citizen.getId());
            }
        }
    }
}
