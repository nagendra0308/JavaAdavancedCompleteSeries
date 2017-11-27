import java.io.*;  
import java.net.*;  
public class prog7 {  
public static void main(String[] args){  
try{  
URL url=new URL("https://nagendra0308.wordpress.com/about/");  
URLConnection urlcon=url.openConnection();  
InputStream stream=urlcon.getInputStream();  
int i;  
while((i=stream.read())!=-1){  
System.out.print((char)i);  
}  
}catch(Exception e){System.out.println(e);}  
}  
}  
