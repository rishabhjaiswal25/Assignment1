package new_Package;
import java.util.Scanner;
public class Rohit_assignment1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the integer value a");
		int a = sc.nextInt();
		System.out.println("Write the integer value b");
		int b = sc.nextInt();
		int c = a + b;
		if(a >= 13 && a <=19){
			System.out.println("Given integer value is a teen number:");
			System.out.println("Output = 19");
			
		}
		else if(b>=13 && b<=19){
			System.out.println("Given integer value is a teen number:");
			System.out.println("Output = 19");
		}
		else {
			System.out.println("None of your given input is teen number:");
			System.out.println(c);
		}

	}

}
