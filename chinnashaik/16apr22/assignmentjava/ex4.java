import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("a : ");
		int a=s.nextInt();
		System.out.print("b : ");
		int b=s.nextInt();
		if((a>=13 && a<=19)||(b>=13 && b<=19)){
		    System.out.println("teen sum : 19");
		}
		else{
		    System.out.println("teen sum : "+(a+b));
		}
	}
}
