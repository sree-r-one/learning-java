
public class Employee {
	private String name;
	private Salary salary;

	public Employee(String name, Salary salary) {
		this.name = name;
		this.salary = new Salary(200);
	}

}
