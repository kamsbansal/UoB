package company;

import java.util.ArrayList;

public abstract class Company {

	private ArrayList<Employee> employees;

	/**
	 * constructor creates what?? from the parts
	 * 
	 * @param firstName
	 * @param lastName
	 * @param nI
	 */

	public Company() {

		this.employees = new ArrayList<Employee>();

	}

	/**
	 * Getter for Employees
	 */

	public ArrayList<Employee> getEmployees() {
		return this.employees;
	}

	/**
	 * Setter for Employees
	 */

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	/*
	 * Method for increasing salary
	 */

	public void increaseSalaries(double rate) {

		for (int i = 0; i < employees.size(); i++) {
			employees.get(i).increaseSalary(rate);

		}

	}
}
