
import java.util.Scanner;
class Permutation {
 static int rsum=0,sum=0;
    
    static void combinationUtil(int arr[], int n, int r, int index,
                                int data[], int i)
    {
        if (index == r)
        {
        	int comsum=0;
            for (int j=0; j<r; j++)
            {
            	//System.out.println(data[j]);
            	comsum+=data[j];
            }
            System.out.println(comsum);
            int x=0,y=0;
            if(comsum>sum-comsum)
            {x=comsum;
            y=sum-comsum;
            }
            else
            	x=sum-comsum;
            y=comsum;
         rsum+=2*(x-y);      
             //   System.out.print(data[j]+" ");
           // System.out.println("");
        return;
        }      
        if (i >= n)
        return;      
        data[index] = arr[i];
        combinationUtil(arr, n, r, index+1, data, i+1);
        combinationUtil(arr, n, r, index, data, i+1);
    }  
    static void printCombination(int arr[], int n, int r)
    {
        int data[]=new int[r];
        combinationUtil(arr, n, r, 0, data, 0);
    }
    public static void main (String[] args) {
    	int t;
    	int ingri_no,msum = 0;
    	Scanner Scan=new Scanner(System.in);
    	t=Scan.nextInt();
    	for(int k=0;k<t;k++){
    		sum=0;
    		rsum=0;
    	ingri_no=Scan.nextInt();
    	int ingri_score[]=new int[ingri_no];
    	for(int i=0;i<ingri_no;i++)
    	{
    		ingri_score[i]=Scan.nextInt();
    		sum+=ingri_score[i];
    	}
    	rsum=2*sum;
    	for(int r=1;r<=(ingri_no-1)/2;r++)
    	{
        printCombination(ingri_score,ingri_no, r);
    	}
    	if(ingri_no%2==0)
    	{
    		for(int d=0;d<ingri_no/2;d++)
    		msum+=ingri_score[d];
    		if(msum>(sum-msum))
    		{
    			rsum+=2*(2*msum-sum);
    		}
    		else
    			rsum+=2*(sum-2*msum);
    	}
    	System.out.println((rsum));
    	}
    }
}

