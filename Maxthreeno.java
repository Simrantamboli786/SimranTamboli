import java.util.*;

public class Maxthreeno
{
    public static void main(String args[])
        {
            int fno,sno,tno;
            System.out.println("Enter fno");
            Scanner sc=new Scanner(System.in);
            fno=sc.nextInt();
            System.out.println("Enter sno");
            
            sno=sc.nextInt();
            System.out.println("Enter tno");
            
            tno=sc.nextInt();
            if(fno==sno && sno==tno && fno==tno)
            {
                System.out.println("plz numer must be differnt");
            }
            else if(fno>sno && fno>tno)
            {
                System.out.println("fno is grether");
            }
            else if(sno>fno && sno>tno)
            {
                System.out.println(+sno+" is grether");
            }
            else if(tno>fno && tno>sno)
            {
                System.out.println(+tno+" is grether");
            }
            
            
            
        }
}