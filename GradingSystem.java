import java.util.*;
class GradingSystem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		
		if( n== 9 ||n== 10)
		{
			System.out.println("Excellent");
		}
		else if(n == 7 || n==8)
		{
			System.out.println("Notable");
		}
		else if(n==6)
		{
			System.out.println("Good");
		}
		else if(n==5)
		{
			System.out.println("Approved");
		}
		else if (n>=0 && n<=4)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}