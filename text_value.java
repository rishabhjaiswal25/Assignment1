package assignment1;

import java.util.Scanner;

public class text_value 
{
	public static void main(String[] args)
	{
		Scanner sys=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sys.nextInt();
		
		if(num==9 || num==10)
		{
			System.out.println("Excellent");
		}
		else if(num==7 || num==8)
		{
			System.out.println("Notable");
		}
		else if(num==6)
		{
			System.out.println("Good");
		}
		else if(num==5)
		{
			System.out.println("Approved");
		}
		else if(num==0 || num==1 || num==2 || num==3 || num==4)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
