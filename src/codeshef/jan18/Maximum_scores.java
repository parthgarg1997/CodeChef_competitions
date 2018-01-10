package jan18;

import java.util.Scanner;

public class Maximum_scores {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int T=scan.nextInt();
	for(int i=0;i<T;i++)
	{
		int sum=0;
		int q=-1,maxp=-1;
		int N=scan.nextInt();
		int x[][]=new int[N][N];
		for(int l=0;l<N;l++)
		{
			for(int m=0;m<N;m++)
			{
				x[l][m]=scan.nextInt();
			}
		}
		for(int l=N-1;l>=0;l--)
		{
			int max=0;
			
			for(int m=0;m<N;m++)
			{
				if(x[l][m]>max&&max<maxp)
					max=x[l][m];
			}
			System.out.println(max+" "+maxp);
			if(max!=0)
				{
				maxp=max;
				sum+=max;
				}
			else
			{
				System.out.println(-1);
				q=0;
				break;
			}
		}
		if(q==-1)
		System.out.println(sum);
	}
}
}
