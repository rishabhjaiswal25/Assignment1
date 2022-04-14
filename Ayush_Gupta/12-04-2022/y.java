import java.util.*;
public class Main{
    
public static void main (String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number :");
    int num= sc.nextInt();
    if(num>=0 && num<=4)
    {
        System.out.println("Fail");
        
    }
    else if(num==5)
    {
       System.out.println("Approved"); 
    }
    else if(num==6)
    {
       System.out.println("Good"); 
    }
    else if(num==7 || num==8)
    {
        System.out.println("Notable");
    }
    else if(num>=10)
    {
        System.out.println("Invalid");
    }
    
}
}