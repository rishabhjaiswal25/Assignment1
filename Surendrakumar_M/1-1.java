import java.util.Scanner;
public class assignment1 {
	 
	public static void main(String[] args) {
    Scanner sys=new Scanner(System.in);
    System.out.println("Enter the CODE: ");
    int code=sys.nextInt();
    if(code==1)
    {
    	Scanner num1=new Scanner(System.in);
    	System.out.println("Enter value of X: ");
    	float x=num1.nextFloat();
    	Scanner num2=new Scanner(System.in);
    	System.out.println("Enter value of Y: ");
    	float y=num2.nextFloat();
    System.out.println("Sum of two numbers= "+ Float.sum(x,y));
    }
    else {
    	System.out.println("Sum=0.00");
    }
    
	}
}