import java.io.*;
import java.util.*;
public class Evenodd
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter an positive interger:");
	num=sc.nextInt();
	if(num%2==0)
	{
	System.out.println(num+"is a even integer");
	}
	else
	{
	System.out.println(num+"is odd integer");
	}
}
}
