package new_package;
import java.util.*;
public class assign1prog9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==9 ||a==10) {
			System.out.print("Excellent");
		}
		else if(a==7 ||a==8) {
			System.out.print("Notable");
		}
		else if(a==6) {
			System.out.print("Good");
		}
		else if(a==5) {
			System.out.print("Approved");
		}
		else if(a>=0 && a<=4) {
			System.out.print("Fail");
		}
		else {
			System.out.print("Invalid");
		}	

	}

}
