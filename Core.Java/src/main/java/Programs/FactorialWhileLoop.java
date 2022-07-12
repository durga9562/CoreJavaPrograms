package Programs;

import java.util.Scanner;

public class FactorialWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, n ,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value:");
n = sc.nextInt();
i=1;
while(n>=i) {
	fact=fact*i;
	i++;
}
System.out.println("fact :"+fact);
	}

}
