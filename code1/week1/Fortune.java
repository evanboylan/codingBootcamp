//Ask the user for first name, last name, age, birth month as int, favorite ROYGBIV color, enter "Help" if non ROYGBIV color entered and list colors, number of siblings.

import java.util.Scanner;

class Fortune
{

	public static void main (String[] args)
	{
		String[] colorArray = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
		boolean dog = true;
		int check = 0;
		System.out.println("What is your first name?");
		Scanner inputScanner = new Scanner(System.in);
		String firstName = inputScanner.nextLine();
		//System.out.println("Hello " + firstName + ".");
		System.out.println("What is your last name?");
		String lastName = inputScanner.nextLine();
		//System.out.println("Hello " + firstName + " " + lastName + ".");
		System.out.println("What is your current age?");
		int age = inputScanner.nextInt();
		inputScanner.nextLine();
		//System.out.println(age);
		System.out.println("What month of the year were you born in? (Please input as a number.)");
		int month = inputScanner.nextInt();
		//System.out.println(month);
		inputScanner.nextLine();
		do
		{
			System.out.println("What is your favorite ROYGBIV color? (Please input Red, Orange, Yellow, Green, Blue, Indigo, or Violet.)");
			String color = inputScanner.nextLine();
			for (int i = 0;i < 7; i++)
			{
				if (colorArray[i] == color)
				{
					check++;
					System.out.println(colorArray[i]);
				}
				else if (check == 1)
				{
					dog = false;
				}
			}
		}
		while (dog == true);
		System.out.println("Enter the number of siblings that you have.");
		int siblings = inputScanner.nextInt();
	}

}
