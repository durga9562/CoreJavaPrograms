package InputAndOutputStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fos = new FileOutputStream("abc.txt");
System.out.println("To stop reading");

int k;
while((k=System.in.read())!='@') {
	fos.write(k);
}
fos.close();
	}

}
