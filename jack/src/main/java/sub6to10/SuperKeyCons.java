package sub6to10;

public class SuperKeyCons {

	public static void main(String[] args) {
		Bot b=new Bot(90);
		

	}

}
abstract class Top{
	public Top(int i)
	{
		System.out.println(i);
	}
}
abstract class Mid extends Top{
	public Mid(String s)
	{
		super(100);
		System.out.println(s);
	}
}
class Bot extends Mid{
	public Bot(int j) {
		super("prasanth");
		System.out.println(j);
	}
}
