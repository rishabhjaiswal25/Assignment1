package new_package;
import java.util.*;
public class assign1prog6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the car no:");
		int a=sc.nextInt();
		if(a>999 && a<10000) {
			int n=a,sum=0;
			while(n>0) {
				sum+=n%10;
				n=n/10;
			}
			if((sum%3==0) || (sum%5==0) || (sum%7==0)){
				System.out.println("Lucky Number");
			}
			else {
				System.out.println("Sorry it is not my lucky number");
			}
		}
		else {
			System.out.println(a+" is not a valid number");	
		}
		
	}

}