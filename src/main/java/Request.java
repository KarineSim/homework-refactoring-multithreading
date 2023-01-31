import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Request {

    public static List<NameValuePair> getQueryParam(String url) {
        List<NameValuePair> params;
        try {
            params = URLEncodedUtils.parse(new URI(url), StandardCharsets.UTF_8);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return params;
    }

    public static String getQueryParams(String url) {
        String[] result = url.split("\\?");
        return result[0];
    }
}
