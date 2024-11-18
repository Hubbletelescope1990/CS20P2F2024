package Mastery_LunchOrder;

public class LunchOrder_Mastery {
	private double burger_fiber;
	private double burger_carbs;
	private double burger_fat;
	private double burger_price;
	private double salad_fiber;
	private double salad_carbs;
	private double salad_fat;
	private double salad_price;
	private double fries_fiber;
	private double fries_carbs;
	private double fries_fat;
	private double fries_price;
	private double soda_fiber;
	private double soda_carbs;
	private double soda_fat;
	private double soda_price;
	private int burger_number;
	private int salad_number;
	private int fries_number;
	private int soda_number;
	
	//Constructor that initializes food object with the same values as the textbook
	public LunchOrder_Mastery() {
		burger_fiber = 1;
		burger_carbs = 33;
		burger_fat = 9;
		burger_price = 1.85;
		salad_fiber = 5;
		salad_carbs = 11;
		salad_fat = 9;
		salad_price = 2;
		fries_fiber = 4;
		fries_carbs = 36;
		fries_fat = 11;
		fries_price = 1.3;
		soda_fiber = 0;
		soda_carbs = 38;
		soda_fat = 0;
		soda_price = 0.95;
	}
	
	//Constructor initializes food object with custom values
	public LunchOrder_Mastery(double bf, double bc, double bfa, double bp, double sf, double sc, double sfa, double sp, double ff, double fc, double ffa, double fp, double sof, double soc, double sofa, double sop) {
		burger_fiber = bf;
		burger_carbs = bc;
		burger_fat = bfa;
		burger_price = bp;
		salad_fiber = sf;
		salad_carbs = sc;
		salad_fat = sfa;
		salad_price = sp;
		fries_fiber = ff;
		fries_carbs = fc;
		fries_fat = ffa;
		fries_price = fp;
		soda_fiber = sof;
		soda_carbs = soc;
		soda_fat = sofa;
		soda_price = sop;
	}
	//User enters order of burgers and is told their fat, carb, and fiber contents
	public String getBurgers(int burg) {
		burger_number = burg;
		String burger_string;
		burger_string = "Each hamburger has " + burger_fat + "g of fat, " + burger_carbs + "g of carbs, and " + burger_fiber + "g of fiber.";
		return(burger_string);
	}
	//User enters order of salads and is told their fat, carb, and fiber contents
	public String getSalads(int sal) {
		salad_number = sal;
		String burger_string;
		burger_string = "Each salad has " + salad_fat + "g of fat, " + salad_carbs + "g of carbs, and " + salad_fiber + "g of fiber.";
		return(burger_string);
	}
	//User enters order of fries and is told their fat, carb, and fiber contents
	public String getFries(int fry) {
		fries_number = fry;
		String burger_string;
		burger_string = "Each fries has " + fries_fat + "g of fat, " + fries_carbs + "g of carbs, and " + fries_fiber + "g of fiber.";
		return(burger_string);
	}
	//User enters order of sodas and is told their fat, carb, and fiber contents
	public String getSodas(int soda) {
		soda_number = soda;
		String burger_string;
		burger_string = "Each soda has " + soda_fat + "g of fat, " + soda_carbs + "g of carbs, and " + soda_fiber + "g of fiber.";
		return(burger_string);
	}
	//Adds price of all items ordered and returns total
	public String getCost() {
		double total;
		String total_string;
		total = burger_number * burger_price + salad_number * salad_price + fries_number * fries_price + soda_number * soda_price;
		total_string = "Your order comes to: $" + total;
		return(total_string);
	}
	}
