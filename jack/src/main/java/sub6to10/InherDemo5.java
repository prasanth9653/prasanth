package sub6to10;

	//https://fluvid.com/videos/detail/dagdEhZG2qF8L_X6q#.YpWcHmK03-4.link
	public class InherDemo5 {
		public static void main(String[] args) {
//			ShakthiPlug indianPlug=new ShakthiPlug();
			AmericanPlug americanPlug=new LenovoPlug();
			
			ShakthiSocket indianSocket=new ShakthiSocket();
			IndianAdapter adapter=new IndianAdapter(americanPlug);
			indianSocket.roundPinHole(adapter);
		}
	}
	abstract class IndianPlug{
		public abstract void roundPin();
	}
	abstract class IndianSocket{
		public abstract void roundPinHole(IndianPlug ip);
	}
	abstract class AmericanPlug{
		public abstract void slabPin();
	}
	abstract class AmericanSocket{
		public abstract void slabPinHole(AmericanPlug ap);
	}
	class ShakthiPlug extends IndianPlug{
		@Override
		public void roundPin() {
			System.out.println("shakthi plug working....");
		}
	}
	class ShakthiSocket extends IndianSocket{
		@Override
		public void roundPinHole(IndianPlug ip) {
			ip.roundPin();
		}
	}
	class IndianAdapter extends IndianPlug{
		AmericanPlug ap;
		public IndianAdapter() {
			// TODO Auto-generated constructor stub
		}
		public IndianAdapter(AmericanPlug ap) {
			this.ap=ap;
		}
		@Override
		public void roundPin() {
			ap.slabPin();
		}
	}
	class LenovoPlug extends AmericanPlug{
		
		@Override
		public void slabPin() {
			System.out.println("american slab pin plug working....");
		}
	}



