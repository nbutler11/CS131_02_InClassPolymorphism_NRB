
public class Rectangle extends Shape{
	private double length, width;
	
	public Rectangle(double l, double w) {
		super();
		length = l;
		width = w;
		calculateArea();
	}
	
	protected double calculateArea() {
		area = length*width;
		return area;
	}
	
	public double getArea() {
		return area;
	}

}
