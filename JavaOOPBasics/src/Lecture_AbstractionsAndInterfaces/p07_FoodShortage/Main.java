package Lecture_AbstractionsAndInterfaces.p07_FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Buyer> allBuyers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");

            if (tokens.length == 4) {
                Buyer buyer = new Citizen(tokens[0], tokens[1], tokens[2], tokens[3]);
                allBuyers.add(buyer);
            } else if (tokens.length == 3) {
                Buyer buyer = new Rebel(tokens[0], tokens[1], tokens[2]);
                allBuyers.add(buyer);
            }
        }

        int totalAmountOfFood = 0;
        while (true) {
            String name = reader.readLine();
            if (name.equals("End")) {
                break;
            }

            for (Buyer buyer : allBuyers) {
                if (buyer.getName().equals(name)) {
                    totalAmountOfFood += buyer.buyFood();
                }
            }
        }
        System.out.println(totalAmountOfFood);
    }
}
