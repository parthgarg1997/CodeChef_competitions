package october_challenge_2017;

import java.util.Scanner;

public class Counter_test_for_chefsum {

	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int n=0;n<t;n++)
		{
			int N=scan.nextInt();
			 long mod=4294967294L;
			//int arr[]=new int[N];
			//long sum=1;
			int div=(int) (mod/N-1)+1;
			if(N==99995||N==100000||N==99993||N==99997)
				div+=1;
			//System.out.println(div);
			//arr[0]=1;
			System.out.print(1+" ");
			for(int i=1;i<N-2;i++)
			{
				//arr[i]=div;
				//sum+=div;
				System.out.print(div+" ");
			}
			int remain=(int)(mod%(N-1)-2);
			//arr[N-1]= arr[N-2]=div+remain/2;
			System.out.print(div+remain/2+" ");
			System.out.print(div+remain/2+" ");
			
			//sum+=arr[N-1]+arr[N-2];
			//System.out.println(sum);
		}
	}
}
