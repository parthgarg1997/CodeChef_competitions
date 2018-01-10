package october_challenge_2017;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Max_mex2 {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt(),z=0,pz=0;
		for(int n=0;n<t;n++)
		{
			int N=scan.nextInt();
			int K=scan.nextInt();
			int s[]=new int[N];
			for(int i=0;i<N;i++)
				s[i]=scan.nextInt();
			Arrays.sort(s);
			int q=0;
			z=0;
			pz=0;
			while(q<N)
			{
				z=s[q]-q-pz;// 2 3 5 7 9
				if(z<=K)
				K=K-z;
				else 
					break;
				pz+=z;
				q++;
			}
			//System.out.println(K +" "+q);
			
				if(q==0)
					System.out.println(K);
				else
				{
					System.out.println(s[q-1]+K+1);
				}
			
		}
	}
}


