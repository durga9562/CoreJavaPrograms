package Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n,i=2;
		Scanner s = new Scanner(System.in);
	n = s.nextInt();
	System.out.println("enter the number");
	
	while(true) {
		if(n>1) {
			System.out.println("enter above 1");
			break;
		}
		if(n%i==0) {
			break;
		}else {
			i++;
		}
		if(n==i) {
	
	System.out.println("prime");
}else {
	System.out.println("not prime");
}
}
}}