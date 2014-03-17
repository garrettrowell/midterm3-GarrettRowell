import java.util.Calendar;

public class CompanyTracker {
	public static void main(String[] args) {
		Company c = new Company("Acme Corp");
		
		// We use the below to set the date
		Calendar cal = Calendar.getInstance();
		// Add Employee 1
		cal.clear();
		cal.set(1980, 1, 17);
		Employee e1 = new Employee("Jason Slagle", cal.getTime(), "Peon", 10000.0);
		System.out.println("Adding " + e1.personDetails());
		System.out.println(e1.getAge() + " years old");
		c.addEmployee(e1);
		
		
		// Add employee 2
		cal.set(1990,0,23);
		Person p = new Person("John Doe",cal.getTime());
		Employee e2 = new Employee(p, "Supreme Overload", 100234.45);
		System.out.println("Adding " + p);
		c.addEmployee(e2);
		
		// Add employee 3
		cal.set(1993,6,7);
		Employee e3 = new Employee("Jane Smith", cal.getTime(), "Instructor", 65000.0);
		System.out.println("Adding " + e3.personDetails());
		c.addEmployee(e3);
		
		// Print some info
		System.out.println("-------------");
		System.out.println("Salaries");
		System.out.println("-------------");
		c.printSalaries();
		System.out.println("-------------");
		
		// Everyone gets a 3% raise
		c.doRaise(0.03);
		System.out.println("Salaries");
		System.out.println("-------------");
		c.printSalaries();

		
		// Uh oh - Peon be gone
		c.removeEmployee(e1);
		// Overlord gets a raise
		Employee overlord = c.findEmployee(e2);
		overlord.doRaise(0.10);
		System.out.println("-------------");
		System.out.println("Salaries");
		System.out.println("-------------");
		c.printSalaries();	
		
	}
}
