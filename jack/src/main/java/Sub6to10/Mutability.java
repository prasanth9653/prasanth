package Sub6to10;

public class Mutability {

	public static void main(String[] args) {
		int n=100;
		int k=n;
		n=n+100;
		System.out.println(k);
		System.out.println(n);
		
		String str="Prasanth";
		
		String str1=str;
		
		str=str+"    Jack  ";
		System.out.println(str1);
		System.out.println(str);
		
		world wl=new world();
		world wl2=wl;
		wl.size=10000000;
		
		
		System.out.println(wl2.size);
		System.out.println(wl.size);
		
	}

}
class world{
	int size=10;
}
