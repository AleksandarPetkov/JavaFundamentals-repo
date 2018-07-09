package ExamPreparationNFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CarManager manager = new CarManager();
        Garage garage = new Garage();

        while (true) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("Cops")) {
                break;
            }

            switch (tokens[0]) {
                case "register":
                    manager.register(Integer.valueOf(tokens[1]), tokens[2], tokens[3], tokens[4], Integer.valueOf(tokens[5]), Integer.valueOf(tokens[6]), Integer.valueOf(tokens[7]), Integer.valueOf(tokens[8]), Integer.valueOf(tokens[9]));
                    break;
                case "check":
                    System.out.println(manager.check(Integer.valueOf(tokens[1])));
                    break;
                case "open":
                    manager.open(Integer.valueOf(tokens[1]), tokens[2], Integer.valueOf(tokens[3]), tokens[4], Integer.valueOf(tokens[5]));
                    break;
                case "participate":
                    manager.participate(Integer.valueOf(tokens[1]), Integer.valueOf(tokens[2]));
                    break;
                case "start":
                    System.out.print(manager.start(Integer.valueOf(tokens[1])));
                    break;
                case "park":
                    manager.park(Integer.valueOf(tokens[1]));
                    break;
                case "unpark":
                    manager.unpark(Integer.valueOf(tokens[1]));
                    break;
                case "tune":
                    manager.tune(Integer.valueOf(tokens[1]), tokens[2]);
                    break;
            }
        }
    }
}
