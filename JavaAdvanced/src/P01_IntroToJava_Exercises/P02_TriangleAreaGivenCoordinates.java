package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_TriangleAreaGivenCoordinates {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sideOne = reader.readLine().split(" ");
        String[] sideTwo = reader.readLine().split(" ");
        String[] sideThree = reader.readLine().split(" ");

        int aX = Integer.parseInt(sideOne[0]);
        int aY = Integer.parseInt(sideOne[1]);

        int bX = Integer.parseInt(sideTwo[0]);
        int bY = Integer.parseInt(sideTwo[1]);

        int cX = Integer.parseInt(sideThree[0]);
        int cY = Integer.parseInt(sideThree[1]);


        int areaTriangle = ((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY))) / 2;
        System.out.println(Math.abs(areaTriangle));
    }
}
