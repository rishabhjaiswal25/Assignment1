package new_package;
import java.util.*;
public class assign1prog4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("a : ");
		int a=sc.nextInt();
		System.out.print("b : ");
		int b=sc.nextInt();
		if ((a>=13 && a<=19) || (b>=13 && b<=19)) {
			System.out.println("teenSum  "+19);
		}
		else {
			System.out.println("teenSum  "+(a+b));
		}
	}

}
