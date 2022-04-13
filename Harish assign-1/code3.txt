import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Current number : ");
		int a=s.nextInt();
		if(a%2 == 0){
		    System.out.println("Current Number : "+(a/2));
		}
		else{
		    System.out.println("Current Number : "+(a*3+1));
		}
	}
}