package sub6to10;

	

	// interface 
	// implements object creation types
	//a).normal interface simple empty method
	//1.anonymous
	//2.reference
	//3.lambda
	//4.normal object creation

	public class SecondDayTest
	{
		
		
		public static void main(String[] args) {
		System.out.println("The Process is Started...........");
		new T1() {
		@Override
		public void meth() {
		System.out.println("It is Asyn Part1.........");
		}
		}.meth();
		//T1 t=SecondDayTest::dis;
		//t.meth();
		//T1 a=()->{System.out.println("It is lamda meth part1...........");};
		//a.meth();
		Raja b=new Raja();
		b.meth();
		int c=new T2() {
		@Override
		public int meth() {
		// TODO Auto-generated method stub
		return 2;
		}
		}.meth();
		System.out.println("The Asyn Meth Part2 return Value.........."+c);
		T2 d=SecondDayTest::dis1;
		int e=d.meth();
		System.out.println("The Output is Method Referance Part2.........."+e);
		T2 f=()->{return 2;};
		int g=f.meth();
		System.out.println("The Output is Lamda Method Part2.........."+g);
		Raja2 ra=new Raja2();
		int h=ra.meth();
		System.out.println("It is Implement Meth Part2............"+h);
		String i=new T3() {
		@Override
		public String meth(int i, String s) {
		// TODO Auto-generated method stub
		return "Hi";
		}
		}.meth(3, "Hiii");
		System.out.println("The Asyn Meth Part3 return Value.........."+i);
		T3 j=SecondDayTest::dis2;
		String k=j.meth(3, "hiii");
		System.out.println("The Output is Method Referance Part3.........."+k);
		T3 l=(int m, String n)->{return m+":"+n;};
		String o=l.meth(3, "hiii");
		System.out.println("The Output is Lamda Method Part3.........."+o);
		String p=b.meth(3, "hiii");
		System.out.println("It is Implement Meth Part3............"+p);
		Acc q=new Acc();
		new T4() {
		@Override
		public Acc transfer(Acc a, int debit) {
		a.Savings=a.Savings-debit;
		return q;
		}
		}.transfer(q, 38);
		System.out.println("The Asyn Meth Part4 Balance Value.........."+q.Savings);
		T4 r=SecondDayTest::transfer;
		r.transfer(q, 52);
		System.out.println("The Output is Method Referance Part4.........."+q.Savings);
		T4 s=(Acc v,int debit)->{q.Savings= q.Savings-13; return q;};
		s.transfer(q, 13);
		System.out.println("The Output is Lamda Method Part4.........."+q.Savings);
		b.transfer(q, 42);
		System.out.println("It is Implement Meth Part4............"+q.Savings);
		}
		static void dis() {
		System.out.println("It is Reference meth part1...........");
		}
		static int dis1() {
		return 2;
		}
		static String dis2(int i,String a) {
		return "hiii";
		}
		static Acc transfer(Acc a,int debit){
		a.Savings=a.Savings-debit;
		return a;
		}
		}interface T1{
		void meth();
		}interface T2{
		int meth();
		}interface T3{
		String meth(int i,String s);
		}interface T4{
		Acc transfer(Acc a,int debit);
		}class Acc{
		int Savings=10000;
		}class Raja implements T1,T3,T4{ public void meth() {
		System.out.println("It is Implement Meth Part1............");
		} @Override
		public String meth(int i, String s) {
		return "Hiii";
		} @Override
		public Acc transfer(Acc a, int Debit) {
		a.Savings=a.Savings-Debit;
		return a;
		}
		}class Raja2 implements T2{ public int meth() {
		return 2;
		}
		}

		