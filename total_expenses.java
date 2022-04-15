package assignment1;

import java.util.Scanner;

public class total_expenses 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quantity of purchased item");
		double quantity=sc.nextDouble();
		System.out.println("Enter the rate of per item ");
		double rate=sc.nextDouble();
		double total;
		total=quantity*rate;
		
		if(rate>1000)
		{
			double discount=(rate/10);
			total=rate-discount;
		}
		System.out.println("Total Expenses : "+total);
		
	}

}
