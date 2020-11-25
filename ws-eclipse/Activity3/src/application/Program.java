package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Student std = new Student();
		System.out.println("Name = ");
		std.name = sc.nextLine();
		System.out.println("Fist note (max 30.0) = ");
		std.note1 = sc.nextDouble();
		System.out.println("Second note (max 35.0) = ");
		std.note2 = sc.nextDouble();
		System.out.println("Third note (max 35.0) =  ");
		std.note3 = sc.nextDouble();
		System.out.println();
		System.out.println("Final Grade = " + std.finalGrade());
		if(std.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f Points\n",std.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
	}

}
