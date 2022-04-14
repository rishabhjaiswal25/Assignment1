import java.util.Scanner;

public class Main {
    static float code,p,q;
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code :");
		code=sc.nextFloat();
		System.out.println("Enter the x :");
		p=sc.nextFloat();
		System.out.println("Enter the y :");
		q=sc.nextFloat();
		arithmetic(code, p, q);
		

	}


	private static void arithmetic(float code, float p, float q) {
		if(code==1) {
			float sum = p+q;
			System.out.println("Sum of X and Y : "+sum);
			
			
		}
		else
			System.out.println("sum is : 0.00");
	}
}