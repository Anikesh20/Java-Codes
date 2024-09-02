import java.net.*;
public class Urlclass
{
public static void main(String[] args) throws Exception
{
URL url = new URL("https://192.168.1.5:/index.html");
System.out.println("URL is"+ url.toString());
System.out.println("protocol is "+ url.getProtocol());
System.out.println("authority is "+ url.getAuthority());
System.out.println("File name is "+ url.getFile());
System.out.println("host is "+ url.getHost());
System.out.println("path is "+ url.getPath());
System.out.println("port is "+ url.getPort());
}
}