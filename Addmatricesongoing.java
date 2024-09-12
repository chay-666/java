import java.io.*;
import java.util.*;
public class Addmatricesongoing
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of first matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter order of second matrix : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r1][c1];
        if(r1!=r2 && c1!=c2)
        {
            System.out.println("Matrix addition is not possible");
            System.exit(0);
        }
    }
}
