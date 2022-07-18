package revision;



public class Adapter2 {

	public static void main(String[] args) {
		sakthiplug3 indianplug3 =new sakthiplug3();
		sakthisocket3 indianshocket =new sakthisocket3();
		americanplug3 americanplug=new lenovoplug3();
		
		indianadapter3 adapter=new indianadapter3(americanplug);

	}

}
abstract class indianplug3
{
	public abstract void roundpin3();
}
abstract class indianshocket3
{
	public abstract void roundpinhole3(indianplug3 ip); 
		
	
}
abstract class americanplug3
{
	public abstract void slappin(); 
		
	
}
abstract class americanshocket3
{
	public abstract void slappinhole3(americanplug3 ap);
}
class sakthiplug3 extends indianplug3
{
	@Override
	public void roundpin3() {
		// TODO Auto-generated method stub
		
	}
}
class sakthisocket3 extends indianshocket3
{
	@Override
	public void roundpinhole3(indianplug3 ip) {
		ip.roundpin3();
		
	}
}
class indianadapter3 extends indianplug3
{
	americanplug3 ap;
	public indianadapter3() {
		// TODO Auto-generated constructor stub
	}
	public indianadapter3(americanplug3 ap)
	{
		this.ap=ap;
	}
	@Override
	public void roundpin3() {
		
		ap.slappin();
		
	}
	
}
class lenovoplug3 extends americanplug3
{
	@Override
	public void slappin() {
		System.err.println("worked");
		
	}
}