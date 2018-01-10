
import java.util.Scanner;
public class hello_hello {
	
public static void main(String[] args)
{  
	Scanner scan=new Scanner(System.in);
	int t= scan.nextInt();
	long j,i;
	for(i=0;i<t;i++)
	{
		double drate=(scan.nextDouble());
		long min=scan.nextLong();
		long nplans=scan.nextInt();
		double damount=min*drate;
		double differance1=0.0;
		long nopack=0;
		for(j=0;j<nplans;j++)
		{
			double month=scan.nextInt();
			double arate=scan.nextDouble();
			double cost=scan.nextInt();
			double namount=((arate*min)+(cost/month));
			double differance=damount-namount;
			//System.out.println(differance);
			if(differance>differance1)
			{
			  nopack=j+1;
			differance1=differance;
			}
		}
	  System.out.println(nopack);
	   
	}
	
}
}
