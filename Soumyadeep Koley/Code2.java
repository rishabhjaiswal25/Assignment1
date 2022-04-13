import java.util.*;
public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Quantity Purchesed: ");
		int q=sc.nextInt();
		System.out.print("Price: ");
		double p=sc.nextDouble();		
		if(q>1000)
		{
			double a=(90*p)/100;
			double t=a*q;
			System.out.printf("Total Expenses: %.6f",t);
		}
		else
		{
			double t=p*q;
			System.out.print("Total Expenses: "+t);
		}
	}

}
