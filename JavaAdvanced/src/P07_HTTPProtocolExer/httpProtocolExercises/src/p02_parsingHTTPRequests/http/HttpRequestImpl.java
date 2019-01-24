package p02_parsingHTTPRequests.http;

import java.util.*;

public class HttpRequestImpl implements HttpRequest {

    private String method;
    private String requestUrl;
    private Map<String, String> headers;
    private Map<String, String> body;

    public HttpRequestImpl() {
        this.headers = new LinkedHashMap<>();
        this.body = new LinkedHashMap<>();
    }

    @Override
    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(headers);
    }

    @Override
    public Map<String, String> getBodyParameters() {
        return Collections.unmodifiableMap(body);
    }

    @Override
    public String getMethod() {
        return this.method;
    }

    @Override
    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String getRequestUrl() {
        return this.requestUrl;
    }

    @Override
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Override
    public void addHeader(String header, String value) {
        this.headers.put(header,value);
    }

    @Override
    public void addBodyParameter(String parameter, String value) {
        this.body.put(parameter,value);
    }

    @Override
    public boolean isResource(List<String> validUrls) {
        return validUrls.contains(this.requestUrl);
    }
}
