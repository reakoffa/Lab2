import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) { 
		String userAnswer;
		
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter width of room:");
			double width = scan.nextDouble();
					
			System.out.println("Enter length of room:");
			double length = scan.nextDouble();
			
			double area = length * width;
			System.out.println("the area is " + area);
			
			double perimeter = (length + width) * 2;
			scan.nextLine();
			System.out.println("the perimeter is " + perimeter);
			
			System.out.println("Continue? Y/N: ");
			userAnswer = scan.nextLine(); 
		}
		while(userAnswer.equals("y"));
	}
}