package overriding_overloading;

class Shapes{
	void perimeter() {
		return;
	}
}

class Square extends Shapes{
	int side;
	Square(int side){
		this.side = side;
		System.out.println("The given shape is Square having " + side + " sides");
	}
	
	@Override
	void perimeter() {
		System.out.println("The perimeter of square is : " + 4*side);
	}
	
}

class Circle extends Shapes{
	int radius;
	Circle(int radius){
		this.radius = radius;
		System.out.println("The given shape is circle with radius " + radius);
	}
	
	@Override
	void perimeter() {
		System.out.println("The perimeter of circle is : " + 2*3.14*radius);
	}
	
}

class Triangle extends Shapes{
	int one, two, three;
	Triangle(int one, int two, int three){
		this.one = one;
		this.two = two;
		this.three = three;
		System.out.println("The given shape is triangle with sides of " + one + "," + two + "," + three);
	}
	
	@Override
	void perimeter() {
		int tot = one+two+three;
		System.out.println("The perimeter of triangle is : " + tot);
	}
	
}


public class Main{
	public static void main(String[] args) {
		Square a = new Square(5);
		Circle b = new Circle(4);
		Triangle c = new Triangle(2,5,4);
		
		a.perimeter();
		b.perimeter();
		c.perimeter();
		
	}
}