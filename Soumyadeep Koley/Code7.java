import java.util.*;
public class Code7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the color: ");
		String q=sc.next();
		if(q.equals("Green")||q.equals("green"))
		{
			System.out.print("Go");	
		}
		else if(q.equals("yellow")||q.equals("Yellow"))
		{
			System.out.print("proceed with caution");	
		}
		else if(q.equals("Red")||q.equals("red"))
		{
			System.out.print("Stop");	
		}
		else
		{
			System.out.print("prepare to go");
		}
		
	}

}
