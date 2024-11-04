package SkillBuilders_Circle;

public class TestCircle {

	public static void main(String[] args) {
		
		//part 1
		Circle_part1of4 spot = new Circle_part1of4();
		 
		spot.setRadius(3);
		System.out.println("Circle radius : " + spot.getRadius());
		System.out.println("Circle circumference : " + spot.getCircumference());
		
		System.out.println("");
		
		//part 2
		Circle_part2of4 pot = new Circle_part2of4(4);
		
		System.out.println("Circle radius : " + pot.getRadius());
		
		System.out.println("");
		
		//part 3
		Circle_part3of4 bot = new Circle_part3of4();
		
		System.out.println("The formula to get the area of a cricle is: " + bot.displayAreaFormula());
		
		System.out.println("");
		
		//part 4
		Circle_part4of4 robot = new Circle_part4of4(9);
		Circle_part4of4 brought = new Circle_part4of4(3);
		
		System.out.println(robot.toString());
		System.out.println("The two circle objects are equal: " + robot.equals(robot));
		System.out.println("The two circle objects are equal: " + robot.equals(brought));
	}

}
