package exam;

public class CommandPatten {
	public static void main(String[] args) {
		Mall.usemall();
	}
}

class Mall {
	public static void usemall()
	{
	FirstFloor ff = new FirstFloor();
	SecondFloor sf = new SecondFloor();
	ThirdFloor tf = new ThirdFloor();
	
	father f=new father(sf,tf);
	mother m=new mother(ff, sf, tf);
	son s=new son(ff, sf, tf);
	
	liftoperator Mall=new liftoperator();
	Mall.setexecute(0);
	Mall.setLift(f, 1);
	Mall.setLift(s, 2);
	Mall.setLift(f, 3);
	
	Mall.setexecute(1);
	Mall.setexecute(2);
	Mall.setexecute(3);
	
	
	//System.out.println(" ENtering the mall");
	//Mall.setexecute(0);
	
	
	
	
	}

}

class FirstFloor {
	public void TheatorOne() {
		System.out.println("Watching tamil movie");
	}

	public void TheatoreTwo() {
		System.out.println("Watching Malayalam movie");
	}

}

class SecondFloor {
	public void CoffeeShop() {
		System.out.println("Drinking Cofee");
	}

	public void backery() {
		System.out.println("Eating snacks");

	}

}

class ThirdFloor {
	public void MensWorld() {
		System.out.println("Purchasing T-Shirt");
	}

	public void WomensWorld() {
		System.out.println("Purchassing Saree");
	}
}

interface Lift {
	public void execute();
}

class father implements Lift {
	
	SecondFloor sf;
	ThirdFloor tf;

	public father(SecondFloor SF, ThirdFloor TF) {
		this.sf = SF;
		this.tf = TF;

	}

	@Override
	public void execute() {
		System.out.println("Father Purchasing Started");
		sf.backery();
		tf.MensWorld();
		System.out.println("Father Purchassing finished");

	}
}

class mother implements Lift {
		FirstFloor ff;
		SecondFloor sf;
		ThirdFloor tf;

		public mother(FirstFloor FF, SecondFloor SF, ThirdFloor TF) {

			this.ff = FF;
			this.sf = SF;
			this.tf = TF;
		}

		@Override
		public void execute() {
			System.out.println("Mother Purchasing Started");
			ff.TheatoreTwo();
			sf.CoffeeShop();
			sf.backery();
			tf.MensWorld();
			System.out.println("Mother Purchassing Finished ");

		}
}

class son implements Lift {
			FirstFloor ff;
			SecondFloor sf;
			ThirdFloor tf;

	public son(FirstFloor FF,SecondFloor SF,ThirdFloor TF) {
				this.ff=FF;
				this.sf=SF;
				this.tf=TF;
		}

@Override
public void execute() 
{
	System.out.println("son Purchasing Started");
	ff.TheatorOne();
	ff.TheatoreTwo();
	sf.CoffeeShop();
	sf.backery();
	tf.MensWorld();
	System.out.println("son purchassing fimnished");
}
}
class car implements Lift
{
	@Override
	public void execute() {
		System.out.println("No shopping ONly stay in Parking");
		
	}
}
class liftoperator
{
	Lift lift[]=new Lift[4];
	public liftoperator()
	{
		for(int i=0;i<lift.length;i++) {
		lift[i]=new car();
	}
	}
	public void setLift(Lift lift,int slot) {
		this.lift[slot]=lift;
	}
	public void setexecute(int slot)
	{
		lift[slot].execute();
	}
	
}
