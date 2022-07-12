package Programs;

import java.util.Scanner;

public class BubbleSortNew {

	public static void main(String[] args) {
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=s.nextInt();
		System.out.println("enter the elements");
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				System.out.println("sorting");
			}
		}
		//System.out.println("after sorting");
		System.out.println(a[i]);

	}

}
}
