package october_challenge_2017;

import java.util.Scanner;

public class A_Balanced_contest {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int n=0;n<t;n++)
		{
			int a=0,b=0;
			int N=scan.nextInt();
			int P=scan.nextInt();
			//System.out.println(P);
			for(int i=0;i<N;i++)
			{
				int prob=scan.nextInt();
				//System.out.println(prob);
				if(prob<=(P/10))
					a++;
				else if(prob>=(P/2))
					b++;
			}
		//	System.out.println(a+" "+b);
			if(a==2&&b==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
