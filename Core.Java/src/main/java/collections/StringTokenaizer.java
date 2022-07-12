package collections;

import java.util.StringTokenizer;

public class StringTokenaizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using split
		String str1 = "iam a good boy";
		String[] str2 = str1.split(" ");

		for (String s : str2) {
			System.out.println(s);
		}
		for (int i = 0; i < str2.length; i++) {

		}
		// UsingStringTokenizer
		StringTokenizer str3 = new StringTokenizer(" ");
		while (str3.hasMoreElements()) {
			System.out.println(str3.nextToken());
		}

	}

}
