import java.util.Scanner;
class Main {
public static void main(String[] args) {
    
    int currentNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("currentNumber:");
    currentNumber=sc.nextInt();

if (currentNumber % 2 == 1)

     currentNumber = currentNumber*3+1;

else

    currentNumber = currentNumber/2;

    System.out.println("currentNumber: " +currentNumber );
}
}
