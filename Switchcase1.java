import java.util.*;

public class Switchcase1
{
    public static void main(String args[])
    {
        int Num1, Num2 , Result;
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter the first number : ");
        Num1=sc.nextInt();

        System.out.print( " \n Enter the second number : ");
        Num2=sc.nextInt();

        System.out.println(" enter the your choice in between  + , - , * , % ");
        

        
       
        ch=sc.next().charAt(0);

        switch(ch)
        {
            case '+': 
                Result = Num1 + Num2;
                System.out.println( "Addition of two number is : " + Result);
            break;

            case '-': 
                Result = Num1 - Num2;
                System.out.println( "Substraction of two number is : " + Result);
            break;

            case '*': 
                Result = Num1 * Num2;
                System.out.println( "Multiplication of two number is : " + Result);
            break;

            case '%': 
                Result = Num1 % Num2;
                System.out.println( "Division of two number is : " + Result);
            break;

            default:
                System.out.println("Plz Enter valid OPtion");
                        

        }

    }
}