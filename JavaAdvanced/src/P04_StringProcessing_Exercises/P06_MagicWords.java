package P04_StringProcessing_Exercises;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class P06_MagicWords {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        String first = line[0];
        String second = line[1];
        System.out.println(areEqual(first, second));

    }

    private static boolean areEqual(String a, String b) {
        boolean areEqual = true;
        HashMap<Character, Character> map = new HashMap<>();
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char firstChar = a.charAt(i);
                char secondChar = b.charAt(i);
                if (!map.containsKey(firstChar)) {
                    map.put(firstChar, secondChar);
                }else{
                    if(!map.containsValue(secondChar)){
                        areEqual= false;
                    }
                }
            }
        } else {
            areEqual = false;
        }

        return areEqual;
    }

}
