import java.util.*;
class MonthSeason
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
	
		Dictionary d  = new Hashtable();
		d.put(1,"January");
		d.put(2,"February");
		d.put(3,"March");	
		d.put(4,"April");
		d.put(5,"May");
		d.put(6,"June");
		d.put(7,"July");
		d.put(8,"August");
		d.put(9,"September");
		d.put(10,"October");
		d.put(11,"November");
		d.put(12,"December");
		
		if(d >=3 && d<=5)
		{
			System.out.println("Spring");
		}
		else if(d>=6 && d<=8)
		{
			System.out.println("Summer");
		}
		else if((d>=9 && d<=11) 
		{
			Sysetm.out.println("Autumn");
		}
		else if(d == 12 || d==1 || d==2)
		{
			Sysetm.out.println("Winter');
		}
		else
		{
			System.out.println("Invalid Month");
		}
	}
}