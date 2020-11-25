package Entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	public double finalGrade() {
		return note1 + note2 + note3;
	}
	public double missingPoints() {
		if(finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}else {
			return 0.0;
		}
	}
}
