package new_package;
import java.util.*;
public class assign1prog8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month : ");
		int month=sc.nextInt();
		if(month>=3 && month<=5) {
			System.out.print("Season : Spring");
		}
		else if(month>=6 && month<=8) {
			System.out.print("Season : Summer");
		}
		else if(month>=9 && month<=11) {
			System.out.print("Season : Autumn");
		}
		else if(month==12 || month<=2) {
			System.out.print("Season : Winter");
		}
		else {
			System.out.print("Invalid month");
		}
			

	}

}
