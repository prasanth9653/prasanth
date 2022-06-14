package sub6to10;

public class SuperKeywordMet {

	public static void main(String[] args) {
		Lowstar ls= new Lowstar();
		ls.topmet(10);
		
		
		
		

	}

}
abstract class Topstar{
	public void topmet(int i)
	{
		
		System.out.println(i);
	}
	
}
abstract class Midstar extends Topstar{
	public void topmet(int i)
	{
	super.topmet(30); 
	 System.out.println(i);
	
}
}
class Lowstar extends Midstar{
	public void topmet(int i)
	{
	super.topmet(20);
		System.out.println(i);
		
	}
}
	
