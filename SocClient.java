import java.io.*;
import java.net.*;
class SocClient
{
public static void main(String[] args) throws Exception
{
String ip = "localhost";
int port=9999; // 0 to 65535
Socket s = new Socket(ip, port);
String str = "What are the courses offered by Citizen college";
OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
PrintWriter out = new PrintWriter(os);
os.write(str + "\n");
os.flush();
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
String course = br.readLine();
System.out.println("C: Data from Server" +course);
}}