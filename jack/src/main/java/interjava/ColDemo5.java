package interjava;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ColDemo5 {
	public static void main(String[] args) {
		Properties prop=new Properties();
		
		prop.put("s100", "Ajith");
		prop.put("s200", "Aathi");
		prop.put("s300", "ganesh");
		prop.put("s400", "kaliya");
		
		System.out.println(prop);
		System.out.println(prop.get("s300"));
		
		Set s=prop.entrySet();
		Iterator iter=s.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		
	}

}
