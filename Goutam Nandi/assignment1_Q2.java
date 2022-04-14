package new_pakage;

import java.util.*;

import java.lang.*;

import java.io.*;

public class assignment1_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the quantity: ");
		int q=sc.nextInt();
		
		Scanner r=new Scanner(System.in);
		
		System.out.println("enter the rate per items ");
		
		float rate=r.nextFloat();
		
		float total_expenses=(q*rate);
		
		if(q>1000) 
		{
			
			total_expenses=(total_expenses-(total_expenses/10));
		
			System.out.println("Total Expenses is :"+total_expenses);
		
		}
		else {
			
			System.out.println("Total Expenses is :"+total_expenses);
		}
	}

}
