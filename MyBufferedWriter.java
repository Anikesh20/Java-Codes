import java.io.*;
class MyBufferedWriter {
 public static void main(String[] args) throws IOException
 {
 //BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\file\\nishanta.txt"));
 FileWriter fw = new FileWriter("Anikesh.txt");
 BufferedWriter bw = new BufferedWriter(fw);
 bw.write("I am working at citizen college, \n");
 bw.write("I am working at Milton college. \n");
 bw.write("I am working at Nist college");
 System.out.println("Data is successfully written in the file. ");
 bw.close();
 }
}