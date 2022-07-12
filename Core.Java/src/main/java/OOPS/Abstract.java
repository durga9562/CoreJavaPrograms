package OOPS;

abstract class Bike{
	public void color() {
		System.out.println("red color");
	}
	public abstract void run(); 
		
	}

class ActiveHonda extends Bike{
	public void run() {
		System.out.println("good in hyderabad");
	}
}

class FZ extends Bike{
	public void run() {
		System.out.println("full like in roads");
	}
}

public class Abstract {

	public static void main(String[] args) {
		ActiveHonda ah=new ActiveHonda();
		ah.color();
		ah.run();
		
		FZ fz = new FZ();
		fz.color();
		fz.run();
		
		Bike b1 = new ActiveHonda();
		b1.color();
		b1.run();
		
		Bike b2 = new FZ();
		b2.color();
		b2.run();

	}

}
