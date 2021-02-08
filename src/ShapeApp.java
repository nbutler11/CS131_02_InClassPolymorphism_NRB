
public class ShapeApp {

	public static void main(String[] args) {
		Circle c1 = new Circle(4.2);
		System.out.println(c1.getArea());
		
		Square mySquare = new Square(2.3);
		System.out.println(mySquare.getArea());
		
		Rectangle r1 = new Rectangle(5.7, 1.8);
		System.out.println(r1.getArea());

	}

}
