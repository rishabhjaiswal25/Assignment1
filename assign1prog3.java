package new_package;
import java.util.*;
public class assign1prog3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("currentNumber  ");
		int currentNumber=sc.nextInt();
		if (currentNumber%2!=0) {
			System.out.println("currentNumber: "+(3*currentNumber+1));
		}
		else {
			System.out.println("currentNumber: "+currentNumber/2);
		}
	}

}
