import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter width of room:");
			double width = scan.nextDouble();
					
			System.out.println("Enter length of room:");
			double length = scan.nextDouble();
			
			double area = length * width;
			System.out.println("the area is " + area);
			
			double perimeter = (length + width) * 2;
			System.out.println("the perimeter is " + perimeter);
			
			System.out.println("Continue? Y/N");
		}
		
	
	}
}