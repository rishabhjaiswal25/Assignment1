import java.util.*;
public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the cost of the mobile: ");
		int q=sc.nextInt();
		if(q<=15000)
		{
			
			System.out.print("Mobile choosen is within budget");
		}
		else
		{
			System.out.print("Mobile chosen is beyond the budget");
		}
		
	}

}
