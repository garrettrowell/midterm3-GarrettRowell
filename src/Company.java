import java.util.ArrayList;

public class Company {
	private ArrayList<Person> people;
	private ArrayList<Employee> employees;
	private String name;
	
	public ArrayList<Person> getPerson() {
		return people;
	}

	public void setPerson(ArrayList<Person> people) {
		this.people = people;
	}

	public ArrayList<Employee> getEmployee() {
		return employees;
	}

	public void setEmployee(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company(String name) {
		this(name, new ArrayList<Person>(), new ArrayList<Employee>());
	}
	
	public Company(String name, ArrayList<Person> people,
			ArrayList<Employee> employees) {
		this.setName(name);
		this.setPerson(people);
		this.setEmployee(employees);
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public void printSalaries() {
		System.out.println("Employees for company "+this.getName());
		for(int i=0;i<=employees.size()-1;i++){
			System.out.println(employees.get(i).getName()+": "+employees.get(i).getSalary());
		}
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public void doRaise(Double percent) {
		
		for(int i=0;i<=employees.size()-1;i++){
			employees.get(i).setSalary(employees.get(i).getSalary()*(1+percent));
		}
	}

	public Employee findEmployee(Employee employee) {
		for (int i = 0; i <= (employees.size()-1); i++)
		{
			if (employees.size()!=0 && employees.get(i).getName().equals(employee.getName())) {
				return employees.get(i);
			}
		}
		return null;
	}
}
