public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("current Number: ");
		int q=sc.nextInt();
		if(q%2==0)
		{
			int a=q/2;
			System.out.print("Current Number: "+a);
		}
		else
		{
			int a=(3*q)+1;
			System.out.print("Current Number: "+a);
		}
		
	}

}
