import java.util.*;
class LuckyNumber
{
	public static void main(String args[])
	{
		int n,digit,sum =0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(length(n) >= 4)
		{
			while(n>0)
			{
				digit = n%10;
				sum += digit;
				n =n/10;
			}
			
			if((sum % 3 == 0) || (sum % 5 == 0) || (sum % 7 == 0))
			{
				System.out.println("Lucky Number");
			}
			else
			{
				System.out.println("Sorry its not my lucky number");
			}
		}
		else
		{
			System.out.println(n + "is not a valid number");
		}
	}
}