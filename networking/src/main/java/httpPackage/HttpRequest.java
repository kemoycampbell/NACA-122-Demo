package httpPackage;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest 
{
    private Method method;
    private String uri;
    private Map<String, String> headers;
    private String body;

    public HttpRequest(
        Method method,
        String uri,
        Map<String, String> headers,
        String body
    )
    {
        this.method = method;
        this.uri = uri;
        this.headers = headers;
        this.body = body;
    }

    public Method getMethod()
    {
        return this.method;
    }

    public String getUri()
    {
        return this.uri;
    }

    public String getHeader(String name)
    {
        return this.headers.get(name);
    }

    public String getBody()
    {
        return this.body;
    }

    @Override
    public String toString()
    {
        return String.format(
            "HTTPRequest {method: %s, uri: %s, headers: %s, body: %s}", 
            method,uri,headers,body
        );
    }

    public static void main(String args [])
    {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Length", "25");
        headers.put("User-agent", "myagent");

        String body = "Year=2005&month=0&day=12";
        HttpRequest request = new HttpRequest(Method.POST, "https://rit.edu/meh/blah", headers, body);

        System.out.println(request);
    }

}
