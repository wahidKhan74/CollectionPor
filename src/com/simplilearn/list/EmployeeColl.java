package com.simplilearn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeColl {

	public static void main(String[] args) {
		
		Employee em1 = new Employee(100, "John Smith", "Engineering");
		Employee em2 = new Employee(101, "Will Smith", "Devlopement");
		Employee em3 = new Employee(102, "Mike Smith", "Operations");
		Employee em4 = new Employee(103, "Marry Smith", "QA");
		Employee em5 = new Employee(104, "Harry Smith", "QA");
		
		// An ordered collection (also known as a sequence). 
		// The user of this interface has precise control over where in 
		// the list each element is inserted. The user can access elements by 
		// their integer index (position in the list), and search for elements in the list.
		List <Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(em1);
		employeeList.add(em2);
		employeeList.add(em3);
		employeeList.add(em4);
		employeeList.add(em5);
		
		System.out.println("The Employee details");

		for(Employee emp: employeeList) {
			
			System.out.println("The Employee Id: "+emp.getEmpId());
			System.out.println("The Employee Name: "+emp.getEmpName());
			System.out.println("The Employee Dept: "+emp.getEmpDept());
		}
		System.out.println("-----------------------------");
//		System.out.println(employeeList);

	}
	
	// list of Players : - 
	// Number array list
}
