package org.mycompany.spring.loosecouple;

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
