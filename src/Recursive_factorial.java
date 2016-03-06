import java.io.*;
import java.util.*;

class factorial
{
	int fun(int n)
	{
		if (n==1)
		{
			return 1;
		}
		else
		{
			
			int fact =fun(n-1)*n;
			return fact;
		}
		
	}
}
public class Recursive_factorial {
	
	public static void main(String args[])
	{
		System.out.println("Enter a Number");
		Scanner s=new Scanner(System.in);
		int val=s.nextInt();
		factorial f=new factorial();
		int ans=f.fun(val);
		System.out.println(ans);
	}
	
}

