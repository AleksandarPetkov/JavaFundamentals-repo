package Lecture_AbstractionsAndInterfaces.p08_MooD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split(" \\| ");

        GameFunctional player = null;
        if (tokens[1].equals("Demon")) {
            player = new Demon(tokens[0], Double.valueOf(tokens[2]), Integer.valueOf(tokens[3]));

            System.out.printf("\"%s\" | \"%d\" -> %s%n",tokens[0], player.unlockHashedPassword(tokens[0]), tokens[1]);
            System.out.printf("%.1f", Double.valueOf(tokens[2]) * Integer.valueOf(tokens[3]));
        } else {
            player = new Archangel(tokens[0], Integer.valueOf(tokens[2]), Integer.valueOf(tokens[3]));

            System.out.printf("\"%s\" | \"%s%d\" -> %s%n",tokens[0],player.reverseUsername(tokens[0])  , player.unlockHashedPassword(tokens[0]), tokens[1]);
            System.out.printf("%d", Integer.valueOf(tokens[2]) * Integer.valueOf(tokens[3]));
        }


    }
}
