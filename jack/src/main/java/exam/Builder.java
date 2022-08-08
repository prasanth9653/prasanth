package exam;

public class Builder {

	public static void main(String[] args) {
		employee emp=new employee.company("Ajith", "Kumar").age(24).degreecompleted(true).experience(true).build();
		
		
		System.out.println(emp.firstname());
		System.out.println(emp.lastname());
		System.out.println(emp.Age());
		System.out.println(emp.DegreeCompleted());
		System.out.println(emp.Experience());
		
	}

}
class employee
{
	private String FirtsName,LastName;
	private int Age;
	private boolean DegreeCompleted,Experience;
	
	public String firstname()
	{
		System.out.println("Enter your FirstName:");
		return FirtsName;
	}
	public String lastname()
	{
		System.out.println("Enter your LastName:");
		return LastName;
	}
	public int Age()
	{
		System.out.println("Enter your Age:");
		return Age;
		
	}
	public Boolean DegreeCompleted()
	{
		System.out.println("degree Completed");
		return DegreeCompleted;
	}
	public Boolean Experience() 
	{
		System.out.println("Exoerience");
		return Experience;
	}
	private employee(company comp) 
	{
		this.FirtsName=comp.firstname;
		this.LastName=comp.lastname;
		this.Age=comp.age;
		this.Experience=comp.degreecompleted;
		this.DegreeCompleted=comp.experience;
	}
	public static class company
	{
		private String firstname,lastname;
		private int age;
		private boolean degreecompleted,experience;
	
	public company(String fn,String ln)
	{
		this.firstname=fn;
		this.lastname=ln;
		
	}
	public  company age(int a) {
		this.age=a;
		return this;
	}
	public company degreecompleted(boolean dc) {
		this.degreecompleted=dc;
		return this;
	}
	public company experience(boolean ep) {
		this.experience=ep;
		return this;
		
	}
	public employee build()
	{
		return new employee(this);
	}
	}
	
}

