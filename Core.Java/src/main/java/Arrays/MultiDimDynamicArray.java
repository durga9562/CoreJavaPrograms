package Arrays;

import java.util.Scanner;

public class MultiDimDynamicArray {

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
	for(int j=0;j<cols;++j){
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
	}

}
