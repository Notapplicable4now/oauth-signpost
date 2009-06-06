package oauth.signpost.impl.commonshttp;

import oauth.signpost.HttpRequest;

import org.apache.http.HttpEntityEnclosingRequest;

public class RequestAdapterFactory implements
        oauth.signpost.RequestAdapterFactory<org.apache.http.HttpRequest> {

    @Override
    public HttpRequest adapt(org.apache.http.HttpRequest request) {
        if (request instanceof HttpEntityEnclosingRequest) {
            return null;
        } else {
            return null;
        }
    }

}
