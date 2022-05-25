package Sub6to10;


	public class ThisDemo2 {
		static String s;
		public ThisDemo2(String s) {
			this.s=s;
		}
		public static void main(String[] args) {
			//this keyword cannot be used inside a static method
			ThisDemo2 obj=new ThisDemo2("some value...");
			obj.printS("aaaaaaaaaa");
		}
		
		public void printS(String s) {
			
			System.out.println(this.s);
		}
	}
	









