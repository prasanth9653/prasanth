package revision;

public class Bridge {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor1();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor1();
	}
}

interface Color {
	public void applyColor();
}
class GreenColor implements Color {
	public void applyColor() {
		System.out.println("green.");
	}
}

class RedColor implements Color {
	public void applyColor() {
		System.out.println("red.");
	}
}

abstract class Shape {
	// Composition - implementor
	protected Color color;

	// constructor with implementor as input argument
	public Shape(Color c) {
		this.color = c;
	}

	public abstract void applyColor1();
}



class Pentagon extends Shape {
	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor1() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}
}

class Triangle extends Shape {
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor1() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}
}
