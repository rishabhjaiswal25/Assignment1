package new_pakage;
import java.util.*;
import java.lang.*;
import java.io.*;
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the CurrentNumber: ");
		int num=sc.nextInt();
		if(num%2!=0)
		{
			num=num*3+1;
			System.out.println("CurrentNumber= "+num);
		}
		else
		{
			num=num/2;
			System.out.println("CurrentNumber= "+num);
		}
		
	}

}
