package codeshef;

import java.util.Scanner;
public class test_christmas {
 static int rsum=0;
    
    static void combinationUtil(int arr[], int n, int r, int index,
                                int data[], int i,int sum)
    {
       
        if (index == r)
        {
        	int comsum=0;
            for (int j=0; j<r; j++)
            {
            	comsum+=data[j];
            }
         if(comsum>=(sum-comsum))
         {
        	rsum+=(2*comsum-sum);
         }
         else
         {
        	 rsum+=(sum-2*comsum);
         }
            
             //   System.out.print(data[j]+" ");
           // System.out.println("");
        return;
        }
 
        
        if (i >= n)
        return;
 
        
        data[index] = arr[i];
        combinationUtil(arr, n, r, index+1, data, i+1,sum);
 
     
        combinationUtil(arr, n, r, index, data, i+1,sum);
    }
 
   
    static void printCombination(int arr[], int n, int r,int sum)
    {
        int data[]=new int[r];
 
        combinationUtil(arr, n, r, 0, data, 0,sum);
    }
 
    
    public static void main (String[] args) {
    	int t,sum=0;
    	int ingri_no;
    	Scanner Scan=new Scanner(System.in);
    	t=Scan.nextInt();
    	for(int k=0;k<t;k++){
    	ingri_no=Scan.nextInt();
    	int ingri_score[]=new int[ingri_no];
    	for(int i=0;i<ingri_no;i++)
    	{
    		ingri_score[i]=Scan.nextInt();
    		sum+=ingri_score[i];
    	}
    
    	for(int r=1;r<=ingri_no;r++)
    	{
        printCombination(ingri_score,ingri_no, r,sum);
    	}
    	System.out.println((rsum+sum));
    	}
    	
    }
    
} 