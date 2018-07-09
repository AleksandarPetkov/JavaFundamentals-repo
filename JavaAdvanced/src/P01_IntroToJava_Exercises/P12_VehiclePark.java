package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P12_VehiclePark {
    public static void main(String[] args) throws IOException {

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         List<String> vehicle = Arrays.stream(reader.readLine().toLowerCase().split("\\s+")).collect(Collectors.toList());

         int soldVehecle = 0;
         while (true){
             String[] request = reader.readLine().toLowerCase().split("\\s+");
             if (request[0].equals("end")){
                 break;
             }

             String vehicleType = request[0];
             char currentType = vehicleType.charAt(0);
             String seats = request[request.length - 2];
             boolean removeVehicle = false;

             for (String veh : vehicle) {

                 char vType = veh.charAt(0);
                 String vSeats = veh.substring(1,veh.length());

                 if (vType == currentType && seats.equals(vSeats)){

                     int multiplication = Integer.parseInt(seats);
                     int price = multiplication * (int)vType;
                     System.out.printf("Yes, sold for %d$%n",price);
                     removeVehicle = true;
                     soldVehecle++;
                     vehicle.remove(veh);
                     break;
                 }
             }


             if (removeVehicle == false){
                 System.out.println("No");

             }
             else{
                 removeVehicle = false;

             }
         }
        System.out.printf("Vehicles left: %s%n", String.join(", ", vehicle));
        System.out.printf("Vehicles sold: %d", soldVehecle);
    }
}
