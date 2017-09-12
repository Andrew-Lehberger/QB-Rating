import java.util.Scanner;
public class Rating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of Touchdowns");
		int TD = input.nextInt();
		
		System.out.print("Enter the amount of Passing Yards");
		int Yards = input.nextInt();
		
		System.out.print("Enter the amount of Interceptions");
		int INT = input.nextInt();
		
		System.out.print("Enter the amount of Completions");
		int Comp = input.nextInt();
		
		System.out.print("Enter the amount of Attempts");
		int ATT = input.nextInt();
		
		double a = ((double)Comp / ATT - 0.3) * 5;
		double b = ((double)Yards / ATT - 3) * .25;
		double c = ((double)TD / ATT) * 20;
		double d = 2.375 - ((double)INT / ATT * 25);
		double passerrating = ((a + b + c + d) / 6) * 100;
		
		System.out.println("The Passer Rating is " + passerrating);
				}

}



