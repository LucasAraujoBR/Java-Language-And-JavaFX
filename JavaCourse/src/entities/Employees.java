package entities;

import java.util.ArrayList;

public class Employees {
	private Integer id;
	private String name;
	private Double salary;

	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void increaseSalary(double percentage) {
		this.salary += this.salary * percentage / 100.0;
		
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Employees: |" + "ID: "+id+"|Name: "+name+"|Salary: %.2f",salary);
				}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
