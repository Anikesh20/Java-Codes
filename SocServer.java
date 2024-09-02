import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.net.*;
class SocServer
{

public static void main(String[] args) throws Exception
{
System.out.println("s: Server is started");
ServerSocket ss = new ServerSocket(9999);
System.out.println("s: Server is waiting for client request");
Socket s = ss.accept();
System.out.println("s: Client Connected");
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
String str = br.readLine();
System.out.println("client Data" + str);
String course = "BBA, BCA, BBA- TT"; 
OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
PrintWriter out = new PrintWriter(os);
os.write(course + "\n");
os.flush();
System.out.println( "Data sent from server to client");
}
}