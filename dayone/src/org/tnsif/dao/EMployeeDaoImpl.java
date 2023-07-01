package org.tnsif.dao;

import javax.persistence.EntityManager;

import org.tnsif.entities.Employee;

public  class EMployeeDaoImpl implements EmployeeDao {

	private EntityManager em;
	//default constructor 
		public EMployeeDaoImpl() {
			em =JPAUtil.getEntityManager();
			}
		//create and add
	public void addEmployee1(Employee emp) {
		em.persist(emp);
		
	}
//retrieve
	@Override
	public Employee getEmployee(int id) {
		Employee emp=em.find(Employee.class, id);
		return emp;
	}
//update
	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
		
		
	}
//delete
	@Override
	public void deleteeEmployee(Employee emp) {
		em.remove(emp);
		
	}
//begin Transaction
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}
//close transaction
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();	// TODO Auto-generated method stub
		
	}
@Override
public void addEmployee(Employee emp) {
	// TODO Auto-generated method stub
	
}
@Override
public void removeStudent(Employee emp) {
	em.remove(emp);
	
}

	
	

}
