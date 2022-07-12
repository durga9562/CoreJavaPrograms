package ASSIGNMENTS;

import java.util.Scanner;

public class SignFinder {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter the number");
int n = sc.nextInt();
if(n==0) {
	System.out.println("value is ZERO");
}else if(n>=0) {
	System.out.println("value is POSSITIVE");
}else {
	System.out.println("value is NEGATIVE");
}
	}

}
