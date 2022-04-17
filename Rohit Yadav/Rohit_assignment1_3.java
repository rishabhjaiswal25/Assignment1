package new_Package;
import java.util.Scanner;

public class Rohit_assignment1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the number ");
		int num = sc.nextInt();
		if(num%2 != 0) {
			System.out.println("Given number is odd");
			int tot = (num*3) + 1;
			System.out.println("Final current outout : "+tot);
		}
		else {
			System.out.println("Given number is even");
			int tot = num /2;
			System.out.println("Final current output : "+tot);
		}

	}

}
