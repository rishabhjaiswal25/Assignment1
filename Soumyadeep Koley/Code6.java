import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the car number: ");
		int q=sc.nextInt();
		int i=0,s=0,t;
		while(q>0)
		{
			t=q%10;
			s=s+t;
			i=i+1;
			q=q/10;		
		}
		if(i==4)
		{
			
			if(s%3==0||s%5==0||s%7==0)
			{
			System.out.print("Lucky Number");
			}
			else
			{
				System.out.print("Sorry its not my lucky number");
			}
		}
		else
		{
			System.out.print(q+" is not a valid number");
		}		
	}
}
