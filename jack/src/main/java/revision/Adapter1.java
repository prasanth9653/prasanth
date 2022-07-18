package revision;

public class Adapter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class indianplug1
{
	public abstract void roundpin1();
	
}
abstract class indianshocket1
{
	public abstract void indianpinhole1(indianplug1 ip);
}
abstract class americanplug1
{
	public abstract void slappin1() ;
	
}
abstract class americanshocket1
{
	public abstract void americanpinhole1(americanplug1 ap);
}

class sakthiplug1 extends indianplug1
{
	@Override
	public void roundpin1() {
		System.out.println("Sakthi plug working");
		
	}
}
class sakthishocket1 extends indianshocket1
{
	@Override
	public void indianpinhole1(indianplug1 ip) {
		ip.roundpin1();
	}
}
class indianadapter1 extends indianplug1
{
	americanplug1 ap;
	public indianadapter1() {
		// TODO Auto-generated constructor stub
	}
	
	public indianadapter1(americanplug1 ap) {
		this.ap=ap;
	}
	@Override
	public void roundpin1() {
		ap.slappin1();
		
	}
	
}
class lenovoplug1 extends americanplug1
{
	@Override
	public void slappin1() {
				System.out.println("lenovoplug worked");
		
	}
}