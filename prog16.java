/*
Description:
The URL class provides utility methods that let you query URL objects. You can get the protocol, authority, host name, port number, path, query, filename, and reference from a URL using these accessor methods:

getProtocol() method returns the protocol identifier of the URL.
getAuthority() method returns the authority of the URL.
getHost() method returns the host name of the URL.
getPort() method returns the port number of the URL. If the port is not set, then it returns -1.
getPath() method returns the path of this URL.
getQuery() method returns the query of this URL.
getFile() method returns the filename of the URL.
getRef() method returns the reference of the URL.

- See more at: http://www.java2novice.com/java_networking/get_URL_properties/#sthash.JCSVpLr3.dpuf */


/*
Modifier and Type	Method and Description
boolean	equals(Object obj)
Compares this object against the specified object.
byte[]	getAddress()
Returns the raw IP address of this InetAddress object.
static InetAddress[]	getAllByName(String host)
Given the name of a host, returns an array of its IP addresses, based on the configured name service on the system.
static InetAddress	getByAddress(byte[] addr)
Returns an InetAddress object given the raw IP address .
static InetAddress	getByAddress(String host, byte[] addr)
Creates an InetAddress based on the provided host name and IP address.
static InetAddress	getByName(String host)
Determines the IP address of a host, given the host's name.
String	getCanonicalHostName()
Gets the fully qualified domain name for this IP address.
String	getHostAddress()
Returns the IP address string in textual presentation.
String	getHostName()
Gets the host name for this IP address.
static InetAddress	getLocalHost()
Returns the address of the local host.
static InetAddress	getLoopbackAddress()
Returns the loopback address.
int	hashCode()
Returns a hashcode for this IP address.
boolean	isAnyLocalAddress()
Utility routine to check if the InetAddress in a wildcard address.
boolean	isLinkLocalAddress()
Utility routine to check if the InetAddress is an link local address.
boolean	isLoopbackAddress()
Utility routine to check if the InetAddress is a loopback address.
boolean	isMCGlobal()
Utility routine to check if the multicast address has global scope.
boolean	isMCLinkLocal()
Utility routine to check if the multicast address has link scope.
boolean	isMCNodeLocal()
Utility routine to check if the multicast address has node scope.
boolean	isMCOrgLocal()
Utility routine to check if the multicast address has organization scope.
boolean	isMCSiteLocal()
Utility routine to check if the multicast address has site scope.
boolean	isMulticastAddress()
Utility routine to check if the InetAddress is an IP multicast address.
boolean	isReachable(int timeout)
Test whether that address is reachable.
boolean	isReachable(NetworkInterface netif, int ttl, int timeout)
Test whether that address is reachable.
boolean	isSiteLocalAddress()
Utility routine to check if the InetAddress is a site local address.
String	toString()
Converts this IP address to a String.
*/
import java.net.MalformedURLException;
import java.net.URL;
 
public class prog16 {
 
    public static void main(String a[]){
     
        try {
            String url =
        "http://www.java2novice.com:80/java_constructor_examples/?query=ok#header";
            URL myUrl = new URL(url);
            System.out.println("Protocol: "+myUrl.getProtocol());
            System.out.println("Host: "+myUrl.getHost());
            System.out.println("Port: "+myUrl.getPort());
            System.out.println("Athority of the URL: "+myUrl.getAuthority());
            System.out.println("Query: "+myUrl.getQuery());
            System.out.println("Reference: "+myUrl.getRef());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
