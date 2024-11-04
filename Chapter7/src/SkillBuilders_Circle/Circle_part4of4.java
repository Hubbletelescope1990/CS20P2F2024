package SkillBuilders_Circle;

public class Circle_part4of4 {
	private static final double PI = 3.14;
	private double radius;
	//Creates circle object, no pre required, radius is 1 by default
	public Circle_part4of4() {
		radius = 1;
	}
	//Creates another circle object, no pre required, user must input radius
	public Circle_part4of4(double r) {
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
	
	//Returns the formula used to calculate the area of a circle, no pre required
	public String displayAreaFormula() {
		return("πr^2");
	}
	
	//Returns basic description of circle object, plus its radius, no pre required
	public String toString() {
		String circleString;
		
		circleString = "The circle object has a radius of: " + radius;
		return(circleString);
	}
	
	//Compares the radius of two circle objects that can be constructed and returns true or false accordingly
	//no pre required
	public boolean equals(Object c) {
		Circle_part4of4 testObj = (Circle_part4of4)c;
		
		if (testObj.getRadius() == radius) {
			return(true);
		} else {
			return(false);
		}
	}
}
