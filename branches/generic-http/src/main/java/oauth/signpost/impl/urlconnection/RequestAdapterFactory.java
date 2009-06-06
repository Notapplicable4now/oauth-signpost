package oauth.signpost.impl.urlconnection;

import java.net.HttpURLConnection;

import oauth.signpost.HttpRequest;

public class RequestAdapterFactory implements
        oauth.signpost.RequestAdapterFactory<HttpURLConnection> {

    @Override
    public HttpRequest adapt(HttpURLConnection request) {
        return new HttpRequestAdapter(request);
    }

}
