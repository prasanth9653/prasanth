package interjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ColDemo2 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("ramu"));
		list.add(new Student("babu"));
		list.add(new Student("anand"));
		list.add(new Student("george"));
		list.add(new Student("Akram"));
		System.out.println("Before Sorting"+list);
		Collections.sort(list);
		System.out.println("After Sorting"+list);
		HashSet<Student>hs=new HashSet<Student>(list);
		System.out.println(hs);
		TreeSet<Student> ts=new TreeSet<Student>(new MyComparator());
		ts.addAll(hs);
		System.out.println(ts);
	
	}
	

}
class MyComparator implements Comparator<Student>

{@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o2.compareTo(o1);
}

	
	
}
class Student implements Comparable<Student>
{
	String name;
	public Student(String name)
	{
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
