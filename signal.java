package assignment1;

import java.util.Scanner;

public class signal 
{
	public static void main(String[] args)
	{
		Scanner sys=new Scanner(System.in);
		System.out.println("Enter the colour: ");
		String signal=sys.next();
		switch(signal)
		{
		case "red":
			System.out.println("stop");
			break;
		case "green":
			System.out.println("go");
			break;
		case "yellow":
			System.out.println("proceed with caution");
			break;
		default:
			System.out.println("prepare to go");
			break;
		
		}
	}

}
