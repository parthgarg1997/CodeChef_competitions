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
		int q=-1,maxp=1000000001;
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
				//System.out.println(max+" "+maxp);
				if((x[l][m]>max)&&(x[l][m]<maxp))
					max=x[l][m];
				//System.out.println(max+" "+maxp);

			}
			//System.out.println(max+" "+maxp);
			if(max!=0)
				{
				maxp=max;
				sum=(sum+max)%2147483647;
				}
			else
			{
				//System.out.println(-1);
				q=0;
				break;
			}
			//System.out.println(max+" "+maxp);
		}
		if(q==-1)
		System.out.println(sum);
		else
			System.out.println(-1);
	}
}
}
