package Application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class mainListExemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Employees> list = new ArrayList<>();
		System.out.println("How many employees will be registered? ");
		int qtd_funcionarios = sc.nextInt();

		for (int i = 0; i < qtd_funcionarios; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employees emp = new Employees(id, name, salary);
			list.add(emp);

		}
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		boolean have = false;
		for (Employees x : list) {
			if (idSalary == x.getId()) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				x.increaseSalary(percentage);
				have = true;

			}
		}
		if (have == true) {
			System.out.println("this id does not exist!");
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employees emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}
}
