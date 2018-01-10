package kIIT_coding_weekend;

import java.util.Scanner;

public class LArge_product {
public static void main(String args[])
{
	long multiply=1;
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=0;i<n;i++)
	{
		int t=scan.nextInt();
		multiply=(multiply*t)%1000000007;
	}
	System.out.println(multiply);
}
}
