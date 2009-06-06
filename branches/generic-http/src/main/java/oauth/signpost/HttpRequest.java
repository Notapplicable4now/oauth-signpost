package oauth.signpost;


public interface HttpRequest {

    String getMethod();

    String getRequestUrl();

    void setHeader(String name, String value);

    String getHeader(String name);
}
