import java.util.*;




import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the currentNumber :");
		int i = sc.nextInt();
		
		if((i%2) != 0) {
			i= (i*3)+1;
			System.out.println("currentNumber is :"+i);
			
		}
		else {
			i= i/2;
			System.out.println("currentNumber is :"+i);
		}

	}

}
