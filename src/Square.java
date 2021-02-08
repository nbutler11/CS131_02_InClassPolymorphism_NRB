
public class Square extends Rectangle{
	private double side;
	
	public Square(double s) {
		super(s,s);
		side = s; 
		calculateArea();
	}
	
	protected double calculateArea() {
		super.calculateArea();
		area=Math.pow(side, 2);
		return area;
	}
	
	public double getArea() {
		return area;
	}

}
