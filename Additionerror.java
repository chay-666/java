import java.io.*;
import java.util.*;
public class Additionerror
{
    int add(int x, int y){
        return x+y;
    }
    int add(int x, int y,int z)
    {
        return x+y;
    }
    int add(int x, float y)
    {
        return x+y;
    }
    float add(float x, float y)
    {
        return x+y;
    }
    float add(double x, double y)
    {
        return x+y;
    }
    public class Addition_Main
    {
        public static void main(String args[])
        {
           Addition a = new Addition();
           System.out.println("Sumof 5,10 is"+a.add(5,10));
           System.out.println("Sumof of 20,30,50 is"+a.add(20,30,50));
            System.out.println("Sumof of 5.5,7.7 is"+a.add(5.5,7.7));
        }
    }
    
}
