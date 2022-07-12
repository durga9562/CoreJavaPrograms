package innerclasses;

public class MemberInnerClass {
	private int  data =10;
	
	class InnerClass{
		public void m1() {
			System.out.println("dATA:"+data);
		}
	}
	public void display() {
		InnerClass ic = new InnerClass();
		ic.m1();
			
		
	}

	public static void main(String[] args) {
		MemberInnerClass obj = new MemberInnerClass();
		obj.display();
		
		MemberInnerClass.InnerClass mic = new MemberInnerClass().new InnerClass();
		mic.m1();
		}

	}


