package OOPS;

public class PolyOverLoad {
	public int add(int i, int j) {
		return i+j;
	}

	public int add(int i, int j, int k) {
		return i+j+k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyOverLoad obj=new PolyOverLoad();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(20, 30,40));

	}

}
