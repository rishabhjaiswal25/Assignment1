package co.solution;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code");
		int code= sc.nextInt();
		if(code==1)
		{
			System.out.println("Enter the value of x and y");
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			double sum=x+y;
			System.out.println("Sum : "+sum);
		}
		
		else
		{
			System.out.println("Sum : 0.00");
		}
	}
}
