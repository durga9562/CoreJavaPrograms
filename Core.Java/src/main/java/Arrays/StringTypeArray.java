package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringTypeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string Array size:");
		int size = sc.nextInt();
		String[] names = new String[size];
		System.out.println("Enter string arrayu Element:");
		for (int i = 0; i < size; ++i) {
			names[i] = sc.next();
		}
		System.out.println("string array element are:");
		Arrays.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
