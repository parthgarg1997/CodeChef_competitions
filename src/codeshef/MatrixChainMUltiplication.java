

public class MatrixChainMUltiplication {
	public static void main(String args[])
	{
		int a[][]={{10,30},{30,5},{5,60}};
		int x[][]=new int[a.length][a.length];
		int q=0;
		for(int l=a.length;l>0;l--)
		{
			for(int i=0;i<l;i++)
			{
			int j=i+q;
			//System.out.println(i+""+j);
			if(j==i)
				x[i][j]=0;
			else
			{
				for(int k=i;k<j;k++)
				{
					int min=671623187;
					int r=x[i][k]+x[k+1][j]+a[i][0]*a[k][1]*a[j][1];
					if(r<min)
						min=r;
					x[i][j]=min;
					
				}
				//System.out.println(x[i][j]);
			}
			
		}
			q++;
		}
		System.out.println(x[0][a.length-1]);
	}

}
