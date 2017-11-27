import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
 
public class prog12 {
    public static void main(String a[]){
        try {
            System.out.println(URLDecoder.decode("special+chars%3A+%26%25*+", "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}
//- See more at: http://www.java2novice.com/java_networking/url_decode/#sthash.jNdRFxi1.dpuf