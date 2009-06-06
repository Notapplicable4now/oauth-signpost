package oauth.signpost.impl.urlconnection;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import oauth.signpost.HttpRequestWithPayload;

public class HttpRequestAdapter implements HttpRequestWithPayload {

    protected HttpURLConnection connection;

    public HttpRequestAdapter(HttpURLConnection connection) {
        this.connection = connection;
    }

    public String getMethod() {
        return connection.getRequestMethod();
    }

    public String getRequestUrl() {
        return connection.getURL().toExternalForm();
    }

    public void setHeader(String name, String value) {
        connection.setRequestProperty(name, value);
    }

    public String getHeader(String name) {
        return connection.getHeaderField(name);
    }

    public void setMessagePayload(InputStream data) {
        //TODO
    }

    public InputStream getMessagePayload() throws IOException {
        return connection.getInputStream();
    }

    public String getContentType() {
        // TODO Auto-generated method stub
        return null;
    }
}
