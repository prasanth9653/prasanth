package interjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ColDemo4 {
public static void main(String[] args) {
	HashMap<String, String> hm=new HashMap<String, String>();
	//TreeMap<String, String> hm=new TreeMap<String, String>();
	hm.put("s200", "Ganesh");
	hm.put("s300", "Ajith");
	hm.put("s400", "Kaliya");
	hm.put("s500", "aadhi");
	
	System.out.println(hm);
	
	System.out.println(hm.get("s200"));
	
	Set<Map.Entry<String,String>>s=hm.entrySet();
	Iterator<Map.Entry<String,String>>iter=s.iterator();
	
	while(iter.hasNext())
	{
		Map.Entry<String, String> me=iter.next();
		System.out.println(me.getKey()+":" +me.getValue());
	}
	
}
}
