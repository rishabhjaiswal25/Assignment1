import java.util.*;
public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Code   ");
		int code=sc.nextInt();
		if(code==1) {
			System.out.print("X   ");
			double a=sc.nextDouble();
			System.out.print("Y   ");
			double b=sc.nextDouble();
			double sum=a+b;
			System.out.printf("Sum %.2f",sum);
		}
		else {
			System.out.printf("Sum %.2f ",0.00);
		}	
	}

}

