package P03_SetsAndMaps_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P01_ParkingLot {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         HashSet<String> carNumbers = new HashSet<>();

         while (true){
             String[] inputArgs = reader.readLine().split(", ");
             if (inputArgs[0].equals("END")){
                 break;
             }

             String command = inputArgs[0];
             String number = inputArgs[1];

             if (command.equals("IN")){
                 carNumbers.add(number);
             }
             else {
                 carNumbers.remove(number);
             }
         }

         if (carNumbers.isEmpty()){
             System.out.println("Parking Lot is Empty");
         }
         else {
             for (String carNumber : carNumbers) {
                 System.out.println(carNumber);
             }
         }
    }
}
