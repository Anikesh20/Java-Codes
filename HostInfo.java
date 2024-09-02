import java.net.*;
public class HostInfo{
public static void main(String args[]) throws Exception {
InetAddress ip=InetAddress.getByName("facebook.com");
System.out.println("ADD"+ip.getHostAddress());
System.out.println("name"+ip.getHostName());
}
}