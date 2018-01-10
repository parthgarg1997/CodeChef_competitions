package sebtember_challenge_2017;

import java.util.Scanner;

public class Sereja_and_commands {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int T=scan.nextInt();
	for(int t=0;t<T;t++)
	{
		int n=scan.nextInt();
		int m=scan.nextInt();
		int arr[]=new int[n];
		int s_ans[][]=new int[n][m];
		for(int i=0;i<m;i++)
		{
			int c=scan.nextInt();
			int l=scan.nextInt();
			int r=scan.nextInt();
			if(c==1)
			{
				for(int j=l-1;j<r;j++)
					s_ans[j][i]++;
			}
			if(c==2)
			{
				for(int j=l-1;j<r;j++)
				{
					for(int k=0;k<n;k++)
					{
						s_ans[k][i]+=s_ans[k][j];
					}
				}
			}
		}
		int ans[] =new int[n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ans[j]+=s_ans[j][i];
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(ans[i]);
	}
}
}
