package Programs;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();
		c=a; 
		a=b;
		 //c=a;
		 b=c;
		System.out.println("result a:"+a);
		System.out.println("result b:"+b);

	}

}
