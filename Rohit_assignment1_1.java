package new_Package;
import java.util.Scanner;
public class Rohit_assignment1_1 {

	public static void main(String[] args) {
		System.out.println("Enter code");
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		if(code==1) {
			System.out.println("Enter the value of x: ");
			double x =sc.nextDouble();
			System.out.println("Enter the value of y: ");
			double y = sc.nextDouble();
			double sum = x + y;
			System.out.println("Sum = "+sum);
		}
		else {
			System.out.println("Sum :0.00");
		}

	}

}
