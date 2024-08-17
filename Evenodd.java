import java.util.*;

public class Evenodd
{
    public static void main(String args[])
    {
        int num;
        System.out.print("Enter the number for check num even or odd");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num==0)
        {
            System.out.println("Plz Entrer the positive number");

        }
        else if(num%2==0)
        {
            System.out.println(num+"  number is even");

        }
        else{
            System.out.println(num+" number is odd");
        }
    }
}