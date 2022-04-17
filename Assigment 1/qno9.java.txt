import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int grade=s.nextInt();
		if(grade>=0 && grade<=4){
		    System.out.println("fail");
		}
	    else if(grade == 5){
	        System.out.println("Approved");
	    }
	    else if(grade == 6){
	        System.out.println("Good");
	    }
	    else if(grade==7 || grade==8){
	        System.out.println("Notable");
	    }
	    else if(grade==9 || grade==10){
	        System.out.println("Excellent");
	    }
	    else{
	        System.out.println("Invalid");
	    }
	}
}