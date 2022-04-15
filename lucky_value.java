package assignment1;

import java.util.Scanner;

public class lucky_value 
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("a: ");
		int a=ip.nextInt();
		System.out.println("b: ");
		int b=ip.nextInt();
		if(a<13 && b<13)
		{
			int teenSum=a+b;
			System.out.println("teenSum: "+teenSum);
		}
		else
		{
			System.out.println("teenSum: "+19);
		}
	}

}