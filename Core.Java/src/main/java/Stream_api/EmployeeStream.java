package Stream_api;

class Employee {
	public int eid;
	public String ename;
	public int eage;
	public String egender;
	public String edepartment;
	public double eyearOfJoining;
	public double esalary;

	public Employee(int eid, String ename, int eage, String egender, String edepartment, double eyearOfJoining,
			double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.egender = egender;
		this.edepartment = edepartment;
		this.eyearOfJoining = eyearOfJoining;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEgender() {
		return egender;
	}

	public void setEgender(String egender) {
		this.egender = egender;
	}

	public String getEdepartment() {
		return edepartment;
	}

	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}

	public double getEyearOfJoining() {
		return eyearOfJoining;
	}

	public void setEyearOfJoining(double eyearOfJoining) {
		this.eyearOfJoining = eyearOfJoining;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return eid + "\t" + ename + "\t" + eage + "\t" + egender + "\t" + "\t" + edepartment + "\t" + eyearOfJoining
				+ "\t" + esalary;
	}

}

public class EmployeeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
