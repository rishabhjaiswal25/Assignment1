package co.solution;
import java.uitl.*;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 digit number");
		int n=sc.nextInt();
		int sum=0,digit;
		int c=0;
		while(n > 0)  
		{    
		digit = n % 10;  
		sum = sum + digit;   
		n = n / 10;  
		c++;
		}  
		if(c==4)
		{
			if(sum%3==0 || sum%5==0 || sum%7==0)
			{
				System.out.println("Lucky number");
			}
			else {
				System.out.println("Sorry its not a lucky number");
			}
		}
		else {
			System.out.println("Car number is not of 4 digits");
		}
	}

}
