import java.util.*;
public class Code8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month: ");
		int q=sc.nextInt();
		if(q>=3&&q<=5)
		{
			System.out.print("Spring");	
		}
		else if(q>=6&&q<=8)
		{
			System.out.print("Summer");	
		}
		else if(q>=9&&q<=11)
		{
			System.out.print("Autumn");	
		}
		else if(q==12||q==1||q==2)
		{
			System.out.print("Winter");	
		}
		else
		{
			System.out.print("Invalid month");
		}	
	}
}
