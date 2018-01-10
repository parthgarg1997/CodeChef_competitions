package october_challenge_2017;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Max_mex {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt(),z=0;
		for(int n=0;n<t;n++)
		{
			int N=scan.nextInt();
			int K=scan.nextInt();
			int s[]=new int[N+1];
			 s[0]=-1;
			for(int i=1;i<=N;i++)
				s[i]=scan.nextInt();
			Arrays.sort(s);
			int q=1;
			int r=0;
			while(q<=N)
			{
				r=s[q]-s[q-1];
				
				if(K>=(r-1))
				{
					if(r>=2)
				K=K-r+1;
				}
				else
					break;
				
				q++;
			}
			//System.out.println(s[q-1]+ " "+K);
			if((q-1)==0)
				System.out.println(0+K);
			else
			System.out.println(s[q-1]+K+1);
		}
	}
}


