import java.util.*;
public class main {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter Current number : ");
        int num1=s.nextInt();
        if(num1%2 == 0){
            System.out.println("Current Number : "+(num1/2));
        }
        else{
            System.out.println("Current Number : "+(num1*3+1));
        }

         }
}
