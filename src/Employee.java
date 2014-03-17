import java.util.Date;
import java.util.Calendar;


public class Employee extends Person{
	private String title;
	private Double salary;
	private Integer age,year;
	Calendar cal = Calendar.getInstance();
	
	public Employee(String name, Date date, String title,Double salary) {
		super(name, date);
		this.title=title;
		this.salary=salary;
		this.year = Integer.parseInt(date.toString().substring(date.toString().lastIndexOf(" ")+1));
	}

	public Employee(Person person, String title, double salary) {
		super(person.getName(),person.getDate());
		this.title=title;
		this.salary=salary;
		this.year = Integer.parseInt(person.getDate().toString().substring(person.getDate().toString().lastIndexOf(" ")+1));

	}

	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Double getSalary(){
		return this.salary;
	}
	
	public void setSalary(Double salary){
		this.salary=salary;
	}

	public void doRaise(double d) {
		this.salary=salary*(1+d);
	}

	public Integer getAge() {
		if (cal.get(Calendar.YEAR)>=this.year){
			this.age=cal.get(Calendar.YEAR)-(this.year);
			return age;
		}
		return null;
	}

}
