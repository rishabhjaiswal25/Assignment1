package new_pakage;
import java.util.*;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=ob.nextInt();
		if(num<1000 || num>9999)
		{
			System.out.println(num+" not a valid car number.");
		}
		else {
			
		int sum=0;
		while(num!=0)
		{
         
         sum+=num%10;
         num=num/10;
		}
		if(sum%3==0 || sum%5==0||sum%7==0)
		{
			System.out.println("Lucky number.");
		}
		else {
			System.out.println("Sorry its not my lucky number.");
		}
	}

}
}
