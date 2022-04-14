import java.util.Scanner;
public class Main
{
    public static void sum(double a,double b){
    System.out.println("Sum : "+(a+b));
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		double a=s.nextDouble();
		System.out.print("Enter Num2 : ");
		double b=s.nextDouble();
		sum(a,b);
	}
}
