package new_pakage;
import java.util.*;
import java.lang.*;
import java.io.*;
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=ob.nextInt();
		System.out.println("enter the value of b:");
		int b=ob.nextInt();
		int sum=a+b;
		if(a>=13&&a<=19 || b>=13&&b<=19)
		{
			System.out.println("teensum= 19");
		}
		else {
			System.out.println("teensum= "+sum);
		}
		
	}

}
