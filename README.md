### This is a simple Java console app that convert quarts to gallons

## Briefly introduction: 
Reference: https://www.calculatorful.com/quarts-to-gallons 

The quart is a measurement unit of volume used in the US customary system and the British imperial system. The unit can be abbreviated as qt. A quart equals 2 pints. US liquid and dry quarts are equivalent to approximately 0.95 liter and 1.1 liters respectively, and an imperial quart is 1.13 liters.

A gallon is a measurement unit of volume used in the US customary system and the British imperial system equal to 4 quarts, 8 pints, 3.79 - 4.55 liters. It is commonly used to measure the volume of liquid products, especially fuels for vehicles in the USA


### How to convert [quarts to gallons](https://www.calculatorful.com/quarts-to-gallons)

There are 4 quarts in a gallon, or a quart equals a quarter of a gallon, which explains its unit name, a quart. For example, 4 quarts equal to:
```
4 / 4 = 1 (gal)
```

## A simple Java program to generate a conversion table
```
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

		gallons = (float) quarts / QUARTS_IN_GALLON;

		System.out.println(quarts + " quart(s) equal to " + gallons + " gallon(s)");
	}
}
```