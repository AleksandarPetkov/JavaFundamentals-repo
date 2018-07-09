package P03_SetsAndMaps_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
//Write a program that:
//         Read from console number of student for a track
//         Read on pair of rows:
//        o First line is name of student
//        o Second line is his score for different number of courses
//         Print on console “{name} is graduated with {average scores)”

public class P04_AcademyGraduatio {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(reader.readLine());
         TreeMap<String, Double> mapGraduation = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String student = reader.readLine();
            String[] scores = reader.readLine().split("\\s+");

            double currentScore = 0;
            for (String score : scores) {
                currentScore += Double.parseDouble(score);
            }
            double studentGraduaiton = currentScore / (double)scores.length;

            if (!mapGraduation.containsKey(student)){
                mapGraduation.put(student,studentGraduaiton);
            }
        }
        for (String key : mapGraduation.keySet()) {
            System.out.println(key+" is graduated with "+ mapGraduation.get(key));
        }
    }
}
