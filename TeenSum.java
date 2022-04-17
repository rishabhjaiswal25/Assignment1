class TeenSum
{
	public void teenSum(int a ,int b)
	{
		int teenSum=0;
		if((a>=13 && a<=19) || (b>=13 && b<=19))
		{
			teenSum = 19;
			System.out.println(teenSum);
		}
		else
		{
			teenSum = a+b;		
		}
	}
	public static void main(String args[])
	{
		TeenSum ts = new TeenSum();
		ts.teenSum(3,4);
	}
}
	