package P04_StringProcessing_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_ParceURL {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] input = reader.readLine().split("://");

         if (input.length != 2){
             System.out.println("Invalid URL");
             return;
         }

         String protocol = input[0];
         int index = input[1].indexOf("/");
         String server = input[1].substring(0, index);
         input[1] = input[1].substring(index + 1);
         String resources = input[1];

         System.out.println("Protocol = "+protocol);
         System.out.println("Server = "+server);
         System.out.println("Resources = "+resources);
}
}
