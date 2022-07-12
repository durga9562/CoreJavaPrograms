package InputAndOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("ab.txt");
FileOutputStream fos = new FileOutputStream("xyz.txt");

 int k;
 System.out.println("Reading started.....");
 while((k=fis.read())!=-1) {
	 fos.write(k);
 }
 System.out.println("Writing Completed....");
 fis.close();
 fos.close();
	}

}
