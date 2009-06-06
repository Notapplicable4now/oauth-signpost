package oauth.signpost;

import java.io.IOException;
import java.io.InputStream;

public interface HttpRequestWithPayload extends HttpRequest {

    InputStream getMessagePayload() throws IOException;

    void setMessagePayload(InputStream data);

    String getContentType();
}
