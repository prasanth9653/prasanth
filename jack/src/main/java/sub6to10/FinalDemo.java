package sub6to10;
public class FinalDemo {
	public static void main(String[] args) {
		FinCla fc=new FinCla();
		//fc.x=200;
		fc.s=200;
		
		
	}
}
final class FinCla{
	final int x=100;//final variables are constants...
	int s=10;
	
	final void met() {
		
	}
	final void met(int i) {
		
	}
}
//class SubFinCla extends FinCla{
//	//void met() {
//		
//	//}
//}






