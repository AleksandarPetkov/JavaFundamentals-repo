package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
//Given a sequence consisting of parentheses, determine whether the expression is balanced.
// A sequence of parentheses is balanced if every open parenthesis can be paired uniquely with a closed parenthesis that occurs after the former.
//Also,the interval between them must be balanced. You will be given three types of parentheses: (, {, and [.
//{[()]} - This is a balanced parenthesis.
//{[(])} - This is not a balanced parenthesis.
public class P12_BalancedParentheses {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         char[] symbols = reader.readLine().toCharArray();
         ArrayDeque<Character> queue = new ArrayDeque();
         ArrayDeque<Character> stack = new ArrayDeque<>();

         for (char symbol : symbols) {
             queue.add(symbol);
         }
         for (char symbol : symbols) {
            stack.push(symbol);
         }

         for (int i = 0; i < queue.size() / 2; i++) {
            if (queue.peek() == '{' && stack.peek() != '}'){
                System.out.println("NO");
                return;
            }
            else if (queue.peek() == '(' && stack.peek() != ')'){
                System.out.println("NO");
                return;
            }
            else if (queue.peek() == '[' && stack.peek() != ']'){
                System.out.println("NO");
                return;
            }
            else if (queue.peek() == ' ' && stack.peek() != ' '){
                System.out.println("NO");
                return;
            }
            stack.pop();
            queue.remove();
         }
         System.out.println("YES");
    }
}
