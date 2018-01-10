package jan18;

import java.util.Scanner;

public class Rectangl {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	
	int T=scan.nextInt();
	for(int i=0;i<T;i++)
	{
		int l=-1,m=-1,lc=0,mc=0;
		int x[]=new int[4];
		for(int j=0;j<4;j++)
		{
			x[j]=scan.nextInt();
		}
		l=x[0];
		for(int j=1;j<4;j++)
		{
			if(x[j]!=l)
			{
				m=x[j];
				break;
			}
		}
		for(int j=0;j<4;j++)
		{
			if(x[j]==l)
				lc++;
			else if(x[j]==m)
				mc++;
		}
		if((lc==2&&mc==2)||lc==4)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
}
