package Arrays;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cols:");
		int cols = sc.nextInt();
		
		int [][] arr=new int[rows][cols];
		System.out.println("Enter Array Element:");
		for(int i=0;i<rows;++i) {
			for(int j=0;j<cols;++j) {
				//System.out.println();
				arr[i][j]=sc.nextInt();
			}
		}
System.out.println("Array Elements are:");
for(int i=0;i<rows;++i){
	int sum = 0;
	for(int j=0;j<cols;++j){
		System.out.print(arr[i][j]+" ");
		sum = sum+arr[i][j];
	}
	System.out.println();
	System.out.println("="+sum);
}
	
	int total=0;
	for(int i=0;i<rows;++i) {
		for (int j=0;j<cols;++j) {
			if(i==j) {
				System.out.println(arr[i][j]);
				total = total+arr[i][j];
			}
		}
	}
	System.out.println("total="+total);
}
}