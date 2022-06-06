package sub6to10;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
//		int j;
		MethodOverLoadingDemo mol=new MethodOverLoadingDemo();
		mol.met();
		mol.met(12);
		mol.met(55.8f);
		

	}
	public void met()
	{
		System.out.println("ajith");
	}
	public void met(int i) {
		
		
		i=i+100;
		int j=i;
		System.out.println(""+j);
	}
	public void met(float a)
	{
		a=a+55.5f;
		System.out.println(a);
		
	}

}
