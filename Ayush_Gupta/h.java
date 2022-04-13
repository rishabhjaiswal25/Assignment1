import java.util.Scanner;

    

   public class Main{

        

      public static void main(String[] args){

           

         Scanner sc=new Scanner(System.in);

         System.out.println("Enter the color");

         String color=sc.next();

        sc.nextLine();

        if(color=="green")

         {
             System.out.println("go");

       }

        else if(color=="red")

         {

             System.out.println("stop");

         }

       else if(color=="yellow")

         {

             System.out.println("proceed with caution");

         }

         else

         {

             System.out.println("prepare to go");

         }

      }

   }