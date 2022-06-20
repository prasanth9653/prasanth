package sub6to10;

public class InterDemo6 {

	public static void main(String[] args) 
	{
		//1. Anonymous 2. Method Referencing 3. Lambda 4. Muthur teacher
		
			//1. Anonymous inner class implementation
			new FInterOne() 
			{			
				@Override
				public void met()
				{
						System.out.println("anonymous inner class met called..");				
				}
			}.met();
				
			//Method Referencing...
			FInterOne one=InterDemo6::mymethod;
			one.met();
				
			//Lambda
			FInterOne oneLambda=()->
			{
				System.out.println("logic in lambda called...");
			};
			oneLambda.met();
				
			
	}	
				
			
			public static void mymethod() {
				System.out.println("my method called...");
			}
	}
			
		interface FInterOne{
			public void met();
			
		}
		