package Lecture_AbstractionsAndInterfaces.p04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] phoneNumbers = reader.readLine().split("\\s+");
        String[] allSites = reader.readLine().split("\\s+");

        Smartphone smartphone = new Phone();

        for (String phoneNumber : phoneNumbers) {
            smartphone.setPhoneNumbers(phoneNumber);
        }

        for (String currentSite : allSites) {
            smartphone.setAllSites(currentSite);
        }

        smartphone.Calling(smartphone.getPhoneNumbers());
        smartphone.Browsing(smartphone.getAllSites());
    }
}
