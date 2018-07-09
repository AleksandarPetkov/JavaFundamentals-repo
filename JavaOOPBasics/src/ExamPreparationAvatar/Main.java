package ExamPreparationAvatar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AvatarManager manager = new AvatarManager();
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("Quit")) {
                System.out.print(sb.toString());
                break;
            }

            switch (tokens[0]){
                case "Bender":
                    manager.Bender(tokens[1], tokens[2], Integer.valueOf(tokens[3]), Double.valueOf(tokens[4]));
                    break;
                case "Monument":
                    manager.Monument(tokens[1], tokens[2], Integer.valueOf(tokens[3]));
                    break;
                case "Status":
                    System.out.print(manager.Status(tokens[1]));
                    break;
                case "War":
                    sb.append(manager.War(tokens[1]));
                    break;
            }
        }
    }
}
