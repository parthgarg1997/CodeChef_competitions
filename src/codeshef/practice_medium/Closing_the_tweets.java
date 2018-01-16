package practice_medium;

import java.util.Scanner;

public class Closing_the_tweets {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int K=scan.nextInt();
		int x[]=new int[N+1];
		int ans=0;
		for(int i=0;i<K;i++)
		{
			String mode=scan.next();
			
			
			if(mode.equals("CLICK"))
			{
				int pos=scan.nextInt();
				if(x[pos]==0)
				{
					ans+=1;
					x[pos]=1;
				}
				else
				{
					ans-=1;
					x[pos]=0;
				}
			}
			else
			{
				x=new int[N+1];
				ans=0;
			}
			System.out.println(ans);
		}
	}
}
