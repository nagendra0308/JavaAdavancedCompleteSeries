import java.net.InetAddress;
import java.net.UnknownHostException;

public class prog6 {
    public static void main(String args[]) throws UnknownHostException {  
        InetAddress addr = InetAddress.getLocalHost();
        String ipAddress = addr.getHostAddress();    
        System.out.println("IP address of localhost : " + ipAddress);
        String hostname = addr.getHostName();
        System.out.println("Name of hostname : " + hostname);
    }
}