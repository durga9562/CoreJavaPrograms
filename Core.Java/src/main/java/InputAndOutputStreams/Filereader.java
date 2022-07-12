package InputAndOutputStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("wc.txt");
BufferedReader br = new BufferedReader(fr);
int k;
while((k=br.read())!=-1) {
	System.out.println((char)k);
}
	}

}
