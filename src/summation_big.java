import java.io.*;
import java.util.Scanner;



class summation
{
	long fun2(long n)
	{
		if (n==1)
		{
			return 1;
		}
		else
		{
			
			long fact =fun(n-1)+n;
			return fact;
		}
		
	}
}




public class summation_big {
	
	public static void main(String s[])
	{
		System.out.println("Enter a big number");
		Scanner s1=new Scanner(System.in);
		long val=s1.nextInt();
		summation f=new summation();
		long ans=f.fun2(val);
		System.out.println(ans);
	}
}
