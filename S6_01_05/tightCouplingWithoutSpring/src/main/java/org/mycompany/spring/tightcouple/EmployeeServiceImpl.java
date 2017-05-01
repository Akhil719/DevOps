package org.mycompany.spring.tightcouple;

/**
 * 
 * @author Ravi
 * 
 */
public class EmployeeServiceImpl implements EmployeeService {

	public Long generateEployeeID() {

		return System.currentTimeMillis();

	}

}
