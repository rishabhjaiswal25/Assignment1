import java.util.*;
class RoadSignalling
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner();
		String str = sc.nextline();
		
		switch (str) {
			case 'red':
				System.out.println("Stop");
				break;
			case 'green':
				System.out.println("Go");
				break;
			case 'yellow':
				System.out.pprintln("Proceed with caution");
				break;
			default:
				System.out.println("Prepare to go");
				break;
			