/*
Class URL represents a Uniform Resource Locator, a pointer to a "resource" on the World Wide Web. A resource can be something as simple as a file or a directory, or it can be a reference to a more complicated object, such as a query to a database or to a search engine.
java.net.URL creates a URL object from the String representation.
- See more at: http://www.java2novice.com/java_networking/create_URL_object/#sthash.wo4pegoN.dpuf
*/
import java.net.MalformedURLException;
import java.net.URL;
 
public class prog17{
    public static void main(String a[]){
        try {
            String myUrl = "http://www.java2novice.com";
            URL url = new URL(myUrl);
            System.out.println(url.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
//- See more at: http://www.java2novice.com/java_networking/create_URL_object/#sthash.wo4pegoN.dpuf