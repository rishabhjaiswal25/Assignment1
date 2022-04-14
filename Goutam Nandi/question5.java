package new_pakage;
import java.util.*;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the cost of the mobile: ");
		int a=sc.nextInt();
		if(a<=15000) {
			System.out.println("MOBILE CHOOSEN IS WITHIN THE BUDGET.");
		}
		else {
			System.out.println("MOBILE CHOOSEN IS BEYOND THE BUDGET.");
		}
	}

}
