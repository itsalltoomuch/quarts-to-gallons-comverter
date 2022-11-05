import java.util.Scanner;

public class QuartsToGallons
{
	public static void main(String[] args) 
	{
		final int QUARTS_IN_GALLON = 4;

		int quarts;
		int gallons;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number of quarts: ");
		quarts = keyboard.nextInt();

		gallons = (float)quarts / QUARTS_IN_GALLON;

		System.out.println(quarts + " quart(s) equal to " + gallons + " gallon(s)");
	}
}