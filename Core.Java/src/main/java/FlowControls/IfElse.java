package FlowControls;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter A");
int a = sc.nextInt();
System.out.println("Enter B");
int b = sc.nextInt();
if (a<b) {
	System.out.println("BANANA");
}else if(a>b) {
	System.out.println("APPLE");
}else {
	System.out.println("BLACK");
}

	}

}
