package oauth.signpost;

public interface RequestAdapterFactory<RequestT> {

    public HttpRequest adapt(RequestT request);

}
