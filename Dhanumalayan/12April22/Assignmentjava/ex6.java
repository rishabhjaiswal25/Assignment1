import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the bike no : ");
		int num=s.nextInt();
		int temp=num;
		int sum=0,count=0;
		while(temp!=0){
		    count+=1;
		    int rem=temp%10;
		    sum=sum+rem;
		    temp=temp/10;
		}
		if(count!=4){
		    System.out.println(num+" is not a valid bike number");
		}
		else if((sum%3==0)||(sum%5==0)||(sum%7==0)){
		    System.out.println("fav Number");
		}
		else{
		    System.out.println("Sorry its not my fav number");
		}
	}
}
