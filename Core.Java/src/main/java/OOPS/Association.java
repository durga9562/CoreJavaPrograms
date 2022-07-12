package OOPS;
class Ride{
	public int id;
	public String name;
	public String time;

public Ride(int id, String name, String time) {
	this.id = id;
	this.name = name;
	this.time = time;
}
}

class Champ{
	public int id;
	public String name;
	public Ride ride;
	public Champ(int id, String name, Ride ride) {
		this.id = id;
		this.name = name;
		this.ride = ride;
	}
}
public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride r = new Ride(100,"prasad","5 hours");
		Champ c = new Champ(22,"kumar",r);
		System.out.println("ride id:"+r.id);
		System.out.println("ride name:"+r.name);
		System.out.println("ride time:"+r.Champ.ride);

	}

}
