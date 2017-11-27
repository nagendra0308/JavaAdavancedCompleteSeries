import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
 
public class prog13 {
 
    public static void main(String a[]){
     
        try {
            System.out.println(URLEncoder.encode("String with spaces", "UTF-8"));
            System.out.println(URLEncoder.encode("special chars: &%*", "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}
//- See more at: http://www.java2novice.com/java_networking/url_encode/#sthash.Rp6AHMt7.dpuf