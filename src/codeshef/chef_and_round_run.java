import java.util.Scanner;;
public class chef_and_round_run {
public static void main(String[] args)
{ Scanner scan=new Scanner(System.in);
	long k;
	int n;
	 long counter=0;
	k=scan.nextInt();
	for(int i=0;i<k;i++)
	{ counter=0;
		n=scan.nextInt();
		long a[]=new long[n];
		for(int j=0;j<n;j++)
		{
			a[j]=scan.nextLong();
		}
		for(int l=0;l<n;l++)
		{
			long b[]=new long[n];
			int z=0;
			//b[0]=a[l];
			long store=l;
		while(z<n)
		{ 
			long temp=a[(int)store];
			if(temp>=n)
			{
				temp=temp%n;
			}
			store+=temp+1;
			if(store>=n)
			{
				store=store%n;
			}
			z++;
			if(l==store)
				{
				counter++;
				break;
				}
		}
		}
		System.out.println(counter);
	}
	
}
}
