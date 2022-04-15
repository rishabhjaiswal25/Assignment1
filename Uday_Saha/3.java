package co.solution;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int currentNumber=sc.nextInt();
		if(currentNumber%2!=0)
		{
			currentNumber=(currentNumber*3)+1;
			System.out.println("Current Number : "+currentNumber);
		}
		else
		{
			currentNumber=(currentNumber/2);
			System.out.println("Current Number : "+currentNumber);
			
		}

	}

}
