package Skillbuilders_Rectangle;

public class Rectangle_part1of5 {
	private double length;
	private double width;
	//Creates rectangle object, no pre required, default length and width is 2 and 1
	public Rectangle_part1of5() {
		length = 2;
		width = 1;
	}
	//Creates rectangle object with input values for length and width, no pre required
	public Rectangle_part1of5(double leg, double wid) {
		length = leg;
		width = wid;
	}
	//Changes length based on input, no pre required
	public void setLength(double newlength) {
		length = newlength;
	}
	//Changes width based on input, no pre required
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	//Returns current length, no pre required
	public double getLength() {
		return(length);
	}
	//Returns current width, no pre required
	public double getWidth() {
		return(width);
	}
	//Calculates and returns area, no pre required
	public double getArea() {
		double area = length * width;
		return(area);
	}
	//Calculates and returns perimeter, no pre required
	public double getPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		return(perimeter);
	}
}
