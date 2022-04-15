package co.solution;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the cose of the chosen mobile phone");
		double cost=sc.nextDouble();
		if(cost<=15000)
		{
			System.out.println("Mobile chosen is within the budget");
		}
		else
		{
			System.out.println("Mobile chosen is beyond the budget");
		}

	}

}
