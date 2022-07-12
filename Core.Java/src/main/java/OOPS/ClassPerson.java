package OOPS;
//class
public class ClassPerson {
	//common properties
	public int pid;
	public String name;
	public int age;
	public float height;
	public int weight;
	public String color;
	
	public void eat() {
		if(weight>80) {
			System.out.println("better to eAT VEG FOOD");
		}else {
			System.out.println("your are in danger zone");
		}
	}
	
	public void sleep() {
		if(age <12) {
			System.out.println("Better to sleep 9 hours");
		}else {
			System.out.println("atleast sleep 8 hours");
		}
	}

	//instance of class
	public static void main(String[] args) {
	 ClassPerson cp = new ClassPerson();
	 cp.pid = 1;
	 cp.name = "name";
	 cp.age=23;
	 cp.height=5.10f;
	 cp.weight=56;
	 cp.color = "red";
	 cp.eat();
	 cp.sleep();
	}

}
