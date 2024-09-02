
import java.io.*;
public class Filereader
{
 
 public static void main(String args[]) throws IOException
 {
 
 FileReader r = new FileReader("Anikesh.txt");
 
 int i;
 while((i = r.read()) != -1)
 {
 System.out.print((char)i);
 }
 
 r.close();
 System.out.println("file closed");
 }
 
 }
