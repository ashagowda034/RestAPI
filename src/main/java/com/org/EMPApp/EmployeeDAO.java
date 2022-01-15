package com.org.EMPApp;

import org.springframework.stereotype.Repository;
import com.org.EMPApp.Employees;
import com.org.EMPApp.Employee;

@Repository
public class EmployeeDAO {


	private static Employees list = new Employees();

static {
	list.getEmployeeList().add(new Employee(1,"a","b","xyz"));
	list.getEmployeeList().add(new Employee(2,"p","q","pqr"));
}
public Employees getAllEmployees() {
	return list;
}
public void addEmployee(Employee employee) {
	list.getEmployeeList().add(employee);
}

}
