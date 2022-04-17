import java.util.*;
public class PrintSum
{
	public void printSum(int X,int Y)
	{
		int Sum;
		Double d1 = Double.valueOf(X);
		Double d2 = Double.valueOf(Y);
		
		Sum = d1+d2;
		System.out.println(Sum);
	}
	public static void main(String args[])
	{
		int Code;
		Scanner sc = new Scanner(System.in);
		Code = sc.nextInt();

		PrintSum ps = new PrintSum();
		ps.printSum(3,4);

		if(Code == 1)
		{
			printSum();
		}
		else
		{
			System.out.println("Sum :0.00");
		