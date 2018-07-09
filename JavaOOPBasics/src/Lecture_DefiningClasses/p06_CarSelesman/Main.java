package Lecture_DefiningClasses.p06_CarSelesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String , Engine> allEngines = new LinkedHashMap<>();
        List<Car> allCars = new ArrayList<>();

        int countOfEngines = Integer.parseInt(reader.readLine());
        for (int i = 0; i < countOfEngines; i++) {
            String[] tokens = reader.readLine().split("\\s+");

            String currentModel = tokens[0];
            int power = Integer.parseInt(tokens[1]);

            Engine currentEngine = null;
            switch (tokens.length){
                case 2:
                    currentEngine = new Engine(currentModel , power);
                    break;
                case 3:
                    Pattern pattern = Pattern.compile("[\\d]+");
                    Matcher matcher = pattern.matcher(tokens[2]);

                    if (matcher.find()){
                        currentEngine = new Engine(currentModel, power , Integer.valueOf(tokens[2]));
                    } else {
                        currentEngine = new Engine(currentModel, power , tokens[2]);
                    }

                    break;
                case 4:
                    currentEngine = new Engine(currentModel, power, Integer.parseInt(tokens[2]), tokens[3]);
                    break;
            }

            if (!allEngines.containsKey(currentModel)){
                allEngines.put(currentModel , currentEngine);
            }
        }

        int countOfCars = Integer.parseInt(reader.readLine());
        for (int i = 0; i < countOfCars; i++) {
            String[] tokens = reader.readLine().split("\\s+");

            Car currentCar = null;
            switch (tokens.length){
                case 2:
                    currentCar = new Car(tokens[0], allEngines.get(tokens[1]));
                    break;
                case 3:
                    Pattern pattern = Pattern.compile("[\\d]+");
                    Matcher matcher = pattern.matcher(tokens[2]);

                    if (matcher.find()){
                        currentCar = new Car(tokens[0], allEngines.get(tokens[1]) , Integer.valueOf(tokens[2]));
                    } else {
                        currentCar = new Car(tokens[0], allEngines.get(tokens[1]) , tokens[2]);
                    }
                    break;
                case 4:
                    currentCar = new Car(tokens[0], allEngines.get(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]);
                    break;
            }
            allCars.add(currentCar);
        }
        System.out.println();
        allCars.forEach(x -> System.out.println(x));
    }
}
