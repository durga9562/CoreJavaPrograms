package basics;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array strings");
		String input = sc.next();
		String output = " ";
		for(int i=input.length()-1;i>=0;--i) {
			output = output+input.charAt(i);
		}
		System.out.println("Before reverse:"+input);
		System.out.println("After reverse: "+output);

	}

}
