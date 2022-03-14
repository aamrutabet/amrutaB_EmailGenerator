package employee;

import utils.entity.Department;

public class Employee {
	private String fName;
	private String lName; 
	private Department dept;
	
	public Employee(String fName, String lName, Integer dept) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dept = getById(dept);
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public Department getById(Integer id) {
		for (Department d : Department.values()) {
			if (d.id.equals(id)) {
				return d;
			}
		}
		return Department.UNKNOWN;
	}
}
