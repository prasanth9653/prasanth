package sub6to10;


	class GoodDog{
		
		public void play(Item item) {
			item.display();
		}
	}
	abstract class Item{
		public abstract void display();
	}
	class Stone1 extends Item{
		@Override
		public void display() {
			System.out.println("biting...............");
		}
	}
	class Stick2 extends Item{
		@Override
		public void display() {
			System.out.println("running....");
		}
	}
	class Biscuit2 extends Item{
		@Override
		public void display() {
			System.out.println("enjoying....");
		}
		public static void main(String[] args) {
			GoodDog gd=new GoodDog();
			gd.play(null);
		}
	}

