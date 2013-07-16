package com.javacrud;

import java.sql.SQLException;
import java.text.ParseException;

import com.javatpoint.dao.EmployeeDao;
import com.javatpoint.home.Employee;
public class CrudApp {

	public static void main (String []args){
		EmployeeDao dao = new EmployeeDao();

		Employee emp = new Employee();	
		/*Add Employee
		emp.setId(7);
		emp.setFirstName("Cristiano");
		emp.setLastName("Ronaldo");	
		dao.addEmployee(emp);
		System.out.println("Record Successfully Added");
		
	*/
		
		/*Update Employee
		emp.setId(440);
		emp.setFirstName("Ayo");
		emp.setLastName("bjhaid");
		dao.updateEmployee(emp);
		System.out.println("Record Successfully Updated");
		*/
		
		/* Delete Employee
		dao.deleteEmployee(0);
		System.out.println("Record Successfully Deleted");
		*/
		
		
		/*Get All Employee
		for(Employee iter: dao.getAllEmployee()){
		System.out.println(iter);
			*/
			
		
		
		//Get Employee by ID
	    System.out.println(dao.getUserById(911));
		
		
	}
}
	

