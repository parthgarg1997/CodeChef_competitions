package sebtember_challenge_2017;

import java.math.BigInteger;
import java.util.Scanner;

public class Chef_and_a_pick_digit {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int q=0;q<t;q++)
		{
		int a[]=new int[10];
		BigInteger b=scan.nextBigInteger();
		while(!b.equals(BigInteger.ZERO))
		{
			int k=b.mod(BigInteger.TEN).intValue();
			a[k]++;
			b=b.divide(BigInteger.TEN);
		}
		String str="";
		for(int i=6;i<=9;i++)
		{
			if(a[i]>0)
			{
				a[i]--;
				for(int j=0;j<=9;j++)
				{
					
					if(a[j]>0)
					{
						int result=(i*10+j);
						if(result>=65&&result<=90)
						str+=(char)result;
					}
					
				}
				a[i]++;
			}
		}
		System.out.println(str);
	}
	}
}
