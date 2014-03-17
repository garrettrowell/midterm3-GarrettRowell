import java.util.Date;


public class Person {

	private String name;
	private Date date;
	
	public Person(String name, Date date) {
		this.setName(name);
		this.setDate(date);
	}	

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public void setDate(Date date){
		this.date=date;
	}
	
	public String personDetails(){
		return name+" - DOB: "+date;
		
	}
	
    public String toString()  
    {  
        String tempName = this.getName();  
        return tempName + " - " + this.getDate();  
    }  

}
