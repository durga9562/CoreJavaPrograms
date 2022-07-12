package Programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,reminder ;
	double result=0;
	System.out.println("enter the number");
	n = sc.nextInt();
	int m=n;	
	while(n>0) {
		reminder=n%10;
		result+=reminder*reminder*reminder;
		n=n/10;
	}
	if(m==result) {
	System.out.println("armstrong");
	
	}else {
		System.out.println("not armstrong");
	}

}

}