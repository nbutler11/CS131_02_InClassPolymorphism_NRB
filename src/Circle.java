
public class Circle extends Shape{
	private double radius;
	
	public Circle(double r) {
		super();
		radius = r;
		calculateArea();
	}
	
	protected double calculateArea() {
		area = Math.PI*radius*radius;
		return area;
	}
	
	public double getArea() {
		return area;
	}

}
