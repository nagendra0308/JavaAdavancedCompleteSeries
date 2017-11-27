import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class prog11 {
 
    public static void main(String a[]){
     
        try {
            InetAddress host = InetAddress.getByName("192.0.78.12");
            System.out.println(host.getHostName());
        } catch (UnknownHostException ex) {
            
        }
    }
}
