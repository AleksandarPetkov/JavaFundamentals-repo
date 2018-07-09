package Lecture_DefiningClasses.p03_CompanyRoster;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String, List<Employee>> allEmployee = new HashMap<>();

        Employee employee = null;
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");

            switch (tokens.length) {
                case 6:
                     employee = new Employee(tokens[0], Double.parseDouble(tokens[1]), tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]));
                    break;
                case 5:
                    Pattern pattern = Pattern.compile("[\\d]+");
                    Matcher matcher = pattern.matcher(tokens[4]);

                    if (matcher.find()) {
                         employee = new Employee(tokens[0], Double.parseDouble(tokens[1]), tokens[2], tokens[3], Integer.valueOf(tokens[4]));
                    } else {
                         employee = new Employee(tokens[0], Double.parseDouble(tokens[1]), tokens[2], tokens[3], tokens[4]);
                    }

                    break;
                case 4:
                     employee = new Employee(tokens[0], Double.parseDouble(tokens[1]), tokens[2], tokens[3]);
                    break;
            }

            String departemnt = employee.getDepartment();
            if (! allEmployee.containsKey(departemnt)){
                allEmployee.put(departemnt , new ArrayList<>());
            }
            allEmployee.get(departemnt).add(employee);

        }

        allEmployee.entrySet().stream()
                .sorted((e1, e2) ->
                        Double.compare(
                                e2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                                e1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()))
                .limit(1)
                .forEach(d -> {
            StringBuilder result = new StringBuilder();
            result.append(String.format("Highest Average Salary: %s", d.getKey())).append(System.lineSeparator());
            d.getValue().stream()
                    // .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                    .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                    .forEach(employee1 -> result.append(employee1.toString()).append(System.lineSeparator()));

            System.out.print(result.toString());
        });

    }
}
