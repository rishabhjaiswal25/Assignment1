import java.util.*;
public class main {
    public static void sum(double a,double b){
        System.out.println("Sum : "+(a+b));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        double input1=s.nextDouble();
        System.out.print("Enter Num2 : ");
        double input2=s.nextDouble();
        sum(input1,input2);


         }
}