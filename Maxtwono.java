import java.util.*;

public class Maxtwono
{
    public static void main(String args[])
        {
            int fno,sno;
            System.out.println("Enter fno");
            Scanner sc=new Scanner(System.in);
            fno=sc.nextInt();
            System.out.println("Enter sno");
            
            sno=sc.nextInt();
            if(fno==sno)
            {
                System.out.println("plz numer must be differnt");
            }
            else if(fno>sno)
            {
                System.out.println("fno is grether");
            }
            else
            {
                System.out.println(+sno+" is grether");
            }
            
            
        }
}