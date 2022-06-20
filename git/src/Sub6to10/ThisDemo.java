package Sub6to10;

public class ThisDemo {
	
		public static void main(String[] args) {
			Fan khaitan=new Fan();
			khaitan.setup();
		}
	}
	class Fan{
		public Fan() {
			System.out.println("fan object created...");
		}
		public void on() {
			System.out.println("fan switched on...");
		}
		public void setup() {
			Room myRoom=new Room();
			myRoom.fix(this);//this keyword represents the current object
			//myRoom.fix(new Fan());
		}
	}
	class Room{
		public void fix(Fan f) {
			f.on();
		}
	}

