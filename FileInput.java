import java.io.*;
public class FileInput
{
 public static void main(String args[]) throws IOException
 {
FileInputStream in = new FileInputStream("Anikesh.txt");
 int i;
 while((i = in.read()) != -1)
 {
 System.out.print((char)i);
 }
 in.close();
 System.out.println("file closed");
}
}
 
