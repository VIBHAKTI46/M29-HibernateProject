package org.tnsif.dao;

import org.tnsif.entities.Employee;

public interface EmployeeDao {
//by defult abstract method
	//user defined method for CRUD operation
	void addEmployee(Employee emp);//create
	Employee getEmployee(int id);//retrieve
	 void removeStudent(Employee emp);
	void updateEmployee(Employee emp);//update
	void deleteeEmployee(Employee emp);//delete
	
	//JPA Transaction
	void beginTransaction();//begin
	void commitTransaction();//exist
}
