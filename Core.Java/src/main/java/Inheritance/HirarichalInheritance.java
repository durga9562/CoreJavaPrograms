package Inheritance;

class Manager{
	public void task() {
		System.out.println("day 1");
	}
}

class Team1 extends Manager{
	public void task() {
		System.out.println("java");
	}
}

class Team2 extends Manager{
	public void task() {
		System.out.println("react");
	}
}

class Team3 extends Manager{
	public void task() {
		System.out.println("database");
	}
}
public class HirarichalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Team1 t1 = new Team1();
t1.task();

Team2 t2 = new Team2();
t2.task();

Team3 t3 = new Team3();
t3.task();
	}

}
