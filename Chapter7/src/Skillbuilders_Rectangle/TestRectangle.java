package Skillbuilders_Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		//part 1
		Rectangle_part1of5 spot = new Rectangle_part1of5(7, 4);
		
		System.out.println("Rectangle length : " + spot.getLength());
		System.out.println("Rectangle perimeter : " + spot.getPerimeter());
		System.out.println("Rectangle area : " + spot.getArea());
		System.out.println("Rectangle width : " + spot.getWidth());
		
		Rectangle_part1of5 dot = new Rectangle_part1of5();
		
		dot.setLength(12);
		dot.setWidth(8);
		System.out.println("Rectangle length : " + dot.getLength());
		System.out.println("Rectangle perimeter : " + dot.getPerimeter());
		System.out.println("Rectangle area : " + dot.getArea());
		System.out.println("Rectangle width : " + dot.getWidth());
		
		System.out.println("");
		
		//part 2
		Rectangle_part2of5 rot = new Rectangle_part2of5(8, 5);
		
		System.out.println("The formula to get the area of a rectangle is: " + rot.displayAreaFormula());
		
		System.out.println("");
		
		//part 3
		Rectangle_part3of5 moat = new Rectangle_part3of5(8, 5);
		Rectangle_part3of5 boat = new Rectangle_part3of5(4, 2);
		
		System.out.println(moat.toString());
		System.out.println("The two rectangle objects are equal: " + moat.equals(moat));
		System.out.println("The two rectangle objects are equal: " + moat.equals(boat));
	
		

	}

}
