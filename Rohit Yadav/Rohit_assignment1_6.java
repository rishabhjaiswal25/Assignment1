package new_Package;
import java.util.Scanner;

public class Rohit_assignment1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car no: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int sum = num1 + num2 + num3 + num4;
		if(sum%3==0 || sum%5==0 || sum%7==0) {
			System.out.println("Lucky Number");
		}
		else if(sum%3!=0 || sum%5!=0 || sum%7!=0){
			System.out.println("Its not a Lucky Number");
		}
		else {
			System.out.println("Its no a valid car number");
		}
		
		

	}

}
