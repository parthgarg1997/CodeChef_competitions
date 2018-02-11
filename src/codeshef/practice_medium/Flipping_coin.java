package practice_medium;
import java.util.Scanner;
public class Flipping_coin {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int N=scan.nextInt();
	int Q=scan.nextInt();
	int x[]=new int[N];
	int y[]=new int[3*N];
	int z[]=new int[3*N];
	for(int i=0;i<Q;i++)
	{
	int r=scan.nextInt();
	int l=scan.nextInt(),u=scan.nextInt();
//	segmentTree(x,y,0,x.length-1,0);
	if(r==1)
	{
	System.out.println(NO_head(y,z,l,u,0,x.length-1,0));
	}
	if(r==0)
	{
		FlipCoin(y,z,l,u,0,x.length-1,0);
	}
	/*for(int j=0;j<10;j++)
	{
		System.out.println(y[j]+"");
	}*/
	}
}
public static void FlipCoin(int y[],int z[],int rl,int ru,int l,int u,int pos)
{
	//System.out.println("l="+l+"u="+u);
	if(l>u)
		return;
	if(z[pos]!=0)
	{
		y[pos]=(u-l+1-y[pos]);
		if(l!=u)
		{
			z[2*pos+1]=z[2*pos+2]=1;
		}
		z[pos]=0;
	}
	if(l>=rl&&u<=ru)
	{
		y[pos]=(u-l+1-y[pos]);
		if(l!=u)
		{
		//	System.out.println("pos="+pos);
			z[2*pos+1]=1;
			z[2*pos+2]=1;
		}
		return;
	}
	else if(ru<l||rl>u)
	{
		return ;
	}
	else
	{
		int mid=(l+u)/2;
		FlipCoin(y,z,rl,ru,l,mid,2*pos+1);
		FlipCoin(y,z,rl,ru,mid+1,u,2*pos+2);
		y[pos]=y[2*pos+1]+y[2*pos+2];
	}
}
public static int NO_head(int y[],int z[],int rl,int ru,int l,int u,int pos)
{
	
	if(z[pos]!=0)
	{
		y[pos]=(u-l+1-y[pos]);
		if(l!=u)
		{
			z[2*pos+1]=z[2*pos+2]=1;
		}
		z[pos]=0;
	}
	if(l>=rl&&u<=ru)
	{
		return y[pos];
	}
	else if(ru<l||rl>u)
	{
		return 0;
	}
	else
	{
		int mid=(l+u)/2;
		return(NO_head(y,z,rl,ru,l,mid,2*pos+1)+NO_head(y,z,rl,ru,mid+1,u,2*pos+2));
	}
}
public static void segmentTree(int x[],int y[],int low,int end ,int pos)
{
	if(low==end)
		{
		//System.out.println("pOS"+pos);
		 y[pos]= x[low];
		return;
		}
	int mid=(low+end)/2;
	//System.out.println(mid);
	segmentTree( x,y,low,mid,2*pos+1);
	segmentTree(x,y,mid+1,end,2*pos+2);
	
	y[pos]=y[2*pos+1]+y[2*pos+2];
	//System.out.println("pos="+pos);
	
}
}
