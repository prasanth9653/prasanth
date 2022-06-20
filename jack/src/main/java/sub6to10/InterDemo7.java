package sub6to10;

public class InterDemo7
{
	public static void main(String[] args)
	{
		int value=new FInterTwo()
		{
			

				@Override
				public int met()
				{
					// TODO Auto-generated method stub
					return 100;
				}
		
			
		}.met();
		System.out.println("Anonyms Type"+value);

		FInterTwo two=InterDemo7::mymethod;
		two.met();
		
		FInterTwo twoLambda=()->
		{
			return 1000;
		};
		value=twoLambda.met();
		System.out.println(value);
		
	}
	public static int mymethod()
	{
		int i=100;
		System.out.println(i);
		return 1000;
	}
}
interface FInterTwo
{
	public int met();
}

