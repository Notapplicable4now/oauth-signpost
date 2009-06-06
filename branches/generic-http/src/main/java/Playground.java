import oauth.signpost.OAuthConsumer;
import oauth.signpost.impl.DefaultOAuthConsumer;
import oauth.signpost.signature.SignatureMethod;

import org.apache.http.client.methods.HttpGet;

public class Playground {

    public static void main(String[] args) {

        OAuthConsumer consumer = new DefaultOAuthConsumer("", "",
                SignatureMethod.HMAC_SHA1);

        HttpGet request = new HttpGet();

    }

}
