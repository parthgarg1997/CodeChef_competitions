package codeWizz1;

import java.util.Scanner;

public class BitPairSum {

	public static void main(String args[])
	{
		
		Scanner scan =new Scanner(System.in);
		int T=scan.nextInt();
		
		for(int d=0;d<T;d++)
		{
			try{
			int x=scan.nextInt();
			int z=0,o=0,sum=0;
			while(x!=0)
			{
				if(x%2==0)
				{
					sum=sum+(o*1);
					z++;
				}
				else
				{
					sum=sum+3*o+2*z;
					o++;	
				}	
				x=x/2;
			}
			System.out.println(sum);
			}catch(Exception e)
			{
				
			}
		}
		
	}
}

