package revision;

public class Adapter {
	public static void main(String[] args) {
		AmericanPlug lenovo=new LenovoPlug();
		
		IndianSocket socket=new ShakthiSocket();
		
		IndianAdapter ip=new IndianAdapter();
		ip.plug=lenovo;
		
		socket.roundPinHole(ip);
				
	}
}
abstract class AmericanPlug {
	public abstract void work();
}
class LenovoPlug extends AmericanPlug{
	@Override
	public void work() {
		System.out.println("american plug working.........");
	}
}
abstract class IndianPlug {
	public abstract void work();
}
class IndianAdapter extends IndianPlug{
	AmericanPlug plug;
	@Override
	public void work() {
		plug.work();
	}
}

abstract class IndianSocket {
	public abstract void roundPinHole(IndianPlug ip);
}

class ShakthiSocket extends IndianSocket{
	@Override
	public void roundPinHole(IndianPlug ip) {
		ip.work();
	}
}