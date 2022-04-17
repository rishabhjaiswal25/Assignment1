import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the month : ");
		int month=s.nextInt();
		if(month<1 || month>12){
		    System.out.println("Invalid month");
		}
	    else if(month>=3 && month<=5){
	        System.out.println("Spring");
	    }
	    else if(month>=6 && month<=8){
	        System.out.println("Summer");
	    }
	    else if(month>=9 && month<=11){
	        System.out.println("Autumn");
	    }
	    else{
	        System.out.println("Winter");
	    }
	}
}