import java.util.*;
public class Mobile{
   public static void main(String args[]){
      int a;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
     if(a<=15000)
       System.out.println("Mobile chosen is within the budget");
     else
       System.out.println("Mobile chosen is  beyond the budget");
}
}
