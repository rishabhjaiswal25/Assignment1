import java.util.*;
public class main {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the colour : ");
        String st=s.nextLine();
        switch(st){
            case "red" : System.out.println("Stop");
                break;
            case "yellow" : System.out.println("proceed with caution");
                break;
            case "green" : System.out.println("Go");
                break;
            default : System.out.println("prepare to go");
        }
         }
}
