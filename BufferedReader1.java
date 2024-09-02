
import java.io.*;
class BufferedReader1
{
 public static void main(String args[]) throws IOException
 {
 //FileReader fr = new FileReader("Anikesh.txt");
 try(BufferedReader br = new BufferedReader(new FileReader("Anikesh.txt"))){
 //String data = br.readLine();
 String data = "";
 
 while((data = br.readLine()) != null)
 {
 System.out.println(data);
 }
 }
}
}
