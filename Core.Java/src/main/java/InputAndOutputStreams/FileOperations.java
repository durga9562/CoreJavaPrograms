package InputAndOutputStreams;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException{
		File f1 = new File("student1.text");
		System.out.println(f1.exists());
		
		f1.createNewFile();
		System.out.println(f1.isFile());
		
		File f2 = new File("prasad.txt");
		System.out.println(f2.exists());
		// TODO Auto-generated method stub
f2.mkdir();
System.out.println(f2.isDirectory());

File f3 = new File("prasad","xyz.txt");
f3.createNewFile();
f1.delete();
f3.renameTo(f1);
File path = new File("C:\\Users\\dp21422\\eclipse-workspace\\Assignment");
String[] frames = path.list();
for(String name:frames) {
	System.out.println(name);
}
File f4 = new File("pqr.txt");
f4.createNewFile();
f4.delete();
f4.renameTo(f1);
	}

}
