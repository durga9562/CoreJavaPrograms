package InputAndOutputStreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterjava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw = new FileWriter("wc.txt");
fw.write(65);
fw.write("\n");
char[] ch= {'a','b','c'};
fw.write(ch);
fw.write("\n");
fw.write("prasad");
fw.close();
System.out.println("Writing Completed");
	}

}
