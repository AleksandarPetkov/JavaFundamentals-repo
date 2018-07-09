package ExamPreparationTheExpance;

import ExamPreparationTheExpance.colonist.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] familyTokens = reader.readLine().split("\\s+");
        int familyCount = Integer.valueOf(familyTokens[0]);
        int familyCapacity = Integer.valueOf(familyTokens[1]);
        Colony colony = new Colony(familyCount, familyCapacity);

        while (true) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("end")) {
                break;
            }

            switch (tokens[0]) {
                case "insert":
                    try {
                        addColomist(colony, tokens);
                    } catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "remove":
                    if (tokens[1].equals("colonist")){
                        colony.removeColonist(tokens[2], tokens[3]);
                    } else {
                        colony.removeFamily(tokens[2]);
                    }
                    break;
                case "grow":
                    colony.grow(Integer.valueOf(tokens[1]));
                    break;
                case "potential":
                    int potention = colony.getPotential();
                    System.out.printf("potential: %d%n",potention);
                    break;
                case "capacity":
                    System.out.print(colony.getCapacity());
                    break;
                case "family":
                    System.out.print(colony.family(tokens[1]));
                    break;
            }
        }
    }

    private static void addColomist(Colony colony, String[] tokens) {
        String classColonist = tokens[1];
        String colonistId = tokens[2];
        String familyId = tokens[3];
        int talent = Integer.valueOf(tokens[4]);
        int age = Integer.valueOf(tokens[5]);
        if (tokens.length == 7){
            String sign = tokens[6];
            if (classColonist.equals("Surgeon")){
                Medic surgeon = new Surgeon(colonistId, familyId, talent, age, sign);
                colony.addColonist(surgeon);
            } else {
                Medic gp = new GeneralPractitioner(colonistId, familyId, talent, age, sign);
                colony.addColonist(gp);
            }

        } else {
            switch (classColonist){
                case "SoftwareEngineer":
                    Colonist softEn = new SoftwareEngineer(colonistId, familyId, talent, age);
                    colony.addColonist(softEn);
                    break;
                case "HardwareEngineer":
                    Colonist hardEn = new HardwareEngineer(colonistId, familyId, talent, age);
                    colony.addColonist(hardEn);
                    break;
                case "Soldier":
                    Colonist soldier = new Soldier(colonistId, familyId, talent, age);
                    colony.addColonist(soldier);
                    break;
            }
        }
    }
}
