package Lecture_EnumerationsAndAnnotations_Lab.p02_WarningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String level = reader.readLine();
        Logger logger = new Logger(level);
        while (true){
            String[] tokens = reader.readLine().split(": ");
            if (tokens[0].equals("END")){
                break;
            }
            Message message = new Message(tokens[0], tokens[1]);
            logger.addMessage(message);
        }
        System.out.print(logger.toString());
    }
}
