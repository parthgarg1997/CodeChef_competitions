
import java.util.Scanner;
public class Prime_generator {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int i,j,m;
	int q,t;
	t=scan.nextInt();
	for(i=0;i<t;i++)
	{
		int start=scan.nextInt();
		if(start==1)
		start++;
		if(start==2)
			System.out.println(2);
		if(start%2==0)
			start++;
		int end=scan.nextInt();
		for(j=start;j<=end;j+=2)
		{    q=0;
			
		
			double re=Math.sqrt(j);
			for(m=3;m<=re;m+=2)
			{
				if(j%m==0)
				{
					q=-1;
					break;
				}
			}
			if(q ==0)
			{
				System.out.println(j);
			}
		
					
		}
		System.out.println();
	}
	
}
}
