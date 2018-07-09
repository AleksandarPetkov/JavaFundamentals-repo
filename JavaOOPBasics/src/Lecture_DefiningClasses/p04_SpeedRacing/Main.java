package Lecture_DefiningClasses.p04_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String , Car> allCars = new LinkedHashMap<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");

            String model = tokens[0];
            double currentFuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostFor1km = Double.parseDouble(tokens[2]);

            Car currentCar = new Car(model, currentFuelAmount , fuelCostFor1km);
            allCars.put(model, currentCar);


        }

        while (true){
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("End")){
                break;
            }

            String currentModel = tokens[1];
            int amountOfKm = Integer.parseInt(tokens[2]);

            try {
                allCars.get(currentModel).drive(amountOfKm);
            }catch (IllegalStateException ise){
                System.out.println(ise.getMessage());
            }
        }

        allCars.values().forEach(x -> System.out.println(x));
    }
}
