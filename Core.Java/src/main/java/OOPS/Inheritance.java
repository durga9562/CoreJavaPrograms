package OOPS;

class employee {
	public double salary = 5000;
}

class RegularEmployee extends employee {
	public double bonus = 1000;
}

class ParttimeEmployee extends employee {
	public double bonus = 500;
}

public class Inheritance {

	public static void main(String[] args) {
		RegularEmployee re = new RegularEmployee();
		ParttimeEmployee pe = new ParttimeEmployee();
		System.out.println("-----------------");
		System.out.println("RegularEmployee");
		System.out.println("------------------");
		System.out.println("RegularEmployee salary:" + re.salary);
		System.out.println("RegularEmploye bonus:" + re.bonus);
		System.out.println("total salary:" + (re.salary + re.bonus));
		
		
		
		

		System.out.println("--------------");
		System.out.println("PartTime Employee");
		System.out.println("---------------");
		System.out.println("PartTimeEmploye salary:" + pe.salary);
		System.out.println("partTimeEmploye bonus:" + pe.bonus);
		System.out.println("total salary:" + (pe.salary + pe.bonus));
	}

}
