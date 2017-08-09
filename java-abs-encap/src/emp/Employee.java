package emp;

// Java Bean

public class Employee {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	public Employee(int id, String name, double salary) {
		if (id > 0)
			this.id = id;
		this.name = name;
		if (salary <= 1000)
			this.salary = salary;
		this.bonus = this.salary * 0.2;
	}

	public void setSalary(double salary) {
		if (salary <= 5000) {
			this.salary = salary;
			this.bonus = salary * .5;
		}
	}

	public double getSalary() {
		return this.salary;
	}

	public double getBonus() {
		return this.bonus;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee - [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
