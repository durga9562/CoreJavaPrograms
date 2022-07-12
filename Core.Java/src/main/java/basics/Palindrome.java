package basics;

import java.util.Scanner;

public class Palindrome {

	public String MethodBasedStringReverse(String input) {
		String output = " ";
		for (int i = input.length() - 1; i >= 0; --i) {
			output = output + input.charAt(i);
		}
		return output;

	}

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String input = sc.next();
		String output = obj.MethodBasedStringReverse(input);
		System.out.println("Before:" + input);
		System.out.println("After :" + output);

	

	if(input.equals(output)) {
		System.out.println("given input palindrome");
	}else {
		System.out.println("Given input not palindrome");
	

}
}
}
