package new_Package;
import java.util.Scanner;

public class Rohit_assignment1_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		if(mon>=3 && mon<=5) {
			System.out.println("Season:Spring");
		}
		else if(mon>=6 && mon<=8) {
			System.out.println("Season:Summer");
		}
		else if(mon>=9 && mon<=11) {
			System.out.println("Season:Autumn");
		}
		else if(mon==1 || mon==2 || mon==12) {
			System.out.println("Season:Winter");
		}
		else {
			System.out.println("Invalid month");
		}

	}

}
