import java.util.Arrays;
import java.util.Scanner;

public class Lapindromes {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int alpha1[]=new int[26];
	int alpha2[]=new int[26];
	int i=0,j;
	int n;
	n=scan.nextInt();
	scan.nextLine();

	for(int t=0;t<n;t++)
	{
		
		String s=scan.nextLine();
		Arrays.fill(alpha1, 0);
		Arrays.fill(alpha2, 0);
		for(i=0;i<s.length()/2;i++)
		{
			alpha1[(int)s.charAt(i)-97]++;
		}
		if(s.length()%2==0)
		{
			j=i;
		}
		else
			j=i+1;
		for(i=j;i<s.length();i++)
		{
			alpha2[((int)s.charAt(i)-97)]++;
		}
		if(Arrays.equals(alpha1, alpha2))
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
}
}
