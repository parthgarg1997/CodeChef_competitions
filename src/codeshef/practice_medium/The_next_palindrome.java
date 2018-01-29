package practice_medium;
import java.util.Scanner;

public class The_next_palindrome {
 public static void main(String args[])
 {
	 
	 Scanner scan=new Scanner(System.in);

	 int T=scan.nextInt();
	 while(T--!=0)
	 {
		 int flag=1;
		 char[] str=scan.next().toCharArray();
		 int ln=str.length;
		 for(int i=0;i<ln;i++)
		 {
			 if(str[i]!='9')
			 {
				 flag=0;
				 break;
			 }
		 }
		 if(flag==1)
		 {
			 str[0]='1';
			 for(int i=1;i<ln;i++)
			 {
				 str[i]='0';
			 }
			System.out.print(str);
			System.out.println(1);
			continue;
		 }
		 int fl=0;
		 for(int j=0;j<=ln/2;j++)
		 {
			 if(str[j]>str[ln-j-1])
			 {
				 fl=1;
			 }
			 else if(str[j]<str[ln-j-1])
			 {
				 fl=-1;
			 }
			 str[ln-j-1]=str[j];
		 }
		 if(fl==0||fl==-1)
		 {
			 int mid;
			 
			 if(ln%2==0)
				 {
				 mid=ln/2-1;
				 }
			 else
				 mid=ln/2;
			 while(str[mid]=='9')
			 {
				 str[mid]=str[ln-mid-1]='0';
				 mid--;
			 }
			 str[mid]++;
			 str[ln-mid-1]=str[mid];
		 }
		 System.out.println(str);
	 }
 }
}
