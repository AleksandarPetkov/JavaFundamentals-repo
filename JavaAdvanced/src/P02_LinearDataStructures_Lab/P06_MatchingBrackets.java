package P02_LinearDataStructures_Lab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//We are given an arithmetical expression with brackets. Scan through the string and extract each sub-expression.
public class P06_MatchingBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<Integer> indexes = new ArrayDeque<>();

        char start = '(';
        char end = ')';
        String print = "";
        for (int i = 0; i < input.length(); i++) {

            if ( start == input.charAt(i)){
                indexes.push(i);
            }
            if (end == input.charAt(i)){
                int endIndex = i;
                print = input.substring(indexes.peek(),endIndex + 1);
                System.out.println(print);
                indexes.pop();
            }
        }

    }
}
