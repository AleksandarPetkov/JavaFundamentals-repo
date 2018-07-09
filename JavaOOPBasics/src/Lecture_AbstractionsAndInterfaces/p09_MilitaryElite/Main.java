package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite;

import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.ICommando;
import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.IEngineer;
import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.ILeutenantGeneral;
import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.ISpy;
import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Private> allPrivates = new LinkedHashSet<>();
        Set<Repair> allRepairs = new LinkedHashSet<>();
        Set<Missions> allMisions = new LinkedHashSet<>();
        while (true) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("End")) {
                break;
            }

            switch (tokens[0]) {
                case "Private":
                    privateImplementation(allPrivates, tokens);
                    break;
                case "LeutenantGeneral":
                    leutanantImplementations(allPrivates, tokens);
                    break;
                case "Engineer":
                    engineerEmplementations(allRepairs, tokens);
                    break;
                case "Commando":
                    commandoImplementations(allMisions, tokens);
                    break;
                case "Spy":
                    spyImplementations(tokens);
                    break;
            }
        }
    }

    private static void commandoImplementations(Set<Missions> allMisions, String[] tokens) {

        try {
            Missions missions = new Missions(tokens[6],(tokens[7]));
            allMisions.add(missions);
        } catch (Exception iae){
            ;
        }

        try {
            Missions missions1 = new Missions(tokens[8],(tokens[9]));
            allMisions.add(missions1);
        } catch (Exception iae){
            ;
        }

        ICommando commando = new Commando(tokens[3], tokens[1], tokens[2],
                Double.valueOf(tokens[4]), tokens[5], allMisions);
        System.out.print(commando);
        allMisions.clear();
    }

    private static void spyImplementations(String[] tokens) {
        ISpy iSpy = new Spy(tokens[1], tokens[2], tokens[3], (tokens[4]));
        System.out.println(iSpy);
    }

    private static void leutanantImplementations(Set<Private> allPrivates, String[] tokens) {
        ILeutenantGeneral leutenantGeneral = new LeutenantGeneral(tokens[3], tokens[1], tokens[2], Double.valueOf(tokens[4]), allPrivates);
        System.out.println(leutenantGeneral);
    }

    private static void privateImplementation(Set<Private> allPrivates, String[] tokens) {
        Private iPrivate = new Private(tokens[3], tokens[1], tokens[2], Double.valueOf(tokens[4]));
        allPrivates.add(iPrivate);
        System.out.println(iPrivate);
    }

    private static void engineerEmplementations(Set<Repair> allRepairs, String[] tokens) {

        try {
            Repair repairs = new Repair(tokens[6], Integer.valueOf(tokens[7]));
            allRepairs.add(repairs);
        } catch (Exception iae){
            ;
        }

        try {
            Repair repairs1 = new Repair(tokens[8], Integer.valueOf(tokens[9]));
            allRepairs.add(repairs1);
        } catch (Exception iae){
            ;
        }


        IEngineer engineer = new Engineer(tokens[3], tokens[1], tokens[2],
                Double.valueOf(tokens[4]), tokens[5], allRepairs);
        System.out.print(engineer);
        allRepairs.clear();
    }

}
