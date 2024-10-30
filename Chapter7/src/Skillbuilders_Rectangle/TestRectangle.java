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
		

	}

}
