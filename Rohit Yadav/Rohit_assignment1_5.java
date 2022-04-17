package new_Package;
import java.util.Scanner;

public class Rohit_assignment1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of of mobile which you chosen");
		double bud = sc.nextDouble();
		if(bud<=15000) {
			System.out.println("Mobile chosen is within the budget");
		}
		else {
			System.out.println("Mobile chosen is beyond the budget");
		}

	}

}
