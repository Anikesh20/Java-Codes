import java.io.*;
public class FileOutput
{
 public static void main(String args[])
 {
 try
 {
 FileOutputStream out = new FileOutputStream( "E:\\BCA\\Java\\Anikesh.txt" );
 try
 {
 String data = "Chesta, preshu, samman and keshab are the best friends";
 byte[] byteArray = data.getBytes();
 out.write(byteArray);
 }
 finally
 {
 out.close();
 }
 System.out.println("Data is successfully written in the file. ");
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}