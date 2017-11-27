import java.net.MalformedURLException;
import java.net.URL;
 
public class prog15{
 
    public static void main(String a[]){
        try {
            URL main = new URL("http://www.java2novice.com");
            URL relative = new URL(main,"/java_thread_examples/");
            System.out.println(relative.toString());
        } catch (MalformedURLException ex) {
 
        }
    }
}
//- See more at: http://www.java2novice.com/java_networking/url_constructor_with_relative_path/#sthash.yoGFXDAl.dpuf