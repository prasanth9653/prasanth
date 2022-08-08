package exam;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSets {
	public static void main(String[] args) {
		Set<A> s=new TreeSet<A>();
		s.add(new A("A"));
		s.add(new A("B"));
		s.add(new A("c"));
		s.add(new A("D"));
		System.out.println(s);
		Set<A> res= ((TreeSet<A>) s).descendingSet();
		System.out.println(res);
		
	}
}
class A implements Comparable<A>{
	String name;
	public A(String name) {
		this.name=name;
	}
	
	
	public int compareTo(A s) {
		
		return name.compareTo(s.name);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
class MyComparator implements Comparator<A>{
	
	public int compare(A obj1, A obj2) {
		return obj2.compareTo(obj1);
	}
}
