package interjava;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class ColDemo6 {
	public static void main(String[] args) {
		Map<String, String> map=new WeakHashMap<String, String>();
		String key1=new String("Ganesh");
		String key2=new String("Kaliya Perumal");
		
		map.put(key1, "Benind Froce");
		map.put(key2, "Anoud Tech");
		
		System.out.println(map);
		key1=null;
		System.out.println(map);
		System.gc();
		System.out.println(map);
		
		
	}

}
