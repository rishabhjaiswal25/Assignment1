import java.util.*;
public class Code9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int q=sc.nextInt();
		if(q>=0&&q<=4)
		{
			System.out.print("Fail");	
		}
		else if(q==5)
		{
			System.out.print("Approved");	
		}
		else if(q==6)
		{
			System.out.print("Good");	
		}
		else if(q==7||q==8)
		{
			System.out.print("Notable");	
		}
		else if(q==9||q==10)
		{
			System.out.print("Excellent");	
		}
		else
		{
			System.out.print("Invalid ");
		}	
	}
}
