import java.util.*;

public class Addno
{
    public static void main(String args[])
        {
            int fno,sno,res;
            System.out.println("Enter fno");
            Scanner sc=new Scanner(System.in);
            fno=sc.nextInt();
            System.out.println("Enter sno");
            
            sno=sc.nextInt();
            res=fno+sno;
            System.out.println("Addition of "+fno+"And"+sno+"="+res);
            
        }
}