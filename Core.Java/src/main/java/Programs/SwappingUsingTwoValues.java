package Programs;

import java.util.Scanner;

public class SwappingUsingTwoValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();
		a=a+b; //a=5 b=7  a=12
		b=a-b; //a=12 b=7 b=5
		a=a-b; // a=12 b=5 a=7
		System.out.println("result a:"+a);
		System.out.println("result b:"+b);

	}

}
