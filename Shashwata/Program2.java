package new_package;
import java.util.*;
public class assign1prog2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Quantity Purchased  ");
		int Quantity=sc.nextInt();
		System.out.print("Rate per item  ");
		double rpm=sc.nextDouble();
		if(Quantity>1000) {
			double cost=Quantity*rpm*0.9;
			System.out.println("Total Expenses  "+cost);
		}
		else {
			double cost=Quantity*rpm;
			System.out.println("Total Expenses  "+cost);
		}
	}

}
