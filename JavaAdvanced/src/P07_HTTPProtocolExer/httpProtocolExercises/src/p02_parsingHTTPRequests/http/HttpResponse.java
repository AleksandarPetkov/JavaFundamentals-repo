package p02_parsingHTTPRequests.http;

import java.util.Map;

public interface HttpResponse {

    Map<String,String> getHeaders();

    int getStatusCode();

    String getContent();

    byte[] getBytes(String decodedName);

    void setStatusCode(int statusCode);

    void setContent(String content);

    void addHeader(String header, String value);
}
