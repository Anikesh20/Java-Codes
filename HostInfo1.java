import java.net.*;
import java.util.*;
public class HostInfo1{
public static void main(String args[]) throws Exception{

Scanner sc=new Scanner(System.in);
String name=sc.next();
InetAddress ipaddress=InetAddress.getByName (name); System.out.println("IP address: \n"+ipaddress);
}

}