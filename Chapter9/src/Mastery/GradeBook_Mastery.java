package Mastery;

public class GradeBook_Mastery {
	
	private double grades[][];
	
	//Constructor sets student and test numbers
	public GradeBook_Mastery(int students, int tests) {

	}
	//Method changes the grade of a test for a specific student
	public void getGrades(int student, int test, int grade) {
		grades[student][test] = grade;
	}
	//Returns the entire array of grades
	public void showGrades() {
	}
	//Returns the average grade of one student
	public double studentAvg(int student) {
		double average = (grades[student][0] + grades[student][1] + grades[student][2] + grades[student][3] + grades[student][4]) / 5;
		return(average);
	}
	//Returns the average grade of all students for one test
	public double testAvg(int test) {
		double average = (grades[0][test] + grades[1][test] + grades[2][test] + grades[3][test] + grades[4][test] + grades[5][test] + grades[6][test] + grades[7][test] + grades[8][test] + grades[9][test] + grades[10][test] + grades[11][test]) / 12;
		return(average);
	}
	

}
