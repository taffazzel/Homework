package proj2;
import java.io.*;
import java.util.*;

class factorial_2
{
	long fun(int n)
	{
		if (n==1)
		{
			return 1;
		}
		else
		{
			
			long fact =fun(n-1)*n;
			return fact;
		}
		
	}
}
public class factorialnumbers
{
	
	public static void main(String args[])
	{
		System.out.println("Factorial from 1 to 20");
		//Scanner s=new Scanner(System.in);
		//int val=s.nextInt();
		factorial_2 f=new factorial_2();
		int i=1;
		while(i<=20)
		{
			
		
			long ans=f.fun(i);
			System.out.println("factorial of"+ i+ "is "+ ans);
			System.out.println();
			i++;	
		}
	}
	
}
