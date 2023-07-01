package org.tnsif.service;

import org.tnsif.entities.Employee;

public interface EmployeeService {
	void addEmployee(Employee emp);//create
	Employee getEmployee(int id);//retrieve
	void updateEmployee(Employee emp);//update
	void deleteeEmployee(Employee emp);//delete
	 void removeStudent(Employee emp);
}
