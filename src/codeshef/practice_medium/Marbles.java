package practice_medium;

import java.util.Scanner;

public class Marbles {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int N=scan.nextInt();
			int k=scan.nextInt(),r;
			long pro=1;
			if(k-1>N-k)
				 r=N-k;
			else
				r=k-1;
		
			int z=1;
			int o=N-1;
			while(z<=r)
			{
				pro*=o;
				pro/=z;
				o--;
				z++;
				
			}
			
			System.out.println(pro);
		}
	}
	public static long fact(int x)
	{
		long pro=1;
		for(int i=1;i<=x;i++)
		{
			pro*=i;
		}
		System.out.println(pro);
		return pro;
	}
}
