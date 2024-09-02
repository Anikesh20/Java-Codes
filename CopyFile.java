import java.io.*;
public class CopyFile
{
 public static void main (String args[]) throws IOException
 {
 
 FileInputStream in = new FileInputStream("Anikesh.txt");
 FileOutputStream out = new FileOutputStream("Empinfo.txt");
 int c;
 while((c = in.read())!= -1)
 {
 out.write(c);
 }
 if (in != null)
 {
 in.close();
 }
 if(out != null)
 {
 out.close();
 }
}
 }
