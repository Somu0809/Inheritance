package overriding_overloading;

class Shapes{
	void shape(String a, int b, int c) {
		System.out.println("The name of the shape is " + a);
	}
	
	
}

class Area extends Shapes{
	@Override
	void shape(String a, int b, int c) {
		
		if(a=="rectangle") {
			System.out.println("The perimeter of " + a + "is" + 2*(b*c));
		}
		else if(a == "square") {
			System.out.println("The perimeter of " + a + " is " + 4*c);
		}
		else {
			System.out.println("The perimeter of " + a + " is " + 1/2*(b*c));
		}
	}
}

public class Main {
	
	public static void main(String[] args) {
		Shapes first = new Shapes();
		Area sec = new Area();
		
		first.shape("square", 5, 4);
		sec.shape("square", 5, 4);
	}
	
}
