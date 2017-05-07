package Medium;
import java.util.*;

/**
 * Created by songqingyuan on 5/7/17.
 */
public class Codec {
    Map<String, String> url2code = new HashMap<String, String>();
    Map<String, String> code2url = new HashMap<String, String>();
    static String fixURL = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(url2code.containsKey(longUrl)) return fixURL+url2code.get(longUrl);
        String alf = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        StringBuilder sb = new StringBuilder();
        String key = null;

        do{
            for(int i=0;i<6;i++){
                int a = (int)(Math.random() * alf.length());
                sb.append(alf.charAt(a));
            }
            key = sb.toString();
        }while(code2url.containsKey(key));

        code2url.put(key, longUrl);
        url2code.put(longUrl, key);

        return fixURL+key;


    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return code2url.get(shortUrl.replace(fixURL,""));
    }
}
