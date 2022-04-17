package new_Package;
import java.util.Scanner;
public class Rohit_assignment1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color");
		String col = sc.nextLine();
		if(col=="green") {
			System.out.println("Go");
			
		}
		else if(col=="red") {
			System.out.println("Stop");
		}
		else if(col=="yellow") {
			System.out.println("proceed with caution");
		}
		if(col=="white") {
			System.out.println("prepare to go");
		}
		

	}

}
