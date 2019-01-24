package p02_parsingHTTPRequests.http;

import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HttpResponseImpl implements HttpResponse {

    private Map<String, String> headers;
    private int statusCode;
    private String content;


    public HttpResponseImpl(int statusCode) {
        this.headers = new LinkedHashMap<>();
        this.statusCode = statusCode;
    }

    @Override
    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.headers);
    }

    @Override
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public byte[] getBytes(String decodedName) {
        return Base64.getDecoder().decode(decodedName);
    }


    @Override
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void addHeader(String header, String value) {
        this.headers.put(header, value);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("HTTP/1.1 ");
        switch (this.statusCode){
            case 400:
                result.append("400 Bad request");
                break;
            case 404:
                result.append("404 Not Found");
                break;
            case 401:
                result.append("401 Unauthorized");
                break;
            case 200:
                result.append("200 OK");
                break;
        }
        result.append(System.lineSeparator());
        this.getHeaders().forEach((key, value) -> result
                .append(key).append(": ")
                .append(value)
                .append(System.lineSeparator()));

        result.append(System.lineSeparator())
                .append(this.content);

        return result.toString();
    }
}
