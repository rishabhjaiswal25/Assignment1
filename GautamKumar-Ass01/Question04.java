import java.util.*;
public class main {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print(" Enter num1 : ");
        int num1=s.nextInt();
        System.out.print("Enter num2 : ");
        int num2=s.nextInt();
        if((num1>=13 && num1<=19)||(num2>=13 && num2<=19)){
            System.out.println("teen sum : 19");
        }
        else{
            System.out.println("teen sum : "+(num1+num2));
        }

         }
}
