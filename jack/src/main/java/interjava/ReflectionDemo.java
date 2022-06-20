package interjava;
//https://fluvid.com/videos/detail/ykZL6c7Ae3CEwAR3p#.YqmEIr-dBek.link
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectionDemo {
	public static void main(String[] args)throws Exception {
		Politician diamond=new Politician();
		PoliceStation p1=new PoliceStation();
		Barber barber=new Barber();
		
		p1.arrest(diamond);
	}
}
class PoliceStation{
	public void arrest(Object obj)throws Exception {
		//Politician pol=(Politician)obj;
		//System.out.println(pol.name);
		Class c=obj.getClass();
		Field f=c.getField("name");
		System.out.println(f.get(obj));
		
		Method m=c.getMethod("service");
		m.invoke(obj);
		singamIntrogation(obj);
	}
	public void singamIntrogation(Object obj)throws Exception {
		Class c=obj.getClass();
		Field f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
		Method m=c.getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(obj);
	}
}
class Barber{
	public String name="I am a good barber...";
	private String secretName="I am a non IncomeTax payer...";
}
class Politician{
	public String name="I am a good man...";
	private String secretName="I am a gunda,...thief...";
	
	public void service() {
		System.out.println("I do social service.....");
	}
	
	private void secretService() {
		System.out.println("I do loot people...........");
	}
}