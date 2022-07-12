package Constructor;

public class ParameterUsed {
	//Instance
	public  int Sid;
	public String Sname;
	public int marks;

	//default
	public ParameterUsed() {
		System.out.println("--default parameter---");
	}
//parameterized
	public ParameterUsed(int sid, String sname, int marks) {

		this.Sid = sid;
		this.Sname = sname;
		this.marks = marks;
	}
	public String grade() {
		String result=null;
		if(marks>=90) {
			result = "A grade";
		}else if(marks>80 && marks <90){
			result = "B grade";
		}else {
			result = "C grade";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterUsed s1 = new ParameterUsed(100,"abc",70);
		System.out.println("Student id:"+s1.Sid);
		System.out.println("Student name:"+s1.Sname);
		System.out.println("Student marks:"+s1.marks);
		System.out.println("Student grade:"+s1.grade());

	}

}
