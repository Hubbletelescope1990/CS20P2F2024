package Skillbuilders_Rectangle;

public class Rectangle_part1of5 {
	private double length;
	private double width;
	
	public Rectangle_part1of5() {
		length = 2;
		width = 1;
	}
	
	public Rectangle_part1of5(double leg, double wid) {
		length = leg;
		width = wid;
	}
	
	public void setLength(double newlength) {
		length = newlength;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double getLength() {
		return(length);
	}
	
	public double getWidth() {
		return(width);
	}
	
	public double getArea() {
		double area = length * width;
		return(area);
	}
	
	public double getPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		return(perimeter);
	}
}
