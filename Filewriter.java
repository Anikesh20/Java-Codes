import java.io.*;
public class Filewriter
{
 public static void main(String args[]) throws IOException
 {

 FileWriter f = new FileWriter( "kehav.txt" );
 
 f.write("Keshab is working at infosys data center. ");
 
 f.close();
 
 System.out.println("Data is successfully written in the file.");
 
 
 }
}