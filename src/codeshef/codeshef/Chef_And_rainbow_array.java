package codeshef;

import java.util.Scanner;

public class Chef_And_rainbow_array {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int flag=0;
			int k=scan.nextInt();
			int array[]=new int[k];
			for(int j=0;j<k;j++)
			{
				array[j]=scan.nextInt();
			}
			int temp=0;
			while(temp<=(k/2))
			{
				System.out.println(Math.abs(array[temp+1]-array[temp]));
				
				if((array[temp]!=array[k-temp-1])&&(Math.abs(array[temp+1]-array[temp])<=1))
					{flag=-1;
					break;
					}
				temp++;
			}
			if(flag==-1)
			{
				System.out.println("no");
			}
			else
				System.out.println("yes");
		}
	}
}
