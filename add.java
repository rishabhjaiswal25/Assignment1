package assignment1;

import java.util.Scanner;

public class add 
{
	public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the code:");
		int code= input.nextInt();
		if(code==1)
		{
		    System.out.print("Value for x: ");
		    double x = input.nextDouble();
		    System.out.print("Value for y: ");
		    double y = input.nextDouble();
		    double sum = x + y;
		    System.out.println("Sum: "+sum);
		    
		}
		else
		{
			System.out.println("Sum : 0.00");
		}
    }

}
