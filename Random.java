import java.io.IOException;
import java.io.RandomAccessFile;
public class Random
{
 public static void main(String[] args) throws IOException
 {
 RandomAccessFile raf = new RandomAccessFile("EmpInfo.txt", "r");
 //moving file pointer
 raf.seek(0);

 byte[] data = new byte[24];

 //storing file data
 raf.read(data);
 //printing file data
 System.out.println(new String(data));
 }
}
