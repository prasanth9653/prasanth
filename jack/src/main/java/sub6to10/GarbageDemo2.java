package sub6to10;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GarbageDemo2 {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Available Memory"+r.maxMemory());
		System.out.println("Avilable Processor"+r.availableProcessors());
		System.out.println("Free Memory"+r.freeMemory());
		r.gc();
	Food food=new Food();
	System.out.println("Free Memory"+r.freeMemory());
	SoftReference soft=new SoftReference(food);
	//WeakReference weak=new WeakReference(food);
		food=null;
		r.gc();
		System.out.println("Free Memory"+r.freeMemory());
		food=(Food)soft.get();
		//food=(Food)weak.get();
		System.out.println(food);		
	}
	

}
class Food 
{
	protected void finalize()throws Throwable
	{
		System.out.println("finalize for the food object called");
		
	}
}
