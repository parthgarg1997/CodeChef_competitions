
import java.util.Scanner;
public class Chef_and_walking_on_the_rectangle {
 public static void main(String[] args)
 {
	 long t,n,m,k,i;
	 Scanner scan=new Scanner(System.in);
	 t=scan.nextLong();
	 for(i=0;i<t;i++)
	 {
		 n=scan.nextLong();
		 m=scan.nextLong();
		 k=scan.nextLong();
		 if((n==1&&m==1)||(n==1&&m==2)||(n==2&&m==1))
			 System.out.println(0);
		 else if(n==1||m==1)
		 {
			 System.out.println(k);
		 }
		 else
		 {
			 if(k%2==0)
				 System.out.println(k/2);
			 else
				 System.out.println((k+1)/2);
		 }
	 }
			 
 }
}
