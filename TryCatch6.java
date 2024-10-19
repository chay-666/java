import java.io.*;
import java.util.Scanner;
class TryCatch6
{
    public static void main(String args[])
    {
        int a=5,b=0,c;
        int arr[]=new int[5];
        String str=null;
        try
        {
            c=a/b;
            arr[10]=200;
            System.out.println("The length of the string is "+ str.length());
        }
        catch(NullPointerException npe)
        {
            System.out.println("NullPointerException caught");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("ArithmeticException caught ");
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}
