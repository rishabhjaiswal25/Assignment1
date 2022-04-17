import java.util.*;
public class main {

    public static void expenses(int a,double b){
        double c=a*b;
        if(a>1000){
            c=c-(c/10);
        }
        System.out.println("Total Expenses : "+c);
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int quantity=s.nextInt();
        System.out.print("Enter Rate : ");
        double rate=s.nextDouble();
        expenses(quantity,rate);

         }
}
