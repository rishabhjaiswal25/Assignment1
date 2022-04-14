package new_pakage;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerical value :");
		int num=sc.nextInt();
	if(num<=10) 
	{	
		if (num==9||num==10)
		{
			System.out.println("Excellent ");
		}
		else if (num==7 || num==8)
		{
			System.out.println("Notable");
		}
		else if (num==6)
		{
			System.out.println("Good ");
			
		}
		else if (num==5)
		{
			System.out.println("aproved");
		}
		else
		{
			System.out.println("Fail");
			
		}
		
	}
	else {
		System.out.println("invalid");
	}
 }
}
