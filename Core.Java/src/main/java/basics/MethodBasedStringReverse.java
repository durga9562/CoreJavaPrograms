package basics;

import java.util.Scanner;

public class MethodBasedStringReverse {

	public String MethodBasedStringReverse(String input) {
		String output = " ";
		for (int i = input.length() - 1; i >= 0; --i) {
			output = output + input.charAt(i);
		}
		return output;

	}

	public static void main(String[] args) {
		MethodBasedStringReverse obj = new MethodBasedStringReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String input = sc.next();
		String output = obj.MethodBasedStringReverse(input);
		System.out.println("Before:" + input);
		System.out.println("After :" + output);

	}

}
