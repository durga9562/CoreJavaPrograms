package Stream_api;

import java.util.Arrays;
import java.util.List;

class Emp {
	public int eid;
	public String ename;
	public double esalary;

	public Emp(int eid, String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public String toString() {
		return eid + "\t" + ename + "\t" + esalary;
	}
}

public class ObjectStream {

	public static Emp[] arrayOfEmps = { new Emp(1, "prasad", 20000), new Emp(2, "raghav", 30000),
			new Emp(3, "hello", 40000)

	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List employee = Arrays.asList(arrayOfEmps);
		employee.stream().forEach(e -> System.out.println(e));
	}

}
