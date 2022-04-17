public class Main
{
    public static void Cal_expenses(int a,double b){
    double cost=a*b;
    if(a>1000){
        cost=cost-(cost/10);
    }
    System.out.println("Total Expenses : "+cost);
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Qantity : ");
		int a=s.nextInt();
		System.out.print("Enter Rate per item : ");
		double b=s.nextDouble();
		Cal_expenses(a,b);
	}
}