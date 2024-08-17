import java.util.*;

public class TableReverse
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter the number: ");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();

        for(int i=10;i>=1;i--)
        {
            System.out.println( num + " * " + i + " = " + num * i);
        }
    }


}
