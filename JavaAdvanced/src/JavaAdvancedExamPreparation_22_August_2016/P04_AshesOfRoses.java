package P00_JavaAdvancedRetakeExam_22_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_AshesOfRoses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("Grow\\s<[A-Z][a-z]+>\\s<[a-zA-Z0-9]+>\\s[\\d]+");
        Map<String, Map<String, Long>> roses = new TreeMap<>();

        while (true) {
            String line = reader.readLine();
            if (line.equals("Icarus, Ignite!")) {
                break;
            }
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String[] tokens = line.split("[<>\\s]+");
                String region = tokens[1];
                String colour = tokens[2];
                Long roseAmount = Long.parseLong(tokens[3]);

                if (!roses.containsKey(region)) {

                    roses.put(region, new TreeMap<>());
                    roses.get(region).put(colour, roseAmount);

                } else {

                    if (!roses.get(region).containsKey(colour)) {
                        roses.get(region).put(colour, roseAmount);
                    } else {
                        roses.get(region).put(colour, roses.get(region).get(colour) + roseAmount);
                    }

                }
            }

        }
        roses.entrySet()
                .stream()
                .filter(x -> !x.getKey().isEmpty())
                .sorted((rose1, rose2) -> {
                    long rosesAmoun1 = rose1.getValue().values().stream().mapToLong(Long::valueOf).sum();
                    long rosesAmoun2 = rose2.getValue().values().stream().mapToLong(Long::valueOf).sum();

                    int comparator = Long.compare(rosesAmoun2, rosesAmoun1);
                    return comparator;
                })
                .forEach((r) -> { // r = entrySet
                    String key = r.getKey();
                    System.out.println(r.getKey());
                    r.getValue().entrySet()
                            .stream()
                            .sorted((n1, n2) -> {
                                Long num1 = n1.getValue();
                                Long num2 = n2.getValue();
                                int comparator = Long.compare(num1, num2);
                                return comparator;
                            })
                            .forEach(x -> {

                                System.out.println("*--" + x.getKey() + " | " + x.getValue() + "");
                            });
                });

    }
}
