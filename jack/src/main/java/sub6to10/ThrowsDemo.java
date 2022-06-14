package sub6to10;

public class ThrowsDemo {
	public static void main(String[] args) {
		YesBank yb=new YesBank();
		try {
			yb.withDraw(100000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Business Continue");
	}

}
class YesBank{
	public void withDraw(int amt)throws MaxLimitException
	{
		if(amt>100000)
		{
			throw new MaxLimitException();
		}
	}
}
class MaxLimitException extends Exception{
	
}