
import java.util.Scanner;
public class Chef_and_collection_of_stamps {
 public static void main(String[] args)
 {
	Scanner scan=new Scanner(System.in);
	long t,i;
	t=scan.nextLong();
	for(i=0;i<t;i++)
	{
	int noffers,nstamps,j,k;
	nstamps=scan.nextInt();
	noffers=scan.nextInt();
	int stamps[]=new int[nstamps];
	int offers[][]=new int[noffers][3];
	for(j=0;j<nstamps;j++)
	{
		stamps[j]=scan.nextInt();
	}
	for(j=0;j<noffers;j++)
	{
		for(k=0;k<3;k++)
		{
			offers[j][k]=scan.nextInt();
		}
		
	}
	}
 }	
}
