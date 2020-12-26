package entities;

public class Acount {
	public int number;
	public String holder;
	public double deposit;

	public Acount() {
		
	}
	public Acount(int number, String holder, double deposit) {

		this.number = number;
		this.holder = holder;
		this.deposit = deposit;
	}

	public Acount(int number, String holder) {

		this.number = number;
		this.holder = holder;
		
	}
	public void addCash(double deposit) {
		this.deposit += deposit;
	}

	public void removeCash(double deposit) {
		this.deposit -= deposit;
	}
	
	public String toString() {
		return "accout " + number + ", Holder: " + holder + ", Balance " + deposit;
	}

}
