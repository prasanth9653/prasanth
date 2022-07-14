package anoundtech;

public class PBVDemo {
	public static void main(String[] args) {
		Laddu1 laddu=new Laddu1();
		System.out.println("before passing......"+laddu.size);
		new xyz().pbv(laddu.size);
		//new xyz().pvr(laddu);
		System.out.println("after passing......"+laddu.size);
	}
}
	class xyz{
		public void pvr(Laddu1 laddu)
		{
			laddu.size=5;
		}
		public void pbv(int size)
		{
			size=15;
			//System.out.println(size);
		}
		
	}

	class Laddu1{
		int size=10;
	}


