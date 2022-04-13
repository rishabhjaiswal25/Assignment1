package new_package;
import java.util.*;
public class assign1prog5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the cost of the mobile ");
		double a=sc.nextDouble();
		if(a<=15000) {
			System.out.println("Mobile chosen is within the budget");
		}
		else {
			System.out.print("Mobile chosen is beyond the budget");
		}

	}

}
