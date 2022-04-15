package assignment1;

import java.util.Scanner;

public class mobile_budget 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the cost of the mobile: ");
		int cost=input.nextInt();
		if(cost<=15000)
		{
			System.out.println("Mobile chosen is within the budget");
		}
		else
		{
			System.out.println("Mobile chosen is beyond the budget");
		}
	}

}
