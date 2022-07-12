package InputAndOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoFileIntoOneFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis1 = new FileInputStream("abc.txt");
FileInputStream fis2 = new FileInputStream("xyz.txt");
FileOutputStream fos = new FileOutputStream("pqr.txt");

SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

int k;
System.out.println("Reading started");
while((k=sis.read())!=-1) {
	fos.write(k);
}
System.out.println("writing completed");
fis1.close();
fis2.close();
sis.close();
fos.close();
	}

}
