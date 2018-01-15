package codeWizz1;

import java.util.Scanner;

public class Sara_and_her_game {

	public static void main(String args[])
	{
		try{
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int x=scan.nextInt();
			int n=0;
			while(x!=1)
			{
			int m=x%3;
			if(m==0)
			{
				n++;
				x=x/3;
			}
			else if(m==2)
			{
				n++;
				x=x+1;
			}
			else if(m==1)
			{
				n++;
				x=x-1;
			}
			}
			System.out.println(n);
		}
		}catch(Exception e)
		{
			
		}
	}
}
