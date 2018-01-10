package sebtember_challenge_2017;

import java.util.Scanner;

public class Minimum_good_permutation {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int n=scan.nextInt();
			if(n%2==0)
			{
				System.out.println(2);
				System.out.println(1);
				int k=1;
			for(int j=3;j<=n;j+=2)
			{
				k+=3;
				System.out.println(k);
				k-=1;
				System.out.println(k);
			}
			}
			else
			{
				System.out.println(2);
				int k=2;
				for(int j=2;j<=n-2;j+=2)
				{
					k-=1;
					System.out.println(k);
					k+=3;
					System.out.println(k);
				}
				System.out.println(n);
				System.out.println(n-2);
			}
		}
	}
}
