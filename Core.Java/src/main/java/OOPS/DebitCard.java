package OOPS;

public class DebitCard {
	//data hiding
	private int pinNumber;
	
public int getPinNumber() {
	return pinNumber;
}

public void setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
}
	public static void main(String[] args) {
		DebitCard visaCard = new DebitCard();
		visaCard.setPinNumber(1234);
		System.out.println(visaCard.getPinNumber());

	}

}
