package assignment1;

import java.util.Scanner;

public class oddsum 
{
	public static void main(String[] args)
	{
		Scanner nw=new Scanner(System.in);
		System.out.println("Enter the currentNumber:");
		int currentNumber=nw.nextInt();
		if (currentNumber % 2 !=0)
		{
			currentNumber = (currentNumber*3)+1;
		}
		else
		{
			currentNumber = (currentNumber)/2;
		}
		System.out.println("Value: "+currentNumber);
	}
}
