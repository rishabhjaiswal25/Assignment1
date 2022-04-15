package assignment1;

import java.util.Scanner;

public class car_number 
{
	public static void main (String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the car number:");
        int num=input.nextInt();
        int sum=0;
        int n=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
            n++;	
        }
        if(n==4)
        {
            if(sum%3==0 || sum%5==0 || sum%7==0)
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
        	System.out.println("This is not a valid car number");
        }
    }
}
