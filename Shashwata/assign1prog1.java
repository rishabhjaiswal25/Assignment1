package new_package;
import java.util.*;

public class assign1prog1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Code   ");
		int code=sc.nextInt();
		if(code==1) {
			System.out.print("X   ");
			double a=sc.nextDouble();
			System.out.print("Y   ");
			double b=sc.nextDouble();
			double sum=a+b;
			System.out.println("Sum "+sum);
		}
		else {
			System.out.println("Sum "+0.00);
		}	
		
	}

}
