import java.util.Scanner;

public class AreaCalculator {
	private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user

		var ch=new AreaCalculator();
		int choice = ch.scanner.nextInt();
		ch.calculateAreaOfFence(choice);
        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it

    }

    // Function to calculate area of fence by calling respective methods according to user's choice
    public void calculateAreaOfFence(int choice) {
		if(choice==1)
		{
			System.out.println("Enter side of square :");
			double side = scanner.nextDouble();

			double a = calculateAreaOfSquare(side);
			System.out.println ("Area of square fence for chickens is " + a);
		}
		else if(choice==2)
		{
			System.out.println("Enter radius of circle :");
			double radius = scanner.nextDouble();

			double b = calculateAreaOfCircle(radius);
			System.out.println ("Area of circle fence for ducks is " + b);
		}
		else if(choice==3)
		{
			System.out.println("Enter length of rectangle :");
			double length = scanner.nextDouble();
			System.out.println("Enter breadth of rectangle :");
			double breadth = scanner.nextDouble();

			double c = calculateAreaOfRectangle(length, breadth);
			System.out.println ("Area of rectangle fence for cowss is " + c);
		}
    }

    // Function to calculate area of square
    public double calculateAreaOfSquare(double side) {
		double val=side*side;
        return val;
    }

    // Function to calculate area of circle
    public double calculateAreaOfCircle(double radius) {
		double res=3.14*radius*radius;
        return res;
    }

    // Function to calculate area of rectangle
    public double calculateAreaOfRectangle(double length, double breadth) {
		double prod=length*breadth;
        return prod;
    }
}
