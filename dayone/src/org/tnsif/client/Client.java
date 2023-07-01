//driver class
package org.tnsif.client;
import org.tnsif.entities.Employee;
import org.tnsif.service.EmployeeServiceImpl;
import org.tnsif.service.EmployeeService;
public class Client {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImpl ();
		Employee emp  =new Employee();
		//CRUD OPeration
		//create
		emp.setId(102);
		emp.setName("Vibhakti Patil");
		service.addEmployee(emp);
		System.out.println("data added ");
		//update 
				/*
				 * emp=service.getEmploye(101);
				emp.setName("sachin k");
				service.updateEmployee(emp);
				System.out.println("data update ");
				*/
				
				//delete
				/*
				emp =service.getEmploye(102);
				service.removeStudent(emp);
				System.out.println("data delete ");
				
				
				
				
				
				//retriev
				emp=service.getEmploye(102);
				System.out.println("emp id "+emp.getId());
				System.out.println("emp name "+emp.getName());
				
				*/
	}

}
