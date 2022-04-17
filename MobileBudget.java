import java.util.Scanner;
class MobileBudget
{
	public static void main(String args[])
	{
		int mB;
		Scanner sc = new Scanner();
		mB = sc.nextInt();
	
		if(mB < 15000)
		{
			System.out.println("Mobile Choosen is within the budget");
		}
		else
		{
			System.out.println("Mobile Choosen is beyond the budget");
		}
	}
}