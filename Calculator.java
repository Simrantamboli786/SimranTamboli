import java.util.*;

public class Calculator
{
    public static void main(String args[])
    {
        char ch;
        int Num1=40,Num2=50,Res;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter your choice: ");
        ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+':
                Res = Num1+Num2;
                System.out.println("Addition = " + Res);
                break;
            case 2:
                Res = Num1 - Num2;
                System.out.println("Substraction = " + Res);
                break;
            case 3:
                Res = Num1 * Num2;
                System.out.println("MULTIPLICATION = " + Res);
                break;
            case 4:
                Res = Num1 % Num2;
                System.out.println("division = " + Res);
                break;
            
            default:
                System.out.println("Plz Enter  the coice is coreect");
        }
    }
}