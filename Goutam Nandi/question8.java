package new_pakage;
import java.util.*;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month :");
		int month=sc.nextInt();
		if(month==1 ||month==2||month==12)
		{
			System.out.println("Winter");
		}
		else if(month==3||month==4||month==5)
		{
			System.out.println("Spring");
		}
		else if(month==6|| month==7||month==8)
		{
			System.out.println("summer");
		}
		else {
			System.out.println("Auttum");
		}
	}

}
