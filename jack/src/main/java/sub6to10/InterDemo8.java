package sub6to10;

public class InterDemo8 {
	public static void main(String[] args) {
		String value=new FInter() {
			
			@Override
			public String met(int i, String s) {
				return i+":"+s;
				
				
			}
		}.met(1000,"AAdhi is now Studying");
		System.out.println(value);
		
		FInter one =new InterDemo8()::met;
	
		value=one.met(100, "ajith is a good boy");
				System.out.println(value);
				
		FInter s=(int num,String str)->
				{
						return num+":"+str;
				};
				value=s.met(101, "Kaliya");
				System.out.println(value);
				
				
	}
	public String  met(int i,String s)
	{
		return i+":"+s;
	
	}

}
interface FInter
{
	public String met(int i,String s);
}
