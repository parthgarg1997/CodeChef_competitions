package jan18;

import java.util.Scanner;

public class Kconatination {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int N=scan.nextInt();
			int K=scan.nextInt();
			int x[]=new int[N];
			int sum=-1000000,max=-1000000,gmax=-1000000;
			for(int j=0;j<N;j++)
				x[j]=scan.nextInt();
			for(int j=0,l=0;j<N*K;j++,l++)
			{
				if(l==N)
					l=0;
				sum=sum+x[l];
				sum=Math.max(x[l], sum);
				//if(sum<0)
			//		{
					//if(j>=K)
					//	//break;
					//sum=0;
				//	}
				max=Math.max(max, sum);
			}
			System.out.println(max);
		}
	}
}
