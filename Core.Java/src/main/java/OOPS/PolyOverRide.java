package OOPS;

class CentralGovt{
	public void gst() {
		System.out.println("enter govt gst");
	}
}

class StateGovt extends CentralGovt{
	public void gst() {
		System.out.println("enter + state");
	}
}
public class PolyOverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CentralGovt center = new CentralGovt();
center.gst();

StateGovt state = new StateGovt();
state.gst();

CentralGovt tax =  new StateGovt();
tax.gst();
	}

}
