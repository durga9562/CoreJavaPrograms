package InputAndOutputStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileToConsole {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method 
FileInputStream fis = new FileInputStream("abc.txt");
int k;
while((k=fis.read())!=-1) {
	System.out.println((char)k);
}

	}

}
