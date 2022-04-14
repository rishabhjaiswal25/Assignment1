import java.util.*;
public class Discount{
  public static void main(String args[]){
    int Cur_Num;
    Scanner sc=new Scanner(System.in);
    Cur_Num=sc.nextInt();
    if(Cur_Num%2==1)
     Cur_Num=Cur_Num*3+1;
    else
     Cur_Num=Cur_Num/2;
    System.out.println("Current Number : "+Cur_Num);
}
}


   