package p01_parsingHTTPRequests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] paths = reader.readLine().split("\\s+");
        String[] method = reader.readLine().split("\\s+");

        List<String> urlPaths = Arrays.asList(paths);
        Map<String, String> headers = new LinkedHashMap<>();

        String line;
        while (!"".equals(line = reader.readLine())) {
            String[] params = line.split(": ");

            switch (params[0]) {
                case "Date":
                    headers.put(params[0], params[1]);
                    break;
                case "Host":
                    headers.put(params[0], params[1]);
                    break;
                case "Content-Type":
                    headers.put(params[0], params[1]);
                    break;
                case "Authorization":
                    headers.put(params[0], params[1]);
                    break;
                case "":
                    break;
            }
        }

        List<String> parsed = new LinkedList<>();

        if (!"".equals(line = reader.readLine())) {
            String[] requestLine = line.split("&|=");
            parsed = Arrays.asList(requestLine);
        }

        StringBuilder result = new StringBuilder();
        if (!urlPaths.contains(method[1])) {

            result.append("HTTP/1.1 404 Not Found").append(System.lineSeparator());

            mapResult(headers, result);

            result.append("The requested functionality was not found.");
        } else if (!headers.containsKey("Authorization")) {

            result.append("HTTP/1.1 401 Unauthorized").append(System.lineSeparator());

            mapResult(headers, result);

            result.append("You are not authorized to access the requested functionality.");

        } else if ("POST".equals(method[0]) && parsed.size() == 0) {
            result.append("HTTP/1.1 400 Bad request").append(System.lineSeparator());

            mapResult(headers, result);

            result.append("There was an error with the requested functionality due to malformed request.");
        }else{
            result.append("HTTP/1.1 200 OK").append(System.lineSeparator());

            mapResult(headers, result);
            String nameUndecoded = headers.get("Authorization");
            String[]nameArray = nameUndecoded.split("\\s+");
            byte[] nameAsByte = Base64.getDecoder().decode(nameArray[1]);
            String name = new String(nameAsByte);
            result.append(String.format("Greetings %s! You have successfully created %s with quantity – %s, price – %s.",name,parsed.get(1),parsed.get(3),parsed.get(5)));
        }

        System.out.println(result.toString());
    }

    private static void mapResult(Map<String, String> headers, StringBuilder result) {
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            if (entry.getKey().equals("Authorization")){
                continue;
            }
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(System.lineSeparator());
        }
        result.append(System.lineSeparator());

    }
}
