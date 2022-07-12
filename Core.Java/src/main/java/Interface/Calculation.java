package Interface;

import java.util.Scanner;

interface Cal{
	public int add(int i, int j);
	public int sub(int i, int j);
	public int mul(int i, int j);
	public int div(int i, int j);
}

public class Calculation implements Cal {

	

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i%j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculation o = new Calculation();
Scanner s = new Scanner(System.in);
System.out.println("enter i value");
int i = s.nextInt();
System.out.println("enter j value");
int j = s.nextInt();
System.out.println("ffhfhfh"+o.add(i,j ));
System.out.println("fsdsgsg"+o.sub(i, j));
System.out.println("dfdgdfg"+o.mul(i,j));
System.out.println("gfdgfgg"+o.div(i, j));
	}

}
