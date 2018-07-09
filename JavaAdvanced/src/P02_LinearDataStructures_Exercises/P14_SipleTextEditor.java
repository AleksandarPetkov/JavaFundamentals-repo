package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

//You are given an empty text. Your task is to implement 4 types of commands related to manipulating the text:
//        •	"1 [string]" - appends [string] to the end of the text
//        •	"2 [count]" - erases the last [count] elements from the text
//        •	"3 [index]" - returns the element at position [index] from the text
//        •	"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation
public class P14_SipleTextEditor {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(reader.readLine());

         ArrayDeque<String> stack = new ArrayDeque<>();
         StringBuilder sb = new StringBuilder();

         for (int i = 0; i < n; i++) {
             String[]  commandsArgs = reader.readLine().split("\\s+");
             String command = commandsArgs[0];
             String text = "";

             if (!command.equals("4")){
                 text  = commandsArgs[1];
             }

             switch (command){
                 case "1":
//                     addElementsInStack(text,stack,sb);
                     break;
                 case "2":

                     break;
                 case "3":
//                     printCharackterFromStack(stack,text);
                     break;
                 case "4":
                     break;
             }
         }
    }

}
