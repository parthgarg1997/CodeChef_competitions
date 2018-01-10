package kIIT_coding_weekend;
import java.util.Scanner;
public class primeGenertorbySieveofEratosthenes {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int i=0,j,m;
	int q,t,listc=0;
	boolean list[]=new boolean[(32001)];
	int primearray[]=new int[3432];
	for(int k=2;k<=32000;k++)
	{
		if(list[k]==false)
		{
			primearray[i]=k;
			i++;
			for( m=k;m<=32000;m+=k)
			{
				list[m]=true;
			}
		}
	}
	t=scan.nextInt();
	
	for(i=0;i<t;i++)
	{
		int start=scan.nextInt();
		if(start==1)
		start++;
		if(start==2)
			System.out.println(2);
		if(start%2==0)
			start++;
		int end=scan.nextInt();
		for(j=start;j<=end;j+=2)
		{    q=0;
			
		
			double re=Math.sqrt(j);
			for(m=0;primearray[m]<=re;m++)
			{
				if(j%primearray[m]==0)
				{
					q=-1;
					break;
				}
			}
			if(q ==0)
			{
				System.out.println(j);
			}
		
					
		}
		System.out.println();
	}
}
}
