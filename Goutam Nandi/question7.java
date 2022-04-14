package new_pakage;
import java.util.*;
import java.io.*;
import java.lang.*;

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Color: ");
		String color=sc.next();
		sc.nextLine();
		switch(color)
		{
		case "green":
			System.out.println("Go");
			break;
		case "yellow":
			System.out.println("Proceed with caution");
			break;
		case "red":
			System.out.println("Stop");
			break;
		default:
			System.out.println("Prepare to Go");
			break;
		}
		
	}

}

