package practice_medium;

import java.util.Scanner;

public class Root_of_the_problem {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int T=scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int sum=0;
			int n=scan.nextInt();
			for(int j=0;j<n;j++)
			{
				int l=scan.nextInt();
				int m=scan.nextInt();
				sum=sum+l-m;
			}
			System.out.println(sum);
		}
	}
}
