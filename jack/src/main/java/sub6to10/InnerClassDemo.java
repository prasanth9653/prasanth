package sub6to10;

public class InnerClassDemo {

	public static void main(String[] args) {
//		Ajith a=new Ajith();
//		a.bike();
		
		Ajith a=new Ajith();
		a.bike();
		Kali k=new Kali();
		k.car();

	}

}
class Kali
{
	public void car()
	{
		Ajith.Ganesh g=new Ajith().new Ganesh();
		
		g.taxi(10);
		//g.bike();
		
	}
//	class Akash
//	{
//		public void van()
//		{
//			
//		}
//		
//	}
	
}

class Ajith
{
	public void bike()
	{
		Ganesh g=new Ganesh();
		
		//g.taxi(10);
		System.out.println("I value is");
		
		
	}
	class Ganesh
	{
		public void taxi(int i)
		{
			i=i+10;
			//System.out.println("I value is");
			System.out.println(i);
		}
	}
	
}
