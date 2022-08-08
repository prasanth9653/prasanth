package revision;

public class Bridge1 {

	public static void main(String[] args) {
		 shape1 tri=new triangle1(new greencolor1());
		 tri.fillcolor();

	}

}
interface color1
{
	public void applycolor(color1 col);
	
}
class redcolor1 implements color1
{
	@Override
	public void applycolor(color1 col) {
		System.out.println("red");
	}
}
class greencolor1 implements color1
{
	@Override
	public void applycolor(color1 col) {
		System.out.println("green");
	}
}
abstract class shape1
{
	protected color1 color1;
	
	public shape1(color1 col) {
		this.color1=col;
	}
	abstract public void fillcolor();
}
class triangle1 extends shape1
{
	public triangle1(color1 s1) {
		super(s1);
		
	}
	@Override
	public void fillcolor() {
		System.out.println("triangle color filled");
		color1.applycolor(color1);
	}
}
class pentagan1 extends shape1
{
	public pentagan1(color1 b1) {
		super(b1);
	}
	@Override
	public void fillcolor() {
		System.out.println("pentagan color filled");
		color1.applycolor(color1);
		
	}
	
}
