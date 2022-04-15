package co.solution;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items purchased");
		double quantity=sc.nextDouble();
		System.out.println("Enter the rate of per item ");
		double rate=sc.nextDouble();
		double amount;
		if(rate>1000)
		{
			double price=quantity*rate;
			amount=price-(0.10*price);
			System.out.println("Total Expenses : "+amount);
		}
		else {
			amount=quantity*rate;
			System.out.println("Total Expenses : "+amount);
			
		}



	}

}
