package org.tnsif.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceExecutor {

public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("John");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Trisha");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		//create one employee
				Employee employee1 = new Employee();
				employee1.setName("Shiwani");
				employee1.setSalary(5000);
				em.persist(employee1);
				
				//create one manager
				Manager manager1 = new Manager();
				manager1.setName("Vikas");
				manager1.setSalary(8000);
				manager.setDepartmentName("IT");
				em.persist(manager1);
				
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}