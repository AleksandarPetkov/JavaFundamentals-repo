package Lecture_IteratorsAndComparators_Exercises.p01_ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ListyIterator listyIterator = null;
        while (true) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("END")) {
                break;
            }

            switch (tokens[0]) {
                case "Create":
                    if (tokens.length == 1){
                        listyIterator = new ListyIterator();
                    } else {
                        String[] strings = new String[tokens.length - 1];
                        for (int i = 1; i < tokens.length ; i++) {
                            strings[i - 1] = tokens[i];
                        }
                        listyIterator = new ListyIterator(strings);
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
            }
        }
    }
}
