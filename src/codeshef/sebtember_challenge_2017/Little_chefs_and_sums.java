package sebtember_challenge_2017;

import java.util.Scanner;

public class Little_chefs_and_sums {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int n=scan.nextInt();
			int temp=657657650;
			int index=0;
			for(int j=0;j<n;j++)
			{
				int a=scan.nextInt();
				if(a<temp)
				{
					temp=a;
					index=j+1;
				}
			}
			System.out.println(index);
		}
	}
}
