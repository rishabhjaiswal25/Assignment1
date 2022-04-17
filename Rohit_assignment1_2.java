package new_Package;
import java.util.Scanner;

public class Rohit_assignment1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity and rate");
		int num1 = sc.nextInt();
		float num2 = sc.nextFloat();
		float num3 = num1 * num2;
		System.out.println("Total Expenses = "+num3);
		float dis = 0.10f;
		if(num1>1000) {
			System.out.println("Your total expense is more then 1000");
			System.out.println("You got 10% discount");
			dis = (num1 * num2) * dis;
			dis = num3 - dis;
			
			System.out.println("Final Total Expenses = "+dis);
		}
		else {
			System.out.println("Your total expense is less then 1000");
			System.out.println("No discount offer for you");
			dis = num1 * num2;
			System.out.println("Final Total Expenses = " +dis);
		}
		

	}

}
