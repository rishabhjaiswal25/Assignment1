import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
         Scanner sc=new Scanner(System.in);
         int TEST = sc.nextInt();
         while(TEST-->0)
         {
             int p=sc.nextInt();
             int q=sc.nextInt();
             float dis=p*q;
             if(p>1000)
             {
                 dis=dis-(dis/10);
                 System.out.println(dis);
             }
             else
             {
                 System.out.println(dis);
             }
         }
    }
}






































