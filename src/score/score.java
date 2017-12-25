package score;

import java.util.Scanner;

public class score {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input the score: ");
		System.out.println("Yout letter grade is " + letterGrade(scanner.nextInt()) + ".");
	}
	
	public static char letterGrade(int score) {
		char grade;
		if (score < 0 || score > 100)
			grade = 'X';
		else if (score >= 90 && score <= 100)
			grade = 'A';
		else if (score >= 80 && score < 90)
			grade = 'B';
		else if (score >= 70 && score < 80)
			grade = 'C';
		else if (score >= 60 && score < 70)
			grade = 'D';
		else
			grade = 'F';
		
		return grade;
	}
}
