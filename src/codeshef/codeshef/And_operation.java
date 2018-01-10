package codeshef;
import java.util.Scanner;
public class And_operation {

	public static void main(String args[])
	{
		int max=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				int temp=array[i]&array[j];
				
				if(temp>max)
				{
					max=temp;
				}
			}
		}
		System.out.println(max);
	}
}
