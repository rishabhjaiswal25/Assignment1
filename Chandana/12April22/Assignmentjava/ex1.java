package basic;

import java.util.Scanner;

public class IP_stmts {
	static int num1,num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sys=new Scanner(System.in);
		System.out.println("Enter Your Num1:");
		num1=sys.nextInt();
		System.out.println("Enter Your Num2:");
		num2=sys.nextInt();
		arithmetic(num1, num2);//calling function
	}

	private static void arithmetic(int num12, int num22) {
		// TODO Auto-generated method stub
		if(num12>0)
		{
			if(num22>0)
			{
				if(num12>=num22)
				{
					System.out.println("Yes its greater");
				}
				else
				{
					System.out.println("No its false");
				}
			}
			else
			{
				System.out.println("Num2 is lesser than 0");
			}
		}
		else
		{
			System.out.println("Num1 is lesser than 0");
		}
		
	}
	
/*	public static void arithmetic(int num1,int num2)//called function
	{
		boolean c=num1>num2;
		boolean d=num1<num2;
		boolean e=num1>=num2;
		boolean f=num1<=num2;
		boolean g=num1==num2;
		System.out.println(num1+" > "+num2+" = "+c);
		System.out.println(num1+" < "+num2+" = "+d);
		System.out.println(num1+" >= "+num2+" = "+e);
		System.out.println(num1+" <= "+num2+" = "+f);
		System.out.println(num1+" == "+num2+" = "+g);
	}
	*/
	

}
