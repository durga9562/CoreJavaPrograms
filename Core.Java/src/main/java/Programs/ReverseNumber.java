package Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,reverse =0,k;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		//k=n;
		while(n>0) {
			i=n%10;
			reverse = reverse*10+i;
			n = n/10;
		}
System.out.println("reverse "+n+" is:"+reverse);
	}

}
