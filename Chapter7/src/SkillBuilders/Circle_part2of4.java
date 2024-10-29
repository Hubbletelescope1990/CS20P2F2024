package SkillBuilders;

public class Circle_part2of4 {
	private static final double PI = 3.14;
	private double radius;
	//Creates circle object, no pre required, radius is 1 by default
	public Circle_part2of4() {
		radius = 1;
	}
	//Creates another circle object, no pre required, user must input radius
	public Circle_part2of4(double r) {
		radius = r;
	}
	//Changes radius of the circle, no pre required
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	//Calculates and returns the area of the circle, no pre required
	public double area() {
		double circleArea;
		
		circleArea = PI * radius * radius;
		return(circleArea);
	}
	//Returns the current radius of the circle, no pre required
	public double getRadius() {
		return(radius);
	}
	//Calculates and returns the circles circumference, no pre required
	public double getCircumference() {
		double circleCircumference;
		
		circleCircumference = 2 * PI * radius;
		return(circleCircumference);
	}
	
}
