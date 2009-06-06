import oauth.signpost.OAuthConsumer;
import oauth.signpost.impl.DefaultOAuthConsumer;
import oauth.signpost.signature.SignatureMethod;

import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpGet;

public class Playground {

    public static void main(String[] args) throws Exception {

        OAuthConsumer<HttpRequest> consumer = new DefaultOAuthConsumer<HttpRequest>(
                "", "", SignatureMethod.HMAC_SHA1);

        HttpGet request = new HttpGet();
        consumer.sign(request);

    }

}
