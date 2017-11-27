import java.net.MalformedURLException;
import java.net.URL;
 
public class prog18{
 
    public static void main(String a[]){
        try {
            URL url = new URL("file://c:/Perl");
            System.out.println(url.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
         
    }
}
//- See more at: http://www.java2novice.com/java_networking/file_url_object/#sthash.HFwLQ3k2.dpuf