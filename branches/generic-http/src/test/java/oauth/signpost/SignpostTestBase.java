package oauth.signpost;

import java.util.HashMap;

import org.junit.BeforeClass;

public abstract class SignpostTestBase {

    public static final String OAUTH_VERSION = "1.0";

    public static final String CONSUMER_KEY = "dpf43f3p2l4k3l03";

    public static final String CONSUMER_SECRET = "kd94hf93k423kf44";

    public static final String TOKEN = "nnch734d00sl2jdk";

    public static final String TOKEN_SECRET = "pfkkdhi9sl3r4s00";

    public static final String NONCE = "kllo9940pd9333jh";

    public static final String TIMESTAMP = "1191242096";

    public static final String SIGNATURE_METHOD = "HMAC-SHA1";

    public static final String REQUEST_TOKEN_ENDPOINT_URL = "http://api.test.com/request_token";

    public static final String ACCESS_TOKEN_ENDPOINT_URL = "http://api.test.com/access_token";

    public static final String AUTHORIZE_WEBSITE_URL = "http://www.test.com/authorize";

    public static final HashMap<String, String> OAUTH_PARAMS = new HashMap<String, String>();

    @BeforeClass
    public static void initOAuthParams() {
        OAUTH_PARAMS.put("oauth_consumer_key", CONSUMER_KEY);
        OAUTH_PARAMS.put("oauth_signature_method", SIGNATURE_METHOD);
        OAUTH_PARAMS.put("oauth_timestamp", TIMESTAMP);
        OAUTH_PARAMS.put("oauth_nonce", NONCE);
        OAUTH_PARAMS.put("oauth_version", OAUTH_VERSION);
        OAUTH_PARAMS.put("oauth_token", TOKEN);
    }

    protected HttpRequest httpGET(String url) {
        return null;
    }

    protected HttpRequest httpPOST(String url) {
        return null;
    }
}
