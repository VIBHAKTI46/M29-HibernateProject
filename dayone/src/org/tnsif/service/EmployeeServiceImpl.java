package org.tnsif.service;
import org.tnsif.dao.EMployeeDaoImpl;
import org.tnsif.dao.EmployeeDao;
import org.tnsif.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao;
	public EmployeeServiceImpl() {
		dao =new EMployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee getEmployee(int id) {
		Employee emp =dao.getEmployee(id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void deleteeEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteeEmployee(emp);
		dao.commitTransaction();
	}
	@Override
	public void removeStudent(Employee emp) {
		dao.beginTransaction();
		dao.removeStudent(emp);
		dao.commitTransaction();
		
	}


}
