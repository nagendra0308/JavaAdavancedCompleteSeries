import java.net.InetAddress;
import java.util.Arrays;

public class prog9 {
  public static void main(String[] argv) throws Exception {
    byte[] ipAddr = new byte[] { 122, 0, 78, 12 };
    InetAddress addr = InetAddress.getByAddress("Localhost",ipAddr);
    System.out.println(Arrays.toString(addr.getAddress()));
  }
}