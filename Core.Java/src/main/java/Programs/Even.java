package Programs;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter ");
int n = sc.nextInt();
int fact = 1;
int i=1;
while(n>=i) {
	fact=fact*i;
	i++;
	System.out.println(fact);
}
	}
}
