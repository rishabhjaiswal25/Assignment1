package new_package;
import java.util.*;
public class assign1prog7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color");
		String s=sc.next();
		if (s.equals("green")==true) {
			System.out.println("Go");
		}
		else if(s.equals("red")==true) {
			System.out.println("Stop");
		}
		else if(s.equals("yellow")==true) {
			System.out.println("proceed with caution");
		}
		else {
			System.out.println("prepare to go");
		}

	}

}
