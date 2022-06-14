package sub6to10;

public class SuperKeyVar {
	public static void main(String[] args) {
		Bot1 b=new Bot1();
		b.met();
		
	}

}
abstract class Top1
{
	double f=10000.25245;
}
 abstract class Mid1 extends Top1
{
	 
	String s="prasanth";
	
  
	
}
class Bot1 extends Mid1
{
	public void met()
	{
		int i=100;
		System.out.println(i);
		System.out.println("The Value is"+super.s);
		System.out.println("The Value is"+super.f);
	}
}
