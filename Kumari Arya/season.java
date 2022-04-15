package assignment1;

import java.util.Scanner;

public class season 
{
	public static void main(String[] args)
	{
		Scanner sys=new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int month=sys.nextInt();
		
		if(month>=3 && month<=5)
		{
			System.out.println("Spring");
		}
		else if(month>=6 && month<=8)
		{
			System.out.println("Summer");
		}
		else if(month>=9 && month<=11)
		{
			System.out.println("Autumn");
		}
		else if(month==1 && month==2 && month==12)
		{
			System.out.println("Winter");
		}
		else
		{
			System.out.println("Invalid month");
		}
	}

}
