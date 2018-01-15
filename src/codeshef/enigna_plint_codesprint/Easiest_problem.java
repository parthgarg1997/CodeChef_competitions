package enigna_plint_codesprint;

import java.util.Scanner;

public class Easiest_problem {
	public static int fact(int x)
	{
		int p=1;
		for(int i=1;i<=x;i++)
			p*=i;
		return p;
	}
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int N=scan.nextInt();
	int M=scan.nextInt();
	for(int i=0;i<M;i++)
	{
		int x=scan.nextInt();
	}
	int l=M-N;
	System.out.println((fact(l)*(M+1))%1000000007+"");
	
}
}
