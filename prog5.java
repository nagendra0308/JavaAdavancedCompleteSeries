import java.io.*;
import java.net.*;
public class prog5{
	public static void main(String args[]){
try{	
	// byte[] ipAddr = new byte[] {192,0,78,12};
   	 //InetAddress ip = InetAddress.getByAddress(ipAddr);

	InetAddress ip=InetAddress.getByName("www.nagendra0308.wordpress.com");
	System.out.println("HostName"+ip.getHostName());
	System.out.println("IP Address:"+ip.getHostAddress()); 
	System.out.println("IP  fully qualified domain name for this IP address:"+ip.getCanonicalHostName());
	
	//IPAddress kp = new IPAddress("192.0.78.12");
	//String host = kp.getHost();
	//System.out.println(host);

}
catch(Exception e)
	{ System.out.println(e); }
}
}