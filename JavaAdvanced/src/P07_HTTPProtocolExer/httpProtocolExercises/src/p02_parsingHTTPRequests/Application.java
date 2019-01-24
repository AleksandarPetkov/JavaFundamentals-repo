package p02_parsingHTTPRequests;

import p02_parsingHTTPRequests.http.HttpRequest;
import p02_parsingHTTPRequests.http.HttpRequestImpl;
import p02_parsingHTTPRequests.http.HttpResponse;
import p02_parsingHTTPRequests.http.HttpResponseImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Application {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<String> validUrls = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        List<String> request = getRequest();

        HttpRequest httpRequest = fillRequest(request);

        HttpResponse httpResponse = fillResponse(httpRequest, validUrls);

        System.out.println(httpResponse.toString());

    }

    private static HttpResponse fillResponse(HttpRequest httpRequest, List<String> validUrls) {


        if (!httpRequest.isResource(validUrls)) {
            HttpResponse httpResponse = new HttpResponseImpl(404);

            for (Map.Entry<String, String> entry : httpRequest.getHeaders().entrySet()) {
                if (entry.getKey().equals("Authorization")) {
                    continue;
                }
                httpResponse.addHeader(entry.getKey(), entry.getValue());
            }

            httpResponse.setContent("The requested functionality was not found.");

            return httpResponse;

        } else if (!httpRequest.getHeaders().containsKey("Authorization")) {
            HttpResponse httpResponse = new HttpResponseImpl(401);

            for (Map.Entry<String, String> entry : httpRequest.getHeaders().entrySet()) {
                if (entry.getKey().equals("Authorization")) {
                    continue;
                }
                httpResponse.addHeader(entry.getKey(), entry.getValue());
            }

            httpResponse.setContent("You are not authorized to access the requested functionality.");

            return httpResponse;
        } else if ("POST".equals(httpRequest.getMethod()) && httpRequest.getBodyParameters().isEmpty()) {
            HttpResponse httpResponse = new HttpResponseImpl(400);

            for (Map.Entry<String, String> entry : httpRequest.getHeaders().entrySet()) {
                if (entry.getKey().equals("Authorization")) {
                    continue;
                }
                httpResponse.addHeader(entry.getKey(), entry.getValue());
            }

            httpResponse.setContent("There was an error with the requested functionality due to malformed request.");

            return httpResponse;
        }
        HttpResponse httpResponse = new HttpResponseImpl(200);
        for (Map.Entry<String, String> entry : httpRequest.getHeaders().entrySet()) {
            if (entry.getKey().equals("Authorization")) {
                continue;
            }
            httpResponse.addHeader(entry.getKey(), entry.getValue());
        }

        String decodedName = httpRequest.getHeaders().get("Authorization").split("\\s+")[1];
        String name = new String(httpResponse.getBytes(decodedName));
        List<String>body = new ArrayList<>(httpRequest.getBodyParameters().values());
        httpResponse
                .setContent(String.format("Greetings %s! You have successfully created %s with quantity – %s, price – %s."
                        ,name,body.get(0),body.get(1),body.get(2)
                ));
        return httpResponse;

    }

    private static List<String> getRequest() throws IOException {
        List<String> input = new LinkedList<>();
        String line;
        while (true) {
            if ((line = reader.readLine()).isEmpty()) {
                break;
            }
            input.add(line);
        }
        input.add(System.lineSeparator());
        if (!(line = reader.readLine()).isEmpty()) {
            input.add(line);
        }
        return input;
    }

    private static HttpRequest fillRequest(List<String> request) {

        HttpRequest httpRequest = new HttpRequestImpl();

        String[] methodAndUrl = request.get(0).split("\\s+");
        httpRequest.setMethod(methodAndUrl[0]);
        httpRequest.setRequestUrl(methodAndUrl[1]);

        request.stream()
                .filter(line -> line.contains(": "))
                .forEach(r -> {
                    String[] params = r.split(": ");
                    httpRequest.addHeader(params[0], params[1]);
                });
        String lastRow = request.get(request.size() - 1);

        if (!System.lineSeparator().equals(lastRow)) {
            String[] body = request.get(request.size() - 1).split("&");
            Arrays.stream(body).forEach(b -> {
                String[] bodyParams = b.split("=");
                httpRequest.addBodyParameter(bodyParams[0], bodyParams[1]);
            });
        }


        return httpRequest;
    }
}
